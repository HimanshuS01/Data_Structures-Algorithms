/*    */ package DSpractice;
/*    */ 
/*    */ public class QueueUsingLL<T>
/*    */ {
/*    */   private Node<T> head;
/*    */   private Node<T> tail;
/*    */   private int size;
/*    */ 
/*    */   public int size()
/*    */   {
/*  9 */     return this.size;
/*    */   }
/*    */   public boolean isEmpty() {
/* 12 */     if (this.size == 0) {
/* 13 */       return true;
/*    */     }
/* 15 */     return false;
/*    */   }
/*    */ 
/*    */   public T front() throws QueueEmptyException {
/* 19 */     if (isEmpty()) {
/* 20 */       QueueEmptyException e = new QueueEmptyException();
/* 21 */       throw e;
/*    */     }
/* 23 */     return this.head.data;
/*    */   }
/*    */   public void enqueue(T element) {
/* 26 */     Node newNode = new Node();
/* 27 */     newNode.data = element;
/* 28 */     if ((this.tail == null) && (this.head == null)) {
/* 29 */       this.tail = newNode;
/* 30 */       this.head = newNode;
/*    */     } else {
/* 32 */       this.tail.next = newNode;
/* 33 */       this.tail = newNode;
/*    */     }
/* 35 */     this.size += 1;
/*    */   }
/*    */   public T dequeue() throws QueueEmptyException {
/* 38 */     if (isEmpty()) {
/* 39 */       QueueEmptyException e = new QueueEmptyException();
/* 40 */       throw e;
/*    */     }
/* 42 */     if (this.size == 1) {
/* 43 */       this.size -= 1;
/* 44 */       Object element = this.head.data;
/* 45 */       this.head = this.head.next;
/* 46 */       this.tail = null;
/* 47 */       return element;
/*    */     }
/* 49 */     this.size -= 1;
/* 50 */     Object element = this.head.data;
/* 51 */     this.head = this.head.next;
/* 52 */     return element;
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.QueueUsingLL
 * JD-Core Version:    0.6.2
 */