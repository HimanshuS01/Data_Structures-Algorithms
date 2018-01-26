/*     */ package DSpractice;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class TreeUse
/*     */ {
/*     */   public static TreeNode<Integer> TakeTreeInput()
/*     */   {
/*   9 */     Scanner s = new Scanner(System.in);
/*  10 */     System.out.println("Enter the root data");
/*  11 */     int rootData = s.nextInt();
/*  12 */     TreeNode root = new TreeNode(Integer.valueOf(rootData));
/*  13 */     System.out.println("Enter the number of children of" + root.data);
/*  14 */     int numChildren = s.nextInt();
/*  15 */     for (int i = 0; i < numChildren; i++) {
/*  16 */       TreeNode child = TakeTreeInput();
/*  17 */       root.children.add(child);
/*     */     }
/*  19 */     return root;
/*     */   }
/*     */ 
/*     */   public static TreeNode<Integer> TakeTreeInput_2()
/*     */   {
/*  24 */     Scanner s = new Scanner(System.in);
/*  25 */     System.out.println("Enter the root data:");
/*  26 */     int rootData = s.nextInt();
/*  27 */     TreeNode root = new TreeNode(Integer.valueOf(rootData));
/*  28 */     QueueAsLLForTree Q = new QueueAsLLForTree();
/*  29 */     Q.Enqueue(root);
/*     */     int numChildren;
/*     */     int i;
/*  30 */     for (; !Q.isEmpty(); 
/*  41 */       i < numChildren)
/*     */     {
/*     */       try
/*     */       {
/*  33 */         currentNode = Q.dequeue();
/*     */       }
/*     */       catch (QueueEmptyException e)
/*     */       {
/*     */         TreeNode currentNode;
/*  37 */         return null;
/*     */       }
/*     */       TreeNode currentNode;
/*  39 */       System.out.println("Enter the number of children of:" + currentNode.data);
/*  40 */       numChildren = s.nextInt();
/*  41 */       i = 0; continue;
/*  42 */       System.out.println("Enter the data for the" + i + "th child of" + currentNode.data);
/*  43 */       int childData = s.nextInt();
/*  44 */       TreeNode child = new TreeNode(Integer.valueOf(childData));
/*  45 */       currentNode.children.add(child);
/*  46 */       Q.Enqueue(child);
/*     */ 
/*  41 */       i++;
/*     */     }
/*     */ 
/*  49 */     return root;
/*     */   }
/*     */ 
/*     */   public static void PrintTree(TreeNode<Integer> root)
/*     */   {
/*  54 */     String rootString = root.data + ":";
/*  55 */     for (int i = 0; i < root.children.size(); i++) {
/*  56 */       rootString = rootString + ((TreeNode)root.children.get(i)).data + ",";
/*     */     }
/*  58 */     System.out.println(rootString);
/*  59 */     for (int i = 0; i < root.children.size(); i++)
/*  60 */       PrintTree((TreeNode)root.children.get(i));
/*     */   }
/*     */ 
/*     */   public static int Count_Repeat_Node(TreeNode<Integer> root, int x)
/*     */   {
/*  66 */     int count = 0;
/*  67 */     if (root.children.size() == 0) {
/*  68 */       if (((Integer)root.data).intValue() == x) {
/*  69 */         return 1;
/*     */       }
/*     */ 
/*  72 */       return 0;
/*     */     }
/*     */ 
/*  75 */     for (int i = 0; i < root.children.size(); i++) {
/*  76 */       int y = Count_Repeat_Node((TreeNode)root.children.get(i), x);
/*  77 */       count += y;
/*     */     }
/*  79 */     if (((Integer)root.data).intValue() == x) {
/*  80 */       return count + 1;
/*     */     }
/*     */ 
/*  83 */     return count;
/*     */   }
/*     */ 
/*     */   public static int Sum_Of_Nodes(TreeNode<Integer> root)
/*     */   {
/*  88 */     int sum = 0;
/*  89 */     if (root.children.size() == 0) {
/*  90 */       return ((Integer)root.data).intValue();
/*     */     }
/*  92 */     for (int i = 0; i < root.children.size(); i++) {
/*  93 */       int y = Sum_Of_Nodes((TreeNode)root.children.get(i));
/*  94 */       sum += y;
/*     */     }
/*  96 */     return sum + ((Integer)root.data).intValue();
/*     */   }
/*     */ 
/*     */   public static int Count_Leaf_Node(TreeNode<Integer> root) {
/* 100 */     int count = 0;
/* 101 */     if (root.children.size() == 0) {
/* 102 */       return 1;
/*     */     }
/* 104 */     for (int i = 0; i < root.children.size(); i++) {
/* 105 */       int y = Count_Leaf_Node((TreeNode)root.children.get(i));
/* 106 */       count += y;
/*     */     }
/* 108 */     return count;
/*     */   }
/*     */ 
/*     */   public static int Count_Number_Of_Nodes(TreeNode<Integer> root) {
/* 112 */     int count = 0;
/* 113 */     if (root.children.size() == 0) {
/* 114 */       return 1;
/*     */     }
/* 116 */     for (int i = 0; i < root.children.size(); i++) {
/* 117 */       int num = Count_Number_Of_Nodes((TreeNode)root.children.get(i));
/* 118 */       count += num;
/*     */     }
/* 120 */     return count + 1;
/*     */   }
/*     */ 
/*     */   public static boolean Same_Structure(TreeNode<Integer> root1, TreeNode<Integer> root2) {
/* 124 */     if (root1.children.size() != root2.children.size()) {
/* 125 */       return false;
/*     */     }
/* 127 */     if (root1.data != root2.data) {
/* 128 */       return false;
/*     */     }
/* 130 */     for (int i = 0; i < root1.children.size(); i++)
/*     */     {
/* 132 */       boolean result = Same_Structure((TreeNode)root1.children.get(i), (TreeNode)root2.children.get(i));
/* 133 */       if (!result) {
/* 134 */         return false;
/*     */       }
/*     */     }
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */   public static int get_Height_Of_Tree(TreeNode<Integer> root)
/*     */   {
/* 142 */     int height = 0;
/*     */ 
/* 144 */     for (int i = 0; i < root.children.size(); i++) {
/* 145 */       int temp = get_Height_Of_Tree((TreeNode)root.children.get(i));
/* 146 */       if (temp > height) {
/* 147 */         height = temp;
/*     */       }
/*     */     }
/* 150 */     return height + 1;
/*     */   }
/*     */ 
/*     */   public static TreeNode<Integer> Replace_Node_With_Depth_Value(TreeNode<Integer> root) {
/* 154 */     if (root == null) {
/* 155 */       return root;
/*     */     }
/* 157 */     if (root != null) {
/* 158 */       int height = get_Height_Of_Tree(root);
/* 159 */       root.data = Integer.valueOf(height - 1);
/*     */     }
/* 161 */     for (int i = 0; i < root.children.size(); i++) {
/* 162 */       Replace_Node_With_Depth_Value((TreeNode)root.children.get(i));
/*     */     }
/* 164 */     return root;
/*     */   }
/*     */ 
/*     */   public static int Largest_In_Tree(TreeNode<Integer> root)
/*     */   {
/* 169 */     if (root.children.size() == 0) {
/* 170 */       return ((Integer)root.data).intValue();
/*     */     }
/* 172 */     int largest = ((Integer)root.data).intValue();
/*     */ 
/* 174 */     for (int i = 0; i < root.children.size(); i++) {
/* 175 */       if (((Integer)((TreeNode)root.children.get(i)).data).intValue() >= largest) {
/* 176 */         largest = ((Integer)((TreeNode)root.children.get(i)).data).intValue();
/* 177 */         int y = Largest_In_Tree((TreeNode)root.children.get(i));
/* 178 */         if (y > largest)
/* 179 */           largest = y;
/*     */       }
/*     */       else
/*     */       {
/* 183 */         int y = Largest_In_Tree((TreeNode)root.children.get(i));
/* 184 */         if (y > largest) {
/* 185 */           largest = y;
/*     */         }
/*     */       }
/*     */     }
/* 189 */     return largest;
/*     */   }
/*     */ 
/*     */   public static int Largest_In_Tree2(TreeNode<Integer> root) {
/* 193 */     int max = ((Integer)root.data).intValue();
/*     */ 
/* 195 */     for (int i = 0; i < root.children.size(); i++) {
/* 196 */       int currentMax = Largest_In_Tree2((TreeNode)root.children.get(i));
/* 197 */       if (currentMax > max)
/* 198 */         max = currentMax;
/*     */     }
/* 200 */     return max;
/*     */   }
/*     */ 
/*     */   public static int Next_Largest_Element_Method2(TreeNode<Integer> root, int n, ArrayList<Integer> List)
/*     */   {
/* 233 */     if (root == null) {
/* 234 */       return -1;
/*     */     }
/* 236 */     if (((Integer)root.data).intValue() > n) {
/* 237 */       List.add((Integer)root.data);
/*     */     }
/* 239 */     for (int i = 0; i < root.children.size(); i++)
/*     */     {
/* 241 */       Next_Largest_Element_Method2((TreeNode)root.children.get(i), n, List);
/*     */     }
/* 243 */     int min = ((Integer)List.get(0)).intValue();
/* 244 */     for (int i = 0; i < List.size(); i++) {
/* 245 */       if (min < ((Integer)List.get(i)).intValue()) break;
/* 246 */       min = ((Integer)List.get(i)).intValue();
/*     */     }
/*     */ 
/* 252 */     return min;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 257 */     Scanner s = new Scanner(System.in);
/* 258 */     TreeNode root = TakeTreeInput_2();
/*     */ 
/* 260 */     PrintTree(root);
/* 261 */     ArrayList List = new ArrayList();
/* 262 */     int min = Next_Largest_Element_Method2(root, 5, List);
/* 263 */     System.out.println(min);
/*     */ 
/* 266 */     System.out.println("Sum of all the Tree nodes is:" + Sum_Of_Nodes(root));
/* 267 */     System.out.println("Number of Leaf nodes are:" + Count_Leaf_Node(root));
/* 268 */     System.out.println("Number of nodes are:" + Count_Number_Of_Nodes(root));
/*     */ 
/* 276 */     System.out.println("Height of the tree is:" + get_Height_Of_Tree(root));
/*     */ 
/* 279 */     System.out.println("Largest node in the tree is:" + Largest_In_Tree2(root));
/* 280 */     System.out.println("Enter the number");
/* 281 */     int n = s.nextInt();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.TreeUse
 * JD-Core Version:    0.6.2
 */