import java.util.*;

class MarvellousX
{
    public void Display(String s)
    {
        for(int i = 0; i< s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
public class program22
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string :");
        String str = sobj.nextLine(); //nextline to accept the string

        MarvellousX obj = new MarvellousX();
        obj.Display(str);
}
}