package OOPS.Project_Shape;

public class Circle {
    int r;

    Circle(int r, int pi) {
        this.r = r;
    }

    public void getPerimeter(int r) {
        double p = 2 * 3.14 * r;
        System.out.println("Perimeter is : " + p);
    }

    public void getArea(int r) {
        double a = 3.14 * r * r;
        System.out.println("Area is : " + a);
    }
}
