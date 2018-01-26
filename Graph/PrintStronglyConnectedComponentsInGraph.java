/*     */ package Graph;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Stack;
/*     */ 
/*     */ public class PrintStronglyConnectedComponentsInGraph
/*     */ {
/*     */   int num_of_vertices;
/*     */   LinkedList<Integer>[] adj;
/*     */ 
/*     */   public PrintStronglyConnectedComponentsInGraph(int num_of_vertices)
/*     */   {
/*  16 */     this.num_of_vertices = num_of_vertices;
/*  17 */     this.adj = new LinkedList[num_of_vertices];
/*     */ 
/*  19 */     for (int i = 0; i < num_of_vertices; i++)
/*  20 */       this.adj[i] = new LinkedList();
/*     */   }
/*     */ 
/*     */   public void addEdge(int firstVertex, int secondVertex)
/*     */   {
/*  26 */     this.adj[firstVertex].add(Integer.valueOf(secondVertex));
/*     */   }
/*     */ 
/*     */   public PrintStronglyConnectedComponentsInGraph getTranspose()
/*     */   {
/*  32 */     PrintStronglyConnectedComponentsInGraph gr = new PrintStronglyConnectedComponentsInGraph(this.num_of_vertices);
/*     */ 
/*  34 */     for (int i = 0; i < this.adj.length; i++)
/*     */     {
/*  36 */       Iterator ltr = this.adj[i].listIterator();
/*     */ 
/*  38 */       while (ltr.hasNext()) {
/*  39 */         int n = ((Integer)ltr.next()).intValue();
/*  40 */         gr.adj[n].add(Integer.valueOf(i));
/*     */       }
/*     */     }
/*     */ 
/*  44 */     return gr;
/*     */   }
/*     */ 
/*     */   public void fillOrder(int vertex, boolean[] visited, Stack<Integer> stack)
/*     */   {
/*  49 */     visited[vertex] = true;
/*     */ 
/*  51 */     Iterator ltr = this.adj[vertex].listIterator();
/*     */ 
/*  53 */     while (ltr.hasNext()) {
/*  54 */       int i = ((Integer)ltr.next()).intValue();
/*  55 */       if (visited[i] == 0) {
/*  56 */         fillOrder(i, visited, stack);
/*     */       }
/*     */     }
/*     */ 
/*  60 */     stack.push(Integer.valueOf(vertex));
/*     */   }
/*     */ 
/*     */   void DFS(int vertex, boolean[] visited)
/*     */   {
/*  66 */     visited[vertex] = true;
/*  67 */     System.out.print(vertex + " ");
/*     */ 
/*  72 */     Iterator i = this.adj[vertex].iterator();
/*  73 */     while (i.hasNext())
/*     */     {
/*  75 */       int n = ((Integer)i.next()).intValue();
/*  76 */       if (visited[n] == 0)
/*  77 */         DFS(n, visited);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void PrintSCC()
/*     */   {
/*  83 */     Stack stack = new Stack();
/*  84 */     boolean[] visited = new boolean[this.num_of_vertices];
/*  85 */     for (int i = 0; i < this.num_of_vertices; i++) {
/*  86 */       visited[i] = false;
/*     */     }
/*     */ 
/*  89 */     for (int i = 0; i < this.num_of_vertices; i++) {
/*  90 */       if (visited[i] == 0) {
/*  91 */         fillOrder(i, visited, stack);
/*     */       }
/*     */     }
/*     */ 
/*  95 */     PrintStronglyConnectedComponentsInGraph gr = getTranspose();
/*     */ 
/*  97 */     for (int i = 0; i < this.num_of_vertices; i++) {
/*  98 */       visited[i] = false;
/*     */     }
/*     */ 
/* 102 */     while (!stack.empty())
/*     */     {
/* 105 */       int v = ((Integer)stack.pop()).intValue();
/*     */ 
/* 108 */       if (visited[v] == 0)
/*     */       {
/* 110 */         gr.DFS(v, visited);
/* 111 */         System.out.println();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 120 */     PrintStronglyConnectedComponentsInGraph g = new PrintStronglyConnectedComponentsInGraph(5);
/* 121 */     g.addEdge(1, 0);
/* 122 */     g.addEdge(0, 2);
/* 123 */     g.addEdge(2, 1);
/* 124 */     g.addEdge(0, 3);
/* 125 */     g.addEdge(3, 4);
/*     */ 
/* 127 */     g.PrintSCC();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.PrintStronglyConnectedComponentsInGraph
 * JD-Core Version:    0.6.2
 */