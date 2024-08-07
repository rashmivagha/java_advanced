
public class DynamicArray {
    int size = 10;
    int capacity;
    int[] array = new int[size];

    public DynamicArray(int size) {
        this.size = size;
    }

    public void add(int element){
        if(capacity >= (size*0.75)) grow();
        array[capacity] = element;
        capacity++;
    }

    public void remove(){
        array[capacity-1] = 0;
        capacity--;
        if(capacity <= (size*0.25)) shrink();
    }

    public boolean contains(int element){
        for(int i=0; i<capacity; i++){
            if(array[i] == element) return true;
        }
        return false;
    }

    public int getIndex(int element){
        for(int i=0; i<capacity; i++){
            if(array[i] == element) return i;
        }
        return -1; //element not present
    }

    private void grow() {
        System.out.println("Growing array ");
        int[] newArray = new int[size*2];
        for(int i =0;i<capacity; i++){
            newArray[i] = array[i];
        }
        this.size = newArray.length;
        this.array = newArray;
    }

    private void shrink() {
        System.out.println("Shrinking array ");
        int[] newArray = new int[size/2];
        for(int i =0;i<capacity; i++){
            newArray[i] = array[i];
        }
        this.size = newArray.length;
        this.array = newArray;
    }

    public void print() {
        System.out.println("Size: "+size);
        System.out.println("Capacity: "+capacity);
        System.out.print("[");
        for(int i=0; i < size; i++)
            System.out.print(" "+array[i]);
        System.out.println("] ");
        
    }
}
