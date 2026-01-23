public class Exception { 
    public static void main(String[] args)
    {
        try{
            int a=10;
            int b=0;
            int c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Zero "+e);
        }
        finally{
            System.out.println("Finally");
        }

    }
    
}
