import java.util.Scanner;
public class OddDigitCount{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();
       
        int count=0;
        while (n>0) {
         
          if(n%2!=0)
               count++;

            n=n/10;
        }
      System.out.println(count);
    }
}
