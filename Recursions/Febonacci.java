/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Febonacci
/*    */ {
/*    */   public static int fibonacci(int n)
/*    */   {
/* 10 */     if (n == 0) {
/* 11 */       return 0;
/*    */     }
/* 13 */     if (n == 1) {
/* 14 */       return 1;
/*    */     }
/* 16 */     return fibonacci(n - 1) + fibonacci(n - 2);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 22 */     System.out.println("Enter the number upto which fibonacii number will print");
/* 23 */     Scanner s = new Scanner(System.in);
/* 24 */     int x = s.nextInt();
/*    */ 
/* 26 */     for (int i = 0; i <= x; i++) {
/* 27 */       System.out.print(fibonacci(i) + " ");
/*    */     }
/* 29 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.Febonacci
 * JD-Core Version:    0.6.2
 */