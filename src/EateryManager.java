import java.util.Scanner;

public class eateryManager {
    String lastName;
    String firstName;
    int tableNum;
    int mealAmount;

    public void saveEateryManager(){
        System.out.println("What is your lastname?: "+lastName);
        System.out.println("Whatis your Firstname?: "+firstName);
        System.out.println("What is your table number?: "+tableNum);
        System.out.println("How many meals would you have?: "+mealAmount);

    }
}
public void main(String[] args){
    Scanner read = new Scanner(System.in);
    String lastName = read.nextLine();
    String firstName = read.nextLine();
    int tableNum = read.nextInt();
    int mealAmount = read.nextInt();
    //idk wtf this is
    eateryManager  eatery = new eateryManager();
    eatery.lastName = lastName;
    eatery.firstName = firstName;
    eatery.tableNum = tableNum;
    eatery.mealAmount = mealAmount;

    eatery.saveEateryManager();


}
