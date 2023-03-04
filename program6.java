import java.util.*;

class Arithmetic
{
    public int iValue1;   // Characteristics
    public int iValue2;   // Characteristics
    

    public Arithmetic(int i, int j)   //parametrised constructor
    {
        iValue1 = i;
        iValue2 = j;

    }

    public int Addition()    //behaviour
    {
        int Sum = 0;
        Sum = iValue1 + iValue2;
        return Sum;
    }
}

public class program6 {
    
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number :");
        iNo2 = sobj.nextInt();
        
        Arithmetic aobj = new Arithmetic(iNo1, iNo2);
        iAns = aobj.Addition();

        System.out.println("Addition of two nos :" +iAns);
    }
}
