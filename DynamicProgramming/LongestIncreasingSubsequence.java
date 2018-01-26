/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class LongestIncreasingSubsequence
/*    */ {
/*    */   public int longestSubsequenceWithActualSolution(int[] arr)
/*    */   {
/* 11 */     int[] T = new int[arr.length];
/* 12 */     int[] actualSolution = new int[arr.length];
/* 13 */     for (int i = 0; i < arr.length; i++) {
/* 14 */       T[i] = 1;
/* 15 */       actualSolution[i] = i;
/*    */     }
/*    */ 
/* 18 */     for (int i = 1; i < arr.length; i++) {
/* 19 */       for (int j = 0; j < i; j++) {
/* 20 */         if ((arr[i] > arr[j]) && 
/* 21 */           (T[j] + 1 > T[i])) {
/* 22 */           T[j] += 1;
/*    */ 
/* 24 */           actualSolution[i] = j;
/*    */         }
/*    */ 
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 31 */     int maxIndex = 0;
/* 32 */     for (int i = 0; i < T.length; i++) {
/* 33 */       if (T[i] > T[maxIndex]) {
/* 34 */         maxIndex = i;
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 39 */     int t = maxIndex;
/* 40 */     int newT = maxIndex;
/*    */     do {
/* 42 */       t = newT;
/* 43 */       System.out.print(arr[t] + " ");
/* 44 */       newT = actualSolution[t];
/* 45 */     }while (t != newT);
/* 46 */     System.out.println();
/*    */ 
/* 48 */     return T[maxIndex];
/*    */   }
/*    */ 
/*    */   public int longestSubsequenceRecursive(int[] arr)
/*    */   {
/* 55 */     int maxLen = 0;
/* 56 */     for (int i = 0; i < arr.length - 1; i++) {
/* 57 */       int len = longestSubsequenceRecursive(arr, i + 1, arr[i]);
/* 58 */       if (len > maxLen) {
/* 59 */         maxLen = len;
/*    */       }
/*    */     }
/* 62 */     return maxLen + 1;
/*    */   }
/*    */ 
/*    */   private int longestSubsequenceRecursive(int[] arr, int pos, int lastNum) {
/* 66 */     if (pos == arr.length) {
/* 67 */       return 0;
/*    */     }
/* 69 */     int t1 = 0;
/* 70 */     if (arr[pos] > lastNum) {
/* 71 */       t1 = 1 + longestSubsequenceRecursive(arr, pos + 1, arr[pos]);
/*    */     }
/* 73 */     int t2 = longestSubsequenceRecursive(arr, pos + 1, lastNum);
/* 74 */     return Math.max(t1, t2);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 78 */     LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
/* 79 */     int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
/* 80 */     int result = lis.longestSubsequenceWithActualSolution(arr);
/* 81 */     int result1 = lis.longestSubsequenceRecursive(arr);
/* 82 */     System.out.println(result);
/* 83 */     System.out.println(result1);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.LongestIncreasingSubsequence
 * JD-Core Version:    0.6.2
 */