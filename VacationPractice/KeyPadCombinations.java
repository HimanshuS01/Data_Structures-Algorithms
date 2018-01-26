/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class KeyPadCombinations
/*    */ {
/*    */   public static String getKeypad(char c)
/*    */   {
/*  8 */     if (c == '2') {
/*  9 */       return "abc";
/*    */     }
/* 11 */     if (c == '3') {
/* 12 */       return "def";
/*    */     }
/* 14 */     if (c == '4') {
/* 15 */       return "ghi";
/*    */     }
/* 17 */     if (c == '5') {
/* 18 */       return "jkl";
/*    */     }
/* 20 */     if (c == '6') {
/* 21 */       return "mno";
/*    */     }
/* 23 */     if (c == '7') {
/* 24 */       return "pqrs";
/*    */     }
/* 26 */     if (c == '8') {
/* 27 */       return "tuv";
/*    */     }
/*    */ 
/* 30 */     return "wxyz";
/*    */   }
/*    */ 
/*    */   public static String[] PosssibleCombinations(String N) {
/* 34 */     if (N.length() == 0) {
/* 35 */       String[] output = new String[1];
/* 36 */       output[0] = "";
/* 37 */       return output;
/*    */     }
/* 39 */     String[] SmallerOutput = PosssibleCombinations(N.substring(1));
/* 40 */     String CurentPossChar = getKeypad(N.charAt(0));
/* 41 */     String[] output = new String[SmallerOutput.length * CurentPossChar.length()];
/* 42 */     int k = 0;
/* 43 */     for (int i = 0; i < CurentPossChar.length(); i++) {
/* 44 */       for (int j = 0; j < SmallerOutput.length; j++) {
/* 45 */         output[k] = (CurentPossChar.charAt(i) + SmallerOutput[j]);
/* 46 */         k++;
/*    */       }
/*    */     }
/* 49 */     return output;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 55 */     Scanner s = new Scanner(System.in);
/* 56 */     System.out.println("Enter the string:");
/* 57 */     String S = s.nextLine();
/* 58 */     String[] Result = PosssibleCombinations(S);
/* 59 */     for (int i = 0; i < Result.length; i++) {
/* 60 */       System.out.println(Result[i]);
/*    */     }
/* 62 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.KeyPadCombinations
 * JD-Core Version:    0.6.2
 */