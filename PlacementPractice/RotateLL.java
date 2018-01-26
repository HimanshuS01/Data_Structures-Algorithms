/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class RotateLL
/*    */ {
/*    */   static Scanner s;
/*    */ 
/*    */   public static Node<Integer> getLinkListInput(int length)
/*    */   {
/* 18 */     Node head = null;
/* 19 */     Node prev = null;
/* 20 */     int i = 0;
/* 21 */     while (i < length)
/*    */     {
/* 23 */       int num = s.nextInt();
/* 24 */       Node newNode = new Node();
/* 25 */       newNode.data = num;
/* 26 */       newNode.next = null;
/*    */ 
/* 28 */       if (head == null) {
/* 29 */         head = newNode;
/*    */       }
/*    */       else {
/* 32 */         prev.next = newNode;
/*    */       }
/* 34 */       prev = newNode;
/* 35 */       i++;
/*    */     }
/*    */ 
/* 38 */     return head;
/*    */   }
/*    */ 
/*    */   public static Node<Integer> RotateLinkListByK(Node<Integer> head, int k)
/*    */   {
/* 43 */     if (head == null) {
/* 44 */       return head;
/*    */     }
/* 46 */     if (k == 0) {
/* 47 */       return head;
/*    */     }
/*    */ 
/* 50 */     Node temp = head;
/* 51 */     int count = 1;
/*    */ 
/* 53 */     while ((count < k) && (temp != null)) {
/* 54 */       temp = temp.next;
/* 55 */       count++;
/*    */     }
/*    */ 
/* 58 */     Node newHead = temp.next;
/* 59 */     temp.next = null;
/* 60 */     Node temp2 = newHead;
/*    */ 
/* 62 */     while (temp2.next != null) {
/* 63 */       temp2 = temp2.next;
/*    */     }
/*    */ 
/* 66 */     temp2.next = head;
/* 67 */     return newHead;
/*    */   }
/*    */ 
/*    */   public static void PrintLL(Node<Integer> head)
/*    */   {
/* 72 */     while (head != null) {
/* 73 */       System.out.print(head.data + " ");
/* 74 */       head = head.next;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 81 */     s = new Scanner(System.in);
/*    */ 
/* 83 */     int testcases = s.nextInt();
/* 84 */     ArrayList output = new ArrayList();
/*    */ 
/* 86 */     for (int i = 0; i < testcases; i++)
/*    */     {
/* 88 */       int length = s.nextInt();
/* 89 */       Node inputHead = getLinkListInput(length);
/* 90 */       int k = s.nextInt();
/* 91 */       output.add(RotateLinkListByK(inputHead, k));
/*    */     }
/*    */ 
/* 94 */     for (int i = 0; i < output.size(); i++)
/* 95 */       PrintLL((Node)output.get(i));
/*    */   }
/*    */ 
/*    */   static class Node<T>
/*    */   {
/*    */     int data;
/*    */     Node<T> next;
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.RotateLL
 * JD-Core Version:    0.6.2
 */