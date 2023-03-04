//Armstrong Number (153 = 1^3 + 5^3 + 3^3)
import java.util.*;

 class Digits
{  
    
    public boolean CheckArmstrong(int iNo)
    {
        int iDigitCount = 0;
        int iTemp = iNo;
        int iDigit = 0;
        int iCnt = 0;
        int iPower = 1, iSum = 0;

        while(iTemp != 0)    //logic to calc digit
        {
            iDigitCount++;
            iTemp = iTemp /10;
        }

        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            for (iCnt = 1; iCnt <= iDigitCount; iCnt ++)   //logic to calc power
            {
              iPower = iPower * iDigit;
            }
            iSum = iSum + iPower;
            iPower = 1;
            
            iTemp = iTemp / 10;
        }

        if(iSum == iNo)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
}
public class program14
{    
    public static void main(String A[])
    {
     try (Scanner sobj = new Scanner(System.in)) {
        System.out.println("Please enter number");
         int iNo = sobj.nextInt();

         Digits nobj = new Digits();

         boolean bRet = nobj.CheckArmstrong(iNo);
         if(bRet == true)
         {
            System.out.println(iNo+ "is a Armstrong NUmber");
         }
         else
         {
            System.out.println(iNo+ "is not a Armstrong Number");
         }
    }
    }
}
