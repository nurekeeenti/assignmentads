import java.util.Scanner;

public class task5 {
    public static int FibPosition(int position) {
        if (position == 0)
            return 0;
        else if (position == 1)
            return 1;
        else
            return FibPosition(position - 1) + FibPosition(position - 2);
        //O(2^n)
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = FibPosition(n);
        System.out.println(s);
        //O(1)

    }
}
