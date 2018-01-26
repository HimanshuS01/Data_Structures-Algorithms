/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Longest_Common_Substring
/*    */ {
/*    */   public static int LongestCommonSubstring(char[] str1, char[] str2)
/*    */   {
/* 12 */     int[][] dp = new int[str1.length + 1][str2.length + 1];
/* 13 */     int maxLength = -2147483648;
/* 14 */     for (int j = 0; j < str2.length; j++) {
/* 15 */       dp[0][j] = 0;
/*    */     }
/* 17 */     for (int i = 0; i < str1.length; i++) {
/* 18 */       dp[i][0] = 0;
/*    */     }
/*    */ 
/* 21 */     for (int i = 1; i < str1.length; i++) {
/* 22 */       for (int j = 1; j < str2.length; j++)
/*    */       {
/* 24 */         if (str1[i] == str2[j]) {
/* 25 */           dp[i][j] = (dp[(i - 1)][(j - 1)] + 1);
/*    */         }
/*    */         else {
/* 28 */           dp[i][j] = 0;
/*    */         }
/*    */       }
/*    */     }
/* 32 */     for (int i = 1; i < str1.length; i++) {
/* 33 */       for (int j = 1; j < str2.length; j++) {
/* 34 */         if (dp[i][j] > maxLength) {
/* 35 */           maxLength = dp[i][j];
/*    */         }
/*    */       }
/*    */     }
/* 39 */     return maxLength;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 46 */     Scanner s = new Scanner(System.in);
/* 47 */     int testcases = s.nextInt();
/* 48 */     int[] output = new int[testcases];
/* 49 */     for (int i = 0; i < testcases; i++)
/*    */     {
/* 51 */       int length1 = s.nextInt();
/* 52 */       int length2 = s.nextInt();
/*    */ 
/* 54 */       String st1 = s.nextLine();
/* 55 */       st1 = s.nextLine();
/* 56 */       String st2 = s.nextLine();
/*    */ 
/* 58 */       char[] str1 = new char[length1];
/* 59 */       char[] str2 = new char[length2];
/*    */ 
/* 61 */       for (int j = 0; j < length1; j++) {
/* 62 */         str1[j] = st1.charAt(j);
/*    */       }
/*    */ 
/* 65 */       for (int j = 0; j < length2; j++) {
/* 66 */         str2[j] = st2.charAt(j);
/*    */       }
/*    */ 
/* 69 */       output[i] = LongestCommonSubstring(str1, str2);
/*    */     }
/*    */ 
/* 73 */     for (int i = 0; i < output.length; i++)
/* 74 */       System.out.println(output[i]);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.Longest_Common_Substring
 * JD-Core Version:    0.6.2
 */