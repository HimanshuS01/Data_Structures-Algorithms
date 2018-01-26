/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Inputsum
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner s = new Scanner(System.in);
/*  9 */     System.out.println("enter number of inputs");
/* 10 */     int n = s.nextInt();
/* 11 */     int x = 1; int sum = 0;
/* 12 */     while (x <= n)
/*    */     {
/* 14 */       sum += x;
/* 15 */       x++;
/*    */     }
/* 17 */     System.out.println("sum is:" + sum);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Inputsum
 * JD-Core Version:    0.6.2
 */