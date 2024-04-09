import java.util.Scanner;
public class task4 {


    public static int Fact(int n){
        if (n==1){
            return 1;
        }
        else{
            int a = Fact(n-1)*(n);
            return a;
        }
        //O(n)
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int b =Fact(n);
        System.out.println(b);


        scanner.close();
        //O(1)
    }
}

