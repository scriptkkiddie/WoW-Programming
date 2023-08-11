public class Reverse {

    public static void main(String[] args) {

        int arr[] = new int[] {1, 2, 3, 4, 5};
        int N = arr.length;
        int index = 0;
        int indexReverse = N - 1;

        while (index < indexReverse) {
            int temp = arr[index];
            arr[index] = arr[indexReverse];
            arr[indexReverse] = temp;
            index++;
            indexReverse--;
        }

        for(int elements : arr) {
            System.out.print(elements+" ");
        }

    }
    
}
