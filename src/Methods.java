public class Methods {
    static void mymethod(){
        System.out.println("welcome");
        System.out.println("I am a robot");
        System.out.println("How can I assist you?");
    }
    static void welcome(String name){
        System.out.println("Welcome "+name);
    }
    static void number(int age){
        System.out.println("Age:"+age);
    }
    //creating another method
    /*static void perc(double num, int percentage){
        double res = num*percentage/100;
        System.out.println(res);
    }*/

    //creating a method with a return type
    static double perc1(double integer, int percentile){
        double res = integer*percentile/100;
        return res;
    }

    //Creating the main method
    public static void main(String[] args){
        mymethod();
        welcome("James");
        number(21);
      //  perc(530, 23);//answer is 121.9
        double x = perc1(530, 23);
        System.out.println("Result is: "+x);



    }
}
