/*    */ package PlacementPractice;
/*    */ 
/*    */ import DSpractice.QueueAsLinkList;
/*    */ import DSpractice.QueueEmptyException;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class ReverseAQueue
/*    */ {
/*    */   public void ReverseQueue(QueueAsLinkList queue1)
/*    */     throws QueueEmptyException
/*    */   {
/* 33 */     QueueAsLinkList queue2 = new QueueAsLinkList();
/* 34 */     int size = queue1.size();
/* 35 */     while (size != 0) {
/* 36 */       while (queue1.size() != 1) {
/*    */         try {
/* 38 */           queue2.Enqueue(queue1.Dequeue());
/*    */         }
/*    */         catch (QueueEmptyException e) {
/* 41 */           e.printStackTrace();
/*    */         }
/*    */       }
/* 44 */       System.out.print(queue1.Dequeue() + ",");
/* 45 */       size--;
/* 46 */       QueueAsLinkList temp = queue1;
/* 47 */       queue1 = queue2;
/* 48 */       queue2 = temp;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws QueueEmptyException
/*    */   {
/* 56 */     int[] arr = { 1, 2, 3, 4, 5 };
/* 57 */     ReverseAQueue obj = new ReverseAQueue();
/* 58 */     QueueAsLinkList Q = new QueueAsLinkList();
/* 59 */     System.out.println("Original queue is(FIFO):");
/* 60 */     for (int i = 0; i < arr.length; i++) {
/* 61 */       System.out.print(Q.Enqueue(arr[i]) + ",");
/*    */     }
/* 63 */     System.out.println("Queue in Reverse order is(LIFO):");
/* 64 */     obj.ReverseQueue(Q);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.ReverseAQueue
 * JD-Core Version:    0.6.2
 */