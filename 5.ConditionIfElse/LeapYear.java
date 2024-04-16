
import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();

        // if (n%100!=0 && n%4==0  || n%400==0) {
        //     System.out.println("Leap Year");
        // } else {
        //     System.out.println("Not Leap Year");
        // }



        if (n%100==0) {

            if (n%400==0) {
            System.out.println(n+": Not leap year");
            }
            
        } else {

            if (n%4==0) {
                System.out.println(n+": leap year");
            } else {
                System.out.println(n+": Not leap year");
            }
            
        }
        
    }
}