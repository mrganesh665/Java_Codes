import java.util.Scanner;

class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUM: ");
        int n = sc.nextInt();

        while (n > 0) {
            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }

    }
}