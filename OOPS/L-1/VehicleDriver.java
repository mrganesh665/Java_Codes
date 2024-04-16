// import java.nio.file.ProviderMismatchException;

public class VehicleDriver {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.setValue("Car", 1234.7, "white");
        v1.displayDetail();

        Vehicle v2 = new Vehicle();
        v2.setValue("laptop", 123443.7, "red");
        v2.displayDetail();

    }

}

class Vehicle {
    String name;
    double price;
    String color;

    public void setValue(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;

    }

    public void displayDetail() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(color);
    }
}