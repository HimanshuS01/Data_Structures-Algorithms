/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class KeyPadCombination
/*    */ {
/*    */   public static String Get_Codes(char ch)
/*    */     throws InvalidEntryException
/*    */   {
/*  7 */     if (ch == '2') {
/*  8 */       return "abc";
/*    */     }
/* 10 */     if (ch == '3') {
/* 11 */       return "def";
/*    */     }
/* 13 */     if (ch == '4') {
/* 14 */       return "ghi";
/*    */     }
/* 16 */     if (ch == '5') {
/* 17 */       return "jkl";
/*    */     }
/* 19 */     if (ch == '6') {
/* 20 */       return "mno";
/*    */     }
/* 22 */     if (ch == '7') {
/* 23 */       return "pqrs";
/*    */     }
/* 25 */     if (ch == '8') {
/* 26 */       return "tuv";
/*    */     }
/* 28 */     if (ch == '9') {
/* 29 */       return "wxyz";
/*    */     }
/*    */ 
/* 32 */     InvalidEntryException e = new InvalidEntryException();
/* 33 */     throw e;
/*    */   }
/*    */ 
/*    */   public static void Get_Keypad_Combinations(String N, String OutputSoFar)
/*    */   {
/* 41 */     if (N.length() == 0) {
/* 42 */       System.out.println(OutputSoFar);
/* 43 */       return;
/*    */     }
/*    */ 
/*    */     try
/*    */     {
/* 51 */       GetCharForPossNumber = Get_Codes(N.charAt(0));
/*    */     }
/*    */     catch (InvalidEntryException e)
/*    */     {
/*    */       String GetCharForPossNumber;
/* 59 */       System.out.println("Invalid Input!");
/*    */       return;
/*    */     }
/*    */     String GetCharForPossNumber;
/* 62 */     for (int i = 0; i < GetCharForPossNumber.length(); i++)
/* 63 */       Get_Keypad_Combinations(N.substring(1), OutputSoFar + GetCharForPossNumber.charAt(i));
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 70 */     Scanner s = new Scanner(System.in);
/* 71 */     System.out.println("Enter the string(Numeric):");
/* 72 */     String N = s.nextLine();
/* 73 */     String B = "";
/* 74 */     Get_Keypad_Combinations(N, B);
/* 75 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.KeyPadCombination
 * JD-Core Version:    0.6.2
 */