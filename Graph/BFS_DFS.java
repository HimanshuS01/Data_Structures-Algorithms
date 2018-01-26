/*    */ package Graph;
/*    */ 
/*    */ import DS.QueueEmptyException;
/*    */ import DS.QueueusingLL;
/*    */ import DS.StackEmptyException;
/*    */ import DS.StackUsingLinkList;
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class BFS_DFS
/*    */ {
/*    */   public static void Breadth_first_Search(String v, HashMap<String, Integer> Status, Graph g)
/*    */     throws QueueEmptyException
/*    */   {
/* 17 */     System.out.println("Following is a BFS(using queue) travel starting from the vertex " + v);
/* 18 */     QueueusingLL queue = new QueueusingLL();
/* 19 */     queue.enqueue(v);
/* 20 */     Status.put(v, Integer.valueOf(1));
/* 21 */     while (!queue.isEmpty()) {
/* 22 */       v = (String)queue.dequeue();
/* 23 */       Status.put(v, Integer.valueOf(2));
/* 24 */       ArrayList adjacent = new ArrayList();
/* 25 */       adjacent = g.getAdjacent(v);
/* 26 */       for (int i = 0; i < adjacent.size(); i++) {
/* 27 */         if (((Integer)Status.get(adjacent.get(i))).intValue() == 2)
/*    */         {
/*    */           break;
/*    */         }
/* 31 */         queue.enqueue((String)adjacent.get(i));
/* 32 */         Status.put((String)adjacent.get(i), Integer.valueOf(1));
/*    */       }
/*    */ 
/* 35 */       System.out.print(v);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void Depth_first_Search(String source, HashMap<String, Integer> status, Graph g)
/*    */   {
/* 42 */     System.out.println("Following is a DFS(using stack) travel starting from the vertex " + source);
/* 43 */     StackUsingLinkList stack = new StackUsingLinkList();
/* 44 */     stack.push(source);
/* 45 */     status.put(source, Integer.valueOf(1));
/* 46 */     while (!stack.isEmpty())
/*    */       try {
/* 48 */         String vertex = (String)stack.pop();
/* 49 */         status.put(vertex, Integer.valueOf(2));
/* 50 */         ArrayList adjacent = new ArrayList();
/* 51 */         adjacent = g.getAdjacent(vertex);
/* 52 */         for (int i = 0; i < adjacent.size(); i++) {
/* 53 */           if (((Integer)status.get(adjacent.get(i))).intValue() == 2)
/*    */           {
/*    */             break;
/*    */           }
/* 57 */           stack.push((String)adjacent.get(i));
/* 58 */           status.put((String)adjacent.get(i), Integer.valueOf(1));
/*    */         }
/*    */ 
/* 61 */         System.out.print(vertex);
/*    */       }
/*    */       catch (StackEmptyException e) {
/* 64 */         e.printStackTrace();
/*    */       }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws QueueEmptyException
/*    */   {
/* 72 */     HashMap StatusofVertex = new HashMap();
/* 73 */     Graph g = new Graph();
/*    */ 
/* 75 */     g.addVertex("a"); StatusofVertex.put("a", Integer.valueOf(0));
/* 76 */     g.addVertex("b"); StatusofVertex.put("b", Integer.valueOf(0));
/* 77 */     g.addVertex("c"); StatusofVertex.put("c", Integer.valueOf(0));
/* 78 */     g.addVertex("d"); StatusofVertex.put("d", Integer.valueOf(0));
/* 79 */     g.addVertex("e"); StatusofVertex.put("e", Integer.valueOf(0));
/*    */ 
/* 81 */     g.addEdge("a", "b");
/* 82 */     g.addEdge("b", "c");
/* 83 */     g.addEdge("c", "d");
/* 84 */     g.addEdge("d", "e");
/* 85 */     g.addEdge("e", "a");
/* 86 */     g.addEdge("b", "e");
/* 87 */     g.addEdge("b", "d");
/*    */ 
/* 89 */     g.print();
/* 90 */     Breadth_first_Search("a", StatusofVertex, g);
/* 91 */     System.out.println();
/* 92 */     StatusofVertex.put("a", Integer.valueOf(0));
/* 93 */     StatusofVertex.put("b", Integer.valueOf(0));
/* 94 */     StatusofVertex.put("c", Integer.valueOf(0));
/* 95 */     StatusofVertex.put("d", Integer.valueOf(0));
/* 96 */     StatusofVertex.put("e", Integer.valueOf(0));
/* 97 */     Depth_first_Search("a", StatusofVertex, g);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.BFS_DFS
 * JD-Core Version:    0.6.2
 */