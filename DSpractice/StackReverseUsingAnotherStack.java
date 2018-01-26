/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackReverseUsingAnotherStack
/*    */ {
/*    */   public static void Reverse_Stack(StackUsingLinkList Stack)
/*    */   {
/*  6 */     StackUsingLinkList new_Stack = new StackUsingLinkList();
/*  7 */     System.out.println("Elements in new Stack are:");
/*  8 */     while (!Stack.isEmpty()) {
/*    */       try {
/* 10 */         new_Stack.push(Stack.pop());
/*    */       }
/*    */       catch (StackEmptyException e) {
/* 13 */         System.out.println("Not possible");
/*    */       }
/*    */     }
/* 16 */     System.out.println("Stack in reverse is:");
/* 17 */     while (!new_Stack.isEmpty())
/*    */       try {
/* 19 */         int popped_Element = new_Stack.pop();
/* 20 */         System.out.println(popped_Element);
/*    */       }
/*    */       catch (StackEmptyException e) {
/* 23 */         System.out.println("Not possible");
/*    */       }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 30 */     int[] A = { 1, 2, 3, 4, 5 };
/* 31 */     int length = A.length;
/* 32 */     StackUsingLinkList s = new StackUsingLinkList();
/* 33 */     for (int i = 0; i < length; i++) {
/* 34 */       s.push(A[i]);
/*    */     }
/* 36 */     Reverse_Stack(s);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.StackReverseUsingAnotherStack
 * JD-Core Version:    0.6.2
 */