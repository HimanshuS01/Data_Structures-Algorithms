/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SelectionSort
/*    */ {
/*    */   public static void Selection_Sort(int[] A, int beg_index)
/*    */   {
/*  7 */     if (beg_index == A.length - 1) {
/*  8 */       return;
/*    */     }
/* 10 */     int min_Index = beg_index;
/* 11 */     for (int i = beg_index; i < A.length; i++) {
/* 12 */       if (A[i] < A[min_Index]) {
/* 13 */         min_Index = i;
/*    */       }
/*    */     }
/* 16 */     int temp = A[min_Index];
/* 17 */     A[min_Index] = A[beg_index];
/* 18 */     A[beg_index] = temp;
/* 19 */     beg_index++;
/* 20 */     Selection_Sort(A, beg_index);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 27 */     Scanner s = new Scanner(System.in);
/* 28 */     System.out.println("Enter the number of elements of an array");
/* 29 */     int n = s.nextInt();
/* 30 */     int[] A = new int[n];
/* 31 */     for (int i = 0; i < A.length; i++) {
/* 32 */       System.out.print("Enter the next number");
/* 33 */       A[i] = s.nextInt();
/*    */     }
/* 35 */     int beg_index = 0;
/* 36 */     Selection_Sort(A, beg_index);
/* 37 */     for (int i = 0; i < A.length; i++) {
/* 38 */       System.out.print(A[i] + " ");
/*    */     }
/* 40 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.SelectionSort
 * JD-Core Version:    0.6.2
 */