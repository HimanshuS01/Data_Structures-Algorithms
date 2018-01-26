/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SumOfDigit
/*    */ {
/*    */   public static int Sum_Of_Digits(int n)
/*    */   {
/*  8 */     if (n == 0) {
/*  9 */       return 0;
/*    */     }
/* 11 */     if (n == 1) {
/* 12 */       return 1;
/*    */     }
/*    */ 
/* 15 */     int carry = n % 10;
/* 16 */     return carry + Sum_Of_Digits(n / 10);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 21 */     Scanner s = new Scanner(System.in);
/* 22 */     System.out.println("Enter an integer:");
/* 23 */     int n = s.nextInt();
/* 24 */     int result = Sum_Of_Digits(n);
/* 25 */     System.out.println(result);
/* 26 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.SumOfDigit
 * JD-Core Version:    0.6.2
 */