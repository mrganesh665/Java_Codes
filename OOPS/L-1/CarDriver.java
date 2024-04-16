class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("hp", "pavillion", 25000, "black");
        c1.displayDetail();
    }
}

class Car {
    String brand;
    String name;
    int value;
    String color;

    Car(String brand, String name, int value, String color) {
        this.brand = brand;
        this.name = name;
        this.value = value;
        this.color = color;
    }

    public void displayDetail() {
        System.out.println(brand);
        System.out.println(name);
        System.out.println(value);
        System.out.println(color);
    }
}