/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class CheckStringReverse
/*    */ {
/*    */   public static boolean CheckReverse(String A, String B)
/*    */   {
/*  6 */     if ((A.length() == 0) && (B.length() == 0)) {
/*  7 */       return true;
/*    */     }
/*  9 */     if (((A.length() == 0) && (B.length() != 0)) || ((A.length() != 0) && (B.length() == 0))) {
/* 10 */       return false;
/*    */     }
/* 12 */     if (A.charAt(0) == B.charAt(B.length() - 1)) {
/* 13 */       return CheckReverse(A.substring(1), B.substring(0, B.length() - 1));
/*    */     }
/* 15 */     return false;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 21 */     String S1 = "abc";
/* 22 */     String S2 = "cba";
/* 23 */     boolean result = CheckReverse(S1, S2);
/* 24 */     if (result) {
/* 25 */       System.out.println("Strings are reverse of each other");
/*    */     }
/*    */     else
/* 28 */       System.out.println("Strings are not reverse of each other");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.CheckStringReverse
 * JD-Core Version:    0.6.2
 */