/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class MaxSumSubArray
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 11 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 13 */     int t = s.nextInt();
/* 14 */     int[] ansarr = new int[t];
/* 15 */     for (int i = 0; i < t; i++)
/*    */     {
/* 17 */       int n = s.nextInt();
/* 18 */       int[] arr = new int[n];
/* 19 */       for (int j = 0; j < n; j++)
/*    */       {
/* 21 */         arr[j] = s.nextInt();
/*    */       }
/* 23 */       int[] dp = new int[n];
/* 24 */       int ans = arr[0];
/* 25 */       dp[0] = arr[0];
/* 26 */       for (int j = 1; j < n; j++)
/*    */       {
/* 29 */         dp[j] = Math.max(dp[(j - 1)] + arr[j], arr[j]);
/* 30 */         ans = Math.max(ans, dp[j]);
/*    */       }
/*    */ 
/* 34 */       ansarr[i] = ans;
/*    */     }
/* 36 */     for (int i = 0; i < t; i++)
/* 37 */       System.out.println(ansarr[i]);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.MaxSumSubArray
 * JD-Core Version:    0.6.2
 */