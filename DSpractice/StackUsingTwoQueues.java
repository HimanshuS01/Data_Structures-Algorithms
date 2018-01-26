/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackUsingTwoQueues
/*    */ {
/*  5 */   QueueAsLinkList Q1 = new QueueAsLinkList();
/*  6 */   QueueAsLinkList Q2 = new QueueAsLinkList();
/*    */ 
/*    */   public int size() {
/*  9 */     return this.Q1.size();
/*    */   }
/*    */ 
/*    */   public boolean isEmpty() {
/* 13 */     if (this.Q1.isEmpty()) {
/* 14 */       return true;
/*    */     }
/*    */ 
/* 17 */     return false;
/*    */   }
/*    */ 
/*    */   public void push(int element)
/*    */   {
/* 22 */     int enqueue_Element = this.Q1.Enqueue(element);
/* 23 */     System.out.println(enqueue_Element);
/*    */   }
/*    */ 
/*    */   public void pop() throws QueueEmptyException {
/* 27 */     if (this.Q1.isEmpty()) {
/* 28 */       e = new QueueEmptyException();
/* 29 */       throw e;
/*    */     }
/*    */ 
/* 32 */     while (this.Q1.size() != 1) {
/*    */       try
/*    */       {
/*    */         QueueEmptyException e;
/* 34 */         this.Q2.Enqueue(this.Q1.Dequeue());
/*    */       }
/*    */       catch (QueueEmptyException e) {
/* 37 */         System.out.println("Cannot possible to enter more elements");
/*    */       }
/*    */     }
/*    */ 
/* 41 */     System.out.println(this.Q1.Dequeue());
/* 42 */     QueueAsLinkList temp = this.Q1;
/* 43 */     this.Q1 = this.Q2;
/* 44 */     this.Q2 = temp;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) throws QueueEmptyException {
/* 48 */     StackUsingTwoQueues Stack = new StackUsingTwoQueues();
/* 49 */     int[] A = { 1, 2, 3, 4, 5 };
/* 50 */     System.out.println("Insertion in a Queue(FIFO) is:");
/* 51 */     for (int i = 0; i < A.length; i++) {
/* 52 */       Stack.push(A[i]);
/*    */     }
/* 54 */     Stack.push(6);
/* 55 */     System.out.println("Stack Opertion(LIFO) using Two Queues is:");
/*    */     try {
/* 57 */       while (!Stack.isEmpty()) {
/* 58 */         Stack.pop();
/*    */       }
/* 60 */       Stack.pop();
/*    */     }
/*    */     catch (QueueEmptyException e) {
/* 63 */       System.out.println("Further popping is not allowed");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.StackUsingTwoQueues
 * JD-Core Version:    0.6.2
 */