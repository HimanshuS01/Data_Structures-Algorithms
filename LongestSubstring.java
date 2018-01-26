/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class LongestSubstring
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  7 */     String str = "My name is Himanshu Singhal";
/*  8 */     int count_space = 0;
/*  9 */     for (int i = 0; i < str.length(); i++) {
/* 10 */       if (str.charAt(i) == ' ') {
/* 11 */         count_space++;
/*    */       }
/*    */     }
/* 14 */     System.out.println("Given string is: " + str);
/* 15 */     int words = count_space + 1;
/* 16 */     int[] A = new int[words + 1];
/* 17 */     int i = 0; int count = 0; int j = 0; int k = 0;
/* 18 */     A[0] = -1;
/* 19 */     String[] newStr = new String[words];
/* 20 */     while (i < str.length())
/*    */     {
/* 22 */       i++;
/*    */ 
/* 21 */       while (str.charAt(i) != ' ')
/*    */       {
/* 23 */         count++;
/* 24 */         if (i >= str.length()) {
/*    */           break;
/*    */         }
/*    */       }
/* 28 */       A[(++j)] = count;
/* 29 */       newStr[k] = str.substring(A[(j - 1)] + 1, A[j]);
/* 30 */       k++;
/* 31 */       i++;
/* 32 */       count++;
/*    */     }
/* 34 */     String LargestSubstring = newStr[0];
/* 35 */     int l = 0;
/* 36 */     while (l < newStr.length) {
/* 37 */       if (newStr[l].length() >= LargestSubstring.length()) {
/* 38 */         LargestSubstring = newStr[l];
/*    */       }
/* 40 */       l++;
/*    */     }
/* 42 */     System.out.println("Largest substring is : " + LargestSubstring);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     LongestSubstring
 * JD-Core Version:    0.6.2
 */