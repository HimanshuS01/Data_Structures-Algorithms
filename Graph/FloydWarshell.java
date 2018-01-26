/*    */ package Graph;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class FloydWarshell
/*    */ {
/*    */   static final int INF = 99999;
/*    */   static final int V = 4;
/*    */ 
/*    */   void floydWarshall(int[][] graph)
/*    */   {
/*  9 */     int[][] dist = new int[4][4];
/*    */ 
/* 16 */     for (int i = 0; i < 4; i++) {
/* 17 */       for (int j = 0; j < 4; j++) {
/* 18 */         dist[i][j] = graph[i][j];
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 30 */     for (int k = 0; k < 4; k++)
/*    */     {
/* 33 */       for (i = 0; i < 4; i++)
/*    */       {
/* 36 */         for (int j = 0; j < 4; j++)
/*    */         {
/* 39 */           if (dist[i][k] + dist[k][j] < dist[i][j]) {
/* 40 */             dist[i][k] += dist[k][j];
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */ 
/* 46 */     printSolution(dist);
/*    */   }
/*    */ 
/*    */   void printSolution(int[][] dist)
/*    */   {
/* 51 */     System.out.println("Following matrix shows the shortest distances between every pair of vertices");
/*    */ 
/* 53 */     for (int i = 0; i < 4; i++)
/*    */     {
/* 55 */       for (int j = 0; j < 4; j++)
/*    */       {
/* 57 */         if (dist[i][j] == 99999)
/* 58 */           System.out.print("INF ");
/*    */         else
/* 60 */           System.out.print(dist[i][j] + "   ");
/*    */       }
/* 62 */       System.out.println();
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 78 */     int[][] graph = { 
/* 79 */       { 0, 5, 99999, 10 }, 
/* 80 */       { 99999, 0, 3, 99999 }, 
/* 81 */       { 99999, 99999, 0, 1 }, 
/* 82 */       { 99999, 99999, 99999 } };
/*    */ 
/* 84 */     FloydWarshell a = new FloydWarshell();
/*    */ 
/* 87 */     a.floydWarshall(graph);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.FloydWarshell
 * JD-Core Version:    0.6.2
 */