import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SupermarketCheckout {

    
    class Customer {
        int custID;
        int lineNum;
        int numOfItems;

        public Customer() {
            this.custID = -1;
            this.lineNum = -1;
            this.numOfItems = -1;
        }

        public Customer(int custID, int lineNum, int numOfItems) {
            this.custID = custID;
            this.lineNum = lineNum;
            this.numOfItems = numOfItems;
        }
    }

    ArrayList<Queue<Customer>> supermarket;

    public SupermarketCheckout(){
        this.supermarket = new ArrayList<>();
    }

    public void customerEnter(int newCustId, int newLineNum, int newNumOfItems) {
        Customer newCust = new Customer(newCustId, newLineNum, newNumOfItems);
        // if(this.supermarket != null) {
            Queue<Customer> checkoutLine = this.supermarket.get(newLineNum);
            if(checkoutLine == null) {
                checkoutLine = new LinkedList<Customer>();
            }
            checkoutLine.add(newCust);
            // this.supermarket.add(newLineNum, checkoutLine);
        }
        // else {
        //     Queue<Customer> checkoutLine = new LinkedList<Customer>();
        //     checkoutLine.add(newCust);
        //     this.supermarket = new ArrayList<Queue<Customer>>();
        //     this.supermarket.add(newLineNum, checkoutLine);
        // }
    }

    public void basketChange(int custID, int newNumOfItems) {
        Customer cust = null;
        Queue<Customer> custCheckoutLine = null;
        for(int i =0; i<supermarket.size(); i++) {
            Queue<Customer> checkoutLine = this.supermarket.get(i);
            for(Customer c : checkoutLine) {
                if(c.custID == custID) {
                    cust = c;
                    custCheckoutLine = checkoutLine;
                    break;
                }
            }
        }
        if(cust != null) {
            if(newNumOfItems == 0) {
                custCheckoutLine.remove(cust);
                customerExit(cust);
            }
            else if(cust.numOfItems > newNumOfItems) {cust.numOfItems = newNumOfItems;}
            else { //remove customer and put them at the back of the queue
                custCheckoutLine.remove(cust);
                cust.numOfItems = newNumOfItems;
                custCheckoutLine.offer(cust);
                // this.supermarket.add(cust.lineNum, custCheckoutLine);
            }
        }       
    }

    public void lineService(int lineNum, int numOfItemsProcessed) {
        Queue<Customer> checkoutLine = this.supermarket.get(lineNum);
        int itemsProcessed = numOfItemsProcessed;
        while(!checkoutLine.isEmpty() && itemsProcessed > 0) {
            for(Customer c: checkoutLine){
                if(itemsProcessed > c.numOfItems){
                    itemsProcessed -= c.numOfItems;
                    checkoutLine.poll();
                    customerExit(c);
                    }
                else {
                    c.numOfItems -= itemsProcessed;
                    numOfItemsProcessed = 0;
                }
                }
        }
        
    }

    public void customerExit(Customer c) {
        System.out.println(c.custID+" exited ");
    }


    public void linesService(int numOfItemsProcessed) { //process these many from each line
        for(int i=0 ; i<this.supermarket.size() ; i++) { //processing sequentially
            lineService(i, numOfItemsProcessed);
        }
    }
}
