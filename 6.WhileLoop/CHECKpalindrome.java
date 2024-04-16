import java.util.Scanner;

public class CHECKpalindrome {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();
       
        int rev=0;
        int a=n;

        while(n>0){
            int rem = n%10;
           
            rev = rev*10 + rem;

            n=n/10;

        }

        System.out.println("Reverse : "+rev);
       if (a==rev) {
        System.out.println(a+" is Palindrome Number");
       } else {
        System.out.println(a+" is NOT Palindrome Number");
       }
    }
}
