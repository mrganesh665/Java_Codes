import java.util.Scanner;

public class SumOfFactorials {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
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
     
    }
}
