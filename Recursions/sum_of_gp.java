/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class sum_of_gp
/*    */ {
/*    */   public static float SumOfGp(float sum, int k)
/*    */   {
/*  7 */     if (k == 0) {
/*  8 */       return sum;
/*    */     }
/* 10 */     return SumOfGp(sum + (float)Math.pow(0.5D, k), k - 1);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 18 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 21 */     System.out.println("enter the power upto which sum is to be calculate");
/* 22 */     int k = s.nextInt();
/* 23 */     float result = SumOfGp(1.0F, k);
/* 24 */     System.out.println(result);
/* 25 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.sum_of_gp
 * JD-Core Version:    0.6.2
 */