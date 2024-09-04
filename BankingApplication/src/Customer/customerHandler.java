package Customer;

import java.util.Scanner;

import bank.bank;

public class customerHandler {

    public void addCustomer(){

        Scanner s= new Scanner(System.in);

        System.out.println("Enter customer name");
        String name = s.nextLine();

        System.out.println("Enter password");
        String password = s.nextLine();

        System.out.println("Re-enter passowrd");
        String duplicate = s.nextLine();

        s.close();;

        if(!password.equals(duplicate)){
            System.out.println("Password mis match");
            return;
        }

        if(!isValid(password))
        {
            System.out.println("password invalid");
            return;
        }
        password=getEncryptPass(password);

        bank.refAccountNO++;
        bank.refCustomerID++;

        customer c = new customer(
            bank.refCustomerID,
            bank.refAccountNO,
            name,
            bank.INITIAL_BALANCE,
            password
        );
        bank.Customers.add(c);

        Customer_FileHandler.getInstance().addCustomerToFile(c);
    }

    private static boolean isValid(String passowrd)
    {
        char[] passChar = passowrd.toCharArray();
        for (char c : passChar) {
            if((c>=97 && c<= 122) || (c>=65 && c<=90) || c>=47 && c<=57)
            {
                continue;
            }
            else
            {
                return false;
            }
            
        }
        return true;
    }

    private static String getEncryptPass(String password)
    {
        char[] passChar = password.toCharArray();

        for(int i=0;i<password.length();i++)
        {
            if(passChar[i]=='z' ||passChar[i]=='Z'||passChar[i]=='9'){
                switch (passChar[i]) {
                    case 'z':
                        passChar[i]='a';
                        break;
                    case 'Z':
                        passChar[i]='A';
                        break;
                    case '9':
                        passChar[i]='0';
                        break;
                    default:
                        break;
                }
            }
            else{
                passChar[i]+=1;
            }
            
        }

        String encryptPass = String.valueOf(passChar);
        return encryptPass;
    }

    public void authenticateCustomer(int customerID,String password){

        String encrypted = getEncryptPass(password);

        customer c= bank.customerMap.get(customerID);

        if(c==null)
        {
            System.out.println("invalid username");
            return;
        }

        if(encrypted.equals(c.password))
        {
            System.out.println("valid user");
        }
        else{
            System.out.println("incorrect password");
        }

    }
}
