/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SubsequenceMobileKeypad
/*    */ {
/*    */   public static String getKeypad(char c)
/*    */   {
/*  7 */     if (c == '2') {
/*  8 */       return "abc";
/*    */     }
/* 10 */     if (c == '3') {
/* 11 */       return "def";
/*    */     }
/* 13 */     if (c == '4') {
/* 14 */       return "ghi";
/*    */     }
/* 16 */     if (c == '5') {
/* 17 */       return "jkl";
/*    */     }
/* 19 */     if (c == '6') {
/* 20 */       return "mno";
/*    */     }
/* 22 */     if (c == '7') {
/* 23 */       return "pqrs";
/*    */     }
/* 25 */     if (c == '8') {
/* 26 */       return "tuv";
/*    */     }
/*    */ 
/* 29 */     return "wxyz";
/*    */   }
/*    */ 
/*    */   public static String[] keypadCombinations(String n)
/*    */   {
/* 34 */     if (n.length() == 0) {
/* 35 */       String[] output = new String[1];
/* 36 */       output[0] = "";
/* 37 */       return output;
/*    */     }
/* 39 */     String[] smallerOutput = keypadCombinations(n.substring(1));
/* 40 */     String currentPossChar = getKeypad(n.charAt(0));
/* 41 */     String[] output = new String[smallerOutput.length * currentPossChar.length()];
/* 42 */     int k = 0;
/* 43 */     for (int i = 0; i < currentPossChar.length(); i++) {
/* 44 */       for (int j = 0; j < smallerOutput.length; j++) {
/* 45 */         output[k] = (currentPossChar.charAt(i) + smallerOutput[j]);
/* 46 */         k++;
/*    */       }
/*    */     }
/*    */ 
/* 50 */     return output;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 56 */     Scanner s = new Scanner(System.in);
/* 57 */     System.out.println("Enter the string");
/* 58 */     String n = s.nextLine();
/* 59 */     String[] output = keypadCombinations(n);
/* 60 */     for (int i = 0; i < output.length; i++) {
/* 61 */       System.out.println(output[i]);
/*    */     }
/* 63 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.SubsequenceMobileKeypad
 * JD-Core Version:    0.6.2
 */