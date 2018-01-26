/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class PrintDiamond
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 10 */     Scanner s = new Scanner(System.in);
/* 11 */     System.out.println("Enter the number of rows:");
/* 12 */     int n = s.nextInt();
/* 13 */     int x = n / 2;
/* 14 */     for (int i = 1; i <= x + 1; i++)
/*    */     {
/* 16 */       for (int j = i; j <= x; j++) {
/* 17 */         System.out.print(" ");
/*    */       }
/* 19 */       for (int k = 1; k <= 2 * i - 1; k++) {
/* 20 */         System.out.print("*");
/*    */       }
/* 22 */       System.out.println();
/*    */     }
/* 24 */     for (int i = 1; i <= n - (n / 2 + 1); i++)
/*    */     {
/* 26 */       for (int j = 1; j <= i; j++) {
/* 27 */         System.out.print(" ");
/*    */       }
/* 29 */       for (int k = 1; k <= 2 * x - 1; k++) {
/* 30 */         System.out.print("*");
/*    */       }
/* 32 */       x--;
/* 33 */       System.out.println();
/*    */     }
/* 35 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.PrintDiamond
 * JD-Core Version:    0.6.2
 */