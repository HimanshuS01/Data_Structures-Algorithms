/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Fibonacci
/*    */ {
/*    */   public static int[] FibDp(int number)
/*    */   {
/* 16 */     int[] A = new int[number + 1];
/* 17 */     A[0] = 0;
/* 18 */     A[1] = 1;
/* 19 */     for (int i = 2; i <= number; i++) {
/* 20 */       A[i] = (A[(i - 1)] + A[(i - 2)]);
/*    */     }
/* 22 */     return A;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 28 */     Scanner s = new Scanner(System.in);
/* 29 */     System.out.println("Enter the number:");
/* 30 */     int number = s.nextInt();
/* 31 */     int[] Array = FibDp(number);
/* 32 */     for (int i = 0; i < Array.length; i++) {
/* 33 */       System.out.print(Array[i] + " ");
/*    */     }
/* 35 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.Fibonacci
 * JD-Core Version:    0.6.2
 */