import java.util.Scanner;

class PrintEvenDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        while(n>0){
            int x=n%10;
            if(x%2==0)
             System.out.println(x);

             n=n/10;
        }
        
    }
}