/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class countcharacter
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     System.out.println("Enter the string");
/*  9 */     Scanner s = new Scanner(System.in);
/* 10 */     String A = s.nextLine();
/*    */ 
/* 12 */     int i = 0;
/* 13 */     while (i < A.length()) {
/* 14 */       int count = 1;
/* 15 */       for (int j = i + 1; j < A.length(); j++) {
/* 16 */         if (A.charAt(i) == A.charAt(j)) {
/* 17 */           count++;
/*    */         }
/*    */       }
/*    */ 
/* 21 */       System.out.print(A.charAt(i) + count);
/* 22 */       i += count;
/*    */     }
/*    */ 
/* 25 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     countcharacter
 * JD-Core Version:    0.6.2
 */