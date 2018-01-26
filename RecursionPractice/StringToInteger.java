/*    */ package RecursionPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class StringToInteger
/*    */ {
/*    */   public static int String_To_Integer(String N)
/*    */   {
/*  8 */     if (N.length() == 0) {
/*  9 */       return -1;
/*    */     }
/* 11 */     if (N.length() == 1) {
/* 12 */       return N.charAt(0) - '0';
/*    */     }
/* 14 */     int Smaller_Output = String_To_Integer(N.substring(0, N.length() - 1));
/* 15 */     return Smaller_Output * 10 + N.charAt(N.length() - 1) - 48;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 21 */     Scanner s = new Scanner(System.in);
/* 22 */     System.out.println("Enter the string");
/* 23 */     String N = s.nextLine();
/* 24 */     int result = String_To_Integer(N);
/* 25 */     if (result >= 0) {
/* 26 */       System.out.println("String to integer conversion:" + result);
/*    */     }
/*    */ 
/* 32 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     RecursionPractice.StringToInteger
 * JD-Core Version:    0.6.2
 */