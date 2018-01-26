/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ArraySort01
/*    */ {
/*    */   public static void ArraySort(int[] A, int beg, int end)
/*    */   {
/*  7 */     if (beg >= end) {
/*  8 */       return;
/*    */     }
/*    */ 
/* 11 */     if ((A[beg] == 1) && (A[end] == 0)) {
/* 12 */       int temp = A[end];
/* 13 */       A[end] = A[beg];
/* 14 */       A[beg] = temp;
/* 15 */       ArraySort(A, beg + 1, end - 1);
/*    */     }
/* 18 */     else if ((A[beg] == 0) && (A[end] == 1)) {
/* 19 */       ArraySort(A, beg + 1, end - 1);
/*    */     }
/* 22 */     else if ((A[beg] == 0) && (A[end] == 0)) {
/* 23 */       ArraySort(A, beg + 1, end);
/*    */     }
/* 26 */     else if ((A[beg] == 1) && (A[end] == 1)) {
/* 27 */       ArraySort(A, beg, end - 1);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void sort_zero_one(int[] arr)
/*    */   {
/* 34 */     int countZeroes = 0;
/* 35 */     for (int i = 0; i < arr.length; i++) {
/* 36 */       if (arr[i] == 0) {
/* 37 */         countZeroes++;
/*    */       }
/*    */     }
/* 40 */     for (int i = 0; i < arr.length; i++)
/* 41 */       if (i < countZeroes) {
/* 42 */         arr[i] = 0;
/*    */       }
/*    */       else
/* 45 */         arr[i] = 1;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 52 */     Scanner s = new Scanner(System.in);
/* 53 */     System.out.println("Enter the  number of elements");
/* 54 */     int n = s.nextInt();
/* 55 */     int[] A = new int[n];
/* 56 */     for (int i = 0; i < n; i++) {
/* 57 */       System.out.println("Enter the  next number");
/* 58 */       A[i] = s.nextInt();
/*    */     }
/*    */ 
/* 61 */     System.out.println("Array before change is");
/* 62 */     for (int i = 0; i < n; i++) {
/* 63 */       System.out.print(A[i] + " ");
/*    */     }
/* 65 */     System.out.println();
/*    */ 
/* 67 */     System.out.println("Array after sort is");
/*    */ 
/* 72 */     int beg = 0;
/* 73 */     int end = A.length - 1;
/* 74 */     ArraySort(A, beg, end);
/* 75 */     for (int i = 0; i < A.length; i++) {
/* 76 */       System.out.print(A[i] + " ");
/*    */     }
/* 78 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.ArraySort01
 * JD-Core Version:    0.6.2
 */