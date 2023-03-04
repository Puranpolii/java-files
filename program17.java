import java.util.*;
 // reverse the elements of array
//time complexity = n/2 (50 times loop firel)
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
      
      public void Reverse()
      {
         int iStart = 0;
         int iEnd = Arr.length-1;  // indexing 0 pasna hota so... 0 1 2 3 4
         int iTemp = 0;

         while(iStart < iEnd)
         {
            iTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = iTemp;

            iStart++;
            iEnd--;
         }
      }
 }


 class program17
 {
     public static void main(String args[])
     {   
         Scanner sobj = new Scanner(System.in);
 
         System.out.println("Enter the size of array that you want to create");
         int iSize = sobj.nextInt();
 
         MarvellousX obj = new MarvellousX(iSize);  //After allocating size of class constructor calls
 
         obj.Accept();
 
         obj.Display();

         obj.Reverse();
         System.out.println("Array after reverse operation"); 

         obj.Display();

     }
 }   

