/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class CountRotation
/*    */ {
/*    */   public static void FindRotation(int[] A, int beg)
/*    */   {
/*  9 */     int end = A.length - 1;
/* 10 */     int mid = (beg + end) / 2;
/* 11 */     if (A.length == 1) {
/* 12 */       return;
/*    */     }
/*    */ 
/* 15 */     while (mid > 0) {
/* 16 */       if ((A[beg] < A[mid]) && (A[mid] < A[(A.length - 1)])) {
/*    */         break;
/*    */       }
/* 19 */       if ((A[(mid - 1)] < A[mid]) && (A[mid] < A[(mid + 1)])) {
/* 20 */         if (A[beg] < A[mid]) {
/* 21 */           mid++;
/*    */         }
/*    */         else
/* 24 */           mid--;
/*    */       }
/*    */       else {
/* 27 */         if ((A[(mid - 1)] >= A[mid]) || (A[(mid + 1)] >= A[mid])) break;
/* 28 */         mid++;
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 34 */     int k = 0;
/* 35 */     while (beg < mid) {
/* 36 */       if (A[beg] > A[(beg + 1)]) {
/*    */         break;
/*    */       }
/* 39 */       if ((A[beg] >= A[(beg + 1)]) || (A[beg] <= A[mid])) break;
/* 40 */       k++;
/* 41 */       beg++;
/*    */     }
/*    */ 
/* 47 */     System.out.println("Number of rotation is:" + (k + 1));
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 52 */     Scanner s = new Scanner(System.in);
/* 53 */     System.out.println("Enter the number of elements:");
/* 54 */     int n = s.nextInt();
/* 55 */     int[] A = new int[n];
/* 56 */     for (int i = 0; i < A.length; i++) {
/* 57 */       A[i] = s.nextInt();
/*    */     }
/* 59 */     int beg = 0;
/* 60 */     FindRotation(A, beg);
/*    */ 
/* 62 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.CountRotation
 * JD-Core Version:    0.6.2
 */