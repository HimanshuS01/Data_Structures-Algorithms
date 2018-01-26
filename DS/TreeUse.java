/*     */ package DS;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Queue;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class TreeUse
/*     */ {
/*     */   public static TreeNode<Integer> takeTreeInput2()
/*     */   {
/*  11 */     Scanner s = new Scanner(System.in);
/*  12 */     System.out.println("Enter root");
/*  13 */     int rootData = s.nextInt();
/*     */ 
/*  16 */     Queue q = new LinkedList();
/*  17 */     TreeNode root = new TreeNode(Integer.valueOf(rootData));
/*     */ 
/*  19 */     q.add(root);
/*     */     int numChildren;
/*     */     int i;
/*  20 */     for (; !q.isEmpty(); 
/*  33 */       i < numChildren)
/*     */     {
/*  24 */       TreeNode currentNode = (TreeNode)q.poll();
/*     */ 
/*  30 */       System.out.println("Enter number of children of " + currentNode.data);
/*  31 */       numChildren = s.nextInt();
/*     */ 
/*  33 */       i = 0; continue;
/*  34 */       System.out.println("Enter data for " + i + "th child of " + currentNode.data);
/*  35 */       int childData = s.nextInt();
/*  36 */       TreeNode child = new TreeNode(Integer.valueOf(childData));
/*     */ 
/*  38 */       currentNode.children.add(child);
/*     */ 
/*  40 */       q.add(child);
/*     */ 
/*  33 */       i++;
/*     */     }
/*     */ 
/*  44 */     return root;
/*     */   }
/*     */ 
/*     */   public static TreeNode<Integer> takeTreeInput() {
/*  48 */     System.out.println("Enter root");
/*  49 */     Scanner s = new Scanner(System.in);
/*  50 */     int rootData = s.nextInt();
/*  51 */     TreeNode root = new TreeNode(Integer.valueOf(rootData));
/*  52 */     System.out.println("Enter number of children of " + rootData);
/*  53 */     int numChildren = s.nextInt();
/*     */ 
/*  55 */     for (int i = 0; i < numChildren; i++) {
/*  56 */       TreeNode child = takeTreeInput();
/*  57 */       root.children.add(child);
/*     */     }
/*  59 */     return root;
/*     */   }
/*     */ 
/*     */   public static TreeNode<Integer> Replace_Node_With_Its_Depth(TreeNode<Integer> root) {
/*  63 */     if (root == null) {
/*  64 */       return root;
/*     */     }
/*  66 */     if (root != null) {
/*  67 */       int height = HeightOfTree(root);
/*  68 */       root.data = Integer.valueOf(height - 1);
/*     */     }
/*  70 */     for (int i = 0; i < root.children.size(); i++) {
/*  71 */       Replace_Node_With_Its_Depth((TreeNode)root.children.get(i));
/*     */     }
/*  73 */     return root;
/*     */   }
/*     */ 
/*     */   public static TreeNode<Integer> Replace_Node_With_Its_Depth_Method2(TreeNode<Integer> root, int depthValue)
/*     */   {
/*  78 */     if (root == null) {
/*  79 */       return root;
/*     */     }
/*     */ 
/*  82 */     root.data = Integer.valueOf(depthValue);
/*     */ 
/*  84 */     depthValue++;
/*     */ 
/*  86 */     for (int i = 0; i < root.children.size(); i++) {
/*  87 */       Replace_Node_With_Its_Depth_Method2((TreeNode)root.children.get(i), depthValue);
/*     */     }
/*  89 */     return root;
/*     */   }
/*     */ 
/*     */   public static void printTree(TreeNode<Integer> root)
/*     */   {
/*  94 */     String rootString = root.data + ":";
/*  95 */     for (int i = 0; i < root.children.size(); i++) {
/*  96 */       rootString = rootString + ((TreeNode)root.children.get(i)).data + ",";
/*     */     }
/*  98 */     System.out.println(rootString);
/*  99 */     for (int i = 0; i < root.children.size(); i++)
/* 100 */       printTree((TreeNode)root.children.get(i));
/*     */   }
/*     */ 
/*     */   public static int CountRepeatNode(TreeNode<Integer> root, int x)
/*     */   {
/* 105 */     int count = 0;
/* 106 */     if (root.children.size() == 0) {
/* 107 */       if (((Integer)root.data).intValue() == x) {
/* 108 */         return 1;
/*     */       }
/*     */ 
/* 112 */       return 0;
/*     */     }
/*     */ 
/* 115 */     for (int i = 0; i < root.children.size(); i++)
/*     */     {
/* 117 */       int y = CountRepeatNode((TreeNode)root.children.get(i), x);
/* 118 */       count += y;
/*     */     }
/*     */ 
/* 121 */     if (((Integer)root.data).intValue() == x) {
/* 122 */       return count + 1;
/*     */     }
/*     */ 
/* 125 */     return count;
/*     */   }
/*     */ 
/*     */   public static int SumOfTreeNode(TreeNode<Integer> root)
/*     */   {
/* 132 */     int sum = 0;
/* 133 */     if (root.children.size() == 0) {
/* 134 */       return ((Integer)root.data).intValue();
/*     */     }
/*     */ 
/* 137 */     for (int i = 0; i < root.children.size(); i++) {
/* 138 */       int y = SumOfTreeNode((TreeNode)root.children.get(i));
/* 139 */       sum += y;
/*     */     }
/* 141 */     return sum + ((Integer)root.data).intValue();
/*     */   }
/*     */ 
/*     */   public static int NumberOfNodes(TreeNode<Integer> root)
/*     */   {
/* 147 */     int num = 0;
/* 148 */     if (root.children.size() == 0) {
/* 149 */       return 1;
/*     */     }
/*     */ 
/* 152 */     for (int i = 0; i < root.children.size(); i++) {
/* 153 */       int y = NumberOfNodes((TreeNode)root.children.get(i));
/* 154 */       num += y;
/*     */     }
/* 156 */     return num + 1;
/*     */   }
/*     */ 
/*     */   public static int HeightOfTree2(TreeNode<Integer> root)
/*     */   {
/* 162 */     int height = 0; int temp = 0;
/* 163 */     if (root.children.size() == 0) {
/* 164 */       return 1;
/*     */     }
/* 166 */     for (int i = 0; i < root.children.size(); i++) {
/* 167 */       temp += HeightOfTree((TreeNode)root.children.get(i));
/* 168 */       if (temp > height) {
/* 169 */         height = temp;
/*     */       }
/*     */     }
/* 172 */     return height;
/*     */   }
/*     */ 
/*     */   public static int HeightOfTree(TreeNode<Integer> root) {
/* 176 */     int height = 0;
/* 177 */     for (int i = 0; i < root.children.size(); i++) {
/* 178 */       int temp = HeightOfTree((TreeNode)root.children.get(i));
/* 179 */       if (temp > height) {
/* 180 */         height = temp;
/*     */       }
/*     */     }
/* 183 */     return height + 1;
/*     */   }
/*     */ 
/*     */   public static void FindDegreeOfEachNode(TreeNode<Integer> root)
/*     */   {
/* 188 */     if (root.children.size() == 0) {
/* 189 */       System.out.println("Degree of" + root.data + "is " + 0);
/*     */     }
/*     */     else {
/* 192 */       System.out.println("Degree of" + root.data + "is " + root.children.size());
/*     */     }
/* 194 */     for (int i = 0; i < root.children.size(); i++)
/* 195 */       FindDegreeOfEachNode((TreeNode)root.children.get(i));
/*     */   }
/*     */ 
/*     */   public static int getDepthOfGivenNode(TreeNode<Integer> root, int nodeData, int depth)
/*     */   {
/* 201 */     if (root == null) {
/* 202 */       return -1;
/*     */     }
/*     */ 
/* 205 */     if (((Integer)root.data).intValue() == nodeData) {
/* 206 */       return depth;
/*     */     }
/*     */ 
/* 210 */     depth++;
/*     */ 
/* 212 */     for (int i = 0; i < root.children.size(); i++)
/*     */     {
/* 214 */       int l = getDepthOfGivenNode((TreeNode)root.children.get(i), nodeData, depth);
/*     */ 
/* 216 */       if (l != -1) {
/* 217 */         return l;
/*     */       }
/*     */     }
/* 220 */     return -1;
/*     */   }
/*     */ 
/*     */   public static void PrintNodeAtAGivenDepth(TreeNode<Integer> root, int depth)
/*     */   {
/* 225 */     if (root.children.size() == 0) {
/* 226 */       if (depth == 0) {
/* 227 */         System.out.println(root.data);
/*     */       }
/*     */ 
/*     */     }
/* 231 */     else if (depth == 0) {
/* 232 */       System.out.println(root.data);
/*     */     }
/*     */ 
/* 235 */     depth--;
/* 236 */     for (int i = 0; i < root.children.size(); i++)
/* 237 */       PrintNodeAtAGivenDepth((TreeNode)root.children.get(i), depth);
/*     */   }
/*     */ 
/*     */   public static int NodesGreaterThenRootNode(TreeNode<Integer> root, int rootData)
/*     */   {
/* 257 */     int count = 0;
/* 258 */     if (root.children.size() == 0) {
/* 259 */       return count;
/*     */     }
/*     */ 
/* 262 */     if (root.children.size() != 0) {
/* 263 */       for (int i = 0; i < root.children.size(); i++) {
/* 264 */         if (((Integer)((TreeNode)root.children.get(i)).data).intValue() >= rootData) {
/* 265 */           count++;
/*     */         }
/*     */       }
/* 268 */       return count;
/*     */     }
/*     */ 
/* 271 */     for (int i = 0; i < root.children.size(); i++)
/*     */     {
/* 273 */       count += NodesGreaterThenRootNode((TreeNode)root.children.get(i), rootData);
/*     */     }
/*     */ 
/* 276 */     return count;
/*     */   }
/*     */ 
/*     */   public static boolean SameStructure(TreeNode<Integer> root, TreeNode<Integer> root2)
/*     */   {
/* 281 */     if (root.children.size() != root2.children.size()) {
/* 282 */       return false;
/*     */     }
/* 284 */     if (root.data != root2.data) {
/* 285 */       return false;
/*     */     }
/* 287 */     for (int i = 0; i < root.children.size(); i++) {
/* 288 */       boolean currentChildrenSame = SameStructure((TreeNode)root.children.get(i), (TreeNode)root2.children.get(i));
/* 289 */       if (!currentChildrenSame) {
/* 290 */         return false;
/*     */       }
/*     */     }
/* 293 */     return true;
/*     */   }
/*     */ 
/*     */   public static int NumberOfLeafNodes(TreeNode<Integer> root) {
/* 297 */     int leaf = 0;
/* 298 */     if (root.children.size() == 0) {
/* 299 */       return 1;
/*     */     }
/*     */ 
/* 302 */     for (int i = 0; i < root.children.size(); i++) {
/* 303 */       leaf += NumberOfLeafNodes((TreeNode)root.children.get(i));
/*     */     }
/* 305 */     return leaf;
/*     */   }
/*     */ 
/*     */   public static void printTreePreorder(TreeNode<Integer> root)
/*     */   {
/* 311 */     System.out.print(root.data + ",");
/*     */ 
/* 313 */     for (int i = 0; i < root.children.size(); i++)
/* 314 */       printTreePreorder((TreeNode)root.children.get(i));
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 321 */     TreeNode root = takeTreeInput2();
/* 322 */     printTree(root);
/* 323 */     System.out.println("depth of given node is:" + getDepthOfGivenNode(root, 4, 0));
/*     */ 
/* 326 */     printTreePreorder(Replace_Node_With_Its_Depth_Method2(root, 0));
/* 327 */     System.out.println();
/* 328 */     System.out.println("Number of leaf nodes are:" + NumberOfLeafNodes(root));
/* 329 */     System.out.println(" Number of Nodes Greater than the root node of a tree are:" + NodesGreaterThenRootNode(root, ((Integer)root.data).intValue()));
/*     */ 
/* 337 */     System.out.println("Height Of the Tree is:" + HeightOfTree(root));
/* 338 */     System.out.println("After replacing each node with its depth value tree looks like:");
/* 339 */     TreeNode root1 = Replace_Node_With_Its_Depth(root);
/* 340 */     printTree(root1);
/*     */ 
/* 343 */     int sum = SumOfTreeNode(root);
/* 344 */     System.out.println("Sum of  node is:" + sum);
/* 345 */     int numNodes = NumberOfNodes(root);
/* 346 */     System.out.println("Number of  node is:" + numNodes);
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.TreeUse
 * JD-Core Version:    0.6.2
 */