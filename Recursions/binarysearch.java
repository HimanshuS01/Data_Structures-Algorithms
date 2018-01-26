/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class binarysearch
/*    */ {
/*    */   public static int binarySearch(int[] input, int m, int beginIndex, int endIndex)
/*    */   {
/* 14 */     if (endIndex < beginIndex) {
/* 15 */       return -1;
/*    */     }
/* 17 */     int mid = (beginIndex + endIndex) / 2;
/* 18 */     if (input[mid] == m) {
/* 19 */       return mid;
/*    */     }
/* 21 */     if (input[mid] > m) {
/* 22 */       int answer = binarySearch(input, m, beginIndex, mid - 1);
/* 23 */       return answer;
/*    */     }
/*    */ 
/* 27 */     int answer = binarySearch(input, m, mid + 1, endIndex);
/* 28 */     return answer;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 34 */     Scanner s = new Scanner(System.in);
/* 35 */     System.out.print("Enter the number of elements");
/* 36 */     int n = s.nextInt();
/* 37 */     int[] a = new int[n];
/* 38 */     System.out.print("Enter" + n + "elements");
/* 39 */     for (int i = 0; i <= a.length - 1; i++) {
/* 40 */       a[i] = s.nextInt();
/*    */     }
/* 42 */     System.out.print("Enter the number you want to search");
/* 43 */     int m = s.nextInt();
/* 44 */     int beginIndex = 0; int endIndex = a.length - 1;
/* 45 */     int x = binarySearch(a, m, beginIndex, endIndex);
/* 46 */     if (x > 0) {
/* 47 */       System.out.print("found at position" + x);
/*    */     }
/*    */     else
/*    */     {
/* 51 */       System.out.print("Element not fount");
/*    */     }
/* 53 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.binarysearch
 * JD-Core Version:    0.6.2
 */