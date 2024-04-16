import java.util.Scanner;
class  CheckPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();
        char c;
    
        int rev=0;
        int a = n;
        
        do{
           int rem = n%10;
           
           rev= rev*10+rem;

            n=n/10;

        }while(n>0);

        System.out.println("Reverse : "+rev);
        if (a==rev) {
         System.out.println(a+" is Palindrome Number");
        } else {
         System.out.println(a+" is NOT Palindrome Number");
        }
      
        System.out.println("If you want to check for anathor num press Y or y Else prese another key");
        c = sc.next().charAt(0)
        if ( c==('Y'||'X') ) {
        
        } else {
            
        }
    }

       
}