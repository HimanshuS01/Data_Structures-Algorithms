/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SumOfDigits
/*    */ {
/*    */   public static int Sum_Of_Digits(int n)
/*    */   {
/*  7 */     if (n == 0) {
/*  8 */       return 0;
/*    */     }
/* 10 */     int carry = n % 10;
/* 11 */     int sum = 0;
/* 12 */     return sum + carry + Sum_Of_Digits(n / 10);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 16 */     Scanner s = new Scanner(System.in);
/* 17 */     System.out.println("Enter the number");
/* 18 */     int n = s.nextInt();
/* 19 */     int output = Sum_Of_Digits(n);
/* 20 */     System.out.println("Sum of the digits is " + output);
/* 21 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.SumOfDigits
 * JD-Core Version:    0.6.2
 */