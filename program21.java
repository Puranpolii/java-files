import java.util.*;

public class program21
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String str = sobj.nextLine(); //nextline to accept the string

        for(int i = 0; i< str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
}
}