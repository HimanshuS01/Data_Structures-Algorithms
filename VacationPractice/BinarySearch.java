/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class BinarySearch
/*    */ {
/*    */   public static int Binary_Search(int[] A, int x)
/*    */   {
/*  7 */     int beg = 0;
/*  8 */     int end = A.length - 1;
/*  9 */     int mid = (beg + end) / 2;
/* 10 */     while (beg <= end) {
/* 11 */       if (A[mid] == x) {
/* 12 */         return mid + 1;
/*    */       }
/* 14 */       if (A[mid] < x) {
/* 15 */         beg = mid + 1;
/*    */       }
/*    */       else {
/* 18 */         end = mid - 1;
/*    */       }
/*    */     }
/* 21 */     return -1;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 26 */     Scanner s = new Scanner(System.in);
/* 27 */     System.out.println("Enter the elements of an array:");
/* 28 */     int n = s.nextInt();
/* 29 */     int[] A = new int[n];
/* 30 */     for (int i = 0; i < n; i++) {
/* 31 */       A[i] = s.nextInt();
/*    */     }
/* 33 */     System.out.println("Enter the elements you want to search:");
/* 34 */     int x = s.nextInt();
/* 35 */     int position = Binary_Search(A, x);
/* 36 */     if (position > 0) {
/* 37 */       System.out.println("Element found at position no " + position);
/*    */     }
/*    */     else {
/* 40 */       System.out.println("Element not found!!");
/*    */     }
/* 42 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.BinarySearch
 * JD-Core Version:    0.6.2
 */