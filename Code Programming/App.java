public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        if(triangular(6, 0, 1))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    static boolean triangular(int num,int sum,int inc)
    {
        if(num==sum)
        {
            return true;
        }
        if(num < sum)
        {
            return false;
        }
        System.out.println(inc + "+"+ sum);
        return triangular(num, sum+inc,inc+1);
    }
}
