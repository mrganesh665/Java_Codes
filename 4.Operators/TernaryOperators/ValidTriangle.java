import java.util.Scanner;


 class ValidTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = sc.nextInt();

        System.out.println("Enter second side");
        int b = sc.nextInt();

        System.out.println("Enter third side");
        int c = sc.nextInt();

      String result = (a+b>c && b+c>a && c+a>b) ?  "Valid Triangle" : "Invalid Triangle";
      System.out.println(result);

    }
    
}
