/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackAsDynamicArray
/*    */ {
/*    */   private int[] data;
/*    */   private int lastIndex;
/*    */ 
/*    */   public StackAsDynamicArray(int size)
/*    */   {
/*  9 */     this.data = new int[size];
/* 10 */     this.lastIndex = -1;
/*    */   }
/*    */ 
/*    */   public int size() {
/* 14 */     return this.lastIndex + 1;
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
/*    */   public int top() throws StackEmptyException
/*    */   {
/* 27 */     if (isEmpty()) {
/* 28 */       StackEmptyException e = new StackEmptyException();
/* 29 */       throw e;
/*    */     }
/* 31 */     return this.data[this.lastIndex];
/*    */   }
/*    */ 
/*    */   public void push(int newElement) {
/* 35 */     if (size() == this.data.length) {
/* 36 */       int[] NewArray = new int[2 * this.data.length];
/*    */ 
/* 38 */       for (int i = 0; i < this.data.length; i++) {
/* 39 */         NewArray[i] = this.data[i];
/*    */       }
/*    */ 
/* 42 */       this.lastIndex = i;
/* 43 */       this.data = NewArray;
/* 44 */       this.data[(this.lastIndex + 1)] = newElement;
/* 45 */       System.out.println(this.data[(this.lastIndex + 1)]);
/* 46 */       this.lastIndex += 1;
/*    */     }
/*    */     else {
/* 49 */       this.data[(this.lastIndex + 1)] = newElement;
/* 50 */       System.out.println(this.data[(this.lastIndex + 1)]);
/* 51 */       this.lastIndex += 1;
/*    */     }
/*    */   }
/*    */ 
/*    */   public int pop() throws StackEmptyException {
/* 56 */     if (isEmpty()) {
/* 57 */       StackEmptyException e = new StackEmptyException();
/* 58 */       throw e;
/*    */     }
/*    */ 
/* 61 */     int lastElement = this.data[this.lastIndex];
/* 62 */     this.data[this.lastIndex] = 0;
/* 63 */     this.lastIndex -= 1;
/* 64 */     return lastElement;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws StackEmptyException
/*    */   {
/* 70 */     int[] A = { 1, 2, 3, 4, 5 };
/*    */ 
/* 72 */     StackAsDynamicArray s = new StackAsDynamicArray(A.length);
/* 73 */     for (int i = 0; i < A.length; i++) {
/* 74 */       s.push(A[i]);
/*    */     }
/*    */ 
/* 77 */     s.push(10);
/* 78 */     s.push(20);
/* 79 */     s.push(30);
/* 80 */     int top = s.top();
/* 81 */     System.out.println("Element at the top position is:" + top);
/* 82 */     while (!s.isEmpty()) {
/* 83 */       int popedElement = s.pop();
/* 84 */       System.out.println("Popped element is:" + popedElement);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.StackAsDynamicArray
 * JD-Core Version:    0.6.2
 */