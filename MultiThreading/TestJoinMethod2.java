/*    */ package MultiThreading;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class TestJoinMethod2 extends Thread
/*    */ {
/*    */   public void run()
/*    */   {
/*  6 */     for (int i = 1; i <= 5; i++) {
/*    */       try {
/*  8 */         Thread.sleep(500L);
/*    */       }
/*    */       catch (Exception e) {
/* 11 */         System.out.println(e);
/*    */       }
/* 13 */       System.out.println(i);
/*    */     }
/*    */   }
/*    */ 
/* 17 */   public static void main(String[] args) { TestJoinMethod2 t1 = new TestJoinMethod2();
/* 18 */     TestJoinMethod2 t2 = new TestJoinMethod2();
/* 19 */     TestJoinMethod2 t3 = new TestJoinMethod2();
/* 20 */     t1.start();
/*    */     try {
/* 22 */       t1.join(1500L); } catch (Exception e) {
/* 23 */       System.out.println(e);
/*    */     }
/* 25 */     t2.start();
/* 26 */     t3.start();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     MultiThreading.TestJoinMethod2
 * JD-Core Version:    0.6.2
 */