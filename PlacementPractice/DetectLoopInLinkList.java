/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class DetectLoopInLinkList
/*    */ {
/*    */   public static Node<Integer> LinkListInput()
/*    */   {
/* 15 */     DetectLoopInLinkList obj = new DetectLoopInLinkList();
/* 16 */     System.out.println("Enter the data");
/* 17 */     Scanner s = new Scanner(System.in);
/* 18 */     int num = s.nextInt();
/* 19 */     Node head = null;
/* 20 */     Node prev = null;
/* 21 */     while (num != -1) {
/* 22 */       obj.getClass(); Node newNode = new Node();
/* 23 */       newNode.data = Integer.valueOf(num);
/* 24 */       newNode.next = null;
/*    */ 
/* 26 */       if (head == null) {
/* 27 */         head = newNode;
/*    */       }
/*    */       else {
/* 30 */         prev.next = newNode;
/*    */       }
/* 32 */       prev = newNode;
/*    */ 
/* 34 */       System.out.println("Enter the data");
/* 35 */       num = s.nextInt();
/*    */     }
/*    */ 
/* 38 */     return head;
/*    */   }
/*    */ 
/*    */   public static void printLL(Node<Integer> head)
/*    */   {
/* 43 */     Node temp = head;
/* 44 */     while (temp != null) {
/* 45 */       System.out.print(temp.data + "-->");
/* 46 */       temp = temp.next;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static boolean DetectLoppInLL(Node<Integer> head)
/*    */   {
/* 52 */     Node slow = head;
/* 53 */     Node fast = head;
/* 54 */     while ((slow != null) && (fast != null) && (fast.next != null)) {
/* 55 */       slow = slow.next;
/* 56 */       fast = fast.next.next;
/*    */ 
/* 58 */       if ((fast != null) && (slow.data == fast.data)) {
/* 59 */         System.out.println("Found Loop");
/* 60 */         return true;
/*    */       }
/*    */     }
/* 63 */     return false;
/*    */   }
/*    */ 
/*    */   public static Node<Integer> HeadOfLL_Loop(Node<Integer> head)
/*    */   {
/* 68 */     Node slow = head;
/* 69 */     Node fast = head;
/* 70 */     Node newHead = null;
/*    */ 
/* 72 */     while ((slow != null) && (fast != null) && (fast.next != null)) {
/* 73 */       slow = slow.next;
/* 74 */       fast = fast.next.next;
/*    */ 
/* 76 */       if ((fast != null) && (slow == fast)) {
/* 77 */         newHead = slow;
/* 78 */         break;
/*    */       }
/*    */     }
/* 81 */     if (newHead != null) {
/* 82 */       while (head != newHead) {
/* 83 */         head = head.next;
/* 84 */         newHead = newHead.next;
/*    */       }
/*    */     }
/* 87 */     return newHead;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 94 */     Node input = LinkListInput();
/* 95 */     printLL(input);
/* 96 */     input.next.next.next.next.next = input.next;
/* 97 */     System.out.println();
/* 98 */     System.out.println(HeadOfLL_Loop(input).data);
/*    */   }
/*    */ 
/*    */   public class Node<T>
/*    */   {
/*    */     T data;
/*    */     Node<T> next;
/*    */ 
/*    */     public Node()
/*    */     {
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.DetectLoopInLinkList
 * JD-Core Version:    0.6.2
 */