public class newAnimal {
    public void makeSound(){
    }
}
class Cat extends newAnimal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
class Snake extends newAnimal{
    public void makeSound(){
        System.out.println("Hiss");
    }
}
class newProgram{
    public static void main(String[] args){
        newAnimal a= new Snake();
        newAnimal b=new Cat();

        a.makeSound();
        b.makeSound();
    }
}
