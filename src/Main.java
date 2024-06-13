import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write once, run forever! ");
        System.out.println("Here we go again with Java");
        String name = "Stybo";
        System.out.println(name);
        //Creating a char  data type//
        char letter = 'C';
        System.out.println(letter);

        int wins = 15;
        double ties = 7.6;
        double total = wins + ties;
        System.out.println(total);
        //*To take input from the user, we first must import
       //  the corresponding class.
      //  That is done using the following line://*
        Scanner scanner =new Scanner(System.in);
        String newname =scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Name: "+newname);
        System.out.println("Age:"+age);
//Using double
        double amount = scanner.nextDouble();
        double totalAmount = (amount*15)/100;
        System.out.println("Your total amount is: "+totalAmount);


        //learning about Conditionals and conditional statements
        int styboAge = 21;
        if (styboAge== 30){
            System.out.println("Bingo");
        }
        else {
            System.out.println("Stybo is "+styboAge+"years old so he is not eleigible");
        }

        /*using the switch statement*/
        //using days of the week
        int day = 6;//no case switch has 6 as input so it will be default

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Sunday");
        }

        /*learning while loops
        * here's a simple one below*/

        int w = 1;

        while(w<=9){
            System.out.println(w);
            w = w+1;

            //using the break statement in loops for loop control
            System.out.println("Using a for loop");
            int b = 10;
            while(b < 20){
                System.out.println(b);
                if(b == 15){
                    break;
                }
                b++;
            }
        }
        //learniin Arrays
        //let us use height as an example
        int[] high;
        /*Now, to create the array,
         we need to specify the number of items
         it will hold using the <b>new </b>keyword:*/
        int[] height ;
        height = new int[2];

        /*The given calendar program should output the corresponding day of week from user input,*/
        //fix the declaration of array
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //do not change this code
        int  number = scanner.nextInt();
        System.out.println(days[number]);


        //using a loop with an Array
        int[] ages = {18, 33, 24, 64, 45};
        int sum = 0;//inputting sum for calculations
        for(int x=0;x<ages.length;x++) {
            sum +=ages[x];//this will sum all the inputs in the arrays. answer is 184
            System.out.println(ages[x]);

            //learning the for each loop
            int[] count ={3, 5, 8, 9,};
            //using for loop to establish the for each loop
            for (int s: count){
                System.out.println(s);
            }
        }
        //using for each loop to calculate sum
        int[] add ={2,4,6,8,9,22};
        int added = 0;
        for (int x: add){
            added +=x;
        }
        System.out.println(added);


        /*Using a for loop to loop over arrays
        *
        * for example: for(int x=0; x<arr.length; x++){
        * }
        *
        * for(int x: arr){
        * //current item is x
        * }
        * */



        //learning methods

    }
}