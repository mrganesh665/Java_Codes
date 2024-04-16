public class Car {
    String name;
    int hp;
    double price;
    String color;

    Car() {
        System.out.println("Car Obj is created");
    }

    Car(String name) {
        this();
        this.name = name;
    }

    Car(String name,int hp) {
        this(name);
        this.hp = hp;
    }

    Car(String name, int hp , double price) {
        this(name,hp);
        this.price = price;
    }
    
   public void Display( String name , int hp, Double price){
    name = this.name;
    hp = this.hp;
    price = this.price;
   System.out.println(name);
   System.out.println(hp);
   System.out.println(price);
   }
}
