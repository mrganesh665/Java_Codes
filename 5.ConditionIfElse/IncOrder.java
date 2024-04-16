import java.util.Scanner;
class IncOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
         
        int x=n%10;
        n=n/10;
        int y = n%10;

        if(y>x){
           System.out.println("Inc order");
        }
        else{
             System.out.println("Dec order");
        }
    }
}
