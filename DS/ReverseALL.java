/*    */ package DS;
/*    */ 
/*    */ public class ReverseALL
/*    */ {
/*    */   public static DoubleNode<Integer> reverseRecursive3(Node<Integer> head)
/*    */   {
/*  6 */     if ((head == null) || (head.next == null)) {
/*  7 */       DoubleNode output = new DoubleNode();
/*  8 */       output.head = head;
/*  9 */       output.tail = head;
/* 10 */       return output;
/*    */     }
/* 12 */     DoubleNode smallerOutput = reverseRecursive3(head.next);
/* 13 */     smallerOutput.tail.next = head;
/* 14 */     head.next = null;
/*    */ 
/* 16 */     DoubleNode output = new DoubleNode();
/* 17 */     output.head = smallerOutput.head;
/* 18 */     return output;
/*    */   }
/*    */ 
/*    */   public static Node<Integer> reverseRecursive2(Node<Integer> head)
/*    */   {
/* 28 */     if ((head == null) || (head.next == null)) {
/* 29 */       return head;
/*    */     }
/* 31 */     Node smallerHead = reverseRecursive2(head.next);
/* 32 */     head.next.next = head;
/* 33 */     head.next = null;
/* 34 */     return smallerHead;
/*    */   }
/*    */ 
/*    */   public static Node<Integer> reverseRecursive(Node<Integer> head) {
/* 38 */     if ((head == null) || (head.next == null)) {
/* 39 */       return head;
/*    */     }
/* 41 */     Node smallerHead = reverseRecursive(head.next);
/* 42 */     Node temp = smallerHead;
/* 43 */     while (temp.next != null) {
/* 44 */       temp = temp.next;
/*    */     }
/* 46 */     temp.next = head;
/* 47 */     head.next = null;
/* 48 */     return smallerHead;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 53 */     Node head = LinkedList.takeLinkedListInput();
/* 54 */     Node headReversed = reverseRecursive(head);
/*    */ 
/* 59 */     LinkedList.printLinkedList(reverseRecursive2(headReversed));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.ReverseALL
 * JD-Core Version:    0.6.2
 */