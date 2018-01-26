/*     */ package Graph;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ public class Graph
/*     */   implements GraphInterface
/*     */ {
/*     */   private HashMap<String, Vertex> vertices;
/*     */   public HashMap<Vertex, Boolean> visited;
/*     */ 
/*     */   public Graph()
/*     */   {
/*  12 */     this.vertices = new HashMap();
/*  13 */     this.visited = new HashMap();
/*     */   }
/*     */ 
/*     */   public void addVertex(String name) {
/*  17 */     if (this.vertices.containsKey(name)) {
/*  18 */       return;
/*     */     }
/*     */ 
/*  21 */     Vertex v = new Vertex(name);
/*  22 */     this.vertices.put(name, v);
/*  23 */     this.visited.put(v, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   public void addEdge(String first, String second) {
/*  27 */     if ((!this.vertices.containsKey(first)) || (!this.vertices.containsKey(second))) {
/*  28 */       return;
/*     */     }
/*     */ 
/*  31 */     Vertex firstVertex = (Vertex)this.vertices.get(first);
/*  32 */     Vertex secondVertex = (Vertex)this.vertices.get(second);
/*  33 */     if (firstVertex.isAdjacent(secondVertex)) {
/*  34 */       return;
/*     */     }
/*  36 */     Edge e = new Edge();
/*  37 */     e.first = firstVertex;
/*  38 */     e.second = secondVertex;
/*  39 */     firstVertex.addEdge(e);
/*  40 */     secondVertex.addEdge(e);
/*     */   }
/*     */ 
/*     */   public void print() {
/*  44 */     System.out.println("Printing Graph");
/*     */ 
/*  46 */     Vertex[] allVertices = (Vertex[])this.vertices.values().toArray(new Vertex[0]);
/*     */ 
/*  48 */     for (Vertex v : allVertices)
/*  49 */       v.print();
/*     */   }
/*     */ 
/*     */   public void removeVertex(String name)
/*     */   {
/*  54 */     if (!this.vertices.containsKey(name)) {
/*  55 */       return;
/*     */     }
/*     */ 
/*  58 */     Vertex toBeRemoved = (Vertex)this.vertices.get(name);
/*  59 */     this.vertices.remove(name);
/*  60 */     ArrayList adjacentVertices = toBeRemoved.getAdjacent();
/*  61 */     for (Vertex adjacentVertex : adjacentVertices)
/*  62 */       adjacentVertex.removeEdgeWith(toBeRemoved);
/*     */   }
/*     */ 
/*     */   public void removeEdge(String first, String second)
/*     */   {
/*  67 */     if ((!this.vertices.containsKey(first)) || (!this.vertices.containsKey(second))) {
/*  68 */       return;
/*     */     }
/*  70 */     Vertex firstVertex = (Vertex)this.vertices.get(first);
/*  71 */     Vertex secondVertex = (Vertex)this.vertices.get(second);
/*  72 */     firstVertex.removeEdgeWith(secondVertex);
/*  73 */     secondVertex.removeEdgeWith(firstVertex);
/*     */   }
/*     */ 
/*     */   public ArrayList<String> getAdjacent(String name) {
/*  77 */     if (!this.vertices.containsKey(name)) {
/*  78 */       return null;
/*     */     }
/*  80 */     Vertex vertex = (Vertex)this.vertices.get(name);
/*  81 */     ArrayList adjacent = vertex.getAdjacent();
/*  82 */     ArrayList output = new ArrayList();
/*     */ 
/*  84 */     for (Vertex v : adjacent) {
/*  85 */       String name1 = v.name;
/*  86 */       output.add(name1);
/*     */     }
/*  88 */     return output;
/*     */   }
/*     */ 
/*     */   public int getDegree(String name) {
/*  92 */     if (!this.vertices.containsKey(name)) {
/*  93 */       return -1;
/*     */     }
/*     */ 
/*  96 */     Vertex vertex = (Vertex)this.vertices.get(name);
/*  97 */     return vertex.getDegree();
/*     */   }
/*     */ 
/*     */   public int numberVertices()
/*     */   {
/* 103 */     return this.vertices.size();
/*     */   }
/*     */ 
/*     */   public int numberOfEdges()
/*     */   {
/* 108 */     int count = 0;
/* 109 */     Vertex[] allVertices = (Vertex[])this.vertices.values().toArray(new Vertex[0]);
/* 110 */     for (int i = 0; i < allVertices.length; i++) {
/* 111 */       Vertex v = allVertices[i];
/* 112 */       count += v.getDegree();
/*     */     }
/* 114 */     return count / 2;
/*     */   }
/*     */ 
/*     */   public boolean areTwoVerticesConnected(String first, String second, HashMap<Vertex, Boolean> visited)
/*     */   {
/* 119 */     if ((!this.vertices.containsKey(first)) || (!this.vertices.containsKey(second))) {
/* 120 */       return false;
/*     */     }
/* 122 */     if (first.equals(second)) {
/* 123 */       return true;
/*     */     }
/* 125 */     Vertex firstVertex = (Vertex)this.vertices.get(first);
/* 126 */     ArrayList adjacent = firstVertex.getAdjacent();
/* 127 */     visited.put(firstVertex, Boolean.valueOf(true));
/*     */ 
/* 129 */     for (Vertex v : adjacent) {
/* 130 */       if (!visited.containsKey(v))
/*     */       {
/* 133 */         if (areTwoVerticesConnected(v.name, second, visited))
/* 134 */           return true;
/*     */       }
/*     */     }
/* 137 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean isConnected()
/*     */   {
/* 142 */     return false;
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.Graph
 * JD-Core Version:    0.6.2
 */