import java.util.Scanner;

public class FactorialOfDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();


        while(n>0){
            int rem=n%10;
            int fact=1;
            int i=1;
            while(i<=rem){
            fact = fact*i;
            i++;
            }
            
       System.out.println(rem +"!="+ fact);
            n=n/10;
        }
     }
}
