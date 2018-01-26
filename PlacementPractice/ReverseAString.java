/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ReverseAString
/*    */ {
/*    */   static Scanner s;
/*    */ 
/*    */   public static String reverseString(String[] words)
/*    */   {
/* 12 */     int beg = 0; for (int end = words.length - 1; 
/* 13 */       beg <= end; 
/* 17 */       end--)
/*    */     {
/* 14 */       String temp = words[beg];
/* 15 */       words[beg] = words[end];
/* 16 */       words[end] = temp;
/* 17 */       beg++;
/*    */     }
/*    */ 
/* 20 */     String reverse = "";
/* 21 */     for (int i = 0; i < words.length; i++)
/*    */     {
/* 23 */       for (int j = 0; j < words[i].length(); j++) {
/* 24 */         reverse = reverse + words[i].charAt(j);
/*    */       }
/* 26 */       reverse = reverse + ".";
/*    */     }
/*    */ 
/* 29 */     return reverse;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws IOException
/*    */   {
/* 45 */     char a = 'A';
/* 46 */     System.out.println(a);
/* 47 */     s = new Scanner(System.in);
/*    */ 
/* 50 */     int testCases = s.nextInt();
/*    */ 
/* 53 */     String st = s.nextLine();
/* 54 */     String[] output = new String[testCases];
/* 55 */     int k = 0;
/* 56 */     for (int i = 0; i < testCases; i++)
/*    */     {
/* 58 */       st = s.nextLine();
/*    */ 
/* 62 */       String[] words = st.split("\\.");
/* 63 */       output[(k++)] = reverseString(words);
/*    */     }
/*    */ 
/* 66 */     for (int i = 0; i < output.length; i++) {
/* 67 */       int len = output[i].length();
/* 68 */       System.out.println(output[i].substring(0, len - 1));
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.ReverseAString
 * JD-Core Version:    0.6.2
 */