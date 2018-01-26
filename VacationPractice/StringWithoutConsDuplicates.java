/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class StringWithoutConsDuplicates
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 10 */     Scanner s = new Scanner(System.in);
/* 11 */     String S = "aaaabccba";
/* 12 */     int i = 0;
/* 13 */     while (i < S.length()) {
/* 14 */       int j = i + 1;
/* 15 */       int count = 0;
/* 16 */       while (j < S.length()) {
/* 17 */         if (S.charAt(i) != S.charAt(j)) break;
/* 18 */         j++;
/* 19 */         count++;
/*    */       }
/*    */ 
/* 25 */       System.out.print(S.charAt(i));
/* 26 */       i = i + count + 1;
/*    */     }
/* 28 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.StringWithoutConsDuplicates
 * JD-Core Version:    0.6.2
 */