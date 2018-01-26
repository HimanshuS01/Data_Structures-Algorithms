/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Fibinacci
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 12 */     int sum = 0; int first = 0; int second = 1;
/* 13 */     System.out.println("Enter the number upto which Fibonacci numbers is to be printed:");
/* 14 */     Scanner s = new Scanner(System.in);
/* 15 */     int num = s.nextInt();
/* 16 */     System.out.print(first + " " + second);
/* 17 */     sum = first + second;
/* 18 */     while (sum < num) {
/* 19 */       System.out.print(" " + sum + " ");
/* 20 */       first = second;
/* 21 */       second = sum;
/* 22 */       sum = first + second;
/*    */     }
/* 24 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.Fibinacci
 * JD-Core Version:    0.6.2
 */