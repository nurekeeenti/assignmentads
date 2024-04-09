import java.util.Scanner;

public class task3 {


    public static boolean Prime_rec(int n, int d) {
        if (n <= 1) {
            return false;
        }
        else if (d * d > n) {
            return true;
        }
        else {
            if (n % d == 0) {
                return false;
            }
            else {
                return Prime_rec(n, d + 1);
            }
        }
    //O(sqrt(n))
    }

    public static void prime(int n) {
        if (Prime_rec(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    //O(1)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        prime(n);
        scanner.close();
        //O(1)
    }
}