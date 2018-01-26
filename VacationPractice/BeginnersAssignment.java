/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class BeginnersAssignment
/*    */ {
/*    */   public static int calc_power(int num, int power)
/*    */   {
/*  8 */     int product = 1;
/*  9 */     for (int i = 0; i < power; i++) {
/* 10 */       product *= num;
/*    */     }
/* 12 */     return product;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 18 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 31 */     System.out.println("Enter the  number of rows:");
/* 32 */     int N = s.nextInt();
/* 33 */     for (int i = 0; i < N; i++) {
/* 34 */       int x = (calc_power(10, i) + 1) * i;
/* 35 */       System.out.println(x);
/*    */     }
/* 37 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.BeginnersAssignment
 * JD-Core Version:    0.6.2
 */