import java.util.Scanner;

// public class PrintEven {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// while (n > 0) {
// int rem = n % 10;
// if (rem % 2 == 0)
// System.out.println(rem);
// n = n / 10;
// }
// }
// }

// GREATER OR EQUAL TO 6

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// while (n > 0) {
// int rem = n % 10;
// if (rem >= 6)
// System.out.println(rem);
// n = n / 10;
// }
// }
// }

// COUNT NO OF DIGITS

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// int count = 0;
// while (n > 0) {
// count++;
// n = n / 10;
// }

// System.out.println(count);
// }
// }

// SUM OF DIGITS

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// int sum = 0;

// while (n > 0) {
// int rem = n % 10;
// sum = sum + rem;
// n = n / 10;
// }
// System.out.println(sum);
// }
// }

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// int rev = 0;

// while (n > 0) {
// int rem = n % 10;
// rev = rev * 10 + rem;

// n = n / 10;
// }

// System.out.println(rev);
// }
// }

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// int sum = 0;

// while (n > 0) {
// int rem = n % 10;
// sum = sum + rem;
// n = n / 10;
// }
// System.out.println(sum);
// }
// }

// PRINT FACTORIAL OF DIGITS:

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();

// while (n > 0) {
// int rem = n % 10;
// int fact = 1;
// while (rem > 0) {
// fact = fact * rem;
// rem--;
// }
// System.out.println(fact);

// n = n / 10;
// }

// }
// }

// PRINT SUM OF FACTORIAL OF DIGITS:

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// int sum = 0;

// while (n > 0) {
// int rem = n % 10;
// int fact = 1;
// while (rem > 0) {
// fact = fact * rem;
// rem--;
// }
// System.out.println(fact);
// sum = sum + fact;
// n = n / 10;
// }
// System.out.println(sum);
// }
// }

// STRONG NUMBER

// public class Practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter NUM: ");
// int n = sc.nextInt();
// int m = n;
// int sum = 0;

// while (n > 0) {
// int fact = 1;
// int rem = n % 10;

// while (rem > 0) {
// fact = fact * rem;
// rem--;
// }
// sum = sum + fact;
// n = n / 10;
// }

// if (sum == m)
// System.out.println("Strong Number :" + m);
// else
// System.out.println("Not a strong number :" + m);
// }
// }

// PALINDROME OR NOT ???

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUM: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        // int rev = 0;
        // int m = n;

        // while (n > 0) {
        // int rem = n % 10;
        // rev = 10 * rev + rem;
        // n = n / 10;
        // }
        // System.out.println(rev);

        // if (m == rev)
        // System.out.println("It is a palindrome Number");
        // else
        // System.out.println("It is not palindrome Number");
    }

    public static boolean isPalindrome(int n) {
        int x = n, rev = 0;
        if (n < 0)
            return false;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev == x;
    }
}
