/*    */ package DS;
/*    */ 
/*    */ public class MergeSortUsingLLWithoutRecursion
/*    */ {
/*    */   public static Node<Integer> Merge(Node<Integer> LeftHead, Node<Integer> RightHead)
/*    */   {
/*  6 */     Node head = null;
/*  7 */     Node tail = null;
/*    */     do
/*    */     {
/* 10 */       Node newNode = new Node();
/*    */ 
/* 12 */       if (((Integer)LeftHead.data).intValue() < ((Integer)RightHead.data).intValue()) {
/* 13 */         newNode = LeftHead;
/*    */ 
/* 15 */         if (head == null) {
/* 16 */           head = newNode;
/*    */         }
/*    */         else {
/* 19 */           tail.next = newNode;
/*    */         }
/* 21 */         LeftHead = LeftHead.next;
/*    */       }
/*    */       else
/*    */       {
/* 25 */         newNode = RightHead;
/*    */ 
/* 27 */         if (head == null) {
/* 28 */           head = newNode;
/*    */         }
/*    */         else {
/* 31 */           tail.next = newNode;
/*    */         }
/* 33 */         RightHead = RightHead.next;
/*    */       }
/* 35 */       tail = newNode;
/*    */ 
/*  9 */       if (LeftHead == null) break;  } while (RightHead != null);
/*    */ 
/* 38 */     while (LeftHead != null) {
/* 39 */       Node newNode = new Node();
/* 40 */       newNode = LeftHead;
/* 41 */       tail.next = newNode;
/* 42 */       tail = newNode;
/* 43 */       LeftHead = LeftHead.next;
/*    */     }
/*    */ 
/* 46 */     while (RightHead != null) {
/* 47 */       Node newNode = new Node();
/* 48 */       newNode = RightHead;
/* 49 */       tail.next = newNode;
/* 50 */       tail = newNode;
/* 51 */       RightHead = RightHead.next;
/*    */     }
/* 53 */     return head;
/*    */   }
/*    */ 
/*    */   public static Node<Integer> MergeSort(Node<Integer> head) {
/* 57 */     if ((head == null) || (head.next == null)) {
/* 58 */       return head;
/*    */     }
/*    */ 
/* 61 */     Node MidNode = LinkedList.MidPoint(head);
/* 62 */     Node Left_LL_Head = head;
/* 63 */     Node Right_LL_Head = MidNode.next;
/* 64 */     MidNode.next = null;
/* 65 */     Left_LL_Head = MergeSort(Left_LL_Head);
/* 66 */     Right_LL_Head = MergeSort(Right_LL_Head);
/* 67 */     Node MergedHead = Merge(Left_LL_Head, Right_LL_Head);
/* 68 */     return MergedHead;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 74 */     Node input = LinkedList.takeLinkedListInput();
/* 75 */     Node Newhead = MergeSort(input);
/* 76 */     LinkedList.printLinkedList(Newhead);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.MergeSortUsingLLWithoutRecursion
 * JD-Core Version:    0.6.2
 */