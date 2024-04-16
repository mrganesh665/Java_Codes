public class LaptopDriver {
    public static void main(String[] args) {

        Laptop l1 = new Laptop("hp", 8, 500);
        l1.displayDetail();

    }
}

class Laptop {
    String brand;
    int ram;
    int hd;

    Laptop(String brand, int ram, int hd) {
        this.brand = brand;
        this.ram = ram;
        this.hd = hd;
    }

    public void displayDetail() {
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(hd);
    }
}