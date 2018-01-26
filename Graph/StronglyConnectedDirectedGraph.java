/*     */ package Graph;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ public class StronglyConnectedDirectedGraph
/*     */ {
/*     */   private int V;
/*     */   private LinkedList<Integer>[] adj;
/*     */ 
/*     */   StronglyConnectedDirectedGraph(int v)
/*     */   {
/*  26 */     this.V = v;
/*  27 */     this.adj = new LinkedList[v];
/*  28 */     for (int i = 0; i < v; i++)
/*  29 */       this.adj[i] = new LinkedList();
/*     */   }
/*     */ 
/*     */   void addEdge(int v, int w) {
/*  33 */     this.adj[v].add(Integer.valueOf(w));
/*     */   }
/*     */ 
/*     */   void DFSUtil(int v, Boolean[] visited)
/*     */   {
/*  39 */     visited[v] = Boolean.valueOf(true);
/*     */ 
/*  44 */     Iterator i = this.adj[v].iterator();
/*  45 */     while (i.hasNext())
/*     */     {
/*  47 */       int n = ((Integer)i.next()).intValue();
/*  48 */       if (!visited[n].booleanValue())
/*  49 */         DFSUtil(n, visited);
/*     */     }
/*     */   }
/*     */ 
/*     */   StronglyConnectedDirectedGraph getTranspose()
/*     */   {
/*  56 */     StronglyConnectedDirectedGraph g = new StronglyConnectedDirectedGraph(this.V);
/*  57 */     for (int v = 0; v < this.V; v++)
/*     */     {
/*  60 */       Iterator i = this.adj[v].listIterator();
/*  61 */       while (i.hasNext())
/*  62 */         g.adj[((Integer)i.next()).intValue()].add(Integer.valueOf(v));
/*     */     }
/*  64 */     return g;
/*     */   }
/*     */ 
/*     */   Boolean isSC()
/*     */   {
/*  73 */     Boolean[] visited = new Boolean[this.V];
/*  74 */     for (int i = 0; i < this.V; i++) {
/*  75 */       visited[i] = Boolean.valueOf(false);
/*     */     }
/*     */ 
/*  78 */     DFSUtil(0, visited);
/*     */ 
/*  82 */     for (int i = 0; i < this.V; i++) {
/*  83 */       if (!visited[i].booleanValue()) {
/*  84 */         return Boolean.valueOf(false);
/*     */       }
/*     */     }
/*  87 */     StronglyConnectedDirectedGraph gr = getTranspose();
/*     */ 
/*  91 */     for (int i = 0; i < this.V; i++) {
/*  92 */       visited[i] = Boolean.valueOf(false);
/*     */     }
/*     */ 
/*  97 */     gr.DFSUtil(0, visited);
/*     */ 
/* 101 */     for (int i = 0; i < this.V; i++) {
/* 102 */       if (!visited[i].booleanValue())
/* 103 */         return Boolean.valueOf(false);
/*     */     }
/* 105 */     return Boolean.valueOf(true);
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 111 */     StronglyConnectedDirectedGraph g1 = new StronglyConnectedDirectedGraph(5);
/* 112 */     g1.addEdge(0, 1);
/* 113 */     g1.addEdge(1, 2);
/* 114 */     g1.addEdge(2, 3);
/* 115 */     g1.addEdge(3, 0);
/* 116 */     g1.addEdge(2, 4);
/* 117 */     g1.addEdge(4, 2);
/* 118 */     if (g1.isSC().booleanValue())
/* 119 */       System.out.println("Yes");
/*     */     else {
/* 121 */       System.out.println("No");
/*     */     }
/* 123 */     StronglyConnectedDirectedGraph g2 = new StronglyConnectedDirectedGraph(4);
/* 124 */     g2.addEdge(0, 1);
/* 125 */     g2.addEdge(1, 2);
/* 126 */     g2.addEdge(2, 3);
/* 127 */     if (g2.isSC().booleanValue())
/* 128 */       System.out.println("Yes");
/*     */     else
/* 130 */       System.out.println("No");
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.StronglyConnectedDirectedGraph
 * JD-Core Version:    0.6.2
 */