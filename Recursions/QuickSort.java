/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class QuickSort
/*    */ {
/*    */   public static int partition(int[] A, int beg, int end)
/*    */   {
/*  7 */     int count = beg;
/*  8 */     int min = A[beg];
/*  9 */     for (int i = beg + 1; i <= end; i++) {
/* 10 */       if (min > A[i]) {
/* 11 */         count++;
/*    */       }
/*    */     }
/*    */ 
/* 15 */     return count;
/*    */   }
/*    */ 
/*    */   public static void Quick_Sort(int[] A, int beg, int end)
/*    */   {
/* 20 */     if (beg >= end) {
/* 21 */       return;
/*    */     }
/* 23 */     int PivotPosition = partition(A, beg, end);
/* 24 */     int temp = A[beg];
/* 25 */     A[beg] = A[PivotPosition];
/* 26 */     A[PivotPosition] = temp;
/*    */ 
/* 28 */     int i = beg;
/* 29 */     int j = end;
/* 30 */     while ((i < PivotPosition) && (j > PivotPosition)) {
/* 31 */       if (A[i] > A[PivotPosition])
/*    */       {
/* 33 */         if (A[j] < A[PivotPosition])
/*    */         {
/* 36 */           int temp1 = A[i];
/* 37 */           A[i] = A[j];
/* 38 */           A[j] = temp1;
/*    */         }
/*    */         else
/*    */         {
/* 42 */           j--;
/*    */         }
/*    */       }
/*    */       else {
/* 46 */         i++;
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 53 */     Quick_Sort(A, beg, PivotPosition - 1);
/* 54 */     Quick_Sort(A, PivotPosition + 1, end);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 59 */     Scanner s = new Scanner(System.in);
/* 60 */     System.out.println("Enter the  number of elements");
/* 61 */     int n = s.nextInt();
/* 62 */     int[] A = new int[n];
/* 63 */     for (int i = 0; i < n; i++) {
/* 64 */       System.out.println("Enter the  next number");
/* 65 */       A[i] = s.nextInt();
/*    */     }
/* 67 */     int beg = 0;
/* 68 */     int end = A.length - 1;
/* 69 */     for (int i = 0; i < n; i++) {
/* 70 */       System.out.print(A[i] + " ");
/*    */     }
/* 72 */     Quick_Sort(A, beg, end);
/* 73 */     System.out.println(" ");
/* 74 */     for (int i = 0; i < n; i++) {
/* 75 */       System.out.print(A[i] + " ");
/*    */     }
/*    */ 
/* 78 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.QuickSort
 * JD-Core Version:    0.6.2
 */