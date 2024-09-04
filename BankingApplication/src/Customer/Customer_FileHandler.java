package Customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import bank.bank;

public class Customer_FileHandler {

    private static final String filename="src/bank_db.txt";

    static Customer_FileHandler handler;

    public static Customer_FileHandler getInstance(){
        if(handler==null)
        {
            handler= new Customer_FileHandler();
        }
        return handler;
    }
    

    public void initilize() throws IOException{
        File file = new File(filename);

        BufferedReader reader = new BufferedReader(
            new FileReader(file)
        );

        String customerInfo = reader.readLine();
        do {
            customer customerClass= castStringToCustomer(customerInfo);
            bank.Customers.add(customerClass);
            bank.customerMap.put(customerClass.customerID, customerClass);
            customerInfo = reader.readLine();
        } while (customerInfo!=null);

        int position=bank.Customers.size()-1;
        bank.refAccountNO=bank.Customers.get(position).AccountNO;
        bank.refCustomerID=bank.Customers.get(position).customerID;

        reader.close();

    }

    private customer castStringToCustomer(String customerInfo)
    {
        String[] trimmedInfo = customerInfo.split(" ");

        customer customer = new customer(
            Integer.parseInt(trimmedInfo[0]),
            Integer.parseInt(trimmedInfo[1]),
            trimmedInfo[2],
            Double.parseDouble(trimmedInfo[3]),
            trimmedInfo[4]
        );

        return customer;
    }

    public void addCustomerToFile(customer c)
    {
        File file = new File(filename);
        BufferedWriter writer=null;
        try{
            writer= new BufferedWriter(
                new FileWriter(file,true)
            );
            writer.write(c.toString());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(writer!=null)
            {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
