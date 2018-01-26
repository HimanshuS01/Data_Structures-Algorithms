/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class MedianInTwoSortedArray
/*    */ {
/*    */   public static int getMedian(int[] arr1, int beg1, int end1, int[] arr2, int beg2, int end2)
/*    */   {
/*  7 */     if (beg1 >= end1) {
/*  8 */       return -1;
/*    */     }
/* 10 */     if ((end1 - beg1 + 1 == 1) && (end2 - beg2 + 1 == 1)) {
/* 11 */       return (arr1[beg1] + arr2[beg2]) / 2;
/*    */     }
/* 13 */     if ((end2 - beg2 + 1 == 2) && (end1 - beg1 + 1 == 2)) {
/* 14 */       return (Math.max(arr1[beg1], arr2[beg2]) + Math.min(arr1[end1], arr2[end2])) / 2;
/*    */     }
/*    */ 
/* 17 */     int m1 = arr1[((beg1 + end1) / 2)];
/* 18 */     int m2 = arr2[((beg2 + end2) / 2)];
/*    */ 
/* 20 */     if (m1 == m2) {
/* 21 */       return m1;
/*    */     }
/* 23 */     if (m1 < m2) {
/* 24 */       return getMedian(arr1, (beg1 + end1) / 2, end1, arr2, beg2, (beg2 + end2) / 2);
/*    */     }
/* 26 */     if (m1 > m2) {
/* 27 */       return getMedian(arr1, beg1, (beg1 + end1) / 2, arr2, (beg2 + end2) / 2, end2);
/*    */     }
/* 29 */     return -1;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 36 */     int[] arr1 = { 1, 12, 15, 26, 38 };
/* 37 */     int[] arr2 = { 2, 13, 17, 30, 45 };
/*    */ 
/* 40 */     int beg1 = 0; int end1 = arr1.length - 1; int beg2 = 0; int end2 = arr2.length - 1;
/* 41 */     int median = getMedian(arr1, beg1, end1, arr2, beg2, end2);
/* 42 */     System.out.println(median);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.MedianInTwoSortedArray
 * JD-Core Version:    0.6.2
 */