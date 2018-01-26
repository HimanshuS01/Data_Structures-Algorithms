/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Selection_Sort
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 10 */     Scanner s = new Scanner(System.in);
/* 11 */     System.out.println("Enter the elements of an array:");
/* 12 */     int n = s.nextInt();
/* 13 */     int[] A = new int[n];
/* 14 */     for (int i = 0; i < n; i++) {
/* 15 */       A[i] = s.nextInt();
/*    */     }
/*    */ 
/* 18 */     for (int i = 0; i < A.length; i++) {
/* 19 */       int min = A[i];
/* 20 */       int pos = i;
/* 21 */       for (int j = i + 1; j < A.length; j++) {
/* 22 */         if (A[j] < min) {
/* 23 */           min = A[j];
/* 24 */           pos = j;
/*    */         }
/*    */       }
/* 27 */       int temp = A[i];
/* 28 */       A[i] = A[pos];
/* 29 */       A[pos] = temp;
/*    */     }
/* 31 */     for (int i = 0; i < A.length; i++) {
/* 32 */       System.out.print(A[i] + " ");
/*    */     }
/* 34 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.Selection_Sort
 * JD-Core Version:    0.6.2
 */