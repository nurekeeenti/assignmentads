

import java.util.Scanner;

public class task9{


    public static int binomialCoeff(int n, int k) {
        if (k != 0 && k != n) {
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        } else {
            return 1;
        }
        //O(2^n)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the k: ");
        int k = scanner.nextInt();
        int res = binomialCoeff(n, k);
        System.out.println(res);
        scanner.close();
        //O(1)
    }
}
