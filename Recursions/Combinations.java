/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Combinations
/*    */ {
/*    */   public static String[] PossibleCombinations(String N)
/*    */   {
/*  7 */     if (N.length() == 0) {
/*  8 */       String[] output = new String[1];
/*  9 */       output[0] = "";
/* 10 */       return output;
/*    */     }
/*    */ 
/* 13 */     int beg = 0;
/* 14 */     String[] smallerOutput = PossibleCombinations(N.substring(1));
/* 15 */     char CurrentPossChar = (char)(97 + (N.charAt(0) - '0') - 1);
/* 16 */     String[] output = new String[smallerOutput.length];
/* 17 */     int k = 0;
/* 18 */     for (int i = 0; i < output.length; i++) {
/* 19 */       output[k] = (CurrentPossChar + smallerOutput[i]);
/* 20 */       k++;
/*    */     }
/*    */ 
/* 23 */     if (((N.charAt(beg) <= '1') && (N.charAt(beg) >= '0')) || ((N.charAt(beg) == '2') && (N.charAt(beg + 1) <= '6'))) {
/* 24 */       String[] smallerOutput2 = PossibleCombinations(N.substring(2));
/* 25 */       char CurrentPossChar2 = (char)(97 + ((N.charAt(beg) - '0') * 10 + (N.charAt(beg + 1) - '0')) - 1);
/* 26 */       String[] output2 = new String[smallerOutput2.length];
/* 27 */       int k1 = 0;
/* 28 */       for (int i = 0; i < smallerOutput2.length; i++) {
/* 29 */         output2[k1] = (CurrentPossChar2 + smallerOutput2[i]);
/* 30 */         k1++;
/*    */       }
/* 32 */       return output2;
/*    */     }
/*    */ 
/* 36 */     return output;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 42 */     Scanner s = new Scanner(System.in);
/* 43 */     System.out.println("Enter the string");
/* 44 */     String n = s.nextLine();
/* 45 */     String[] output = PossibleCombinations(n);
/* 46 */     for (int i = 0; i < output.length; i++) {
/* 47 */       System.out.println(output[i]);
/*    */     }
/*    */ 
/* 51 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.Combinations
 * JD-Core Version:    0.6.2
 */