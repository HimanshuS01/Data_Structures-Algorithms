/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class RemoveDuplicatesInArray
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 10 */     Scanner s = new Scanner(System.in);
/* 11 */     System.out.println("Enter the number of elements");
/* 12 */     int n = s.nextInt();
/* 13 */     int sum1 = 0;
/* 14 */     int[] A = new int[n];
/* 15 */     System.out.print("Enter Array elements:");
/* 16 */     for (int i = 0; i < A.length; i++) {
/* 17 */       A[i] = s.nextInt();
/* 18 */       sum1 += A[i];
/*    */     }
/* 20 */     int sum2 = sum1 - A[(A.length - 1)];
/* 21 */     System.out.println("Duplicate number is:" + (sum1 - sum2));
/* 22 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.RemoveDuplicatesInArray
 * JD-Core Version:    0.6.2
 */