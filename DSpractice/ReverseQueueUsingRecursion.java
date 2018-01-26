/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class ReverseQueueUsingRecursion
/*    */ {
/*    */   public static void ReverseQueue(QueueAsLinkList Q)
/*    */   {
/*    */     try
/*    */     {
/*  8 */       if (!Q.isEmpty()) {
/*  9 */         int temp = Q.Dequeue();
/* 10 */         ReverseQueue(Q);
/* 11 */         System.out.println(Q.Enqueue(temp));
/*    */       }
/*    */     } catch (QueueEmptyException e) {
/* 14 */       System.out.println("Cannot possible to Dequeue further");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 21 */     int[] A = { 1, 2, 3, 4, 5 };
/* 22 */     QueueAsLinkList Q = new QueueAsLinkList();
/* 23 */     System.out.println("Original queue is(FIFO):");
/* 24 */     for (int i = 0; i < A.length; i++) {
/* 25 */       System.out.println(Q.Enqueue(A[i]));
/*    */     }
/* 27 */     System.out.println("Queue in Reverse order is(LIFO):");
/* 28 */     ReverseQueue(Q);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.ReverseQueueUsingRecursion
 * JD-Core Version:    0.6.2
 */