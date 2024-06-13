public class returningValue {
    static  boolean check(int grade){//creating a method named check to be called in main
        if(grade >= 70){
            return true;
        }else {
            return false;
        }
    }

    //creating the main method
    public static void main(String[] args){
        int x = 21;
        if(check(x)== true){
            System.out.println("Congrats, you have passed!");
        } else {
            System.out.println("You have failed miserably!");
        }
    }
}
