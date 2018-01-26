/*    */ package DS;
/*    */ 
/*    */ public class QueueusingLL<T>
/*    */ {
/*    */   private Node<T> head;
/*    */   private Node<T> tail;
/*    */   private int size;
/*    */ 
/*    */   public int size()
/*    */   {
/* 10 */     return this.size;
/*    */   }
/*    */ 
/*    */   public boolean isEmpty() {
/* 14 */     if (this.size == 0) {
/* 15 */       return true;
/*    */     }
/*    */ 
/* 18 */     return false;
/*    */   }
/*    */ 
/*    */   public T front() throws QueueEmptyException
/*    */   {
/* 23 */     if (isEmpty()) {
/* 24 */       QueueEmptyException e = new QueueEmptyException();
/* 25 */       throw e;
/*    */     }
/* 27 */     return this.head.data;
/*    */   }
/*    */ 
/*    */   public void enqueue(T element) {
/* 31 */     Node newNode = new Node();
/* 32 */     newNode.data = element;
/* 33 */     if ((this.tail == null) && (this.head == null)) {
/* 34 */       this.tail = newNode;
/* 35 */       this.head = newNode;
/*    */     }
/*    */     else {
/* 38 */       this.tail.next = newNode;
/* 39 */       this.tail = newNode;
/*    */     }
/* 41 */     this.size += 1;
/*    */   }
/*    */ 
/*    */   public T dequeue() throws QueueEmptyException {
/* 45 */     if (isEmpty()) {
/* 46 */       QueueEmptyException e = new QueueEmptyException();
/* 47 */       throw e;
/*    */     }
/* 49 */     if (this.size == 1) {
/* 50 */       this.size -= 1;
/* 51 */       Object element = this.head.data;
/* 52 */       this.head = this.head.next;
/* 53 */       this.tail = null;
/* 54 */       return element;
/*    */     }
/* 56 */     this.size -= 1;
/* 57 */     Object element = this.head.data;
/* 58 */     this.head = this.head.next;
/* 59 */     return element;
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.QueueusingLL
 * JD-Core Version:    0.6.2
 */