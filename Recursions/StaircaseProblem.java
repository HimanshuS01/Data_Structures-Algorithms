/*     */ package Recursions;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Arrays;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class StaircaseProblem
/*     */ {
/*     */   public static int Staircase_Problem(int n)
/*     */   {
/*  14 */     if (n < 0) {
/*  15 */       return 0;
/*     */     }
/*  17 */     if ((n == 1) || (n == 0)) {
/*  18 */       return 1;
/*     */     }
/*  20 */     if (n == 2) {
/*  21 */       return 2;
/*     */     }
/*  23 */     if (n == 3) {
/*  24 */       return 4;
/*     */     }
/*  26 */     return Staircase_Problem(n - 1) + Staircase_Problem(n - 2) + Staircase_Problem(n - 3);
/*     */   }
/*     */ 
/*     */   public static int StairCaseProblem_Recursive_Method2(int n)
/*     */   {
/*  33 */     if (n == 0) {
/*  34 */       return 1;
/*     */     }
/*  36 */     if (n < 0) {
/*  37 */       return 0;
/*     */     }
/*  39 */     return StairCaseProblem_Recursive_Method2(n - 1) + StairCaseProblem_Recursive_Method2(n - 2) + StairCaseProblem_Recursive_Method2(n - 3);
/*     */   }
/*     */ 
/*     */   public static int StairCase_DP_TopDown(int n, int[] dp)
/*     */   {
/*  48 */     if (n == 0) {
/*  49 */       dp[n] = 1;
/*  50 */       return 1;
/*     */     }
/*     */ 
/*  53 */     if (n < 0) {
/*  54 */       return 0;
/*     */     }
/*     */ 
/*  57 */     if (dp[n] != -1) {
/*  58 */       return dp[n];
/*     */     }
/*     */ 
/*  61 */     dp[n] = (StairCase_DP_TopDown(n - 1, dp) + StairCase_DP_TopDown(n - 2, dp) + StairCase_DP_TopDown(n - 3, dp));
/*  62 */     return dp[n];
/*     */   }
/*     */ 
/*     */   public static int StairCase_DP_BottomUp(int n, int k)
/*     */   {
/*  70 */     int[] dp = new int[n + 1];
/*  71 */     dp[0] = 1;
/*     */ 
/*  73 */     for (int stair = 1; stair <= n; stair++)
/*     */     {
/*  75 */       dp[stair] = 0;
/*     */ 
/*  77 */       for (int j = 1; j <= k; j++)
/*     */       {
/*  79 */         if (stair - j >= 0) {
/*  80 */           dp[stair] += dp[(stair - j)];
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*  85 */     return dp[n];
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 109 */     String[] str = { "1", "2", "3", "100", "4", "6", "10" };
/* 110 */     Arrays.sort(str);
/* 111 */     for (String i : str) {
/* 112 */       System.out.print(i + " ");
/*     */     }
/*     */ 
/* 139 */     System.out.println("Enter the number of steps in a staircase:");
/* 140 */     Scanner s = new Scanner(System.in);
/* 141 */     int x = s.nextInt();
/* 142 */     System.out.print("No. of ways for climbing are:");
/* 143 */     System.out.println(StairCaseProblem_Recursive_Method2(x));
/*     */ 
/* 145 */     int[] dp = new int[100];
/* 146 */     for (int i = 0; i < dp.length; i++) {
/* 147 */       dp[i] = -1;
/*     */     }
/* 149 */     System.out.println("Top Down DP :" + StairCase_DP_TopDown(x, dp));
/* 150 */     System.out.println("BottomUp DP :" + StairCase_DP_BottomUp(x, 3));
/*     */ 
/* 153 */     s.close();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.StaircaseProblem
 * JD-Core Version:    0.6.2
 */