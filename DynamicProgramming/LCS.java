/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class LCS
/*    */ {
/*    */   public static String lcs(String s1, String s2)
/*    */   {
/* 11 */     if ((s1.length() == 0) || (s2.length() == 0)) {
/* 12 */       return "";
/*    */     }
/* 14 */     String[][] dpArray = new String[s1.length() + 1][s2.length() + 1];
/*    */ 
/* 16 */     for (int i = 0; i <= s1.length(); i++) {
/* 17 */       dpArray[i][0] = "";
/*    */     }
/*    */ 
/* 20 */     for (int j = 0; j <= s2.length(); j++) {
/* 21 */       dpArray[0][j] = "";
/*    */     }
/*    */ 
/* 25 */     String lcs = "";
/* 26 */     for (int i = 1; i <= s1.length(); i++) {
/* 27 */       for (int j = 1; j <= s2.length(); j++) {
/* 28 */         if (s1.charAt(s1.length() - i) == s2.charAt(s2.length() - j)) {
/* 29 */           dpArray[i][j] = (s1.charAt(s1.length() - i) + dpArray[(i - 1)][(j - 1)]);
/*    */         }
/* 32 */         else if (dpArray[(i - 1)][j].length() > dpArray[i][(j - 1)].length()) {
/* 33 */           dpArray[i][j] = dpArray[(i - 1)][j];
/*    */         }
/*    */         else {
/* 36 */           dpArray[i][j] = dpArray[i][(j - 1)];
/*    */         }
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 42 */     return dpArray[s1.length()][s2.length()];
/*    */   }
/*    */ 
/*    */   public static int lcsLen(String s1, String s2)
/*    */   {
/* 47 */     if ((s1.length() == 0) || (s2.length() == 0)) {
/* 48 */       return 0;
/*    */     }
/* 50 */     int[][] dpArray = new int[s1.length() + 1][s2.length() + 1];
/*    */ 
/* 52 */     for (int i = 1; i <= s1.length(); i++) {
/* 53 */       for (int j = 1; j <= s2.length(); j++) {
/* 54 */         if (s1.charAt(s1.length() - i) == s2.charAt(s2.length() - j)) {
/* 55 */           dpArray[i][j] = (1 + dpArray[(i - 1)][(j - 1)]);
/*    */         }
/*    */         else {
/* 58 */           dpArray[i][j] = Math.max(dpArray[(i - 1)][j], dpArray[i][(j - 1)]);
/*    */         }
/*    */       }
/*    */     }
/* 62 */     return dpArray[s1.length()][s2.length()];
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 67 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 70 */     System.out.println("Enter the first string");
/* 71 */     String s1 = s.nextLine();
/* 72 */     System.out.println("Enter the second string");
/* 73 */     String s2 = s.nextLine();
/* 74 */     int lcsLength = lcsLen(s1, s2);
/* 75 */     System.out.println("Longest Common subsequence is:" + lcs(s1, s2) + "  And its length is:" + lcsLength);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.LCS
 * JD-Core Version:    0.6.2
 */