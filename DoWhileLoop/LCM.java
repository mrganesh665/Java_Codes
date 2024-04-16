import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. : ");
        int a = sc.nextInt();
        System.out.println("Enter no. : ");
        int  b= sc.nextInt();
        System.out.println("Enter no. : ");
        int c = sc.nextInt();
        
        // int max = a*b*c;

        for(int i=1; ; i++){
            if(i%a==0 && i%b==0 && i%c==0 ){
                System.out.println("LCM is : "+i);
                break;
            }
        }

    }
}
