/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Return_Integer
/*    */ {
/*    */   public static int ReturnInteger(String N)
/*    */   {
/*  7 */     if (N.length() == 0) {
/*  8 */       return -1;
/*    */     }
/* 10 */     if (N.length() == 1) {
/* 11 */       return N.charAt(0) - '0';
/*    */     }
/*    */ 
/* 14 */     int smallerOutput = ReturnInteger(N.substring(0, N.length() - 1));
/* 15 */     return smallerOutput * 10 + N.charAt(N.length() - 1) - 48;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 21 */     Scanner s = new Scanner(System.in);
/* 22 */     System.out.println("Enter the String");
/* 23 */     String S = s.nextLine();
/* 24 */     int Result = ReturnInteger(S);
/* 25 */     if (Result >= 0) {
/* 26 */       System.out.println(Result);
/*    */     }
/* 28 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.Return_Integer
 * JD-Core Version:    0.6.2
 */