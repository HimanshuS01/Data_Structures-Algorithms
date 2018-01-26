/*     */ package Graph;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Stack;
/*     */ 
/*     */ public class TopologicalSort
/*     */ {
/*     */   private int V;
/*     */   private LinkedList<Integer>[] adj;
/*     */ 
/*     */   public TopologicalSort(int v)
/*     */   {
/*  23 */     this.V = v;
/*  24 */     this.adj = new LinkedList[v];
/*  25 */     for (int i = 0; i < v; i++)
/*  26 */       this.adj[i] = new LinkedList();
/*     */   }
/*     */ 
/*     */   public void addEdge(int u, int v)
/*     */   {
/*  31 */     this.adj[u].add(Integer.valueOf(v));
/*     */   }
/*     */ 
/*     */   public void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack)
/*     */   {
/*  37 */     visited[v] = true;
/*     */ 
/*  41 */     Iterator it = this.adj[v].iterator();
/*  42 */     while (it.hasNext())
/*     */     {
/*  44 */       Integer i = (Integer)it.next();
/*  45 */       if (visited[i.intValue()] == 0) {
/*  46 */         topologicalSortUtil(i.intValue(), visited, stack);
/*     */       }
/*     */     }
/*     */ 
/*  50 */     stack.push(new Integer(v));
/*     */   }
/*     */ 
/*     */   public void topologicalSort() {
/*  54 */     Stack stack = new Stack();
/*  55 */     boolean[] visited = new boolean[this.V];
/*     */ 
/*  57 */     for (int i = 0; i < this.V; i++) {
/*  58 */       visited[i] = false;
/*     */     }
/*     */ 
/*  61 */     for (int i = 0; i < this.V; i++) {
/*  62 */       if (visited[i] == 0) {
/*  63 */         topologicalSortUtil(i, visited, stack);
/*     */       }
/*     */     }
/*  66 */     while (!stack.empty())
/*  67 */       System.out.print(stack.pop() + " ");
/*     */   }
/*     */ 
/*     */   public boolean isCyclicUtil(int vertex, boolean[] visited, boolean[] recursionStack)
/*     */   {
/*  74 */     if (visited[vertex] == 0) {
/*  75 */       visited[vertex] = true;
/*  76 */       recursionStack[vertex] = true;
/*     */ 
/*  79 */       Iterator it = this.adj[vertex].iterator();
/*  80 */       while (it.hasNext())
/*     */       {
/*  82 */         Integer i = (Integer)it.next();
/*  83 */         if ((visited[i.intValue()] == 0) && (isCyclicUtil(i.intValue(), visited, recursionStack))) {
/*  84 */           return true;
/*     */         }
/*  86 */         if (recursionStack[vertex] != 0) {
/*  87 */           return true;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*  92 */     recursionStack[vertex] = false;
/*  93 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean isCycic()
/*     */   {
/*  98 */     boolean[] visited = new boolean[this.V];
/*  99 */     boolean[] RecursionStack = new boolean[this.V];
/* 100 */     for (int i = 0; i < this.V; i++) {
/* 101 */       visited[i] = false;
/* 102 */       RecursionStack[i] = false;
/*     */     }
/*     */ 
/* 105 */     for (int i = 0; i < this.V; i++) {
/* 106 */       if (isCyclicUtil(i, visited, RecursionStack)) {
/* 107 */         return true;
/*     */       }
/*     */     }
/* 110 */     return false;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 116 */     TopologicalSort obj = new TopologicalSort(6);
/* 117 */     obj.addEdge(5, 2);
/* 118 */     obj.addEdge(5, 0);
/* 119 */     obj.addEdge(4, 0);
/* 120 */     obj.addEdge(4, 1);
/* 121 */     obj.addEdge(2, 3);
/* 122 */     obj.addEdge(3, 1);
/*     */ 
/* 130 */     System.out.println("Following is a Topological sort of the given graph");
/* 131 */     obj.topologicalSort();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.TopologicalSort
 * JD-Core Version:    0.6.2
 */