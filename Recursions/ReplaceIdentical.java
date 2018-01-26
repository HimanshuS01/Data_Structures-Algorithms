/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ReplaceIdentical
/*    */ {
/*    */   public static String Replace_Identical(String N)
/*    */   {
/*  7 */     if ((N.length() == 0) || (N.length() == 1)) {
/*  8 */       return N;
/*    */     }
/* 10 */     if (N.charAt(0) == N.charAt(1)) {
/* 11 */       return N.charAt(0) + "*" + Replace_Identical(N.substring(1));
/*    */     }
/* 13 */     return N.charAt(0) + Replace_Identical(N.substring(1));
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 17 */     Scanner s = new Scanner(System.in);
/* 18 */     System.out.println("Enter the String");
/* 19 */     String S = s.nextLine();
/* 20 */     String result = Replace_Identical(S);
/* 21 */     System.out.println(result);
/* 22 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.ReplaceIdentical
 * JD-Core Version:    0.6.2
 */