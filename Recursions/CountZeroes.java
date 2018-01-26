/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class CountZeroes
/*    */ {
/*    */   public static int Count_Zeroes(int n)
/*    */   {
/*  7 */     if (n == 0) {
/*  8 */       return -1;
/*    */     }
/*    */ 
/* 11 */     if (n % 10 == 0) {
/* 12 */       return 1 + Count_Zeroes(n / 10);
/*    */     }
/* 14 */     return Count_Zeroes(n / 10);
/*    */   }
/*    */ 
/*    */   public static int CountZero(int n)
/*    */   {
/* 19 */     int count = 0;
/* 20 */     if (n == 0) {
/* 21 */       return -1;
/*    */     }
/* 23 */     if (n % 10 == 0) {
/* 24 */       count++;
/*    */     }
/* 26 */     return count + CountZero(n / 10);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 31 */     Scanner s = new Scanner(System.in);
/* 32 */     System.out.print("Enter an integer");
/* 33 */     int n = s.nextInt();
/* 34 */     int result = CountZero(n);
/* 35 */     if (result > 0) {
/* 36 */       System.out.println("Number of zeroes are " + (result + 1));
/*    */     }
/*    */     else {
/* 39 */       System.out.println("No zeroes found!!");
/*    */     }
/* 41 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.CountZeroes
 * JD-Core Version:    0.6.2
 */