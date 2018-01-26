/*    */ package DS;
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
/* 12 */     return this.size;
/*    */   }
/*    */ 
/*    */   public int front() throws QueueEmptyException {
/* 16 */     if (isEmpty()) {
/* 17 */       QueueEmptyException e = new QueueEmptyException();
/* 18 */       throw e;
/*    */     }
/* 20 */     return ((Integer)this.head.data).intValue();
/*    */   }
/*    */ 
/*    */   public boolean isEmpty() {
/* 24 */     if (this.size == 0) {
/* 25 */       return true;
/*    */     }
/*    */ 
/* 28 */     return false;
/*    */   }
/*    */ 
/*    */   public void Enqueue(int Element)
/*    */   {
/* 33 */     Node newNode = new Node();
/* 34 */     newNode.data = Integer.valueOf(Element);
/* 35 */     newNode.next = null;
/*    */ 
/* 37 */     if (this.head == null) {
/* 38 */       this.head = newNode;
/*    */     }
/*    */     else {
/* 41 */       this.prevNode.next = newNode;
/*    */     }
/* 43 */     this.prevNode = newNode;
/*    */ 
/* 45 */     this.size += 1;
/* 46 */     System.out.println(this.prevNode.data);
/*    */   }
/*    */ 
/*    */   public int Dequeue() throws QueueEmptyException {
/* 50 */     if (isEmpty()) {
/* 51 */       QueueEmptyException e = new QueueEmptyException();
/* 52 */       throw e;
/*    */     }
/* 54 */     int ElementToDequeue = ((Integer)this.head.data).intValue();
/* 55 */     this.head = this.head.next;
/* 56 */     this.size -= 1;
/* 57 */     return ElementToDequeue;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) throws QueueEmptyException
/*    */   {
/* 62 */     int[] A = { 1, 2, 3, 4, 5 };
/* 63 */     QueueAsLinkList Q = new QueueAsLinkList();
/* 64 */     for (int i = 0; i < A.length; i++) {
/* 65 */       Q.Enqueue(A[i]);
/*    */     }
/* 67 */     Q.Enqueue(10);
/* 68 */     Q.Enqueue(20);
/* 69 */     int FrontElement = Q.front();
/* 70 */     System.out.println("Front Element:" + FrontElement);
/* 71 */     int size = Q.size();
/* 72 */     for (int i = 0; i < size; i++) {
/* 73 */       int DequeueElement = Q.Dequeue();
/* 74 */       System.out.println("Popped element is:" + DequeueElement);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.QueueAsLinkList
 * JD-Core Version:    0.6.2
 */