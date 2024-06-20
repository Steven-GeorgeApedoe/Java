/*
 class Counter {
    public  static int COUNT=0;
    Counter(){
        COUNT++;
    }
}
public class MyClass{
    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);

    }
}
*/
class Animal{
    protected int legs;
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    Dog(){
        legs = 4;
    }
}

class MyClass{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();

        B obj = new B();


    }
}
class A{
    public A(){
        System.out.println("New A");
    }
}

class B extends A{
    public B(){
        System.out.println("New B");
    }
}

