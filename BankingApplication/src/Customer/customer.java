package Customer;

public class customer {

    public static final String SPACE=" ";

    public int customerID;
    public long AccountNO;
    public String name;
    public Double balance;
    public String password;

    customer(int customerID,long AccountNO,String name,Double balance, String passowrd){
        
        this.AccountNO=AccountNO;
        this.balance=balance;
        this.customerID=customerID;
        this.name=name;
        this.password=passowrd;
    }
    @Override
   public String toString(){
    return "\n"+customerID+ SPACE +
             AccountNO + SPACE
            + name + SPACE
            + balance + SPACE
            + password;

   }

}
