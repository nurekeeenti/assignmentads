import java.util.Scanner;

public class task1 {

    //O(n)
    public static int minRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            int Before_min = minRecursive(arr, n - 1);
            if (Before_min < arr[n - 1]) {
                return Before_min;
            }
            else {
                return arr[n - 1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of the array:");

        int minElement;
        for(minElement = 0; minElement < n; ++minElement) {
            array[minElement] = scanner.nextInt();
        }
        // O(n)


        minElement = minRecursive(array, n);
        System.out.println(minElement);
        scanner.close();
    }
}
