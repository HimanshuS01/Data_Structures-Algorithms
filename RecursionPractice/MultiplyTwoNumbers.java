/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class MultiplyTwoNumbers
/*    */ {
/*    */   public static int Multiply_Recursively(int m, int n)
/*    */   {
/*  9 */     if ((m == 1) && (n == 1)) {
/* 10 */       return 1;
/*    */     }
/* 12 */     if (n == 1) {
/* 13 */       return m;
/*    */     }
/* 15 */     if (m == 1) {
/* 16 */       return n;
/*    */     }
/*    */ 
/* 19 */     return m + Multiply_Recursively(m, n - 1);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 26 */     Scanner s = new Scanner(System.in);
/* 27 */     System.out.println("Enter the first number:");
/* 28 */     int m = s.nextInt();
/* 29 */     System.out.println("Enter the second number:");
/* 30 */     int n = s.nextInt();
/* 31 */     int answer = Multiply_Recursively(m, n);
/* 32 */     System.out.println(answer);
/* 33 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.MultiplyTwoNumbers
 * JD-Core Version:    0.6.2
 */