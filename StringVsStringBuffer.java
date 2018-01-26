/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StringVsStringBuffer
/*    */ {
/*    */   public static String ConcatWithString()
/*    */   {
/*  8 */     String t = "Java";
/*  9 */     for (int i = 0; i < 10000; i++) {
/* 10 */       t = t + "Tpoint";
/*    */     }
/* 12 */     return t;
/*    */   }
/*    */ 
/*    */   public static String ConcatUsingStringBuffer()
/*    */   {
/* 17 */     StringBuffer sb = new StringBuffer("Java");
/* 18 */     for (int i = 0; i < 10000; i++) {
/* 19 */       sb.append("Tpoint");
/*    */     }
/* 21 */     return sb.toString();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 27 */     long startTime = System.currentTimeMillis();
/* 28 */     ConcatWithString();
/* 29 */     System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
/* 30 */     startTime = System.currentTimeMillis();
/* 31 */     ConcatUsingStringBuffer();
/* 32 */     System.out.println("Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     StringVsStringBuffer
 * JD-Core Version:    0.6.2
 */