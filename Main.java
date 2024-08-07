public class Main {

    public static void main(String args[]) {
        //=============================================== Dynamic Array ===================================================
        // DynamicArray dynamicArray = new DynamicArray(10);
        // dynamicArray.print();
        // dynamicArray.add(5);
        // dynamicArray.add(8);
        // dynamicArray.add(2);
        // dynamicArray.add(1);
        // dynamicArray.add(9);
        // dynamicArray.add(7);
        // dynamicArray.add(10);
        // dynamicArray.add(14);
        // dynamicArray.print();
        // dynamicArray.add(18);
        // dynamicArray.add(23);
        // dynamicArray.print();

        // dynamicArray.remove();
        // dynamicArray.remove();
        // dynamicArray.remove();
        // dynamicArray.remove();
        // dynamicArray.remove();
        // dynamicArray.print();
        // dynamicArray.remove();
        // dynamicArray.print();

        // System.out.println(dynamicArray.contains(5));
        // System.out.println(dynamicArray.contains(9));

        // System.out.println(dynamicArray.getIndex(2));
        // System.out.println(dynamicArray.getIndex(11));

        //=============================================== Binary Search ===================================================

        int[] array = new int[50];

        for(int i= 0;i<50;i++) {
            array[i] = i*2;
        }

        BinarySearch binarySearch = new BinarySearch(array);
        int index = binarySearch.search(16);
        if(index != -1)
            System.out.println("Value found at: "+index);
        else
            System.out.println("Value not found");

    }
}
