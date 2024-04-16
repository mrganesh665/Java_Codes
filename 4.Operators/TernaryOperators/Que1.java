import java.util.Scanner;

class Que1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

  
    System.out.println("Enter First number");
    int x = sc.nextInt();
   
    System.out.println("Enter Second number");
    int y = sc.nextInt();

    int a = (x > y) ? x : y;
    System.out.println("Bigger Number is : " + a);
      }
}