/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class QueueAsLinkList
/*    */ {
/*    */   private Node<Integer> head;
/*    */   private int size;
/*    */   private Node<Integer> prevNode;
/*    */ 
/*    */   public int size()
/*    */   {
/*  9 */     return this.size;
/*    */   }
/*    */   public int front() throws QueueEmptyException {
/* 12 */     if (isEmpty()) {
/* 13 */       QueueEmptyException e = new QueueEmptyException();
/* 14 */       throw e;
/*    */     }
/* 16 */     return ((Integer)this.head.data).intValue();
/*    */   }
/*    */ 
/*    */   public boolean isEmpty() {
/* 20 */     if (this.size == 0) {
/* 21 */       return true;
/*    */     }
/*    */ 
/* 24 */     return false;
/*    */   }
/*    */ 
/*    */   public int Enqueue(int Element)
/*    */   {
/* 29 */     Node newNode = new Node();
/* 30 */     newNode.data = Integer.valueOf(Element);
/* 31 */     newNode.next = null;
/*    */ 
/* 33 */     if (this.head == null) {
/* 34 */       this.head = newNode;
/*    */     }
/*    */     else {
/* 37 */       this.prevNode.next = newNode;
/*    */     }
/* 39 */     this.prevNode = newNode;
/*    */ 
/* 41 */     this.size += 1;
/* 42 */     return ((Integer)this.prevNode.data).intValue();
/*    */   }
/*    */ 
/*    */   public int Dequeue() throws QueueEmptyException {
/* 46 */     if (isEmpty()) {
/* 47 */       QueueEmptyException e = new QueueEmptyException();
/* 48 */       throw e;
/*    */     }
/* 50 */     int ElementToDequeue = ((Integer)this.head.data).intValue();
/* 51 */     this.head = this.head.next;
/* 52 */     this.size -= 1;
/* 53 */     return ElementToDequeue;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) throws QueueEmptyException
/*    */   {
/* 58 */     int[] A = { 1, 2, 3, 4, 5 };
/* 59 */     QueueAsLinkList Q = new QueueAsLinkList();
/* 60 */     for (int i = 0; i < A.length; i++) {
/* 61 */       Q.Enqueue(A[i]);
/*    */     }
/*    */ 
/* 65 */     int FrontElement = Q.front();
/* 66 */     System.out.println(FrontElement);
/* 67 */     for (int i = 0; i < A.length; i++) {
/* 68 */       int DequeueElement = Q.Dequeue();
/* 69 */       System.out.println("Popped element is:" + DequeueElement);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.QueueAsLinkList
 * JD-Core Version:    0.6.2
 */