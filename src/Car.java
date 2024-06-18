//Learning Getters and Setters
public class Car {
    private String color;

    //Getter
    public String getColour(){
        return color;
    }

    //Setter
    public void setColor(String c ){
        this.color = c;
    }
}
//once our getters and setters are defined we can use it in our main
class Program {
    public static void main(String[] args) {
        Car c1 = new Car();//creates a variable c1 for the Car class
        c1.setColor("green");//assigning the color of the car to be green
        System.out.println(c1.getColour());//displaying the content of c1 variable

    }
}