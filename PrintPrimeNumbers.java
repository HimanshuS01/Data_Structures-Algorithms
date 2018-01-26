/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class PrintPrimeNumbers
/*    */ {
/*    */   public static boolean isPrime(int number)
/*    */   {
/*  9 */     int x = 2;
/* 10 */     while (x <= number - 1) {
/* 11 */       if (number % x == 0) {
/* 12 */         return false;
/*    */       }
/* 14 */       x++;
/*    */     }
/* 16 */     return true;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 20 */     Scanner s = new Scanner(System.in);
/* 21 */     System.out.println("Enter the number upto which prime numbers has to be printed:");
/* 22 */     int n = s.nextInt();
/* 23 */     for (int i = 2; i < n; i++)
/* 24 */       if (isPrime(i))
/* 25 */         System.out.print(i + " ");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PrintPrimeNumbers
 * JD-Core Version:    0.6.2
 */