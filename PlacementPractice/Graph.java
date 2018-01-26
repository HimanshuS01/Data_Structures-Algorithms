/*     */ package PlacementPractice;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Queue;
/*     */ 
/*     */ public class Graph
/*     */ {
/*     */   int num_of_vertices;
/*     */   LinkedList<Integer>[] adj;
/*     */ 
/*     */   public Graph(int v)
/*     */   {
/*  16 */     this.num_of_vertices = v;
/*  17 */     this.adj = new LinkedList[v];
/*  18 */     for (int i = 0; i < v; i++)
/*  19 */       this.adj[i] = new LinkedList();
/*     */   }
/*     */ 
/*     */   public void addEdge(int number1, int number2)
/*     */   {
/*  25 */     this.adj[number1].add(Integer.valueOf(number2));
/*     */   }
/*     */ 
/*     */   public void BFS(int s)
/*     */   {
/*  31 */     boolean[] visited = new boolean[this.num_of_vertices];
/*  32 */     Queue queue = new LinkedList();
/*  33 */     visited[s] = true;
/*  34 */     queue.add(Integer.valueOf(s));
/*     */     Iterator ltr;
/*  36 */     for (; !queue.isEmpty(); 
/*  42 */       ltr.hasNext())
/*     */     {
/*  38 */       s = ((Integer)queue.poll()).intValue();
/*  39 */       System.out.print(s + " ");
/*     */ 
/*  41 */       ltr = this.adj[s].listIterator();
/*  42 */       continue;
/*     */ 
/*  44 */       int next = ((Integer)ltr.next()).intValue();
/*  45 */       if (visited[next] == 0) {
/*  46 */         visited[next] = true;
/*  47 */         queue.add(Integer.valueOf(next));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void DFS(int v, boolean[] visited)
/*     */   {
/*  63 */     visited[v] = true;
/*  64 */     System.out.print(v + " ");
/*     */ 
/*  67 */     Iterator i = this.adj[v].listIterator();
/*  68 */     while (i.hasNext())
/*     */     {
/*  70 */       int n = ((Integer)i.next()).intValue();
/*  71 */       if (visited[n] == 0)
/*     */       {
/*  73 */         DFS(n, visited);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void DFS(int v)
/*     */   {
/*  82 */     boolean[] visited = new boolean[this.num_of_vertices];
/*     */ 
/*  85 */     DFS(v, visited);
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  91 */     Graph g = new Graph(4);
/*  92 */     g.addEdge(0, 1);
/*  93 */     g.addEdge(0, 2);
/*  94 */     g.addEdge(1, 0);
/*  95 */     g.addEdge(1, 2);
/*  96 */     g.addEdge(2, 0);
/*  97 */     g.addEdge(2, 1);
/*  98 */     g.addEdge(2, 3);
/*  99 */     g.addEdge(3, 3);
/*     */ 
/* 102 */     for (int i = 0; i < g.adj.length; i++) {
/* 103 */       System.out.println(i + "-->" + g.adj[i]);
/*     */     }
/*     */ 
/* 106 */     g.BFS(2);
/*     */ 
/* 108 */     System.out.println();
/*     */ 
/* 110 */     g.DFS(2);
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.Graph
 * JD-Core Version:    0.6.2
 */