/*     */ package Graph;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class DijkstraShortestPath
/*     */ {
/*     */   static final int V = 9;
/*     */ 
/*     */   int minDistance(int[] dist, Boolean[] sptSet)
/*     */   {
/*  18 */     int min = 2147483647; int min_index = -1;
/*     */ 
/*  20 */     for (int v = 0; v < 9; v++) {
/*  21 */       if ((!sptSet[v].booleanValue()) && (dist[v] <= min))
/*     */       {
/*  23 */         min = dist[v];
/*  24 */         min_index = v;
/*     */       }
/*     */     }
/*  27 */     return min_index;
/*     */   }
/*     */ 
/*     */   void printSolution(int[] dist, int n)
/*     */   {
/*  33 */     System.out.println("Vertex   Distance from Source");
/*  34 */     for (int i = 0; i < 9; i++)
/*  35 */       System.out.println(i + " \t\t " + dist[i]);
/*     */   }
/*     */ 
/*     */   void dijkstra(int[][] graph, int src)
/*     */   {
/*  43 */     int[] dist = new int[9];
/*     */ 
/*  47 */     Boolean[] sptSet = new Boolean[9];
/*     */ 
/*  50 */     for (int i = 0; i < 9; i++)
/*     */     {
/*  52 */       dist[i] = 2147483647;
/*  53 */       sptSet[i] = Boolean.valueOf(false);
/*     */     }
/*     */ 
/*  57 */     dist[src] = 0;
/*  58 */     ArrayList path = new ArrayList();
/*  59 */     path.add(Integer.valueOf(src));
/*     */ 
/*  62 */     for (int count = 0; count < 8; count++)
/*     */     {
/*  65 */       int u = minDistance(dist, sptSet);
/*     */ 
/*  68 */       sptSet[u] = Boolean.valueOf(true);
/*     */ 
/*  71 */       for (int v = 0; v < 9; v++)
/*     */       {
/*  76 */         if ((!sptSet[v].booleanValue()) && (graph[u][v] != 0) && (dist[u] != 2147483647) && (dist[u] + graph[u][v] < dist[v])) {
/*  77 */           dist[u] += graph[u][v];
/*  78 */           path.add(Integer.valueOf(v));
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  88 */     printSolution(dist, 9);
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  95 */     int[][] graph = { 
/*  96 */       { 0, 4, 0, 0, 0, 0, 0, 8 }, 
/*  97 */       { 4, 0, 8, 0, 0, 0, 0, 11 }, 
/*  98 */       { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
/*  99 */       { 0, 0, 7, 0, 9, 14 }, 
/* 100 */       { 0, 0, 0, 9, 0, 10 }, 
/* 101 */       { 0, 0, 4, 14, 10, 0, 2 }, 
/* 102 */       { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
/* 103 */       { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
/* 104 */       { 0, 0, 2, 0, 0, 0, 6, 7 } };
/*     */ 
/* 106 */     DijkstraShortestPath t = new DijkstraShortestPath();
/* 107 */     t.dijkstra(graph, 0);
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.DijkstraShortestPath
 * JD-Core Version:    0.6.2
 */