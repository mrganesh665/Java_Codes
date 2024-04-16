import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        System.out.println("Enter 2st Number");
        int b = sc.nextInt();

        System.out.println("Enter 3st Number");
        int c = sc.nextInt();
   
        System.out.println("Enter 4st Number");
        int d = sc.nextInt();



        int p =  (a>b)? (a>c) ? a : c : b>c ? b : c;

        int r = (p > d) ? p : d;
        System.out.println("Big num : "+r);
    }
}
