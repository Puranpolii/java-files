import java.util.*;

public class program26
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string :");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        
        System.out.println("Data is :" + Arr);
        
        for(int i = 0; i< Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
