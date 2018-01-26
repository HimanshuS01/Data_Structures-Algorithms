/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class MergeSortRecursively
/*    */ {
/*    */   public static void Merge(int[] L, int[] R, int[] A)
/*    */   {
/*  8 */     int i = 0; int j = 0; int k = 0;
/*    */     do {
/* 10 */       if (L[i] <= R[j]) {
/* 11 */         A[k] = L[i];
/* 12 */         k++;
/* 13 */         i++;
/*    */       }
/*    */       else {
/* 16 */         A[k] = R[j];
/* 17 */         k++;
/* 18 */         j++;
/*    */       }
/*  9 */       if (i >= L.length) break;  } while (j < R.length);
/*    */ 
/* 21 */     while (i < L.length) {
/* 22 */       A[k] = L[i];
/* 23 */       k++;
/* 24 */       i++;
/*    */     }
/* 26 */     while (j < R.length) {
/* 27 */       A[k] = R[j];
/* 28 */       k++;
/* 29 */       j++;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void MergeSort(int[] A) {
/* 34 */     if (A.length <= 1) {
/* 35 */       return;
/*    */     }
/* 37 */     int beg = 0;
/* 38 */     int end = A.length - 1;
/* 39 */     int mid = (beg + end) / 2;
/* 40 */     int[] L = new int[mid + 1];
/* 41 */     int[] R = new int[end - mid];
/* 42 */     for (int i = 0; i < L.length; i++) {
/* 43 */       L[i] = A[i];
/*    */     }
/* 45 */     int k = 0;
/* 46 */     for (int j = mid + 1; j <= end; j++) {
/* 47 */       R[k] = A[j];
/* 48 */       k++;
/*    */     }
/* 50 */     MergeSort(L);
/* 51 */     MergeSort(R);
/* 52 */     Merge(L, R, A);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 58 */     Scanner s = new Scanner(System.in);
/* 59 */     System.out.println("Enter the array elements");
/* 60 */     int n = s.nextInt();
/* 61 */     int[] A = new int[n];
/* 62 */     for (int i = 0; i < A.length; i++) {
/* 63 */       A[i] = s.nextInt();
/*    */     }
/* 65 */     MergeSort(A);
/* 66 */     for (int i = 0; i < A.length; i++) {
/* 67 */       System.out.print(A[i] + " ");
/*    */     }
/* 69 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.MergeSortRecursively
 * JD-Core Version:    0.6.2
 */