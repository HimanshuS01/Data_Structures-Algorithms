/*    */ package Graph;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ public class DetectCycleInUnDirectedGraph
/*    */ {
/*    */   private int V;
/*    */   private LinkedList<Integer>[] adj;
/*    */ 
/*    */   DetectCycleInUnDirectedGraph(int v)
/*    */   {
/* 14 */     this.V = v;
/* 15 */     this.adj = new LinkedList[v];
/* 16 */     for (int i = 0; i < v; i++)
/* 17 */       this.adj[i] = new LinkedList();
/*    */   }
/*    */ 
/*    */   void addEdge(int v, int w) {
/* 21 */     this.adj[v].add(Integer.valueOf(w));
/* 22 */     this.adj[w].add(Integer.valueOf(v));
/*    */   }
/*    */ 
/*    */   public boolean isCyclicUtil(int v, boolean[] visited, int parent)
/*    */   {
/* 30 */     visited[v] = true;
/*    */ 
/* 34 */     Iterator it = this.adj[v].iterator();
/* 35 */     while (it.hasNext())
/*    */     {
/* 37 */       Integer i = (Integer)it.next();
/*    */ 
/* 41 */       if (visited[i.intValue()] == 0)
/*    */       {
/* 43 */         if (isCyclicUtil(i.intValue(), visited, v)) {
/* 44 */           return true;
/*    */         }
/*    */ 
/*    */       }
/* 49 */       else if (i.intValue() != parent)
/* 50 */         return true;
/*    */     }
/* 52 */     return false;
/*    */   }
/*    */ 
/*    */   public boolean isCyclic()
/*    */   {
/* 58 */     boolean[] visited = new boolean[this.V];
/* 59 */     for (int i = 0; i < this.V; i++) {
/* 60 */       visited[i] = false;
/*    */     }
/*    */ 
/* 64 */     for (int u = 0; u < this.V; u++) {
/* 65 */       if ((visited[u] == 0) && 
/* 66 */         (isCyclicUtil(u, visited, -1)))
/* 67 */         return true;
/*    */     }
/* 69 */     return false;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 75 */     DetectCycleInUnDirectedGraph g1 = new DetectCycleInUnDirectedGraph(5);
/* 76 */     g1.addEdge(1, 0);
/* 77 */     g1.addEdge(0, 2);
/* 78 */     g1.addEdge(2, 0);
/* 79 */     g1.addEdge(0, 3);
/* 80 */     g1.addEdge(3, 4);
/* 81 */     if (g1.isCyclic())
/* 82 */       System.out.println("Graph contains cycle");
/*    */     else {
/* 84 */       System.out.println("Graph doesn't contains cycle");
/*    */     }
/* 86 */     DetectCycleInUnDirectedGraph g2 = new DetectCycleInUnDirectedGraph(3);
/* 87 */     g2.addEdge(0, 1);
/* 88 */     g2.addEdge(1, 2);
/* 89 */     if (g2.isCyclic())
/* 90 */       System.out.println("Graph contains cycle");
/*    */     else
/* 92 */       System.out.println("Graph doesn't contains cycle");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.DetectCycleInUnDirectedGraph
 * JD-Core Version:    0.6.2
 */