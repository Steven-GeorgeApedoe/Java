import java.util.Scanner;

public class Customer{
    //add all necessary attributes here
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo(){
        System.out.println("Firstname: "+ firstName);
        System.out.println("Secondname: "+ secondName);
        System.out.println("Age: "+age);
        System.out.println("Room Number: "+ roomNumber);
    }

}

public void main(String[] args){
    Scanner read = new Scanner(System.in);
    String firstName = read.nextLine();
    String secondName = read.nextLine();
    int age = read.nextInt();
    int roomNumber = read.nextInt();
    //set customer's data to object here
    Customer customer = new Customer();
    customer.firstName =firstName;
    customer.secondName = secondName;
    customer.age = age;
    customer.roomNumber = roomNumber;




    customer.saveCustomerInfo();
}
