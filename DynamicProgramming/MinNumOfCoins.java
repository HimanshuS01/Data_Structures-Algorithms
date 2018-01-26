/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class MinNumOfCoins
/*    */ {
/*    */   static int minCoins(int[] coins, int m, int V)
/*    */   {
/* 16 */     if (V == 0) return 0;
/*    */ 
/* 19 */     int res = 2147483647;
/*    */ 
/* 22 */     for (int i = 0; i < m; i++)
/*    */     {
/* 24 */       if (coins[i] <= V)
/*    */       {
/* 26 */         int sub_res = minCoins(coins, m, V - coins[i]);
/*    */ 
/* 29 */         if ((sub_res != 2147483647) && (sub_res + 1 < res))
/* 30 */           res = sub_res + 1;
/*    */       }
/*    */     }
/* 33 */     return res;
/*    */   }
/*    */ 
/*    */   public static void min_coins(int[] coins, int V)
/*    */   {
/* 41 */     System.out.println("Minimum coins required using greedy approach is ");
/* 42 */     ArrayList result = new ArrayList();
/* 43 */     for (int i = 0; i < coins.length; i++)
/*    */     {
/* 45 */       while (coins[i] <= V) {
/* 46 */         result.add(Integer.valueOf(coins[i]));
/* 47 */         V -= coins[i];
/*    */       }
/*    */     }
/*    */ 
/* 51 */     for (int i = 0; i < result.size(); i++)
/* 52 */       System.out.print(result.get(i) + " ");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 58 */     int[] coins = { 9, 6, 5, 1 };
/* 59 */     int m = coins.length;
/* 60 */     int V = 11;
/* 61 */     System.out.println("Minimum coins required is " + minCoins(coins, m, V));
/* 62 */     min_coins(coins, V);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.MinNumOfCoins
 * JD-Core Version:    0.6.2
 */