/*    */ package Graph;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class GraphUsingAdjacencyMatrix
/*    */ {
/*    */   int num_of_vertices;
/*    */   int[][] adjacencyMatrix;
/*    */ 
/*    */   public GraphUsingAdjacencyMatrix(int num_of_vertices)
/*    */   {
/* 14 */     this.num_of_vertices = num_of_vertices;
/* 15 */     this.adjacencyMatrix = new int[num_of_vertices + 1][num_of_vertices + 1];
/*    */   }
/*    */ 
/*    */   public void addEdge(int to, int from, int edge)
/*    */   {
/*    */     try
/*    */     {
/* 22 */       this.adjacencyMatrix[to][from] = edge;
/*    */     }
/*    */     catch (ArrayIndexOutOfBoundsException exception) {
/* 25 */       System.out.println("These vertices does not exists");
/*    */     }
/*    */   }
/*    */ 
/*    */   public int getEdge(int to, int from)
/*    */   {
/*    */     try
/*    */     {
/* 34 */       return this.adjacencyMatrix[to][from];
/*    */     }
/*    */     catch (ArrayIndexOutOfBoundsException exception)
/*    */     {
/* 38 */       System.out.println("The vertices does not exists");
/*    */     }
/* 40 */     return -1;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 46 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 48 */     System.out.println("Enter number of vertices:");
/* 49 */     int v = s.nextInt();
/*    */ 
/* 51 */     System.out.println("Enter number of Edges:");
/* 52 */     int e = s.nextInt();
/*    */ 
/* 54 */     GraphUsingAdjacencyMatrix g = new GraphUsingAdjacencyMatrix(v);
/*    */ 
/* 56 */     int count = 0; int to = 0; int from = 0;
/*    */ 
/* 58 */     System.out.println("Enter the edges <to> <from>:");
/* 59 */     while (count < e)
/*    */     {
/* 61 */       to = s.nextInt();
/* 62 */       from = s.nextInt();
/*    */ 
/* 64 */       g.addEdge(to, from, 1);
/* 65 */       count++;
/*    */     }
/*    */ 
/* 69 */     System.out.println("The adjacency matrix for the given graph is:");
/*    */ 
/* 71 */     System.out.print("  ");
/* 72 */     for (int i = 1; i <= v; i++) {
/* 73 */       System.out.print(i + " ");
/*    */     }
/* 75 */     System.out.println();
/*    */ 
/* 77 */     for (int i = 1; i <= g.num_of_vertices; i++)
/*    */     {
/* 79 */       System.out.print(i + " ");
/*    */ 
/* 81 */       for (int j = 1; j <= g.num_of_vertices; j++) {
/* 82 */         System.out.print(g.getEdge(i, j) + " ");
/*    */       }
/* 84 */       System.out.println();
/*    */     }
/*    */ 
/* 88 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.GraphUsingAdjacencyMatrix
 * JD-Core Version:    0.6.2
 */