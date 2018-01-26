/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class CountZeroesRecursively
/*    */ {
/*    */   public static int count(int n)
/*    */   {
/*  7 */     int count = 0;
/*  8 */     if (n == 0)
/*  9 */       return 1;
/* 10 */     if (n % 10 == 0) {
/* 11 */       count++;
/* 12 */       return count + count(n / 10);
/*    */     }
/*    */ 
/* 15 */     return count(n / 10);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 20 */     Scanner s = new Scanner(System.in);
/* 21 */     System.out.println("Enter the number");
/* 22 */     int n = s.nextInt();
/* 23 */     int x = count(n);
/* 24 */     if (x > 0) {
/* 25 */       System.out.println(x - 1);
/*    */     }
/*    */     else {
/* 28 */       System.out.println("No zeroes present");
/*    */     }
/* 30 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.CountZeroesRecursively
 * JD-Core Version:    0.6.2
 */