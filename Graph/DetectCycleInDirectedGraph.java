/*    */ package Graph;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ public class DetectCycleInDirectedGraph
/*    */ {
/*    */   int num_of_vertices;
/*    */   LinkedList<Integer>[] adj;
/*    */ 
/*    */   public DetectCycleInDirectedGraph(int num_of_vertices)
/*    */   {
/* 24 */     this.num_of_vertices = num_of_vertices;
/* 25 */     this.adj = new LinkedList[num_of_vertices];
/*    */ 
/* 27 */     for (int i = 0; i < num_of_vertices; i++)
/* 28 */       this.adj[i] = new LinkedList();
/*    */   }
/*    */ 
/*    */   public void addEdge(int firstVertex, int secondVertex)
/*    */   {
/* 34 */     this.adj[firstVertex].add(Integer.valueOf(secondVertex));
/*    */   }
/*    */ 
/*    */   public boolean isCycleUtil(int v, boolean[] visited, boolean[] recStack)
/*    */   {
/* 40 */     if (visited[v] == 0)
/*    */     {
/* 42 */       visited[v] = true;
/* 43 */       recStack[v] = true;
/*    */ 
/* 45 */       Iterator ltr = this.adj[v].listIterator();
/* 46 */       while (ltr.hasNext()) {
/* 47 */         int i = ((Integer)ltr.next()).intValue();
/* 48 */         if ((visited[i] == 0) && (isCycleUtil(i, visited, recStack))) {
/* 49 */           return true;
/*    */         }
/* 51 */         if (recStack[i] != 0) {
/* 52 */           return true;
/*    */         }
/*    */       }
/*    */     }
/* 56 */     recStack[v] = false;
/* 57 */     return false;
/*    */   }
/*    */ 
/*    */   public boolean isCyclePresent()
/*    */   {
/* 62 */     boolean[] visited = new boolean[this.num_of_vertices];
/* 63 */     boolean[] recStack = new boolean[this.num_of_vertices];
/*    */ 
/* 65 */     for (int i = 0; i < this.num_of_vertices; i++)
/*    */     {
/* 67 */       visited[i] = false;
/* 68 */       recStack[i] = false;
/*    */     }
/*    */ 
/* 71 */     for (int i = 0; i < this.num_of_vertices; i++) {
/* 72 */       if (isCycleUtil(i, visited, recStack)) {
/* 73 */         return true;
/*    */       }
/*    */     }
/* 76 */     return false;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 83 */     DetectCycleInDirectedGraph g = new DetectCycleInDirectedGraph(4);
/* 84 */     g.addEdge(0, 1);
/* 85 */     g.addEdge(0, 2);
/* 86 */     g.addEdge(1, 2);
/* 87 */     g.addEdge(2, 0);
/* 88 */     g.addEdge(2, 3);
/* 89 */     g.addEdge(3, 3);
/*    */ 
/* 91 */     if (g.isCyclePresent()) {
/* 92 */       System.out.println("Graph Contains Cycle");
/*    */     }
/*    */     else
/* 95 */       System.out.println("Graph doesn't Contains any Cycle");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.DetectCycleInDirectedGraph
 * JD-Core Version:    0.6.2
 */