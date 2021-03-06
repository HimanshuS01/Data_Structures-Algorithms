/*     */ package Graph;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.HashMap;
/*     */ import java.util.InputMismatchException;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Queue;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class AdjacencyListOfGraph
/*     */ {
/*     */   private Map<Integer, List<Integer>> Adjacency_List;
/*     */ 
/*     */   public AdjacencyListOfGraph(int number_of_vertices)
/*     */   {
/*  21 */     this.Adjacency_List = new HashMap();
/*  22 */     for (int i = 1; i <= number_of_vertices; i++)
/*     */     {
/*  24 */       this.Adjacency_List.put(Integer.valueOf(i), new LinkedList());
/*     */     }
/*     */   }
/*     */ 
/*     */   public void setEdge(int source, int destination)
/*     */   {
/*  33 */     if ((source > this.Adjacency_List.size()) || (destination > this.Adjacency_List.size()))
/*     */     {
/*  35 */       System.out.println("the vertex entered in not present ");
/*  36 */       return;
/*     */     }
/*  38 */     List slist = (List)this.Adjacency_List.get(Integer.valueOf(source));
/*  39 */     slist.add(Integer.valueOf(destination));
/*  40 */     List dlist = (List)this.Adjacency_List.get(Integer.valueOf(destination));
/*  41 */     dlist.add(Integer.valueOf(source));
/*     */   }
/*     */ 
/*     */   public List<Integer> getEdge(int source)
/*     */   {
/*  47 */     if (source > this.Adjacency_List.size())
/*     */     {
/*  49 */       System.out.println("the vertex entered is not present");
/*  50 */       return null;
/*     */     }
/*  52 */     return (List)this.Adjacency_List.get(Integer.valueOf(source));
/*     */   }
/*     */ 
/*     */   public boolean isPathBetween(int vertex1, int vertex2)
/*     */   {
/*  58 */     if ((!this.Adjacency_List.containsKey(Integer.valueOf(vertex1))) || (!this.Adjacency_List.containsKey(Integer.valueOf(vertex2)))) {
/*  59 */       return false;
/*     */     }
/*  61 */     if (vertex1 == vertex2) {
/*  62 */       return true;
/*     */     }
/*  64 */     int[] status = new int[this.Adjacency_List.size()];
/*  65 */     Queue queue = new LinkedList();
/*  66 */     queue.add(Integer.valueOf(vertex1));
/*  67 */     status[(vertex1 - 1)] = 1;
/*     */     Iterator localIterator;
/*  68 */     for (; !queue.isEmpty(); 
/*  72 */       localIterator.hasNext())
/*     */     {
/*  69 */       int v = ((Integer)queue.poll()).intValue();
/*  70 */       status[(v - 1)] = 2;
/*  71 */       List adjacentVertices = (List)this.Adjacency_List.get(Integer.valueOf(v));
/*  72 */       localIterator = adjacentVertices.iterator(); continue; int vertex = ((Integer)localIterator.next()).intValue();
/*  73 */       if (status[(vertex - 1)] == 0) {
/*  74 */         if (vertex == vertex2)
/*  75 */           return true;
/*     */       }
/*     */       else
/*     */       {
/*  79 */         status[(vertex - 1)] = 1;
/*  80 */         queue.add(Integer.valueOf(vertex));
/*     */       }
/*     */     }
/*     */ 
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  96 */     int count = 1;
/*  97 */     Scanner scan = new Scanner(System.in);
/*     */     try
/*     */     {
/* 102 */       System.out.println("Enter the number of vertices and edges in graph");
/* 103 */       int number_of_vertices = scan.nextInt();
/* 104 */       int number_of_edges = scan.nextInt();
/* 105 */       AdjacencyListOfGraph adjacencyList = new AdjacencyListOfGraph(number_of_vertices);
/*     */ 
/* 108 */       System.out.println("Enter the edges in graph Format : <source index> <destination index>");
/* 109 */       while (count <= number_of_edges)
/*     */       {
/* 111 */         int source = scan.nextInt();
/* 112 */         int destination = scan.nextInt();
/* 113 */         adjacencyList.setEdge(    4C:/Program Files/Java/jre1.8.0_144/lib/resources.jar ?C:/Program Files/Java/jre1.8.0_144/lib/ext/access-bridge-64.jar 9C:/Program Files/Java/jre1.8.0_144/lib/ext/localedata.jar 7C:/Program Files/Java/jre1.8.0_144/lib/ext/cldrdata.jar 6C:/Program Files/Java/jre1.8.0_144/lib/ext/nashorn.jar /C:/Program Files/Java/jre1.8.0_144/lib/jsse.jar 6C:/Program Files/Java/jre1.8.0_144/lib/ext/jaccess.jar 8C:/Program Files/Java/jre1.8.0_144/lib/ext/sunmscapi.jar 4C:/Program Files/Java/jre1.8.0_144/lib/ext/jfxrt.jar -C:/Program Files/Java/jre1.8.0_144/lib/rt.jar 3C:/Program Files/Java/jre1.8.0_144/lib/charsets.jar 4C:/Program Files/Java/jre1.8.0_144/lib/ext/dnsns.jar 4C:/Program Files/Java/jre1.8.0_144/lib/ext/zipfs.jar .C:/Program Files/Java/jre1.8.0_144/lib/jfr.jar >C:/Program Files/Java/jre1.8.0_144/lib/ext/sunjce_provider.jar 8C:/Program Files/Java/jre1.8.0_144/lib/ext/sunpkcs11.jar .C:/Program Files/Java/jre1.8.0_144/lib/jce.jar 4C:/Program Files/Java/jre1.8.0_144/lib/ext/sunec.jar                                                                                                                                                                                                                                                                                                                                                                                                                              