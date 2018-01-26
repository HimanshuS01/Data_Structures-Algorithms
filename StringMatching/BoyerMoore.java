/*    */ package StringMatching;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class BoyerMoore
/*    */ {
/*    */   public static HashMap<Character, Integer> findLastOccurances(String s)
/*    */   {
/*  8 */     HashMap h = new HashMap();
/*  9 */     for (int i = 0; i < s.length(); i++) {
/* 10 */       h.put(Character.valueOf(s.charAt(i)), Integer.valueOf(i));
/*    */     }
/* 12 */     return h;
/*    */   }
/*    */ 
/*    */   public static int boyerMoore(String s1, String s2) {
/* 16 */     HashMap lastOccurance = findLastOccurances(s2);
/* 17 */     int i = s2.length() - 1;
/* 18 */     while (i < s1.length()) {
/* 19 */       int j = s2.length() - 1;
/* 20 */       int decrementInJ = 0;
/* 21 */       while (j >= 0) {
/* 22 */         if (s2.charAt(j) == s1.charAt(i - decrementInJ)) {
/* 23 */           j--;
/* 24 */           decrementInJ++;
/* 25 */           if (j == -1)
/* 26 */             return i - (s2.length() - 1);
/*    */         }
/*    */         else {
/* 29 */           Integer lastOccuranceOfLastChar = 
/* 30 */             (Integer)lastOccurance.get(Character.valueOf(s1.charAt(i - decrementInJ)));
/* 31 */           if (lastOccuranceOfLastChar == null) {
/* 32 */             i = i + j + 1;
/* 33 */             break; } if (lastOccuranceOfLastChar.intValue() > j) {
/* 34 */             i++;
/* 35 */             break;
/* 36 */           }i = i + j - lastOccuranceOfLastChar.intValue();
/*    */ 
/* 38 */           break;
/*    */         }
/*    */       }
/*    */     }
/* 42 */     return -1;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 46 */     String s1 = "abxdefghijklbcxhgj";
/* 47 */     String s2 = "bcx";
/*    */ 
/* 49 */     System.out.println("Pattern matches in orignal text at position number :" + boyerMoore(s1, s2));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     StringMatching.BoyerMoore
 * JD-Core Version:    0.6.2
 */