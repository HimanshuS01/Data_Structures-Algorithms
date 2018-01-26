/*    */ package MultiThreading;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class ThreadSleepTest extends Thread
/*    */ {
/*    */   public void run()
/*    */   {
/*  6 */     for (int i = 0; i < 5; i++) {
/*    */       try {
/*  8 */         Thread.sleep(500L);
/*    */       }
/*    */       catch (InterruptedException e)
/*    */       {
/* 12 */         System.out.println(e);
/*    */       }
/* 14 */       System.out.println(i);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 23 */     ThreadSleepTest t1 = new ThreadSleepTest();
/* 24 */     ThreadSleepTest t2 = new ThreadSleepTest();
/* 25 */     t1.start();
/* 26 */     t2.start();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     MultiThreading.ThreadSleepTest
 * JD-Core Version:    0.6.2
 */