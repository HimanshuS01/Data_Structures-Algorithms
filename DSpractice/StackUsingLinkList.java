/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackUsingLinkList
/*    */ {
/*    */   private Node<Integer> head;
/*    */   private int size;
/*    */ 
/*    */   public int size()
/*    */   {
/*  8 */     return this.size;
/*    */   }
/*    */ 
/*    */   public boolean isEmpty() {
/* 12 */     if (size() == 0) {
/* 13 */       return true;
/*    */     }
/*    */ 
/* 16 */     return false;
/*    */   }
/*    */ 
/*    */   public int top() throws StackEmptyException
/*    */   {
/* 21 */     if (isEmpty()) {
/* 22 */       StackEmptyException e = new StackEmptyException();
/* 23 */       throw e;
/*    */     }
/* 25 */     return ((Integer)this.head.data).intValue();
/*    */   }
/*    */ 
/*    */   public void push(int newElement)
/*    */   {
/* 30 */     Node newNode = new Node();
/* 31 */     newNode.data = Integer.valueOf(newElement);
/* 32 */     newNode.next = this.head;
/* 33 */     this.head = newNode;
/* 34 */     this.size += 1;
/* 35 */     System.out.println("Element pushed is:" + this.head.data);
/*    */   }
/*    */ 
/*    */   public int pop() throws StackEmptyException {
/* 39 */     if (isEmpty()) {
/* 40 */       StackEmptyException e = new StackEmptyException();
/* 41 */       throw e;
/*    */     }
/* 43 */     int popped_element = ((Integer)this.head.data).intValue();
/* 44 */     this.size -= 1;
/* 45 */     this.head = this.head.next;
/* 46 */     return popped_element;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws StackEmptyException
/*    */   {
/* 52 */     int[] A = { 1, 2, 3, 4, 5 };
/* 53 */     StackUsingLinkList s = new StackUsingLinkList();
/* 54 */     for (int i = 0; i < A.length; i++) {
/* 55 */       s.push(A[i]);
/*    */     }
/* 57 */     s.push(6);
/* 58 */     int top = s.top();
/* 59 */     System.out.println("Element at the top position is:" + top);
/* 60 */     for (int i = 0; i < A.length; i++) {
/* 61 */       s.pop();
/*    */     }
/* 63 */     s.pop();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.StackUsingLinkList
 * JD-Core Version:    0.6.2
 */