public class Excep_ {
    public static void main(String[] args)
    {
        int age = 16;
        if(age<18)
        {
            throw new ArithmeticException("Getout");
        }
        else{
            System.out.println("CastVote");
        }
        System.out.println("Continue");
    }
}
