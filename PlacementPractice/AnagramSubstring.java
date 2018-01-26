/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class AnagramSubstring
/*    */ {
/*  5 */   static int max = 256;
/*    */ 
/*    */   public static boolean isSimilar(char[] pattern_count, char[] text_count)
/*    */   {
/*  9 */     for (int i = 0; i < max; i++) {
/* 10 */       if (pattern_count[i] != text_count[i]) {
/* 11 */         return false;
/*    */       }
/*    */     }
/* 14 */     return true;
/*    */   }
/*    */ 
/*    */   public static void printPositions(String pattern, String text)
/*    */   {
/* 19 */     int M = pattern.length();
/* 20 */     int N = text.length();
/*    */ 
/* 22 */     char[] pattern_count = new char[max];
/* 23 */     char[] text_count = new char[max];
/*    */ 
/* 25 */     for (int i = 0; i < M; i++)
/*    */     {
/*    */       char tmp38_35 = pattern.charAt(i);
/*    */       char[] tmp38_30 = pattern_count; tmp38_30[tmp38_35] = ((char)(tmp38_30[tmp38_35] + '\001'));
/*    */       char tmp52_49 = text.charAt(i);
/*    */       char[] tmp52_44 = text_count; tmp52_44[tmp52_49] = ((char)(tmp52_44[tmp52_49] + '\001'));
/*    */     }
/*    */ 
/* 31 */     for (int i = M; i < N; i++)
/*    */     {
/* 33 */       if (isSimilar(pattern_count, text_count))
/* 34 */         System.out.println(i - M);
/*    */       char tmp101_98 = text.charAt(i);
/*    */       char[] tmp101_93 = text_count; tmp101_93[tmp101_98] = ((char)(tmp101_93[tmp101_98] + '\001'));
/*    */       char tmp117_114 = text.charAt(i - M);
/*    */       char[] tmp117_107 = text_count; tmp117_107[tmp117_114] = ((char)(tmp117_107[tmp117_114] - '\001'));
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 48 */     String pattern = "abbc";
/* 49 */     String text = "cbabadcbbabbcbabaabc";
/* 50 */     printPositions(pattern, text);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.AnagramSubstring
 * JD-Core Version:    0.6.2
 */