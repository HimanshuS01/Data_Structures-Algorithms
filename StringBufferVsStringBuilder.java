/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StringBufferVsStringBuilder
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  7 */     long startTime = System.currentTimeMillis();
/*  8 */     StringBuffer sb = new StringBuffer("Java");
/*  9 */     for (int i = 0; i < 10000; i++) {
/* 10 */       sb.append("Tpoint");
/*    */     }
/* 12 */     System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
/* 13 */     startTime = System.currentTimeMillis();
/* 14 */     StringBuilder sb2 = new StringBuilder("Java");
/* 15 */     for (int i = 0; i < 10000; i++) {
/* 16 */       sb2.append("Tpoint");
/*    */     }
/* 18 */     System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     StringBufferVsStringBuilder
 * JD-Core Version:    0.6.2
 */