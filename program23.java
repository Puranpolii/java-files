import java.util.*;

class MarvellousX
{
    public int SmallCount(String s)
    {   
        int iCnt = 0;

        for(int i = 0; i< s.length(); i++)
        {
            
            if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
            {
                iCnt++;
            }
            
        }
        return iCnt;
    }
}
public class program23
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string :");
        String str = sobj.nextLine(); //nextline to accept the string

        MarvellousX obj = new MarvellousX();
        int iRet = obj.SmallCount(str);
        System.out.println("Number of small case letters are:" + iRet);
}
}