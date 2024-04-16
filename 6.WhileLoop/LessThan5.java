import java.util.Scanner;

public class LessThan5 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();

        while(n>0){
            int x=n%10;
         if(x>=5){
            System.out.println(x);
         }


            n=n/10;
        }
        
    }
}
