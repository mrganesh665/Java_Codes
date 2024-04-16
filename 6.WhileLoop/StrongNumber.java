import java.util.Scanner;

public class StrongNumber {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int a = n;              //for storing value of n
        int sum = 0;
        while(n>0){
            int rem=n%10;
            int fact=1;
            int i=1;
            while(i<=rem){
            fact = fact*i;
            i++;
            }
            
       System.out.println(rem +"!="+ fact);
       sum=sum+fact;
            n=n/10;
        }
        System.out.println("sum: "+sum);

        if (a==sum) {
            System.out.println("Strong Number");
        }
        else
        System.out.println("Not a strong Number");
     
    }
}
