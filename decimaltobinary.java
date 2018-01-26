/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class decimaltobinary
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     System.out.println("Enter the number which you wants to convert into binary");
/*  9 */     Scanner s = new Scanner(System.in);
/* 10 */     int n = s.nextInt();
/* 11 */     int binary = 0; int i = 1;
/* 12 */     while (n > 0) {
/* 13 */       int rem = n % 2;
/* 14 */       n /= 2;
/* 15 */       binary += rem * i;
/* 16 */       i *= 10;
/*    */     }
/* 18 */     System.out.println("Binary number is " + binary);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     decimaltobinary
 * JD-Core Version:    0.6.2
 */