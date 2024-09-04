package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Customer.customer;

public class bank {


   public static List<customer> Customers = new ArrayList<>();
   public static HashMap<Integer,customer> customerMap = new HashMap<Integer,customer>();

   public static long refAccountNO;
   public static int refCustomerID;

   public static final Double INITIAL_BALANCE = 10000.0;

   
}
