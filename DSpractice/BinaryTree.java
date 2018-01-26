/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class BinaryTree
/*    */ {
/*    */   public static BinaryTreeNode<Integer> Take_BinaryTree_Input()
/*    */   {
/*  9 */     Scanner s = new Scanner(System.in);
/* 10 */     System.out.println("Enter the root data:");
/* 11 */     BinaryTreeNode root = new BinaryTreeNode();
/* 12 */     root.data = Integer.valueOf(s.nextInt());
/* 13 */     QueueUsingLL Queue = new QueueUsingLL();
/* 14 */     Queue.enqueue(root);
/* 15 */     while (!Queue.isEmpty())
/*    */     {
/*    */       try {
/* 18 */         current = (BinaryTreeNode)Queue.dequeue();
/*    */       }
/*    */       catch (QueueEmptyException e)
/*    */       {
/*    */         BinaryTreeNode current;
/* 21 */         e.printStackTrace();
/* 22 */         return null;
/*    */       }
/*    */       BinaryTreeNode current;
/* 24 */       System.out.println("Enter the data for the left child of:" + current.data);
/* 25 */       int left = s.nextInt();
/* 26 */       if (left != -1) {
/* 27 */         BinaryTreeNode leftNode = new BinaryTreeNode();
/* 28 */         leftNode.data = Integer.valueOf(left);
/* 29 */         current.left = leftNode;
/* 30 */         Queue.enqueue(leftNode);
/*    */       }
/* 32 */       System.out.println("Enter the data for the right child of:" + current.data);
/* 33 */       int right = s.nextInt();
/* 34 */       if (right != -1) {
/* 35 */         BinaryTreeNode rightNode = new BinaryTreeNode();
/* 36 */         rightNode.data = Integer.valueOf(right);
/* 37 */         current.right = rightNode;
/* 38 */         Queue.enqueue(rightNode);
/*    */       }
/*    */     }
/* 41 */     return root;
/*    */   }
/*    */ 
/*    */   public static void Print_Binary_Tree(BinaryTreeNode<Integer> root) {
/* 45 */     if (root == null) {
/* 46 */       return;
/*    */     }
/* 48 */     String printString = root.data + ":";
/* 49 */     if (root.left != null) {
/* 50 */       printString = printString + "left:" + root.left.data;
/*    */     }
/* 52 */     if (root.right != null) {
/* 53 */       printString = printString + "right:" + root.right.data;
/*    */     }
/* 55 */     System.out.println(printString);
/* 56 */     Print_Binary_Tree(root.left);
/* 57 */     Print_Binary_Tree(root.right);
/*    */   }
/*    */ 
/*    */   public static int Print_Number_of_nodes(BinaryTreeNode<Integer> root) {
/* 61 */     int count = 0;
/* 62 */     if (root == null) {
/* 63 */       return count;
/*    */     }
/* 65 */     if ((root.left == null) && (root.right == null)) {
/* 66 */       return count + 1;
/*    */     }
/* 68 */     int leftcount = Print_Number_of_nodes(root.left);
/* 69 */     int rightcount = Print_Number_of_nodes(root.right);
/* 70 */     count = count + leftcount + rightcount;
/* 71 */     return count + 1;
/*    */   }
/*    */ 
/*    */   public static int Count_Leaf_Node(BinaryTreeNode<Integer> root) {
/* 75 */     int count = 0;
/* 76 */     if ((root.left == null) && (root.right == null)) {
/* 77 */       return 1;
/*    */     }
/* 79 */     int x = Count_Leaf_Node(root.left);
/* 80 */     count += x;
/* 81 */     int y = Count_Leaf_Node(root.right);
/* 82 */     count += y;
/*    */ 
/* 84 */     return count;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 89 */     BinaryTreeNode root = Take_BinaryTree_Input();
/* 90 */     Print_Binary_Tree(root);
/* 91 */     System.out.println("Number of nodes are:" + Print_Number_of_nodes(root));
/* 92 */     System.out.println("Number of leaf node in a binary tree are:" + Count_Leaf_Node(root));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.BinaryTree
 * JD-Core Version:    0.6.2
 */