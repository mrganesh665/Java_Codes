import java.util.Scanner;
class PrintDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        // int n =  5229;
        while(n>0){ 

            int x = n%10;
            System.out.println(x);
            n=n/10;
        }
    }
}