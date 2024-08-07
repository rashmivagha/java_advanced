public class Main {

    public static void main(String args[]) {
        DynamicArray dynamicArray = new DynamicArray(10);
        dynamicArray.print();
        dynamicArray.add(5);
        dynamicArray.add(8);
        dynamicArray.add(2);
        dynamicArray.add(1);
        dynamicArray.add(9);
        dynamicArray.add(7);
        dynamicArray.add(10);
        dynamicArray.add(14);
        dynamicArray.print();
        dynamicArray.add(18);
        dynamicArray.add(23);
        dynamicArray.print();

        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.print();
        dynamicArray.remove();
        dynamicArray.print();

        // System.out.println(dynamicArray.contains(5));
        // System.out.println(dynamicArray.contains(9));

        // System.out.println(dynamicArray.getIndex(2));
        // System.out.println(dynamicArray.getIndex(11));

    }
}
