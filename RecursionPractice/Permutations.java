/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Permutations
/*    */ {
/*    */   public static String[] permutations(String N)
/*    */   {
/*  9 */     if (N.length() == 0) {
/* 10 */       String[] output = new String[1];
/* 11 */       output[0] = "";
/* 12 */       return output;
/*    */     }
/* 14 */     String firstChar = N.charAt(0);
/* 15 */     String[] SmallerOutput = permutations(N.substring(1));
/* 16 */     String[] output = new String[N.length() * SmallerOutput.length];
/* 17 */     int k = 0;
/* 18 */     for (int i = 0; i < SmallerOutput.length; i++) {
/* 19 */       for (int j = 0; j <= SmallerOutput[i].length(); j++)
/*    */       {
/* 24 */         output[k] = (SmallerOutput[i].substring(0, j) + firstChar + SmallerOutput[i].substring(j));
/* 25 */         k++;
/*    */       }
/*    */     }
/* 28 */     return output;
/*    */   }
/*    */   public static int String_To_Integer(String N) {
/* 31 */     if (N.length() == 0) {
/* 32 */       return -1;
/*    */     }
/* 34 */     if (N.length() == 1) {
/* 35 */       return N.charAt(0) - '0';
/*    */     }
/* 37 */     int smallerOutput = String_To_Integer(N.substring(0, N.length() - 1));
/* 38 */     return 10 * smallerOutput + N.charAt(N.length() - 1) - 48;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 43 */     Scanner s = new Scanner(System.in);
/* 44 */     System.out.println("Enter the string:");
/* 45 */     String S = s.nextLine();
/* 46 */     String[] output = permutations(S);
/* 47 */     for (int i = 0; i < output.length; i++)
/*    */     {
/* 50 */       if (String_To_Integer(output[i]) < 150)
/* 51 */         System.out.println(output[i]);
/*    */     }
/* 53 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.Permutations
 * JD-Core Version:    0.6.2
 */