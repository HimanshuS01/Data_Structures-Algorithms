/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class sumofarray
/*    */ {
/*    */   public static int InputSum(int[] input)
/*    */   {
/*  7 */     int i = 0; int sum = 0;
/*  8 */     while (i < input.length)
/*    */     {
/* 10 */       sum += input[i];
/* 11 */       i++;
/*    */     }
/*    */ 
/* 14 */     return sum;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 20 */     System.out.println("Enter the number of inputs");
/* 21 */     Scanner s = new Scanner(System.in);
/* 22 */     int n = s.nextInt();
/* 23 */     int[] input = new int[n];
/* 24 */     int i = 0;
/* 25 */     while (i < n)
/*    */     {
/* 27 */       System.out.println("Enter the next number");
/* 28 */       input[i] = s.nextInt();
/* 29 */       i++;
/*    */     }
/* 31 */     System.out.println("Sum is:");
/* 32 */     System.out.print(InputSum(input));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     sumofarray
 * JD-Core Version:    0.6.2
 */