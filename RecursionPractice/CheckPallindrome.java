/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class CheckPallindrome
/*    */ {
/*    */   public static boolean Check_Pallindrome_Recursively(String S)
/*    */   {
/*  8 */     if ((S.length() == 0) || (S.length() == 1)) {
/*  9 */       return true;
/*    */     }
/* 11 */     if (S.charAt(0) == S.charAt(S.length() - 1))
/*    */     {
/* 13 */       return Check_Pallindrome_Recursively(S.substring(1, S.length() - 1));
/*    */     }
/* 15 */     return false;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 21 */     Scanner s = new Scanner(System.in);
/* 22 */     System.out.println("Enter the string:");
/* 23 */     String S = s.nextLine();
/* 24 */     boolean result = Check_Pallindrome_Recursively(S);
/* 25 */     if (result) {
/* 26 */       System.out.println("String is pallindrome");
/*    */     }
/*    */     else {
/* 29 */       System.out.println("String is not pallindrome:");
/*    */     }
/* 31 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.CheckPallindrome
 * JD-Core Version:    0.6.2
 */