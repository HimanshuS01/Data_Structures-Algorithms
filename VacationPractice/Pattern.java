/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Pattern
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 10 */     Scanner s = new Scanner(System.in);
/* 11 */     System.out.println("Enter the number of rows:");
/* 12 */     int N = s.nextInt();
/* 13 */     for (int i = 1; i <= N; i++) {
/* 14 */       System.out.print("*");
/*    */     }
/*    */ 
/* 17 */     int x = N;
/* 18 */     System.out.println();
/*    */ 
/* 20 */     for (int i = 1; i <= N / 2; i++)
/*    */     {
/* 22 */       int stars = x - i;
/* 23 */       int count = 0;
/*    */ 
/* 25 */       for (int j = 1; j <= stars / 2; j++) {
/* 26 */         System.out.print("*");
/*    */       }
/*    */ 
/* 29 */       for (int k = 1; k <= 2 * i - 1; k++) {
/* 30 */         System.out.print(" ");
/* 31 */         count++;
/*    */       }
/*    */ 
/* 34 */       for (int l = stars / 2 + count + 1; l <= N; l++) {
/* 35 */         System.out.print("*");
/*    */       }
/*    */ 
/* 38 */       x--;
/* 39 */       System.out.println();
/*    */     }
/* 41 */     int y = N / 2 - 1;
/* 42 */     int a = y;
/* 43 */     int z = y;
/*    */ 
/* 45 */     for (int i = 1; i <= y; i++)
/*    */     {
/* 47 */       int count_stars = 0;
/* 48 */       for (int j = 1; j <= (a + 1) / 2; j++) {
/* 49 */         System.out.print("*");
/* 50 */         count_stars++;
/*    */       }
/* 52 */       a += 2;
/*    */ 
/* 54 */       int count_space = 0;
/* 55 */       for (int k = 1; k <= 2 * z - 1; k++) {
/* 56 */         System.out.print(" ");
/* 57 */         count_space++;
/*    */       }
/*    */ 
/* 60 */       for (int l = count_space + count_stars + 1; l <= N; l++) {
/* 61 */         System.out.print("*");
/*    */       }
/*    */ 
/* 64 */       z--;
/* 65 */       System.out.println();
/*    */     }
/* 67 */     for (int i = 1; i <= N; i++) {
/* 68 */       System.out.print("*");
/*    */     }
/* 70 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.Pattern
 * JD-Core Version:    0.6.2
 */