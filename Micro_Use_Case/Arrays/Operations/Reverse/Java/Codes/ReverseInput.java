import java.util.Scanner;

public class ReverseInput {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        // Taking Array Input Length "N" & its elements

        int N = input.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {

            arr[i] = input.nextInt();

        }

        input.close();

        // Reversing Array

        int index = 0;
        int indexReverse = N - 1;

        while(index < indexReverse) {

            int temp = arr[index];
            arr[index] = arr[indexReverse];
            arr[indexReverse] = temp;
            index++;
            indexReverse--;
        }

        // Traversing Reversed Array

        for(int elements : arr) {
            System.out.print(elements+" ");
        }


    }
}
