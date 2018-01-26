/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.LinkedList;
/*    */ import java.util.Queue;
/*    */ 
/*    */ public class ReverseQueue
/*    */ {
/*    */   public static void ReverseAQueueUsingRecursion(Queue<Integer> queue)
/*    */   {
/* 12 */     if (!queue.isEmpty()) {
/* 13 */       int dequeuedElement = ((Integer)queue.poll()).intValue();
/* 14 */       ReverseAQueueUsingRecursion(queue);
/*    */ 
/* 16 */       queue.add(Integer.valueOf(dequeuedElement));
/*    */     }
/*    */ 
/* 19 */     System.out.println(queue);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 25 */     Queue q1 = new LinkedList();
/* 26 */     Queue q2 = new LinkedList();
/*    */ 
/* 28 */     q1.add(Integer.valueOf(1)); q1.add(Integer.valueOf(2)); q1.add(Integer.valueOf(3)); q1.add(Integer.valueOf(4)); q1.add(Integer.valueOf(5));
/*    */ 
/* 30 */     System.out.println(q1);
/* 31 */     ReverseAQueueUsingRecursion(q1);
/*    */ 
/* 34 */     while (!q1.isEmpty())
/*    */     {
/* 36 */       while (q1.size() != 1)
/*    */       {
/* 38 */         q2.add((Integer)q1.poll());
/*    */       }
/*    */ 
/* 41 */       System.out.print(q1.poll() + " ");
/* 42 */       Queue temp = q1;
/* 43 */       q1 = q2;
/* 44 */       q2 = temp;
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.ReverseQueue
 * JD-Core Version:    0.6.2
 */