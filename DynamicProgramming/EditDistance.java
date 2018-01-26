/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class EditDistance
/*    */ {
/*    */   public static int Edit_Distance(String s1, String s2)
/*    */   {
/*  9 */     if ((s1.length() == 0) && (s2.length() == 0)) {
/* 10 */       return 0;
/*    */     }
/* 12 */     if (s1.length() == 0) {
/* 13 */       return s2.length();
/*    */     }
/* 15 */     if (s2.length() == 0)
/* 16 */       return s1.length();
/*    */     int x;
/*    */     int x;
/* 26 */     if (s1.charAt(0) == s2.charAt(0)) {
/* 27 */       x = Edit_Distance(s1.substring(1), s2.substring(1));
/*    */     }
/*    */     else
/*    */     {
/* 32 */       x = Math.min(1 + Edit_Distance(s1.substring(1), s2.substring(1)), 1 + Edit_Distance(s1, s2.substring(1)));
/*    */     }
/* 34 */     return x;
/*    */   }
/*    */ 
/*    */   public static int EditDistance1(String s1, String s2)
/*    */   {
/* 39 */     if ((s1.length() == 0) && (s2.length() == 0)) {
/* 40 */       return 0;
/*    */     }
/* 42 */     int[][] dpA = new int[s1.length() + 1][s2.length() + 1];
/* 43 */     for (int i = 0; i < s1.length() + 1; i++) {
/* 44 */       dpA[i][0] = i;
/*    */     }
/* 46 */     for (int j = 0; j < s2.length() + 1; j++) {
/* 47 */       dpA[0][j] = j;
/*    */     }
/* 49 */     for (int i = 1; i <= s1.length(); i++)
/*    */     {
/* 51 */       for (int j = 1; j <= s2.length(); j++)
/*    */       {
/* 53 */         if (s1.charAt(i - 1) == s2.charAt(j - 1))
/*    */         {
/* 55 */           dpA[i][j] = dpA[(i - 1)][(j - 1)];
/*    */         }
/*    */         else {
/* 58 */           dpA[i][j] = Math.min(1 + dpA[(i - 1)][(j - 1)], Math.min(1 + dpA[i][(j - 1)], 1 + dpA[(i - 1)][j]));
/*    */         }
/*    */       }
/*    */     }
/*    */ 
/* 63 */     return dpA[s1.length()][s2.length()];
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 68 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 70 */     String s1 = "Anshuman";
/* 71 */     String s2 = "Antihuman";
/*    */ 
/* 73 */     int x = EditDistance1(s1, s2);
/* 74 */     System.out.println(x);
/* 75 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.EditDistance
 * JD-Core Version:    0.6.2
 */