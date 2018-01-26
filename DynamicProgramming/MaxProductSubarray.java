/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class MaxProductSubarray
/*    */ {
/*    */   public static int maxProduct(int[] A)
/*    */   {
/*  9 */     int max = A[0];
/* 10 */     int min = A[0];
/* 11 */     int maxProduct = A[0];
/*    */ 
/* 13 */     for (int i = 1; i < A.length; i++) {
/* 14 */       int temp = max;
/* 15 */       max = Math.max(Math.max(A[i], max * A[i]), min * A[i]);
/* 16 */       min = Math.min(Math.min(A[i], min * A[i]), temp * A[i]);
/* 17 */       if (max > maxProduct)
/* 18 */         maxProduct = max;
/*    */     }
/* 20 */     return maxProduct;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 26 */     int[] A = { 0, -1, 0, 2, 0, -2, -3, -4, -5 };
/* 27 */     System.out.println(maxProduct(A));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.MaxProductSubarray
 * JD-Core Version:    0.6.2
 */