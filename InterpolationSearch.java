public class InterpolationSearch {
    int[] array = new int[50];

    public InterpolationSearch(int[] array) {
        this.array = array;
    }

    public int search(int value) {
        int low = 0;
        int high = array.length-1;
        int probe;
        while(low <= high && value >= array[low] && value <= array[high]) {  
            probe = low + ((value - array[low]) * (high - low) / (array[high] - array[low]));
            System.out.println("Low "+low);
            System.out.println("High "+high);
            System.out.println("Probe "+probe);
            if(array[probe] == value) return probe;
            if(array[probe] > value) {
                high = probe -1;
            }
            if(array[probe] < value) {
                low = probe + 1;
            }
        }
        return -1;
    }
}
