/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Remove_X
/*    */ {
/*    */   public static String Remove_X_Recursively(String S)
/*    */   {
/*  8 */     if (S.length() == 0) {
/*  9 */       return "";
/*    */     }
/* 11 */     if ((S.length() == 1) && (S.charAt(0) == 'x')) {
/* 12 */       return "";
/*    */     }
/* 14 */     if (S.charAt(0) == 'x') {
/* 15 */       return Remove_X_Recursively(S.substring(1));
/*    */     }
/* 17 */     return S.charAt(0) + Remove_X_Recursively(S.substring(1));
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 22 */     Scanner s = new Scanner(System.in);
/* 23 */     System.out.println("Enter the string:");
/* 24 */     String S = s.nextLine();
/*    */ 
/* 26 */     String result = Remove_X_Recursively(S);
/* 27 */     System.out.println(result);
/* 28 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.Remove_X
 * JD-Core Version:    0.6.2
 */