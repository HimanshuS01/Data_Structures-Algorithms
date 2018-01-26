/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class PermutationsOfString2
/*    */ {
/*    */   public static int Fact(int length)
/*    */   {
/*  7 */     int result = 1;
/*  8 */     for (int i = length; i > 0; i--) {
/*  9 */       result *= i;
/*    */     }
/* 11 */     return result;
/*    */   }
/*    */ 
/*    */   public static String[] permutation(String N)
/*    */   {
/* 17 */     if (N.length() == 0)
/*    */     {
/* 19 */       String[] output = new String[1];
/* 20 */       output[0] = "";
/* 21 */       return output;
/*    */     }
/* 23 */     String[] SmallerOutput = permutation(N.substring(1));
/* 24 */     String CurrentPossChar = N.charAt(0);
/* 25 */     String[] output = new String[Fact(N.length())];
/* 26 */     int k = 0;
/* 27 */     for (int i = 0; i < SmallerOutput.length; i++) {
/* 28 */       for (int j = 0; j <= SmallerOutput[i].length(); j++) {
/* 29 */         output[k] = (SmallerOutput[i].substring(0, j) + CurrentPossChar + SmallerOutput[i].substring(j));
/* 30 */         k++;
/*    */       }
/*    */     }
/*    */ 
/* 34 */     return output;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 38 */     Scanner s = new Scanner(System.in);
/* 39 */     System.out.println("type a string");
/*    */ 
/* 41 */     String input = s.nextLine();
/*    */ 
/* 43 */     String[] output = permutation(input);
/*    */ 
/* 45 */     for (int i = 0; i < output.length; i++)
/*    */     {
/* 49 */       System.out.println(output[i]);
/*    */     }
/* 51 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.PermutationsOfString2
 * JD-Core Version:    0.6.2
 */