/*     */ package DynamicProgramming;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class CoinChangingMinCoin
/*     */ {
/*     */   public int minimumCoinTopDown(int total, int[] coins, Map<Integer, Integer> map)
/*     */   {
/*  28 */     if (total == 0) {
/*  29 */       return 0;
/*     */     }
/*     */ 
/*  33 */     if (map.containsKey(Integer.valueOf(total))) {
/*  34 */       return ((Integer)map.get(Integer.valueOf(total))).intValue();
/*     */     }
/*     */ 
/*  38 */     int min = 2147483647;
/*  39 */     for (int i = 0; i < coins.length; i++)
/*     */     {
/*  41 */       if (coins[i] <= total)
/*     */       {
/*  45 */         int val = minimumCoinTopDown(total - coins[i], coins, map);
/*     */ 
/*  49 */         if (val < min) {
/*  50 */           min = val;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*  55 */     min = min == 2147483647 ? min : min + 1;
/*     */ 
/*  58 */     map.put(Integer.valueOf(total), Integer.valueOf(min));
/*  59 */     return min;
/*     */   }
/*     */ 
/*     */   public int minimumCoinBottomUp(int total, int[] coins)
/*     */   {
/*  69 */     int[] T = new int[total + 1];
/*  70 */     int[] R = new int[total + 1];
/*  71 */     T[0] = 0;
/*  72 */     for (int i = 1; i <= total; i++) {
/*  73 */       T[i] = 2147483646;
/*  74 */       R[i] = -1;
/*     */     }
/*  76 */     for (int j = 0; j < coins.length; j++) {
/*  77 */       for (int i = 1; i <= total; i++) {
/*  78 */         if ((coins[j] <= i) && 
/*  79 */           (T[(i - coins[j])] + 1 < T[i])) {
/*  80 */           T[i] = (1 + T[(i - coins[j])]);
/*  81 */           R[i] = j;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*  86 */     printCoinCombination(R, coins);
/*  87 */     return T[total];
/*     */   }
/*     */ 
/*     */   private void printCoinCombination(int[] R, int[] coins) {
/*  91 */     if (R[(R.length - 1)] == -1) {
/*  92 */       System.out.print("No solution is possible");
/*  93 */       return;
/*     */     }
/*  95 */     int start = R.length - 1;
/*  96 */     System.out.print("Coins used to form total ");
/*  97 */     while (start != 0) {
/*  98 */       int j = R[start];
/*  99 */       System.out.print(coins[j] + " ");
/* 100 */       start -= coins[j];
/*     */     }
/* 102 */     System.out.print("\n");
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) {
/* 106 */     int total = 13;
/* 107 */     int[] coins = { 7, 3, 2, 6 };
/* 108 */     CoinChangingMinCoin cc = new CoinChangingMinCoin();
/* 109 */     Map map = new HashMap();
/* 110 */     int topDownValue = cc.minimumCoinTopDown(total, coins, map);
/* 111 */     int bottomUpValue = cc.minimumCoinBottomUp(total, coins);
/*     */ 
/* 113 */     System.out.print(String.format("Bottom up and top down result %s %s", new Object[] { Integer.valueOf(bottomUpValue), Integer.valueOf(topDownValue) }));
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.CoinChangingMinCoin
 * JD-Core Version:    0.6.2
 */