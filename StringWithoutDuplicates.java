/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class StringWithoutDuplicates
/*    */ {
/*    */   public static void Print_String_Without_Duplicates(String n)
/*    */   {
/*  7 */     int i = 0;
/*  8 */     while (i < n.length() - 1) {
/*  9 */       int count = 1;
/* 10 */       if (n.charAt(i) == n.charAt(i + 1)) {
/* 11 */         count++;
/*    */       }
/* 13 */       System.out.print(n.charAt(i));
/* 14 */       i += count;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 33 */     Scanner s = new Scanner(System.in);
/* 34 */     System.out.println("Enter the string:");
/* 35 */     String n = s.nextLine();
/* 36 */     Print_String_Without_Duplicates(n);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     StringWithoutDuplicates
 * JD-Core Version:    0.6.2
 */