/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class prime1
/*    */ {
/*    */   public static boolean isPrime(int n)
/*    */   {
/*  6 */     int x = 2;
/*    */ 
/*  8 */     while (x <= n - 1) {
/*  9 */       if (n % x == 0) {
/* 10 */         return false;
/*    */       }
/* 12 */       x++;
/*    */     }
/* 14 */     return true;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 19 */     System.out.println("Enter the number");
/* 20 */     Scanner s = new Scanner(System.in);
/* 21 */     int n = s.nextInt();
/* 22 */     boolean isp = isPrime(n);
/*    */ 
/* 24 */     if (isp)
/* 25 */       System.out.println("prime");
/*    */     else
/* 27 */       System.out.println("not prime");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     prime1
 * JD-Core Version:    0.6.2
 */