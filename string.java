/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class string
/*    */ {
/*    */   public static boolean Pallindrome(String S)
/*    */   {
/* 19 */     int beg_index = 0; int end_index = S.length() - 1;
/* 20 */     while (beg_index <= end_index) {
/* 21 */       if (S.charAt(beg_index) != S.charAt(end_index)) {
/* 22 */         return false;
/*    */       }
/* 24 */       beg_index++;
/* 25 */       end_index--;
/*    */     }
/* 27 */     return true;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 35 */     System.out.println("Enter the string");
/* 36 */     Scanner s = new Scanner(System.in);
/* 37 */     String a = s.nextLine();
/* 38 */     int i = 0;
/* 39 */     while (i < a.length()) {
/* 40 */       char ith = a.charAt(i);
/* 41 */       System.out.println(ith);
/* 42 */       i++;
/*    */     }
/* 44 */     if (Pallindrome(a)) {
/* 45 */       System.out.println("Yes Palindrome");
/*    */     }
/*    */     else
/* 48 */       System.out.println("Nope not a Palindrome");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     string
 * JD-Core Version:    0.6.2
 */