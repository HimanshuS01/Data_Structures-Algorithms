/*    */ package MultiThreading;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Multi2
/*    */   implements Runnable
/*    */ {
/*    */   public void run()
/*    */   {
/*  7 */     System.out.println("Thread is running:");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 15 */     Multi2 M = new Multi2();
/* 16 */     Thread t = new Thread(M);
/* 17 */     t.start();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     MultiThreading.Multi2
 * JD-Core Version:    0.6.2
 */