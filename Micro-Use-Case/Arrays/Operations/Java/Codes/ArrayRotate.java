public class ArrayRotate {
    
    public static void main(String[] args) {
        
        int arr[] = new int[] { 1, 2, 3, 4};

        int maxE = 0;
        int maxI = -1;

        for(int i = 1; i <= arr.length - 1; i++) {
            if(arr[i - 1] > arr[i]) {
                maxE = arr[i - 1];
                maxI = i - 1;
            }

            else {
                maxE = arr[i];
                maxI = i;
            }
        }

        rotate(arr, maxI);

        System.out.println("maxE: " + maxE);

        for(int elements: arr) {
            System.out.print(elements + " ");
        }

    }


    public static void rotate(int arr[], int maxI) {

        if(maxI == 0) {
            return;
        }

        else {
            for(int i = maxI; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        
    }
}
