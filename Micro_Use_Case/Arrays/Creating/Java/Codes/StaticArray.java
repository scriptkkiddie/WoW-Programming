class StaticArray {
    
    public static void main(String[] args) {
        // Integer Array Initialization
        int arrayInt[] = new int[5];

        // Integer Array Initialization with Elements
        int arrayIntElements[] = new int[] {1, 2, 3, 4, 5};

        for(int elementGarbage : arrayInt) {
            System.out.println("Array Garbage: " + elementGarbage);
        }

        for(int element: arrayIntElements) {
            System.out.println("Array: " + element);
        }
    }
}