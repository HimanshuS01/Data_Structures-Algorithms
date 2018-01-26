/*      */ package DS;
/*      */ 
/*      */ import DSpractice.LinkList;
/*      */ import DSpractice.Node;
/*      */ import java.io.PrintStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.LinkedList;
/*      */ import java.util.Queue;
/*      */ import java.util.Scanner;
/*      */ import java.util.Stack;
/*      */ 
/*      */ public class BinaryTree
/*      */ {
/*   15 */   static int Pre_Beg_Index = 0;
/*      */ 
/*      */   public static BinaryTreeNode<Integer> getBinaryTreeInput()
/*      */   {
/*   19 */     BinaryTreeNode root = new BinaryTreeNode();
/*   20 */     Scanner s = new Scanner(System.in);
/*   21 */     System.out.println("Enter root data");
/*   22 */     root.data = Integer.valueOf(s.nextInt());
/*   23 */     QueueusingLL queue = 
/*   24 */       new QueueusingLL();
/*   25 */     queue.enqueue(root);
/*   26 */     while (!queue.isEmpty())
/*      */     {
/*      */       try {
/*   29 */         current = (BinaryTreeNode)queue.dequeue();
/*      */       }
/*      */       catch (QueueEmptyException e)
/*      */       {
/*      */         BinaryTreeNode current;
/*   32 */         e.printStackTrace();
/*   33 */         return null;
/*      */       }
/*      */       BinaryTreeNode current;
/*   36 */       System.out.println("Enter left child of " + current.data);
/*   37 */       int left = s.nextInt();
/*   38 */       if (left != -1) {
/*   39 */         BinaryTreeNode leftNode = new BinaryTreeNode();
/*   40 */         leftNode.data = Integer.valueOf(left);
/*   41 */         current.left = leftNode;
/*   42 */         queue.enqueue(leftNode);
/*      */       }
/*      */ 
/*   45 */       System.out.println("Enter right child of " + current.data);
/*   46 */       int right = s.nextInt();
/*   47 */       if (right != -1) {
/*   48 */         BinaryTreeNode rightNode = new BinaryTreeNode();
/*   49 */         rightNode.data = Integer.valueOf(right);
/*   50 */         current.right = rightNode;
/*   51 */         queue.enqueue(rightNode);
/*      */       }
/*      */     }
/*   54 */     return root;
/*      */   }
/*      */ 
/*      */   public static void printAsItIsTree(BinaryTreeNode<Integer> root) {
/*   58 */     if (root == null) {
/*   59 */       return;
/*      */     }
/*   61 */     QueueusingLL queue = new QueueusingLL();
/*   62 */     queue.enqueue(root);
/*   63 */     int h = getHeight(root);
/*      */ 
/*   65 */     int currentLevelCount = 1;
/*   66 */     int nextLevelCount = 0;
/*   67 */     int i = 1;
/*      */ 
/*   69 */     while ((!queue.isEmpty()) && (i <= h)) {
/*   70 */       for (int j = h - i; j > 0; j--) {
/*   71 */         System.out.print(" ");
/*      */       }
/*      */       try
/*      */       {
/*   75 */         BinaryTreeNode current = (BinaryTreeNode)queue.dequeue();
/*   76 */         currentLevelCount--;
/*      */       }
/*      */       catch (QueueEmptyException e)
/*      */       {
/*      */         return;
/*      */       }
/*      */       BinaryTreeNode current;
/*   82 */       System.out.print(current.data + " ");
/*      */ 
/*   84 */       if (current.left != null) {
/*   85 */         queue.enqueue(current.left);
/*   86 */         nextLevelCount++;
/*      */       }
/*   88 */       if (current.right != null) {
/*   89 */         queue.enqueue(current.right);
/*   90 */         nextLevelCount++;
/*      */       }
/*      */ 
/*  100 */       if (currentLevelCount == 0) {
/*  101 */         System.out.println();
/*  102 */         i++;
/*  103 */         currentLevelCount = nextLevelCount;
/*  104 */         nextLevelCount = 0;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static void printBinaryTree(BinaryTreeNode<Integer> root)
/*      */   {
/*  111 */     if (root == null) {
/*  112 */       return;
/*      */     }
/*  114 */     String printString = root.data + ":";
/*  115 */     if (root.left != null) {
/*  116 */       printString = printString + " left:" + root.left.data;
/*      */     }
/*  118 */     if (root.right != null) {
/*  119 */       printString = printString + " right:" + root.right.data;
/*      */     }
/*  121 */     System.out.println(printString);
/*      */ 
/*  123 */     printBinaryTree(root.left);
/*  124 */     printBinaryTree(root.right);
/*      */   }
/*      */ 
/*      */   public static void Print_In_Each_Level(BinaryTreeNode<Integer> root)
/*      */   {
/*  129 */     if (root == null) {
/*  130 */       return;
/*      */     }
/*      */ 
/*  133 */     QueueusingLL queue = new QueueusingLL();
/*  134 */     queue.enqueue(root);
/*  135 */     int currentLevelCount = 1;
/*  136 */     int nextLevelCount = 0;
/*  137 */     ArrayList outer = new ArrayList();
/*  138 */     ArrayList inner = new ArrayList();
/*  139 */     while (!queue.isEmpty())
/*      */     {
/*      */       try {
/*  142 */         BinaryTreeNode current = (BinaryTreeNode)queue.dequeue();
/*  143 */         currentLevelCount--;
/*      */       }
/*      */       catch (QueueEmptyException e)
/*      */       {
/*      */         return;
/*      */       }
/*      */       BinaryTreeNode current;
/*  148 */       System.out.print(current.data);
/*  149 */       inner.add((Integer)current.data);
/*  150 */       if (current.left != null) {
/*  151 */         queue.enqueue(current.left);
/*  152 */         nextLevelCount++;
/*      */       }
/*  154 */       if (current.right != null) {
/*  155 */         queue.enqueue(current.right);
/*  156 */         nextLevelCount++;
/*      */       }
/*      */ 
/*  159 */       if (currentLevelCount == 0) {
/*  160 */         outer.add(inner);
/*  161 */         System.out.println();
/*  162 */         currentLevelCount = nextLevelCount;
/*  163 */         nextLevelCount = 0;
/*  164 */         inner = new ArrayList();
/*      */       }
/*      */     }
/*      */ 
/*  168 */     System.out.println("This is level wise printing of a tree using arraylist of an arraylist");
/*  169 */     for (int i = 0; i < outer.size(); i++)
/*  170 */       System.out.println(outer.get(i));
/*      */   }
/*      */ 
/*      */   public static void Print_In_Each_Level_Method2(BinaryTreeNode<Integer> root)
/*      */   {
/*  176 */     if (root == null) {
/*  177 */       return;
/*      */     }
/*  179 */     QueueusingLL queue = new QueueusingLL();
/*  180 */     queue.enqueue(root);
/*  181 */     int count = 1;
/*  182 */     while (!queue.isEmpty())
/*      */     {
/*      */       try {
/*  185 */         BinaryTreeNode current = (BinaryTreeNode)queue.dequeue();
/*  186 */         count--;
/*      */       }
/*      */       catch (QueueEmptyException e)
/*      */       {
/*      */         return;
/*      */       }
/*      */       BinaryTreeNode current;
/*  191 */       System.out.print(current.data + " ");
/*  192 */       if (current.left != null) {
/*  193 */         queue.enqueue(current.left);
/*      */       }
/*      */ 
/*  196 */       if (current.right != null) {
/*  197 */         queue.enqueue(current.right);
/*      */       }
/*      */ 
/*  200 */       if (count == 0) {
/*  201 */         System.out.println();
/*  202 */         count = queue.size();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static void printlevelorder(BinaryTreeNode<Integer> root) {
/*  208 */     if (root == null) {
/*  209 */       return;
/*      */     }
/*  211 */     QueueusingLL queue = new QueueusingLL();
/*  212 */     queue.enqueue(root);
/*  213 */     while (!queue.isEmpty())
/*      */     {
/*      */       try {
/*  216 */         current = (BinaryTreeNode)queue.dequeue();
/*      */       }
/*      */       catch (QueueEmptyException e)
/*      */       {
/*      */         BinaryTreeNode current;
/*      */         return;
/*      */       }
/*      */       BinaryTreeNode current;
/*  221 */       String printString = current.data + ":";
/*  222 */      ÐÏà¡±á                >  þÿ	                               þÿÿÿ        ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿýÿÿÿþÿÿÿþÿÿÿþÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿR o o t   E n t r y                                               ÿÿÿÿÿÿÿÿ   aùVˆ
4Ð©k ÀO×¢            F,É–Ó   À       C O N T E N T S                                                  ÿÿÿÿÿÿÿÿÿÿÿÿ                                        œ                                                                           ÿÿÿÿÿÿÿÿÿÿÿÿ                                                                                                                    ÿÿÿÿÿÿÿÿÿÿÿÿ                                                      þÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿL                               L              àÐW s5Ï®i +.b       L        À      F€                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   BinaryTreeNode Right = getLargest(root.right);
/*      */ 
/*  333 */     if ((((Integer)Left.data).intValue() > ((Integer)Right.data).intValue()) && 
/*  334 */       (((Integer)Left.data).intValue() > ((Integer)root.data).intValue())) {
/*  335 */       return Left;
/*      */     }
/*      */ 
/*  338 */     if (((Integer)Right.data).intValue() > ((Integer)root.data).intValue()) {
/*  339 */       return Right;
/*      */     }
/*      */ 
/*  342 */     return root;
/*      */   }
/*      */ 
/*      */   public static int getHeight(BinaryTreeNode<Integer> root) {
/*  346 */     int height = 0;
/*  347 */     if (root == null) {
/*  348 */       return 0;
/*      */     }
/*  350 */     if ((root.left == null) && (root.right == null)) {
/*  351 */       return 1;
/*      */     }
/*  353 */     int leftHeight = getHeight(root.left);
/*  354 */     int rightHeight = getHeight(root.right);
/*      */ 
/*  356 */     if (leftHeight >= rightHeight) {
/*  357 */       height += leftHeight;
/*      */     }
/*      */     else {
/*  360 */       height += rightHeight;
/*      */     }
/*  362 */     return height + 1;
/*      */   }
/*      */ 
/*      */   public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
/*  366 */     if (root == null) {
/*  367 */       return null;
/*      */     }
/*  369 */     if ((root.left == null) && (root.right == null)) {
/*  370 */       return null;
/*      */     }
/*  372 */     root.left = removeLeaves(root.left);
/*  373 */     root.right = removeLeaves(root.right);
/*  374 */     return root;
/*      */   }
/*      */ 
/*      */   public static int findMax(BinaryTreeNode<Integer> root)
/*      */   {
/*  384 */     if (root == null) {
/*  385 */       return -2147483648;
/*      */     }
/*  387 */     if ((root.left == null) && (root.right == null)) {
/*  388 */       return ((Integer)root.data).intValue();
/*      */     }
/*  390 */     int max = ((Integer)root.data).intValue();
/*  391 */     int Left = findMax(root.left);
/*  392 */     int Right = findMax(root.right);
/*  393 */     if ((Left > Right) && 
/*  394 */       (Left > max)) {
/*  395 */       max = Left;
/*      */     }
/*      */ 
/*  398 */     if (Right > max) {
/*  399 */       max = Right;
/*      */     }
/*  401 */     return max;
/*      */   }
/*      */ 
/*      */   public static int findMin(BinaryTreeNode<Integer> root) {
/*  405 */     if (root == null) {
/*  406 */       return 2147483647;
/*      */     }
/*  408 */     if ((root.left == null) && (root.right == null)) {
/*  409 */       return ((Integer)root.data).intValue();
/*      */     }
/*  411 */     int Left = findMin(root.left);
/*  412 */     int Right = findMin(root.right);
/*  413 */     if ((Left < Right) && 
/*  414 */       (Left < ((Integer)root.data).intValue())) {
/*  415 */       return Left;
/*      */     }
/*      */ 
/*  418 */     if (Right < ((Integer)root.data).intValue()) {
/*  419 */       return Right;
/*      */     }
/*  421 */     return ((Integer)root.data).intValue();
/*      */   }
/*      */ 
/*      */   public static DoubleInt1 SecondLargest(BinaryTreeNode<Integer> root)
/*      */   {
/*  426 */     if (root == null) {
/*  427 */       DoubleInt1 output = new DoubleInt1();
/*  428 */       output.x = -2147483648;
/*  429 */       output.y = -2147483648;
/*  430 */       return output;
/*      */     }
/*      */ 
/*  433 */     int largest = ((Integer)root.data).intValue();
/*  434 */     int secondLargest = -2147483648;
/*      */ 
/*  436 */     DoubleInt1 left = SecondLargest(root.left);
/*  437 */     DoubleInt1 right = SecondLargest(root.right);
/*      */ 
/*  439 */     if (left.x > largest) {
/*  440 */       secondLargest = largest;
/*  441 */       largest = left.x;
/*  442 */     } else if (left.x > secondLargest) {
/*  443 */       secondLargest = left.x;
/*      */     }
/*      */ 
/*  446 */     if (left.y > secondLargest) {
/*  447 */       secondLargest = left.y;
/*      */     }
/*      */ 
/*  450 */     if (right.x > largest) {
/*  451 */       secondLargest = largest;
/*  452 */       largest = right.x;
/*  453 */     } else if (right.x > secondLargest) {
/*  454 */       secondLargest = right.x;
/*      */     }
/*      */ 
/*  457 */     if (right.y > secondLargest) {
/*  458 */       secondLargest = right.y;
/*      */     }
/*  460 */     DoubleInt1 output = new DoubleInt1();
/*  461 */     output.x = largest;
/*  462 */     output.y = secondLargest;
/*      */ 
/*  464 */     return output;
/*      */   }
/*      */ 
/*      */   public static BinaryTreeNode<Integer> findElement(BinaryTreeNode<Integer> root, int k)
/*      */   {
/*  469 */     if (root == null)
/*  470 */       return null;
/*  471 */     if (((Integer)root.data).intValue() == k)
/*  472 */       return root;
/*  473 */     if (k > ((Integer)root.data).intValue()) {
/*  474 */       return findElement(root.right, k);
/*      */     }
/*  476 */     return findElement(root.left, k);
/*      */   }
/*      */ 
/*      */   public static boolean findElementInBT(BinaryTreeNode<Integer> root, int k)
/*      */   {
/*  483 */     boolean leftresult = false;
/*  484 */     boolean rightresult = false;
/*      */ 
/*  486 */     if (root == null) {
/*  487 */       return false;
/*      */     }
/*  489 */     if (((Integer)root.data).intValue() == k) {
/*  490 */       return true;
/*      */     }
/*  492 */     leftresult = findElementInBT(root.left, k);
/*  493 */     rightresult = findElementInBT(root.right, k);
/*  494 */     if ((leftresult) || (rightresult)) {
/*  495 */       return true;
/*      */     }
/*      */ 
/*  498 */     return false;
/*      */   }
/*      */ 
/*      */   public static void preOrder(BinaryTreeNode<Integer> root)
/*      */   {
/*  503 */     if (root == null) {
/*  504 */       return;
/*      */     }
/*  506 */     System.out.println(root.data);
/*  507 */     preOrder(root.left);
/*  508 */     preOrder(root.right);
/*      */   }
/*      */ 
/*      */   public static void postOrder(BinaryTreeNode<Integer> root) {
/*  512 */     if (root == null) {
/*  513 */       return;
/*      */     }
/*  515 */     postOrder(root.left);
/*  516 */     postOrder(root.right);
/*  517 */     System.out.println(root.data);
/*      */   }
/*      */ 
/*      */   public static void inOrde(BinaryTreeNode<Integer> root) {
/*  521 */     if (root == null) {
/*  522 */       return;
/*      */     }
/*      */ 
/*  525 */     inOrde(root.left);
/*  526 */     System.out.println(root.data);
/*  527 */     inOrde(root.right);
/*      */   }
/*      */ 
/*      */   public static ArrayList<Integer> inOrder(BinaryTreeNode<Integer> root, ArrayList<Integer> arr)
/*      */   {
/*  532 */     if (root == null) {
/*  533 */       return arr;
/*      */     }
/*      */ 
/*  536 */     inOrder(root.left, arr);
/*  537 */     arr.add((Integer)root.data);
/*  538 */     inOrder(root.right, arr);
/*      */ 
/*  540 */     return arr;
/*      */   }
/*      */ 
/*      */   public static void Zigzag(BinaryTreeNode<Integer> root)
/*      */   {
/*  545 */     if (root == null)
/*  546 */       return;
/*  547 */     QueueusingLL queue = 
/*  548 */       new QueueusingLL();
/*      */ 
/*  550 */     StackUsingLinkList st = new StackUsingLinkList();
/*  551 */     String printString = null;
/*  552 */     queue.enqueue(root);
/*      */ 
/*  554 */     int CurrentLevelCount = 1;
/*  555 */     int NextLevelCount = 0;
/*  556 */     int level = 0;
/*  557 */     while (!queue.isEmpty())
/*      */     {
/*      */       try {
/*  560 */         BinaryTreeNode current = (BinaryTreeNode)queue.dequeue();
/*  561 */         CurrentLevelCount--;
/*      */       }
/*      */       catch (QueueEmptyException e)
/*      */       {
/*      */         return;
/*      */       }
/*      */       BinaryTreeNode current;
/*  567 */       if (level % 2 != 0)
/*      */       {
/*  569 */         st.push(current.data);
/*      */       }
/*      */       else
/*      */       {
/*  574 */         printString = current.data + " ";
/*  575 */         System.out.print(printString + ",");
/*      */       }
/*  577 */       if (current.left != null)
/*      */       {
/*  579 */         queue.enqueue(current.left);
/*  580 */         NextLevelCount++;
/*      */       }
/*  582 */       if (current.right != null)
/*      */       {
/*  584 */         queue.enqueue(current.right);
/*  585 */         NextLevelCount++;
/*      */       }
/*      */ 
/*  588 */       if (CurrentLevelCount == 0)
/*      */       {
/*  591 */         if (level % 2 != 0) {
/*  592 */           while (!st.isEmpty())
/*      */           {
/*      */             try
/*      */             {
/*  596 */               System.out.print(st.pop() + ",");
/*      */             }
/*      */             catch (StackEmptyException e)
/*      */             {
/*  601 */               System.out.println("cant come here");
/*      */             }
/*      */           }
/*      */         }
/*  605 */         CurrentLevelCount = NextLevelCount;
/*  606 */         NextLevelCount = 0;
/*  607 */         level++;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static int findMin_Method2(BinaryTreeNode<Integer> root)
/*      */   {
/*  686 */     if (root == null) {
/*  687 */       return 2147483647;
/*      */     }
/*  689 */     return Math.min(((Integer)root.data).intValue(), Math.min(findMin(root.left), findMin(root.right)));
/*      */   }
/*      */ 
/*      */   public static int findMax_Method2(BinaryTreeNode<Integer> root) {
/*  693 */     if (root == null) {
/*  694 */       return -2147483648;
/*      */     }
/*  696 */     return Math.max(((Integer)root.data).intValue(), Math.max(findMax(root.left), findMax(root.right)));
/*      */   }
/*      */ 
/*      */   public static isBSTreturnNode isBSTfaster(BinaryTreeNode<Integer> root)
/*      */   {
/*  707 */     if (root == null) {
/*  708 */       isBSTreturnNode output = new isBSTreturnNode();
/*      */ 
/*  710 */       output.max = -2147483648;
/*  711 */       output.min = 2147483647;
/*  712 */       output.isBST = true;
/*  713 */       return output;
/*      */     }
/*      */ 
/*  716 */     isBSTreturnNode leftOutput = isBSTfaster(root.left);
/*  717 */     isBSTreturnNode rightOutput = isBSTfaster(root.right);
/*  718 */     isBSTreturnNode output = new isBSTreturnNode();
/*      */ 
/*  720 */     if ((leftOutput.isBST) && (rightOutput.isBST) && (leftOutput.max < ((Integer)root.data).intValue()) && (rightOutput.min > ((Integer)root.data).intValue())) {
/*  721 */       output.isBST = true;
/*      */ 
/*  724 */       output.min = Math.min(leftOutput.min, ((Integer)root.data).intValue());
/*  725 */       output.max = Math.max(((Integer)root.data).intValue(), rightOutput.max);
/*      */     }
/*      */     else {
/*  728 */       output.isBST = false;
/*      */     }
/*      */ 
/*  732 */     return output;
/*      */   }
/*      */ 
/*      */   public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
/*  736 */     if (root == null) {
/*  737 */       return;
/*      */     }
/*  739 */     if ((k1 < ((Integer)root.data).intValue()) && (((Integer)root.data).intValue() < k2)) {
/*  740 */       System.out.println(root.data);
/*      */     }
/*  742 */     if (((Integer)root.data).intValue() >= k1)
/*  743 */       printBetweenK1K2(root.left, k1, k2);
/*  744 */     if (((Integer)root.data).intValue() <= k2)
/*  745 */       printBetweenK1K2(root.right, k1, k2);
/*      */   }
/*      */ 
/*      */   public static boolean isBST(BinaryTreeNode<Integer> root)
/*      */   {
/*  750 */     if (root == null) {
/*  751 */       return true;
/*      */     }
/*  753 */     int max = findMax(root.left);
/*  754 */     int min = findMin(root.right);
/*      */ 
/*  756 */     if ((((Integer)root.data).intVaeclipse.preferences.version=1
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/description=
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/enabled=true
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/isSystem=true
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/name=download cache
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/provider=
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/suffix=artifacts.xml
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/type=org.eclipse.equinox.p2.artifact.repository.simpleRepository
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/uri=file\:/C\:/Users/Himanshu/.p2/org.eclipse.equinox.p2.core/cache/
repositories/file\:_C\:_Users_Himanshu_.p2_org.eclipse.equinox.p2.core_cache/version=1.0.0
repositories/file\:_C\:_Users_Himanshu_.p2_pool/description=
repositories/file\:_C\:_Users_Himanshu_.p2_pool/enabled=true
repositories/file\:_C\:_Users_Himanshu_.p2_pool/isSystem=true
repositories/file\:_C\:_Users_Himanshu_.p2_pool/name=Bundle pool
repositories/file\:_C\:_Users_Himanshu_.p2_pool/provider=
repositories/file\:_C\:_Users_Himanshu_.p2_pool/suffix=artifacts.xml
repositories/file\:_C\:_Users_Himanshu_.p2_pool/type=org.eclipse.equinox.p2.artifact.repository.simpleRepository
repositories/file\:_C\:_Users_Himanshu_.p2_pool/uri=file\:/C\:/Users/Himanshu/.p2/pool/
repositories/file\:_C\:_Users_Himanshu_.p2_pool/version=1.0.0
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/description=
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/enabled=true
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/isSystem=true
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/name=C\:\\Users\\Himanshu\\.p2\\pool\\.eclipseextension
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/provider=
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/suffix=eclipse
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/type=org.eclipse.equinox.p2.extensionlocation.artifactRepository
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/uri=file\:/C\:/Users/Himanshu/.p2/pool/.eclipseextension
repositories/file\:_C\:_Users_Himanshu_.p2_pool_.eclipseextension/version=1
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/description=
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/enabled=true
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/isSystem=true
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/name=dropins
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/provider=
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/type=org.eclipse.equinox.p2.artifact.repository.simpleRepository
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/uri=file\:/C\:/Users/Himanshu/eclipse/java-oxygen/eclipse/configuration/org.eclipse.osgi/189/data/listener_1925729951/
repositories/file\:_C\:_Users_Himanshu_eclipse_java-oxygen_eclipse_configuration_org.eclipse.osgi_189_data_listener_1925729951/version=1
repositories/http\:__download.eclipse.org_eclipse_updates_4.7/count=1
repositories/http\:__download.eclipse.org_eclipse_updates_4.7/enabled=true
repositories/http\:__download.eclipse.org_eclipse_updates_4.7/nickname=The Eclipse Project Updates
repositories/http\:__download.eclipse.org_eclipse_updates_4.7/uri=http\://download.eclipse.org/eclipse/updates/4.7
repositories/http\:__download.eclipse.org_oomph_updates_milestone_latest/enabled=true
repositories/http\:__download.eclipse.org_oomph_updates_milestone_latest/isSystem=false
repositories/http\:__download.eclipse.org_oomph_updates_milestone_latest/uri=http\://download.eclipse.org/oomph/updates/milestone/latest
repositories/http\:__download.eclipse.org_releases_oxygen/count=1
repositories/http\:__download.eclipse.org_releases_oxygen/enabled=true
repositories/http\:__download.eclipse.org_releases_oxygen/nickname=Oxygen
repositories/http\:__download.eclipse.org_releases_oxygen/uri=http\://download.eclipse.org/releases/oxygen
repositories/http\:__download.eclipse.org_releases_oxygen_201712201001/enabled=true
repositories/http\:__download.eclipse.org_releases_oxygen_201712201001/isSystem=false
repositories/http\:__download.eclipse.org_releases_oxygen_201712201001/uri=http\://download.eclipse.org/releases/oxygen/201712201001
repositories/http\:__download.eclipse.org_technology_epp_packages_oxygen/enabled=true
repositories/http\:__download.eclipse.org_technology_epp_packages_oxygen/isSystem=false
repositories/http\:__download.eclipse.org_technology_epp_packages_oxygen/uri=http\://download.eclipse.org/technology/epp/packages/oxygen
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                l;
/*      */ 
/*  989 */     int currentLevelCount = 1;
/*  990 */     int nextLevelCount = 0;
/*      */ 
/*  992 */     Node head = null;
/*  993 */     Node tail = null;
/*      */ 
/*  995 */     while (!queue.isEmpty()) {
/*      */       try {
/*  997 */         currentNode = (BinaryTreeNode)queue.dequeue();
/*  998 */         currentLevelCount--;
/*  999 */         Node newNode = new Node();
/* 1000 */         newNode.data = ((Integer)currentNode.data);
/* 1001 */         newNode.next = null;
/*      */ 
/* 1003 */         if (head == null) {
/* 1004 */           head = newNode;
/* 1005 */           head.next = null;
/*      */         }
/*      */         else {
/* 1008 */           tail.next = newNode;
/*      */         }
/* 1010 */         tail = newNode;
/*      */       }
/*      */       catch (QueueEmptyException e) {
/* 1013 */         System.out.println("Queue is empty");
/*      */       }
/*      */ 
/* 1016 */       if (currentNode.left != null) {
/* 1017 */         queue.enqueue(currentNode.left);
/* 1018 */         nextLevelCount++;
/*      */       }
/* 1020 */       if (currentNode.right != null) {
/* 1021 */         queue.enqueue(currentNode.right);
/* 1022 */         nextLevelCount++;
/*      */       }
/* 1024 */       if (currentLevelCount == 0) {
/* 1025 */         arr.add(head);
/* 1026 */         head = null;
/* 1027 */         tail = null;
/* 1028 */         currentLevelCount = nextLevelCount;
/* 1029 */         nextLevelCount = 0;
/*      */       }
/*      */     }
/* 1032 */     return arr;
/*      */   }
/*      */ 
/*      */   public static Node<Integer> getSortedLinkedList(BinaryTreeNode<Integer> root) {
/* 1036 */     if (root == null) {
/* 1037 */       return null;
/*      */     }
/*      */ 
/* 1040 */     Node currentnode = new Node();
/* 1041 */     currentnode.data = ((Integer)root.data);
/*      */ 
/* 1043 */     Node leftHead = getSortedLinkedList(root.left);
/* 1044 */     Node rightHead = getSortedLinkedList(root.right);
/*      */ 
/* 1046 */     currentnode.next = rightHead;
/* 1047 */     if (leftHead != null) {
/* 1048 */       Node tail = leftHead;
/* 1049 */       while (tail.next != null) {
/* 1050 */         tail = tail.next;
/*      */       }
/* 1052 */       tail.next = currentnode;
/* 1053 */       return leftHead;
/*      */     }
/* 1055 */     return currentnode;
/*      */   }
/*      */ 
/*      */   public static boolean isCompleteBT(BinaryTreeNode<Integer> root)
/*      */   {
/* 1070 */     if (root == null) {
/* 1071 */       return true;
/*      */     }
/*      */ 
/* 1074 */     Queue queue = new LinkedList();
/*      */ 
/* 1077 */     boolean flag = false;
/*      */ 
/* 1080 */     queue.add(root);
/* 1081 */     while (!queue.isEmpty())
/*      */     {
/* 1084 */       BinaryTreeNode dequeuedNode = (BinaryTreeNode)queue.poll();
/*      */ 
/* 1087 */       if (dequeuedNode.left != null)
/*      */       {
/* 1091 */         if (flag) {
/* 1092 */           return false;
/*      */         }
/*      */ 
/* 1095 */         queue.add(dequeuedNode.left);
/*      */       }
/*      */       else
/*      */       {
/* 1099 */         flag = true;
/*      */       }
/*      */ 
/* 1103 */       if (dequeuedNode.right != null)
/*      */       {
/* 1107 */         if (flag) {
/* 1108 */           return false;
/*      */         }
/*      */ 
/* 1111 */         queue.add(dequeuedNode.right);
/*      */       }
/*      */       else
/*      */       {
/* 1115 */         flag = true;
/*      */       }
/*      */     }
/*      */ 
/* 1119 */     return true;
/*      */   }
/*      */ 
/*      */   public static void InOrderTraversalUsingStack(BinaryTreeNode<Integer> root)
/*      */   {
/* 1126 */     if (root == null) {
/* 1127 */       return;
/*      */     }
/*      */ 
/* 1130 */     Stack stack = new Stack();
/* 1131 */     BinaryTreeNode node = root;
/*      */ 
/* 1133 */     while (node != null) {
/* 1134 */       stack.push(node);
/* 1135 */       node = node.left;
/*      */     }
/*      */ 
/* 1138 */     while (!stack.isEmpty()) {
/* 1139 */       node = (BinaryTreeNode)stack.pop();
/*      */ 
/* 1142 */       System.out.print(node.data);
/*      */ 
/* 1145 */       if (node.right != null) {
/* 1146 */         node = node.right;
/*      */ 
/* 1148 */         while (node != null) {
/* 1149 */           stack.push(node);
/* 1150 */           node = node.left;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static void ReverseInOrderTraversalUsingStack(BinaryTreeNode<Integer> root, int k)
/*      */   {
/* 1160 */     if (root == null) {
/* 1161 */       return;
/*      */     }
/* 1163 */     int kth_index = 0;
/* 1164 */     Stack stack = new Stack();
/* 1165 */     BinaryTreeNode node = root;
/*      */ 
/* 1167 */     while (node != null) {
/* 1168 */       stack.push(node);
/* 1169 */       node = node.right;
/*      */     }
/*      */ 
/* 1172 */     while (!stack.isEmpty()) {
/* 1173 */       node = (BinaryTreeNode)stack.pop();
/* 1174 */       kth_index++;
/* 1175 */       if (kth_index == k) {
/* 1176 */         System.out.print(node.data);
/*      */       }
/*      */ 
/* 1179 */       if (node.left != null) {
/* 1180 */         node = node.left;
/*      */ 
/* 1182 */         while (node != null) {
/* 1183 */           stack.push(node);
/* 1184 */           node = node.right;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static BinaryTreeNode<Integer> DeleteNodeFromBST(BinaryTreeNode<Integer> root, int NodeToBeDeleted)
/*      */   {
/* 1192 */     if (root == null) {
/* 1193 */       return root;
/*      */     }
/*      */ 
/* 1196 */     if (NodeToBeDeleted < ((Integer)root.data).intValue()) {
/* 1197 */       root.left = DeleteNodeFromBST(root.left, NodeToBeDeleted);
/*      */     }
/* 1199 */     else if (NodeToBeDeleted > ((Integer)root.data).intValue()) {
/* 1200 */       root.right = DeleteNodeFromBST(root.right, NodeToBeDeleted);
/*      */     }
/*      */     else {
/* 1203 */       if (root.left == null) {
/* 1204 */         return root.right;
/*      */       }
/* 1206 */       if (root.right == null) {
/* 1207 */         return root.left;
/*      */       }
/*      */ 
/* 1210 */       root.data = ((Integer)minElementBST(root.right).data);
/* 1211 */       root.right = DeleteNodeFromBST(root.right, ((Integer)root.data).intValue());
/*      */     }
/*      */ 
/* 1214 */     return root;
/*      */   }
/*      */ 
/*      */   public static BinaryTreeNode<Integer> CreateBST(BinaryTreeNode<Integer> root, int nodeData)
/*      */   {
/* 1222 */     if (root == null)
/*      */     {
/* 1224 */       root = new BinaryTreeNode();
/* 1225 */       root.data = Integer.valueOf(nodeData);
/* 1226 */       return root;
/*      */     }
/*      */ 
/* 1229 */     if (nodeData < ((Integer)root.data).intValue())
/* 1230 */       root.left = CreateBST(root.left, nodeData);
/* 1231 */     else if (nodeData > ((Integer)root.data).intValue()) {
/* 1232 */       root.right = CreateBST(root.right, nodeData);
/*      */     }
/* 1234 */     return root;
/*      */   }
/*      */ 
/*      */   public static void printPaths(BinaryTreeNode<Integer> root, String path)
/*      */   {
/* 1243 */     if (root == null) {
/* 1244 */       return;
/*      */     }
/* 1246 */     if ((root.left == null) && (root.right == null))
/*      */     {
/* 1250 */       System.out.println(path + root.data);
/* 1251 */       return;
/*      */     }
/*      */ 
/* 1254 */     printPaths(root.left, path + root.data + " ");
/* 1255 */     printPaths(root.right, path + root.data + " ");
/*      */   }
/*      */ 
/*      */   public static void main(String[] args)
/*      */   {
/* 1293 */     BinaryTreeNode root = getBinaryTreeInput();
/* 1294 */     System.out.println(findElementInBT(root, 5));
/*      */ 
/* 1297 */     printPaths(root, "");
/* 1298 */     System.out.println("Print nodes dont have a siblings");
/* 1299 */     PrintNodesDontHaveSiblings(root);
/*      */ 
/* 1301 */     System.out.println("Tree in a zigzag manner");
/* 1302 */     Zigzag(root);
/*      */ 
/* 1305 */     ArrayList arr = new ArrayList();
/* 1306 */     ArrayList resulttt = inOrder(root, arr);
/*      */ 
/* 1308 */     for (int i = 0; i < resulttt.size() - 1; i++) {
/* 1309 */       if (((Integer)resulttt.get(i)).intValue() > ((Integer)resulttt.get(i + 1)).intValue()) {
/* 1310 */         System.out.println("false");
/* 1311 */         break;
/*      */       }
/*      */     }
/* 1314 */     System.out.println("true");
/*      */ 
/* 1316 */     System.out.println("Tree after deletion of node is :");
/* 1317 */     printBinaryTree(DeleteNodeFromBST(root, 2));
/* 1318 */     System.out.println("Post order(reverse inorder) traversal using stack");
/* 1319 */     ReverseInOrderTraversalUsingStack(root, 3);
/*      */ 
/* 1329 */     System.out.println("\nIs the tree a complete binary tree" + isCompleteBT(root));
/* 1330 */     System.out.println("Level order tree");
/* 1331 */     printlevelorder(root);
/* 1332 */     printlevelorder(CreateDuplicateNode(root));
/* 1333 */     System.out.println("Size of the largest BST in a binary tree is :" + largestBST(root));
/* 1334 */     DoubleInt result1 = diameterHeight(root);
/* 1335 */     System.out.println("Height is:" + result1.height + "& Diameter is:" + result1.diameter);
/* 1336 */     System.out.println("Printing Tree");
/* 1337 */     printBinaryTree(root);
/* 1338 */     System.out.println("Printing in each level");
/* 1339 */     Print_In_Each_Level_Method2(root);
/*      */ 
/* 1341 */     System.out.println("This is level wise printing of a tree");
/* 1342 */     printLevelWise(root);
/* 1343 */     System.out.println();
/*      */ 
/* 1345 */     ArrayList result = SeparateLLForEachLevel(root);
/* 1346 */     for (int i = 0; i < result.size(); i++) {
/* 1347 */       System.out.println();
/* 1348 */       LinkList.PrintLinkList((Node)result.get(i));
/*      */     }
/* 1350 */     System.out.println();
/*      */ 
/* 1355 */     System.out.println("Tree from preorder and inorder is");
/* 1356 */     int[] preOrder = { 1, 2, 4, 5, 3, 6, 7 };
/* 1357 */     int[] inOrder = { 4, 2, 5, 1, 6, 3, 7 };
/* 1358 */     int inStart = 0;
/* 1359 */     int inEnd = inOrder.length - 1;
/* 1360 */     printBinaryTree(Pre_In_To_BinaryTree(preOrder, inOrder, inStart, inEnd));
/*      */ 
/* 1362 */     System.out.println("Pre order traversal:");
/*      */     try {
/* 1364 */       Pre_Order_Traversal(root);
/*      */     } catch (StackEmptyException e) {
/* 1366 */       System.out.println("Now your stack is empty...");
/*      */     }
/*      */ 
/* 1369 */     printLevelWise(root);
/* 1370 */     printlevelorder(root);
/*      */ 
/* 1372 */     printAsItIsTree(root);
/* 1373 */     Zigzag(root);
/*      */ 
/* 1375 */     int height = getHeight(root);
/* 1376 */     System.out.println("Height of the tree is:" + height);
/*      */ 
/* 1378 */     printleaf(root);
/*      */ 
/* 1380 */     int count = NumNodes(root);
/* 1381 */     System.out.println("Number of nodes are:" + count);
/*      */ 
/* 1383 */     int sum = sumnodes(root);
/* 1384 */     System.out.println("Sum of the nodes are:" + sum);
/*      */ 
/* 1389 */     pair output = isBalanced2(root);
/* 1390 */     if (output.result)
/* 1391 */       System.out.println("Tree is balanced");
/*      */     else {
/* 1393 */       System.out.println("Tree is not balanced!!");
/*      */     }
/*      */ 
/* 1400 */     System.out.println("Minimum value is" + findMin(root));
/* 1401 */     System.out.println("Maximum value is" + findMax(root));
/*      */ 
/* 1404 */     isBSTreturnNode checkBST = isBSTfaster(root);
/* 1405 */     if (checkBST.isBST) {
/* 1406 */       System.out.println("It is a BST...");
/*      */     }
/*      */     else {
/* 1409 */       System.out.println("Not a BST!!!");
/*      */     }
/*      */ 
/* 1415 */     int diameter = DiameterofBST(root);
/* 1416 */     System.out.println("Diameter of a BST is:" + diameter);
/*      */ 
/* 1418 */     DoubleInt1 output1 = SecondLargest(root);
/* 1419 */     System.out.println("Second largest element is:" + output1.y + " and largest element is:" + output1.x);
/*      */   }
/*      */ 
/*      */   public static class isBSTreturnNode
/*      */   {
/*      */     boolean isBST;
/*      */     int min;
/*      */     int max;
/*      */   }
/*      */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.BinaryTree
 * JD-Core Version:    0.6.2
 */