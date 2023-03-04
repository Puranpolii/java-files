
// multiplication of factors
import java.util.*;

class Numbers
{
   public int Factorsmultiplication(int iNo)
   {
      int iCnt = 0;
      int iMult = 1;
      
      for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
      {
         if((iNo % iCnt) == 0)
         {
            iMult = iMult *iCnt;
         }
      }
       return iMult;

   }
}
public class program12
{
    public static void main(String A[])
    {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Please enter first number");
     int iNo = sobj.nextInt();
    
     Numbers nobj = new Numbers();

    int iRet = nobj.Factorsmultiplication(iNo);

    System.out.println("Multiplication of factors of"+ iNo +"is:"+ iRet);
    }
}
