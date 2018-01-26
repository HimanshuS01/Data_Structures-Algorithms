/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class QueueUsingTwoStacks
/*    */ {
/*  7 */   StackUsingLinkList<Integer> s1 = new StackUsingLinkList();
/*  8 */   StackUsingLinkList<Integer> s2 = new StackUsingLinkList();
/*    */   private int size;
/*    */ 
/*    */   public int size()
/*    */   {
/* 13 */     return this.size;
/*    */   }
/*    */ 
/*    */   public boolean isempty() {
/* 17 */     if (this.s1.size() == 0) {
/* 18 */       return true;
/*    */     }
/* 20 */     return false;
/*    */   }
/*    */ 
/*    */   public void enqueue(int element) {
/* 24 */     this.s1.push(Integer.valueOf(element));
/* 25 */     this.size += 1;
/*    */   }
/*    */ 
/*    */   public void dequeue() throws StackEmptyException {
/* 29 */     if (this.s1.isEmpty()) {
/* 30 */       e = new StackEmptyException();
/* 31 */       throw e;
/*    */     }
/*    */ 
/* 34 */     while (this.s1.size() != 1)
/*    */     {
/*    */       StackEmptyException e;
/* 35 */       this.s2.push((Integer)this.s1.pop());
/*    */ 
/* 37 */       this.size -= 1;
/*    */     }
/*    */ 
/* 40 */     System.out.print(this.s1.pop() + " ");
/* 41 */     while (!this.s2.isEmpty())
/* 42 */       this.s1.push((Integer)this.s2.pop());
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws StackEmptyException
/*    */   {
/* 50 */     int[] a = { 1, 2, 3, 4, 5 };
/* 51 */     QueueUsingTwoStacks s = new QueueUsingTwoStacks();
/*    */ 
/* 53 */     for (int i = 0; i < a.length; i++) {
/* 54 */       s.enqueue(a[i]);
/*    */     }
/* 56 */     for (int i = 0; i < a.length; i++) {
/* 57 */       System.out.print(a[i] + " ");
/*    */     }
/* 59 */     System.out.println();
/* 60 */     System.out.println("The Result is:");
/*    */ 
/* 62 */     while (!s.isempty())
/* 63 */       s.dequeue();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.QueueUsingTwoStacks
 * JD-Core Version:    0.6.2
 */