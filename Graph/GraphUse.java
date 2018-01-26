/*    */ package Graph;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class GraphUse
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Graph g = new Graph();
/*  9 */     g.addVertex("a");
/* 10 */     g.addVertex("b");
/* 11 */     g.addVertex("c");
/* 12 */     g.addVertex("d");
/* 13 */     g.addVertex("e");
/* 14 */     g.addEdge("a", "b");
/* 15 */     g.addEdge("b", "c");
/* 16 */     g.addEdge("c", "d");
/* 17 */     g.addEdge("d", "e");
/* 18 */     g.addEdge("e", "a");
/* 19 */     g.addEdge("b", "e");
/* 20 */     g.addEdge("e", "c");
/*    */ 
/* 23 */     System.out.println(g.getAdjacent("d"));
/* 24 */     g.print();
/*    */ 
/* 26 */     HashMap visited = new HashMap();
/* 27 */     System.out.println(g.areTwoVerticesConnected("a", "d", visited));
/*    */ 
/* 30 */     System.out.println("Total number of edges in a graph are:" + g.numberOfEdges());
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.GraphUse
 * JD-Core Version:    0.6.2
 */