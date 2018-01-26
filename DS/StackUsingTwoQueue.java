/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackUsingTwoQueue
/*    */ {
/*  7 */   QueueAsLinkList Q1 = new QueueAsLinkList();
/*  8 */   QueueAsLinkList Q2 = new QueueAsLinkList();
/*    */ 
/*    */   public int size() {
/* 11 */     return this.Q1.size();
/*    */   }
/*    */   public boolean isEmpty() {
/* 14 */     if (size() == 0) {
/* 15 */       return true;
/*    */     }
/*    */ 
/* 18 */     return false;
/*    */   }
/*    */ 
/*    */   public void push(int element) {
/* 22 */     this.Q1.Enqueue(element);
/*    */   }
/*    */ 
/*    */   public int pop() throws QueueEmptyException {
/* 26 */     if (this.Q1.isEmpty()) {
/* 27 */       e = new QueueEmptyException();
/* 28 */       throw e;
/*    */     }
/*    */ 
/* 32 */     while (this.Q1.size() != 1) {
/*    */       try
/*    */       {
/*    */         QueueEmptyException e;
/* 35 */         this.Q2.Enqueue(this.Q1.Dequeue());
/*    */       }
/*    */       catch (QueueEmptyException e) {
/* 38 */         System.out.println("Cannot Possible To Enter More Elements");
/*    */       }
/*    */     }
/* 41 */     int PoppedElement = this.Q1.Dequeue();
/* 42 */     QueueAsLinkList temp = this.Q1;
/* 43 */     this.Q1 = this.Q2;
/* 44 */     this.Q2 = temp;
/* 45 */     return PoppedElement;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws QueueEmptyException
/*    */   {
/* 52 */     int[] A = { 1, 2, 3, 4, 5 };
/* 53 */     StackUsingTwoQueue stack = new StackUsingTwoQueue();
/*    */ 
/* 55 */     for (int i = 0; i < A.length; i++) {
/* 56 */       stack.push(A[i]);
/*    */     }
/*    */     try
/*    */     {
/* 60 */       while (!stack.isEmpty()) {
/* 61 */         int element = stack.pop();
/* 62 */         System.out.println("Popped element is:" + element);
/*    */       }
/*    */     }
/*    */     catch (QueueEmptyException e) {
/* 66 */       System.out.println("Stack is empty and you cannot pop an element...");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.StackUsingTwoQueue
 * JD-Core Version:    0.6.2
 */