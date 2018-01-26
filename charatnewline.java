/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class charatnewline
/*    */ {
/*    */   public static boolean isPalindrome(String a)
/*    */   {
/*  8 */     int startIndex = 0;
/*  9 */     int endIndex = a.length() - 1;
/*    */ 
/* 11 */     while (startIndex < endIndex) {
/* 12 */       if (a.charAt(startIndex) != a.charAt(endIndex)) {
/* 13 */         return false;
/*    */       }
/* 15 */       startIndex++;
/* 16 */       endIndex--;
/*    */     }
/*    */ 
/* 19 */     return true;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 24 */     Scanner s = new Scanner(System.in);
/* 25 */     String a = s.nextLine();
/*    */ 
/* 27 */     for (int i = 0; i < a.length(); i++) {
/* 28 */       char ith = a.charAt(i);
/* 29 */       System.out.println(ith);
/*    */     }
/* 31 */     boolean result = isPalindrome(a);
/* 32 */     if (result)
/* 33 */       System.out.println("Yes Palindrome");
/*    */     else
/* 35 */       System.out.println("Nope not a Palindrome");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     charatnewline
 * JD-Core Version:    0.6.2
 */