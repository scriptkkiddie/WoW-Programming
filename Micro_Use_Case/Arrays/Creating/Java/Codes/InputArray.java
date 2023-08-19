import java.util.Scanner;

class InputArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking array length size

        int N = sc.nextInt();

        // Creating integer array of N size

        int arrayInt[] = new int[N];

        // traversing ith element of array and updaing input value to each position
        for(int i = 0; i < N; i++) {
            arrayInt[i] = sc.nextInt();
        }

        sc.close();

        for(int element : arrayInt) {
            System.out.println("Array Element: " + element);
        }
    }
}
