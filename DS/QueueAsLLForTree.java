/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class QueueAsLLForTree
/*    */ {
/*    */   private QueueTreeNode<Integer> head;
/*    */   private int size;
/*    */   private QueueTreeNode<Integer> prevNode;
/*    */ 
/*    */   public int size()
/*    */   {
/* 12 */     return this.size;
/*    */   }
/*    */ 
/*    */   public TreeNode<Integer> front() throws QueueEmptyException {
/* 16 */     if (isEmpty()) {
/* 17 */       QueueEmptyException e = new QueueEmptyException();
/* 18 */       throw e;
/*    */     }
/* 20 */     return this.head.data;
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
/*    */   public void Enqueue(TreeNode<Integer> root)
/*    */   {
/* 33 */     QueueTreeNode newNode = new QueueTreeNode();
/* 34 */     newNode.data = root;
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
/*    */   }
/*    */ 
/*    */   public TreeNode<Integer> Dequeue() throws QueueEmptyException
/*    */   {
/* 50 */     if (isEmpty()) {
/* 51 */       QueueEmptyException e = new QueueEmptyException();
/* 52 */       throw e;
/*    */     }
/* 54 */     TreeNode ElementToDequeue = this.head.data;
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
/*    */ 
/* 69 */     int FrontElement = Q.front();
/* 70 */     System.out.println(FrontElement);
/* 71 */     for (int i = 0; i < A.length; i++) {
/* 72 */       int DequeueElement = Q.Dequeue();
/* 73 */       System.out.println("Popped element is:" + DequeueElement);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.QueueAsLLForTree
 * JD-Core Version:    0.6.2
 */