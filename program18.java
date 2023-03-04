import java.util.*;
//palindrome
// time complexity = n/2 if pallindrome , n if not
 class ArrayX
 {
     protected int Arr[];
     
     public ArrayX(int iSize)
     {
         Arr = new int[iSize];
     }
 
     protected void Accept()
     {
         Scanner sobj = new Scanner(System.in);
 
         System.out.println("Please enter" + Arr.length + "elements");
         for(int iCnt = 0; iCnt < Arr.length; iCnt++)
         {
             System.out.println("Enter the elements no :"+ (iCnt +1));
             Arr[iCnt] = sobj.nextInt();
         }
     }
 
     protected void Display()
     {
         System.out.println("Elements of array are :");
 
         for(int iCnt = 0; iCnt < Arr.length; iCnt++)
         {
             System.out.print(Arr[iCnt]+"\t");
         }
 
         System.out.println();
     }
 }

 class MarvellousX extends ArrayX
 {   
      public MarvellousX(int iSize)
      {
          super(iSize);
      }

      public boolean CheckPalindrome()
      {
          int iStart = 0;
          int iEnd = Arr.length-1;
          boolean bFLag = true;

          while(iStart < iEnd)
          {
              if(Arr[iStart] != Arr[iEnd])
              {
                bFLag = false;
                break;
              }
              iStart ++;
              iEnd--;
          }
          return bFLag;
      }

 }


 class program16
 {
     public static void main(String args[])
     {   
         Scanner sobj = new Scanner(System.in);
 
         System.out.println("Enter the size of array that you want to create");
         int iSize = sobj.nextInt();
 
         MarvellousX obj = new MarvellousX(iSize);  //After allocating size of class constructor calls
 
         obj.Accept();
 
         obj.Display();

         boolean bRet = obj.CheckPalindrome();
         if(bRet == true)
        {
            System.out.println("The array is pallindrome:" + bRet);
             
        }
        else
        {
            System.out.println("The array is not pallindrome:" + bRet);
        }
         
     }
 }   

