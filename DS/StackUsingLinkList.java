/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackUsingLinkList<T>
/*    */ {
/*    */   private Node<T> head;
/*    */   private int size;
/*    */ 
/*    */   public int size()
/*    */   {
/* 14 */     return this.size;
/*    */   }
/*    */ 
/*    */   public boolean isEmpty() {
/* 18 */     if (size() == 0) {
/* 19 */       return true;
/*    */     }
/*    */ 
/* 22 */     return false;
/*    */   }
/*    */ 
/*    */   public T top() throws StackEmptyException
/*    */   {
/* 27 */     if (isEmpty()) {
/* 28 */       StackEmptyException e = new StackEmptyException();
/* 29 */       throw e;
/*    */     }
/* 31 */     return this.head.data;
/*    */   }
/*    */ 
/*    */   public T push(T newElement) {
/* 35 */     Node newNode = new Node();
/* 36 */     newNode.data = newElement;
/* 37 */     newNode.next = this.head;
/* 38 */     this.head = newNode;
/* 39 */     this.size += 1;
/* 40 */     return this.head.data;
/*    */   }
/*    */ 
/*    */   public void printStack()
/*    */   {
/* 45 */     Node temp = this.head;
/* 46 */     while (temp != null) {
/* 47 */       System.out.println(temp.data);
/* 48 */       temp = temp.next;
/*    */     }
/*    */   }
/*    */ 
/* 52 */   public T pop() throws StackEmptyException { if (isEmpty()) {
/* 53 */       StackEmptyException e = new StackEmptyException();
/* 54 */       throw e;
/*    */     }
/* 56 */     Object element = this.head.data;
/* 57 */     this.head = this.head.next;
/* 58 */     this.size -= 1;
/* 59 */     return element;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws StackEmptyException
/*    */   {
/* 65 */     int[] A = { 1, 2, 3, 4, 5 };
/* 66 */     StackUsingLinkList s = new StackUsingLinkList();
/* 67 */     for (int i = 0; i < A.length; i++) {
/* 68 */       s.push(Integer.valueOf(A[i]));
/*    */     }
/* 70 */     s.printStack();
/* 71 */     int top = ((Integer)s.top()).intValue();
/* 72 */     System.out.println("Element at the top position is:" + top);
/* 73 */     for (int i = 0; i < A.length; i++) {
/* 74 */       int popedElement = ((Integer)s.pop()).intValue();
/* 75 */       System.out.println("Popped element is:" + popedElement);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.StackUsingLinkList
 * JD-Core Version:    0.6.2
 */