/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Recursions
/*    */ {
/*    */   public static int power(int x, int n)
/*    */   {
/*  6 */     if (n == 0) {
/*  7 */       return 1;
/*    */     }
/*  9 */     return x * power(x, n - 1);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 15 */     Scanner s = new Scanner(System.in);
/* 16 */     System.out.println("Enter the number");
/* 17 */     int x = s.nextInt();
/* 18 */     System.out.println(" Enter the power");
/* 19 */     int n = s.nextInt();
/* 20 */     int answer = power(x, n);
/* 21 */     if (answer == 1) {
/* 22 */       System.out.println(" Answer is" + answer);
/*    */     }
/*    */     else
/* 25 */       System.out.println(" Answer is" + answer);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions
 * JD-Core Version:    0.6.2
 */