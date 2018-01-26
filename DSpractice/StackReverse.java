/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackReverse
/*    */ {
/*    */   public static Node<Integer> push(int[] arr)
/*    */   {
/*  7 */     Node head = null;
/*  8 */     for (int i = 0; i < arr.length; i++) {
/*  9 */       Node newNode = new Node();
/* 10 */       newNode.data = Integer.valueOf(arr[i]);
/* 11 */       newNode.next = head;
/* 12 */       head = newNode;
/*    */     }
/* 14 */     return head;
/*    */   }
/*    */ 
/*    */   public static void ReverseStack(Node<Integer> head) {
/* 18 */     if (head == null) {
/* 19 */       return;
/*    */     }
/* 21 */     ReverseStack(head.next);
/* 22 */     System.out.print(head.data + " ");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 27 */     int[] A = { 1, 2, 3, 4, 5 };
/* 28 */     Node head = push(A);
/* 29 */     ReverseStack(head);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.StackReverse
 * JD-Core Version:    0.6.2
 */