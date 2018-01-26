/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SubsequenceOfString
/*    */ {
/*    */   public static String[] PossibleCombinationsMethod1(String N)
/*    */   {
/*  7 */     if (N.length() == 0) {
/*  8 */       String[] output = new String[1];
/*  9 */       output[0] = "";
/* 10 */       return output;
/*    */     }
/* 12 */     String[] ArraySoFar = PossibleCombinationsMethod1(N.substring(1));
/* 13 */     String[] output = new String[2 * ArraySoFar.length];
/* 14 */     int k = 0;
/* 15 */     for (int i = 0; i < output.length; i++) {
/* 16 */       if (i < ArraySoFar.length) {
/* 17 */         output[k] = ArraySoFar[i];
/*    */       }
/*    */       else {
/* 20 */         output[k] = (N.charAt(0) + ArraySoFar[(i - ArraySoFar.length)]);
/*    */       }
/* 22 */       k++;
/*    */     }
/* 24 */     return output;
/*    */   }
/*    */ 
/*    */   public static void PossibleCombinationsMethod2(String suffix, String prefix) {
/* 28 */     if (prefix.length() < 0) return;
/* 29 */     System.out.print(suffix + ",");
/* 30 */     for (int i = 0; i < prefix.length(); i++)
/*    */     {
/* 32 */       PossibleCombinationsMethod2(suffix + prefix.charAt(i), prefix.substring(i + 1, prefix.length()));
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void printSubsequence(char[] char_arr, char[] arr_so_far, int beg, int end) {
/* 37 */     if (beg >= end) {
/* 38 */       for (char ch : arr_so_far) {
/* 39 */         System.out.print(ch);
/*    */       }
/* 41 */       System.out.print(",");
/* 42 */       return;
/*    */     }
/* 44 */     arr_so_far[beg] = ' ';
/* 45 */     printSubsequence(char_arr, arr_so_far, beg + 1, end);
/*    */ 
/* 47 */     arr_so_far[beg] = char_arr[beg];
/* 48 */     printSubsequence(char_arr, arr_so_far, beg + 1, end);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 57 */     String str = "abc";
/* 58 */     char[] char_arr = str.toCharArray();
/* 59 */     char[] arr_so_far = new char[str.length()];
/* 60 */     printSubsequence(char_arr, arr_so_far, 0, char_arr.length);
/*    */ 
/* 64 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 66 */     System.out.println("Enter the string");
/* 67 */     String n = s.nextLine();
/*    */ 
/* 69 */     System.out.println("\nMethod1:");
/* 70 */     long startTime = System.currentTimeMillis();
/* 71 */     String[] result = PossibleCombinationsMethod1(n);
/* 72 */     long endTime = System.currentTimeMillis();
/* 73 */     long totalTime = endTime - startTime;
/* 74 */     System.out.println(totalTime + " ms");
/* 75 */     for (int i = 0; i < result.length; i++) {
/* 76 */       System.out.print(result[i] + ",");
/*    */     }
/*    */ 
/* 79 */     System.out.println();
/* 80 */     System.out.println("Method2:");
/* 81 */     PossibleCombinationsMethod2("", n);
/*    */ 
/* 83 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.SubsequenceOfString
 * JD-Core Version:    0.6.2
 */