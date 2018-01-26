/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StringBufferForMutable
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  7 */     String S = "Himanshu";
/*  8 */     S.concat("Singhal");
/*  9 */     System.out.println(S);
/* 10 */     StringBuffer sb = new StringBuffer();
/* 11 */     System.out.println(sb.capacity());
/* 12 */     sb.append("Hello");
/* 13 */     System.out.println(sb.capacity());
/* 14 */     System.out.println(sb.reverse());
/* 15 */     sb.append("java is my favourite language");
/* 16 */     System.out.println(sb.reverse());
/* 17 */     System.out.println(sb.capacity());
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     StringBufferForMutable
 * JD-Core Version:    0.6.2
 */