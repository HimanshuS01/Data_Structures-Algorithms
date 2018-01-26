/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class PossibleCombinations
/*    */ {
/*    */   public static void printCodes(String x, String soFar)
/*    */   {
/* 11 */     if (x.length() == 0) {
/* 12 */       System.out.println(soFar);
/* 13 */       return;
/*    */     }
/*    */ 
/* 16 */     if (x.length() == 1) {
/* 17 */       System.out.println(soFar + (char)(97 + (x.charAt(0) - '1')));
/* 18 */       return;
/*    */     }
/*    */ 
/* 22 */     char frontCharPossibility1 = (char)(97 + (x.charAt(0) - '1'));
/* 23 */     printCodes(x.substring(1), soFar + frontCharPossibility1);
/*    */ 
/* 26 */     if ((x.charAt(0) == '1') || ((x.charAt(0) == '2') && (x.charAt(1) <= '6')))
/*    */     {
/*    */       char frontCharPossibility2;
/*    */       char frontCharPossibility2;
/* 28 */       if (x.charAt(0) == '1')
/* 29 */         frontCharPossibility2 = (char)(107 + (x.charAt(1) - '1'));
/*    */       else {
/* 31 */         frontCharPossibility2 = (char)(117 + (x.charAt(1) - '1'));
/*    */       }
/* 33 */       printCodes(x.substring(2), soFar + frontCharPossibility2);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static String[] getPossibleOutputs(String x) {
/* 38 */     if (x.length() == 0) {
/* 39 */       String[] output = new String[1];
/* 40 */       output[0] = "";
/* 41 */       return output;
/*    */     }
/* 43 */     if (x.length() == 1) {
/* 44 */       String[] output = new String[1];
/* 45 */       output[0] = ((char)(97 + (x.charAt(0) - '1')));
/* 46 */       return output;
/*    */     }
/*    */ 
/* 49 */     char CurrentPossChar1 = (char)('a' + x.charAt(0) - 49);
/* 50 */     String[] SmallerOutput1 = getPossibleOutputs(x.substring(1));
/* 51 */     String[] output = null;
/* 52 */     String[] SmallerOutput2 = null;
/* 53 */     char CurrentPossChar2 = ' ';
/*    */ 
/* 55 */     if ((x.charAt(0) == '1') || ((x.charAt(0) == '2') && (x.charAt(1) <= '6'))) {
/* 56 */       if (x.charAt(0) == '1') {
/* 57 */         CurrentPossChar2 = (char)(107 + (x.charAt(1) - '1'));
/*    */       }
/*    */       else
/*    */       {
/* 61 */         CurrentPossChar2 = (char)('u' + x.charAt(1) - 49);
/*    */       }
/* 63 */       SmallerOutput2 = getPossibleOutputs(x.substring(2));
/*    */     }
/* 65 */     if (SmallerOutput2 == null) {
/* 66 */       output = new String[SmallerOutput1.length];
/*    */     }
/*    */     else {
/* 69 */       output = new String[SmallerOutput1.length + SmallerOutput2.length];
/*    */     }
/* 71 */     int i = 0;
/* 72 */     for (String ans : SmallerOutput1) {
/* 73 */       output[i] = (CurrentPossChar1 + ans);
/* 74 */       i++;
/*    */     }
/* 76 */     if (SmallerOutput2 != null) {
/* 77 */       for (String ans : SmallerOutput2) {
/* 78 */         output[i] = (CurrentPossChar2 + ans);
/* 79 */         i++;
/*    */       }
/*    */     }
/* 82 */     return output;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 88 */     Scanner s = new Scanner(System.in);
/* 89 */     System.out.println("Enter the string");
/* 90 */     String n = s.nextLine();
/*    */ 
/* 95 */     String S = "";
/* 96 */     printCodes(n, S);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.PossibleCombinations
 * JD-Core Version:    0.6.2
 */