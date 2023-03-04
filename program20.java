import java.util.*;

public class program20
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String str = sobj.nextLine(); //nextline to accept the string

        System.out.println("Numbers of characters are:" + str.length());
    }
}