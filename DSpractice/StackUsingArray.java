/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackUsingArray
/*    */ {
/*    */   public static int[] data;
/*    */   public int lastIndex;
/*    */ 
/*    */   public StackUsingArray(int size)
/*    */   {
/*  9 */     data = new int[size];
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
/* 31 */     return data[this.lastIndex];
/*    */   }
/*    */ 
/*    */   public void push(int newElement, int length) {
/* 35 */     if (this.lastIndex == length - 1) {
/* 36 */       System.out.println("Stack is full...");
/*    */     }
/* 38 */     data[(this.lastIndex + 1)] = newElement;
/* 39 */     System.out.println("Pushed element is:" + data[(this.lastIndex + 1)]);
/* 40 */     this.lastIndex += 1;
/*    */   }
/*    */ 
/*    */   public static int Min_Element(int last) {
/* 44 */     int min = data[(last - 1)];
/* 45 */     for (int i = last - 1; i >= 0; i--) {
/* 46 */       if (min < data[i]) break;
/* 47 */       min = data[i];
/*    */     }
/*    */ 
/* 53 */     return min;
/*    */   }
/*    */   public int pop() throws StackEmptyException {
/* 56 */     if (isEmpty()) {
/* 57 */       StackEmptyException e = new StackEmptyException();
/* 58 */       throw e;
/*    */     }
/* 60 */     int popped_Element = data[this.lastIndex];
/* 61 */     data[this.lastIndex] = 0;
/* 62 */     this.lastIndex -= 1;
/* 63 */     return popped_Element;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws StackEmptyException
/*    */   {
/* 69 */     int[] A = { 1, 2, 3, 4, 5 };
/* 70 */     int length = A.length;
/* 71 */     StackUsingArray s = new StackUsingArray(length);
/* 72 */     for (int i = 0; i < length; i++) {
/* 73 */       s.push(A[i], length);
/*    */     }
/*    */ 
/* 76 */     int top = s.top();
/* 77 */     System.out.println("Element at the top position is:" + top);
/* 78 */     System.out.println("Min element in the stack is" + Min_Element(s.size()));
/* 79 */     for (int i = 0; i < A.length; i++) {
/* 80 */       int popedElement = s.pop();
/* 81 */       System.out.println(i + 1 + "th popped element is:" + popedElement);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.StackUsingArray
 * JD-Core Version:    0.6.2
 */