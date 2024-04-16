class Op1{
public static void main(String[] args){
    // PROGRAM 1
    // int a=12;
    // int b=a++;

    // b++;

    // int c = a++ + --b;
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
     
    // PROGRAM 2
    //     int a=10;
    //     a++;
        
    //     int b= ++a;
    //     int c=a++ + ++b;
    //     b++;

    //     System.out.println(a);
    //     System.out.println(b);
    //     System.out.println(c);


    // PROGRAM 3

    //  int x=12;
    //  int y = x++ + ++x;
    //  y++;
    //  int z=++y;
    //  int p = x++ - ++y + z++;


    //  System.out.println(x);
    //  System.out.println(y);
    //  System.out.println(z);
    //  System.out.println(p);

    // PROGRAM 4
            // int a = 12;
            // int b = ++a;
            // b++;

            // int c=a++ + --b;

            // int d=a++ + ++b + c++;
            // d++;

            // c--;

            // System.out.println(a);
            // System.out.println(b);
            // System.out.println(c);
            // System.out.println(d);


            // PROGRAM 5
            int a=12;
            a++;
            ++a;

            int b=a++;
            b++;

            int c=a++ + --b;
            c--;
            --b;

            int d= ++a + b++ + --c;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
    }
}
