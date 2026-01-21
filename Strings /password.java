import java.util.*;
public class passwordcheck {
    public static Boolean Validate(String pass)
    {
        if(pass.length()<8)
        {
            return false;
        }
        Boolean Uppercase =false;
        Boolean Lowercase = false;
        Boolean specialchar = false;
        Boolean isDigit = false;
        for(int i=0;i<pass.length();i++)
        {
            if(Character.isUpperCase(pass.charAt(i)))
            {
                Uppercase=true;
            }
            if(Character.isLowerCase(pass.charAt(i)))
            {
                Lowercase=true;
            }
            if(Character.isDigit(pass.charAt(i)))
            {
                isDigit=true;
            }
            if(!Character.isDigit(pass.charAt(i)))
            {
                specialchar=true;
            }
        }
        return Uppercase && Lowercase && isDigit && specialchar;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(Validate(str))
        {
            System.out.println("Valid password"+str);
        }
        else{
            System.out.println("Invalid password"+str);
        }
    }
}
