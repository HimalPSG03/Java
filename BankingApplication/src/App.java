import java.util.Scanner;

import Customer.Customer_FileHandler;
import Customer.customerHandler;



public class App {
    
    public static void main(String[] args) throws Exception {
        Customer_FileHandler handler = new Customer_FileHandler();

        try {
            handler.initilize();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        printMenu();

    }
    static void printMenu(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter operation: \n 1.Add user \n 2.Deposit \n 3.Withdraw \n 4.fund transfer");
        int option;
        try {
            option = s.nextInt();
            customerHandler handler2 = new customerHandler();
            switch (option) {
                case 1:
                handler2.addCustomer();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Enter customer ID");
                    int customerId= s.nextInt();
                    System.out.println("Enter password:");
                    String password= s.next();
                    handler2.authenticateCustomer(customerId, password);
                    break;
                default:
                System.out.println("Invalid option");
                    break;
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        
        
    }
}
