/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class DoublyLinkList
/*    */ {
/*    */   public static DoubleNode CreateDoublyLinkedList()
/*    */   {
/* 20 */     DoublyLinkList obj = new DoublyLinkList();
/* 21 */     Node head = null;
/* 22 */     Node prevNode = null;
/*    */ 
/* 24 */     System.out.println("Enter the data");
/* 25 */     Scanner s = new Scanner(System.in);
/* 26 */     int num = s.nextInt();
/*    */ 
/* 28 */     while (num != -1)
/*    */     {
/* 30 */       obj.getClass(); Node newNode = new Node();
/* 31 */       newNode.data = Integer.valueOf(num);
/* 32 */       newNode.next = null;
/* 33 */       newNode.prev = null;
/*    */ 
/* 35 */       if (head == null) {
/* 36 */         head = newNode;
/*    */       }
/*    */       else {
/* 39 */         prevNode.next = newNode;
/* 40 */         newNode.prev = prevNode;
/*    */       }
/* 42 */       prevNode = newNode;
/*    */ 
/* 44 */       System.out.println("Enter the data");
/* 45 */       num = s.nextInt();
/*    */     }
/* 47 */     obj.getClass(); DoubleNode dNode = new DoubleNode();
/* 48 */     dNode.head = head;
/* 49 */     dNode.tail = prevNode;
/* 50 */     return dNode;
/*    */   }
/*    */ 
/*    */   public static void printLL_Forward(Node<Integer> head)
/*    */   {
/* 55 */     Node temp = head;
/* 56 */     while (temp != null) {
/* 57 */       System.out.print(temp.data + "-->");
/* 58 */       temp = temp.next;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void printLL_Reverse(Node<Integer> tail)
/*    */   {
/* 64 */     Node temp = tail;
/* 65 */     while (temp != null) {
/* 66 */       System.out.print(temp.data + "-->");
/* 67 */       temp = temp.prev;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 73 */     DoubleNode d_node = CreateDoublyLinkedList();
/* 74 */     System.out.println("Forward LL");
/* 75 */     printLL_Forward(d_node.head);
/* 76 */     System.out.println("\nReversed LL");
/* 77 */     printLL_Reverse(d_node.tail);
/*    */   }
/*    */ 
/*    */   public class DoubleNode
/*    */   {
/*    */     DoublyLinkList.Node<Integer> head;
/*    */     DoublyLinkList.Node<Integer> tail;
/*    */ 
/*    */     public DoubleNode()
/*    */     {
/*    */     }
/*    */   }
/*    */ 
/*    */   public class Node<T>
/*    */   {
/*    */     T data;
/*    */     Node<T> next;
/*    */     Node<T> prev;
/*    */ 
/*    */     public Node()
/*    */     {
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.DoublyLinkList
 * JD-Core Version:    0.6.2
 */