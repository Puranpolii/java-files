import java.util.*;

class MarvellousX
{
    public int DigitCount(String s)
    {   
        int iCnt = 0;

        for(int i = 0; i< s.length(); i++)
        {
            
            if((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
            {
                iCnt++;
            }
            
        }
        return iCnt;
    }
}
public class program25
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string :");
        String str = sobj.nextLine(); //nextline to accept the string

        MarvellousX obj = new MarvellousX();
        int iRet = obj.DigitCount(str);
        System.out.println("Number of digits are:" + iRet);
}
}