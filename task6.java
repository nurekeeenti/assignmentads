import java.util.Scanner;

public class task6 {
    public static int Power(int n, int b){
        if (b==0){
            return 1;
        }
        else{
            return n * Power(n, b-1);
        }
    //O(n)
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int c = Power(n,b);
        System.out.println(c);
        //O(1)
    }
}
