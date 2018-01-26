/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class MergeSort
/*    */ {
/*    */   public static void Merge(int[] L, int[] R, int[] A)
/*    */   {
/* 12 */     int j = 0; int k = 0; int i = 0;
/*    */     do
/*    */     {
/* 16 */       if (L[j] <= R[k]) {
/* 17 */         A[i] = L[j];
/* 18 */         j++;
/* 19 */         i++;
/*    */       }
/*    */       else
/*    */       {
/* 23 */         A[i] = R[k];
/* 24 */         k++;
/* 25 */         i++;
/*    */       }
/* 14 */       if (j >= L.length) break;  } while (k < R.length);
/*    */ 
/* 28 */     while (j < L.length) {
/* 29 */       A[i] = L[j];
/* 30 */       i++;
/* 31 */       j++;
/*    */     }
/* 33 */     while (k < R.length) {
/* 34 */       A[i] = R[k];
/* 35 */       i++;
/* 36 */       k++;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void Merge_Sort(int[] A)
/*    */   {
/* 42 */     if (A.length <= 1) {
/* 43 */       return;
/*    */     }
/*    */ 
/* 46 */     int beg = 0;
/* 47 */     int end = A.length - 1;
/* 48 */     int mid = (beg + end) / 2;
/* 49 */     int[] L = new int[mid + 1];
/* 50 */     int[] R = new int[end - mid];
/* 51 */     for (int i = 0; i <= mid; i++) {
/* 52 */       L[i] = A[i];
/*    */     }
/*    */ 
/* 55 */     for (int i = mid + 1; i <= end; i++) {
/* 56 */       R[(i - mid - 1)] = A[i];
/*    */     }
/*    */ 
/* 60 */     Merge_Sort(L);
/* 61 */     Merge_Sort(R);
/* 62 */     Merge(L, R, A);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 69 */     Scanner s = new Scanner(System.in);
/* 70 */     System.out.println("Enter the number of elements");
/* 71 */     int n = s.nextInt();
/* 72 */     int[] input = new int[n];
/* 73 */     for (int i = 0; i < input.length; i++) {
/* 74 */       input[i] = s.nextInt();
/*    */     }
/* 76 */     Merge_Sort(input);
/* 77 */     for (int i = 0; i < input.length; i++) {
/* 78 */       System.out.print(input[i] + " ");
/*    */     }
/* 80 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.MergeSort
 * JD-Core Version:    0.6.2
 */