/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Stack;
/*    */ 
/*    */ public class StackInbuiltClassDemo<T>
/*    */ {
/*    */   public int size(Stack<T> st)
/*    */   {
/*  8 */     return st.size();
/*    */   }
/*    */ 
/*    */   public T push(Stack<T> st, T element)
/*    */   {
/* 13 */     st.push(element);
/* 14 */     System.out.println("push(" + element + ")");
/* 15 */     System.out.print("Stack:" + st);
/* 16 */     return element;
/*    */   }
/*    */ 
/*    */   public void pop(Stack<T> st)
/*    */   {
/* 21 */     if (size(st) == 0) {
/* 22 */       System.out.println("Stack is empty!");
/*    */     }
/* 24 */     System.out.println("pop -> ");
/* 25 */     Object a = st.pop();
/* 26 */     System.out.println(a);
/* 27 */     System.out.println("stack: " + st);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 33 */     Stack st = new Stack();
/* 34 */     StackInbuiltClassDemo obj = new StackInbuiltClassDemo();
/* 35 */     int[] array = { 1, 2, 3, 4, 5 };
/* 36 */     for (int i = 0; i < array.length; i++) {
/* 37 */       obj.push(st, Integer.valueOf(array[i]));
/*    */     }
/* 39 */     obj.pop(st);
/* 40 */     System.out.println(obj.size(st));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.StackInbuiltClassDemo
 * JD-Core Version:    0.6.2
 */