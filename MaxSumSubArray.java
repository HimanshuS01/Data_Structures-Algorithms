/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class MaxSumSubArray
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  9 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 11 */     int t = s.nextInt();
/* 12 */     int[] ansarr = new int[t];
/* 13 */     for (int i = 0; i < t; i++)
/*    */     {
/* 15 */       int n = s.nextInt();
/* 16 */       int[] arr = new int[n];
/* 17 */       for (int j = 0; j < n; j++)
/*    */       {
/* 19 */         arr[j] = s.nextInt();
/*    */       }
/* 21 */       int[] dp = new int[n];
/* 22 */       int ans = arr[0];
/* 23 */       dp[0] = arr[0];
/* 24 */       for (int j = 1; j < n; j++)
/*    */       {
/* 28 */         dp[j] = Math.max(dp[(j - 1)] + arr[j], arr[j]);
/* 29 */         ans = Math.max(ans, dp[j]);
/*    */       }
/*    */ 
/* 33 */       ansarr[i] = ans;
/*    */     }
/* 35 */     for (int i = 0; i < t; i++)
/* 36 */       System.out.println(ansarr[i]);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     MaxSumSubArray
 * JD-Core Version:    0.6.2
 */