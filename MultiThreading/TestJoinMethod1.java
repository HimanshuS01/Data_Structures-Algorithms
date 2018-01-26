/*    */ package MultiThreading;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class TestJoinMethod1 extends Thread
/*    */ {
/*    */   public void run()
/*    */   {
/*  8 */     for (int i = 1; i <= 5; i++) {
/*    */       try {
/* 10 */         Thread.sleep(500L); } catch (Exception e) {
/* 11 */         System.out.println(e);
/* 12 */       }System.out.println(i);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 17 */     TestJoinMethod1 t1 = new TestJoinMethod1();
/* 18 */     TestJoinMethod1 t2 = new TestJoinMethod1();
/* 19 */     TestJoinMethod1 t3 = new TestJoinMethod1();
/* 20 */     t1.start();
/*    */     try
/*    */     {
/* 24 */       t1.join(); } catch (Exception e) {
/* 25 */       System.out.println(e);
/*    */     }
/* 27 */     t2.start();
/* 28 */     t3.start();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     MultiThreading.TestJoinMethod1
 * JD-Core Version:    0.6.2
 */