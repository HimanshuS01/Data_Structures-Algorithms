/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SumOfSeries
/*    */ {
/*    */   public static float Sum_Of_Series(float sum, int k)
/*    */   {
/*  8 */     if (k == 0) {
/*  9 */       return sum;
/*    */     }
/* 11 */     return Sum_Of_Series(sum + (float)Math.pow(0.5D, k), k - 1);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 16 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 19 */     System.out.println("Enter the power upto which sum is about to calculate:");
/* 20 */     int k = s.nextInt();
/* 21 */     float result = Sum_Of_Series(1.0F, k);
/* 22 */     System.out.println(result);
/* 23 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.SumOfSeries
 * JD-Core Version:    0.6.2
 */