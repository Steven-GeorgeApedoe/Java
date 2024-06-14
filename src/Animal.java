public class Animal {
    void bark(){
        System.out.println("Woof-woof");
    }
}
//Creating a class with attributes
 class Vehicle{
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;

    void horn(){
        System.out.println("Beep!");
    }
}
//Creating the Main class
class Myclass{
    public  static void main(String[] args){
        Animal dog  = new Animal();
        dog.bark();
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();


    }
}

