import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        System.out.println("Enter 2st Number");
        int b = sc.nextInt();

        System.out.println("Enter 3st Number");
        int c = sc.nextInt();

        int r = (a>b)? (a>c) ? a : c : b>c ? b : c;
        System.out.println("Big num : "+r);
    }
}
