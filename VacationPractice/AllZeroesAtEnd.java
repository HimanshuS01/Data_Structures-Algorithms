/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class AllZeroesAtEnd
/*    */ {
/*    */   public static void ZeroesAtEnd(int[] A)
/*    */   {
/*  8 */     int i = 0;
/*  9 */     if (i < A.length) {
/* 10 */       int j = i + 1;
/* 11 */       while (j < A.length)
/* 12 */         if ((A[i] == 0) && (A[j] == 0)) {
/* 13 */           j++;
/*    */         }
/* 15 */         else if ((A[i] == 0) && (A[j] != 0)) {
/* 16 */           int temp = A[i];
/* 17 */           A[i] = A[j];
/* 18 */           A[j] = temp;
/* 19 */           i++;
/* 20 */           j++;
/*    */         }
/*    */         else {
/* 23 */           i++;
/* 24 */           j++;
/*    */         }
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 34 */     Scanner s = new Scanner(System.in);
/* 35 */     System.out.println("Enter the number of elements");
/* 36 */     int n = s.nextInt();
/* 37 */     int[] A = new int[n];
/* 38 */     System.out.print("Enter Array elements:");
/* 39 */     for (int i = 0; i < A.length; i++) {
/* 40 */       A[i] = s.nextInt();
/*    */     }
/* 42 */     ZeroesAtEnd(A);
/* 43 */     for (int i = 0; i < A.length; i++) {
/* 44 */       System.out.print(A[i] + " ");
/*    */     }
/* 46 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.AllZeroesAtEnd
 * JD-Core Version:    0.6.2
 */