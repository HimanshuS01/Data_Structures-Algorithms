/*     */ package DS;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Stack;
/*     */ 
/*     */ public class StackUsingArray
/*     */ {
/*     */   private int[] data;
/*     */   private int lastIndex;
/*     */ 
/*     */   public StackUsingArray(int size)
/*     */   {
/*  10 */     this.data = new int[size];
/*  11 */     this.lastIndex = -1;
/*     */   }
/*     */ 
/*     */   public int size() {
/*  15 */     return this.lastIndex + 1;
/*     */   }
/*     */ 
/*     */   public boolean isEmpty() {
/*  19 */     if (size() == 0) {
/*  20 */       return true;
/*     */     }
/*     */ 
/*  23 */     return false;
/*     */   }
/*     */ 
/*     */   public int top() throws StackEmptyException
/*     */   {
/*  28 */     if (isEmpty()) {
/*  29 */       StackEmptyException e = new StackEmptyException();
/*  30 */       throw e;
/*     */     }
/*  32 */     return this.data[this.lastIndex];
/*     */   }
/*     */ 
/*     */   public void push(int newElement) throws StackFullException {
/*  36 */     if (size() == this.data.length) {
/*  37 */       StackFullException e = new StackFullException();
/*  38 */       throw e;
/*     */     }
/*  40 */     this.data[(this.lastIndex + 1)] = newElement;
/*  41 */     System.out.println(this.data[(this.lastIndex + 1)]);
/*  42 */     this.lastIndex += 1;
/*     */   }
/*     */ 
/*     */   public int pop() throws StackEmptyException {
/*  46 */     if (isEmpty()) {
/*  47 */       StackEmptyException e = new StackEmptyException();
/*  48 */       throw e;
/*     */     }
/*     */ 
/*  51 */     int lastElement = this.data[this.lastIndex];
/*  52 */     this.data[this.lastIndex] = 0;
/*  53 */     this.lastIndex -= 1;
/*  54 */     return lastElement;
/*     */   }
/*     */ 
/*     */   public <T> void reverseStack(Stack<T> stack)
/*     */   {
/*  59 */     if (!stack.isEmpty()) {
/*  60 */       Object temp = stack.pop();
/*  61 */       reverseStack(stack);
/*  62 */       insertAtBottom(stack, temp);
/*     */     }
/*     */   }
/*     */ 
/*     */   private <T> void insertAtBottom(Stack<T> stack, T data) {
/*  67 */     if (stack.isEmpty()) {
/*  68 */       stack.push(data);
/*     */     }
/*     */     else {
/*  71 */       Object temp = stack.pop();
/*  72 */       insertAtBottom(stack, data);
/*  73 */       stack.push(temp);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) throws StackEmptyException
/*     */   {
/*  79 */     int[] A = { 1, 2, 3 };
/*  80 */     StackUsingArray s = new StackUsingArray(A.length);
/*  81 */     for (int i = 0; i < A.length; i++) {
/*     */       try {
/*  83 */         s.push(A[i]);
/*     */       }
/*     */       catch (StackFullException e) {
/*  86 */         e.printStackTrace();
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  99 */     int top = s.top();
/* 100 */     System.out.println("Element at the top position is:" + top);
/*     */ 
/* 108 */     Stack stack = new Stack();
/* 109 */     for (int j = 0; j < A.length; j++) {
/* 110 */       stack.push(Integer.valueOf(A[j]));
/*     */     }
/*     */ 
/* 113 */     s.reverseStack(stack);
/* 114 */     int size = stack.size();
/* 115 */     for (int k = 0; k < size; k++)
/* 116 */       System.out.print(stack.pop() + " ");
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.StackUsingArray
 * JD-Core Version:    0.6.2
 */