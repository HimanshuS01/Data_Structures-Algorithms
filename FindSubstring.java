/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class FindSubstring
/*    */ {
/*    */   public static int Index_Of(String a, String b)
/*    */   {
/*  7 */     int i = 0;
/*  8 */     int j = 0;
/*  9 */     while ((i < a.length()) && (j < b.length())) {
/* 10 */       if (a.charAt(i) == b.charAt(j)) {
/* 11 */         i++;
/* 12 */         j++;
/*    */       }
/*    */       else {
/* 15 */         i++;
/* 16 */         j = 0;
/*    */       }
/*    */     }
/* 19 */     return i - b.length();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 41 */     Scanner s = new Scanner(System.in);
/* 42 */     System.out.println("Enter the string");
/* 43 */     String m = s.nextLine();
/* 44 */     System.out.println("Enter the substring");
/* 45 */     String n = s.nextLine();
/* 46 */     int index = Index_Of(m, n);
/* 47 */     System.out.println("Substring starts with the Index :" + index);
/* 48 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     FindSubstring
 * JD-Core Version:    0.6.2
 */