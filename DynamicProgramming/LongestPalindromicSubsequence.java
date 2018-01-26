/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class LongestPalindromicSubsequence
/*    */ {
/*    */   public int calculate1(char[] str)
/*    */   {
/*  8 */     int[][] T = new int[str.length][str.length];
/*  9 */     for (int i = 0; i < str.length; i++) {
/* 10 */       T[i][i] = 1;
/*    */     }
/* 12 */     for (int l = 2; l <= str.length; l++) {
/* 13 */       for (int i = 0; i < str.length - l + 1; i++) {
/* 14 */         int j = i + l - 1;
/* 15 */         if ((l == 2) && (str[i] == str[j]))
/* 16 */           T[i][j] = 2;
/* 17 */         else if (str[i] == str[j])
/* 18 */           T[i][j] = (T[(i + 1)][(j - 1)] + 2);
/*    */         else {
/* 20 */           T[i][j] = Math.max(T[(i + 1)][j], T[i][(j - 1)]);
/*    */         }
/*    */       }
/*    */     }
/* 24 */     return T[0][(str.length - 1)];
/*    */   }
/*    */ 
/*    */   public int calculateRecursive(char[] str, int start, int len)
/*    */   {
/* 29 */     if (len == 1) {
/* 30 */       return 1;
/*    */     }
/* 32 */     if (len == 0) {
/* 33 */       return 0;
/*    */     }
/* 35 */     if (str[start] == str[(start + len - 1)]) {
/* 36 */       return 2 + calculateRecursive(str, start + 1, len - 2);
/*    */     }
/* 38 */     return Math.max(calculateRecursive(str, start + 1, len - 1), calculateRecursive(str, start, len - 1));
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 43 */     LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
/* 44 */     String str = "agbdba";
/* 45 */     int r1 = lps.calculateRecursive(str.toCharArray(), 0, str.length());
/* 46 */     int r2 = lps.calculate1(str.toCharArray());
/* 47 */     System.out.print(r1 + " " + r2);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.LongestPalindromicSubsequence
 * JD-Core Version:    0.6.2
 */