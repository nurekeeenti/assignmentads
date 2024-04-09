import java.util.Scanner;
public class task8 {


    //O(n)
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }

        if (Character.isDigit(s.charAt(0))) {
            return isAllDigits(s.substring(1));
        } else {
            return false;
        }
    }




    //O(n)
    public static void test(){

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        if(isAllDigits(s1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        scanner.close();



    }

    //0(1)
    public static void main(String[] args){
        test();
    }
}