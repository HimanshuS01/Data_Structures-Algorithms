/*     */ package CompetitivePractice;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class ChainReactionHackerRank
/*     */ {
/*     */   public static String getBinaryTree(int testCase, int kthAtom, int noOfInstance)
/*     */   {
/*  93 */     BinaryTreeNode root = new BinaryTreeNode();
/*  94 */     Scanner s = new Scanner(System.in);
/*  95 */     if (testCase % 2 == 0) {
/*  96 */       root.data = "A";
/*     */     }
/*     */     else {
/*  99 */       root.data = "B";
/*     */     }
/* 101 */     QueueusingLL queue = 
/* 102 */       new QueueusingLL();
/* 103 */     queue.enqueue(root);
/* 104 */     int i = 0;
/* 105 */     int currentLevelCount = 1;
/* 106 */     int nextLevelCount = 0;
/* 107 */     ArrayList outer = new ArrayList();
/* 108 */     ArrayList inner = new ArrayList();
/* 109 */     while ((!queue.isEmpty()) && (i < noOfInstance))
/*     */     {
/*     */       try {
/* 112 */         BinaryTreeNode current = (BinaryTreeNode)queue.dequeue();
/* 113 */         currentLevelCount--;
/*     */       }
/*     */       catch (QueueEmptyException e) {
/* 116 */         e.printStackTrace();
/* 117 */         return null;
/*     */       }
/*     */       BinaryTreeNode current;
/* 120 */       inner.add((String)current.data);
/*     */ 
/* 122 */       if (((String)current.data).equals("A")) {
/* 123 */         BinaryTreeNode leftNode = new BinaryTreeNode();
/* 124 */         leftNode.data = "A";
/* 125 */         current.left = leftNode;
/* 126 */         queue.enqueue(leftNode);
/* 127 */         nextLevelCount++;
/* 128 */         BinaryTreeNode rightNode = new BinaryTreeNode();
/* 129 */         rightNode.data = "B";
/* 130 */         current.right = rightNode;
/* 131 */         queue.enqueue(rightNode);
/* 132 */         nextLevelCount++;
/*     */       }
/* 134 */       else if (((String)current.data).equals("B")) {
/* 135 */         BinaryTreeNode leftNode = new BinaryTreeNode();
/* 136 */         leftNode.data = "B";
/* 137 */         current.left = leftNode;
/* 138 */         queue.enqueue(leftNode);
/* 139 */         nextLevelCount++;
/* 140 */         BinaryTreeNode rightNode = new BinaryTreeNode();
/* 141 */         rightNode.data = "A";
/* 142 */         current.right = rightNode;
/* 143 */         queue.enqueue(rightNode);
/* 144 */         nextLevelCount++;
/*     */       }
/* 146 */       if (currentLevelCount == 0) {
/* 147 */         outer.add(inner);
/* 148 */         currentLevelCount = nextLevelCount;
/* 149 */         nextLevelCount = 0;
/* 150 */         i++;
/* 151 */         inner = new ArrayList();
/*     */       }
/*     */     }
/* 154 */     System.out.println("This is level wise printing of a tree using arraylist of an arraylist");
/* 155 */     for (int j = 0; j < outer.size(); j++) {
/* 156 */       System.out.println(outer.get(j));
/*     */     }
/* 158 */     return (String)((ArrayList)outer.get(noOfInstance - 1)).get(kthAtom - 1);
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 164 */     Scanner s = new Scanner(System.in);
/*     */ 
/* 166 */     int t = s.nextInt();
/* 167 */     String[] output = new String[t];
/* 168 */     for (int i = 0; i < t; i++)
/*     */     {
/* 170 */       int k = s.nextInt();
/* 171 */       int n = s.nextInt();
/* 172 */       String atom_type = getBinaryTree(t, k, n);
/* 173 */       output[i] = atom_type;
/*     */     }
/* 175 */     for (int i = 0; i < output.length; i++) {
/* 176 */       System.out.println(output[i]);
/*     */     }
/* 178 */     s.close();
/*     */   }
/*     */ 
/*     */   public static class BinaryTreeNode<T>
/*     */   {
/*     */     T data;
/*     */     BinaryTreeNode<T> left;
/*     */     BinaryTreeNode<T> right;
/*     */   }
/*     */ 
/*     */   public static class Node<T>
/*     */   {
/*     */     T data;
/*     */     Node<T> next;
/*     */   }
/*     */ 
/*     */   public static class QueueEmptyException extends Exception
/*     */   {
/*     */     private static final long serialVersionUID = 1L;
/*     */   }
/*     */ 
/*     */   public static class QueueusingLL<T>
/*     */   {
/*     */     private ChainReactionHackerRank.Node<T> head;
/*     */     private ChainReactionHackerRank.Node<T> tail;
/*     */     private int size;
/*     */ 
/*     */     public int size()
/*     */     {
/*  30 */       return this.size;
/*     */     }
/*     */ 
/*     */     public boolean isEmpty() {
/*  34 */       if (this.size == 0) {
/*  35 */         return true;
/*     */       }
/*     */ 
/*  38 */       return false;
/*     */     }
/*     */ 
/*     */     public T front() throws ChainReactionHackerRank.QueueEmptyException
/*     */     {
/*  43 */       if (isEmpty()) {
/*  44 */         ChainReactionHackerRank.QueueEmptyException e = new ChainReactionHackerRank.QueueEmptyException();
/*  45 */         throw e;
/*     */       }
/*  47 */       return this.head.data;
/*     */     }
/*     */ 
/*     */     public void enqueue(T element) {
/*  51 */       ChainReactionHackerRank.Node newNode = new ChainReactionHackerRank.Node();
/*  52 */       newNode.data = element;
/*  53 */       if ((this.tail == null) && (this.head == null)) {
/*  54 */         this.tail = newNode;
/*  55 */         this.head = newNode;
/*     */       }
/*     */       else {
/*  58 */         this.tail.next = newNode;
/*  59 */         this.tail = newNode;
/*     */       }
/*  61 */       this.size += 1;
/*     */     }
/*     */ 
/*     */     public T dequeue() throws ChainReactionHackerRank.QueueEmptyException {
/*  65 */       if (isEmpty()) {
/*  66 */         ChainReactionHackerRank.QueueEmptyException e = new ChainReactionHackerRank.QueueEmptyException();
/*  67 */         throw e;
/*     */       }
/*  69 */       if (this.size == 1) {
/*  70 */         this.size -= 1;
/*  71 */         Object element = this.head.data;
/*  72 */         this.head = this.head.next;
/*  73 */         this.tail = null;
/*  74 */         return element;
/*     */       }
/*  76 */       this.size -= 1;
/*  77 */       Object element = this.head.data;
/*  78 */       this.head = this.head.next;
/*  79 */       return element;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.ChainReactionHackerRank
 * JD-Core Version:    0.6.2
 */