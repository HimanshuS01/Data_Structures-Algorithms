/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class BinaryIndexTree
/*    */ {
/*    */   public void updateBinaryIndexedTree(int[] binaryIndexedTree, int val, int index)
/*    */   {
/* 27 */     while (index < binaryIndexedTree.length) {
/* 28 */       binaryIndexedTree[index] += val;
/* 29 */       index = getNext(index);
/*    */     }
/*    */   }
/*    */ 
/*    */   public int getSum(int[] binaryIndexedTree, int index)
/*    */   {
/* 38 */     index++;
/* 39 */     int sum = 0;
/* 40 */     while (index > 0) {
/* 41 */       sum += binaryIndexedTree[index];
/* 42 */       index = getParent(index);
/*    */     }
/* 44 */     return sum;
/*    */   }
/*    */ 
/*    */   public int[] createTree(int[] input)
/*    */   {
/* 51 */     int[] binaryIndexedTree = new int[input.length + 1];
/* 52 */     for (int i = 1; i <= input.length; i++) {
/* 53 */       updateBinaryIndexedTree(binaryIndexedTree, input[(i - 1)], i);
/*    */     }
/* 55 */     return binaryIndexedTree;
/*    */   }
/*    */ 
/*    */   private int getParent(int index)
/*    */   {
/* 65 */     return index - (index & -index);
/*    */   }
/*    */ 
/*    */   private int getNext(int index)
/*    */   {
/* 75 */     return index + (index & -index);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 79 */     int[] input = { 3, 2, -1, 6, 5, 4, -3, 3, 7, 2, 3 };
/* 80 */     BinaryIndexTree ft = new BinaryIndexTree();
/* 81 */     int[] binaryIndexedTree = ft.createTree(input);
/* 82 */     System.out.println("Binary Index Tree");
/* 83 */     for (int i = 0; i < binaryIndexedTree.length; i++) {
/* 84 */       System.out.print(binaryIndexedTree[i] + " ");
/*    */     }
/*    */ 
/* 93 */     System.out.println("\n" + ft.getSum(binaryIndexedTree, 4));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.BinaryIndexTree
 * JD-Core Version:    0.6.2
 */