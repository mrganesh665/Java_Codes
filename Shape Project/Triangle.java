// package Shape Project;

public class Triangle extends TwoDShape  {
    double a;
    double b;
    double c;

Triangle()
{

}
Triangle(double a, double b, double c){

this.a = a;
this.b = b;
this.c = c;
}

public void getPerimeter() {
    System.out.println("Perimerter of triangle ");
}



}