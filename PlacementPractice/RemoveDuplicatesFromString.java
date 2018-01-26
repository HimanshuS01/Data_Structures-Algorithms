/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class RemoveDuplicatesFromString
/*    */ {
/*    */   public static String RemoveDuplicates(String newStr, String str)
/*    */   {
/*  7 */     if (str.length() == 0) {
/*  8 */       return newStr;
/*    */     }
/* 10 */     if (newStr.charAt(newStr.length() - 1) != str.charAt(0)) {
/* 11 */       newStr = newStr + str.charAt(0);
/* 12 */       return RemoveDuplicates(newStr, str.substring(1));
/*    */     }
/*    */ 
/* 15 */     return RemoveDuplicates(newStr, str.substring(1));
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 22 */     String str = "aabccccddee";
/* 23 */     System.out.println(RemoveDuplicates(" ", str).trim());
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.RemoveDuplicatesFromString
 * JD-Core Version:    0.6.2
 */