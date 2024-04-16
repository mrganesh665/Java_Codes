import java.util.Scanner;

public class CountFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int a = sc.nextInt();
        int x = FiboNum(a);
        System.out.println(x);
    }

    public static int FiboNum(int n) {

        // function Fibo(n){
        int a = 0;
        int b = 1;
        int c;
        int i;
        if (n == 0)
            return a;
        for (i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        return b;
    }
}
