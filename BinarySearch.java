public class BinarySearch {
    int[] array = new int[50];

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int search(int value) {
        int low = 0;
        int high = array.length;
        
        while(low <= high) {
            int mid = (high + low)/ 2;
            // System.out.println("Low "+low);
            // System.out.println("High "+high);
            // System.out.println("Mid "+mid);
            if(array[mid] == value) return mid;
            if(array[mid] > value) {
                high = mid -1;
            }
            if(array[mid] < value) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
