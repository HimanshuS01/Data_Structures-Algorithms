/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class KthSmallestElement
/*    */ {
/*    */   static Scanner s;
/*    */ 
/*    */   public static int getPivotPosition(int[] arr, int beg, int end)
/*    */   {
/* 16 */     int i = beg - 1;
/* 17 */     int pivot = arr[end];
/* 18 */     for (int j = beg; j <= end - 1; j++)
/*    */     {
/* 20 */       if (arr[j] <= pivot)
/*    */       {
/* 22 */         i++;
/*    */ 
/* 24 */         int temp = arr[i];
/* 25 */         arr[i] = arr[j];
/* 26 */         arr[j] = temp;
/*    */       }
/*    */     }
/*    */ 
/* 30 */     int temp = arr[(i + 1)];
/* 31 */     arr[(i + 1)] = arr[end];
/* 32 */     arr[end] = temp;
/*    */ 
/* 34 */     return i + 1;
/*    */   }
/*    */ 
/*    */   public static int KthSmallestElemen(int[] arr, int beg, int end, int kth)
/*    */   {
/* 40 */     if ((kth > 0) && (kth <= end - beg + 1))
/*    */     {
/* 42 */       int pivotPosition = getPivotPosition(arr, beg, end);
/*    */ 
/* 44 */       if (pivotPosition == kth - 1) {
/* 45 */         return arr[pivotPosition];
/*    */       }
/* 47 */       if (pivotPosition > kth - 1) {
/* 48 */         return KthSmallestElemen(arr, beg, pivotPosition - 1, kth);
/*    */       }
/*    */ 
/* 51 */       return KthSmallestElemen(arr, pivotPosition + 1, end, kth);
/*    */     }
/*    */ 
/* 54 */     return 2147483647;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 61 */     s = new Scanner(System.in);
/* 62 */     int testcases = s.nextInt();
/* 63 */     int[] output = new int[testcases];
/*    */ 
/* 65 */     for (int i = 0; i < output.length; i++)
/*    */     {
/* 67 */       int length = s.nextInt();
/* 68 */       int[] arr = new int[length];
/*    */ 
/* 70 */       for (int j = 0; j < length; j++) {
/* 71 */         arr[j] = s.nextInt();
/*    */       }
/*    */ 
/* 74 */       int kth = s.nextInt();
/*    */ 
/* 76 */       output[i] = KthSmallestElemen(arr, 0, arr.length - 1, kth);
/*    */     }
/*    */ 
/* 79 */     for (int i = 0; i < output.length; i++)
/* 80 */       System.out.println(output[i]);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.KthSmallestElement
 * JD-Core Version:    0.6.2
 */