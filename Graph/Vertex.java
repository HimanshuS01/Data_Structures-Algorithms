/*    */ package Graph;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class Vertex
/*    */ {
/*    */   final String name;
/*    */   private ArrayList<Edge> edges;
/*    */ 
/*    */   public Vertex(String name1)
/*    */   {
/* 12 */     this.name = name1;
/* 13 */     this.edges = new ArrayList();
/*    */   }
/*    */ 
/*    */   public boolean isAdjacent(Vertex secondVertex) {
/* 17 */     for (Edge e : this.edges) {
/* 18 */       if ((e.first == secondVertex) || (e.second == secondVertex)) {
/* 19 */         return true;
/*    */       }
/*    */     }
/* 22 */     return false;
/*    */   }
/*    */ 
/*    */   public void addEdge(Edge e) {
/* 26 */     this.edges.add(e);
/*    */   }
/*    */ 
/*    */   public ArrayList<Vertex> getAdjacent() {
/* 30 */     ArrayList output = new ArrayList();
/* 31 */     for (Edge e : this.edges) {
/* 32 */       if (this == e.first)
/* 33 */         output.add(e.second);
/*    */       else {
/* 35 */         output.add(e.first);
/*    */       }
/*    */     }
/* 38 */     return output;
/*    */   }
/*    */ 
/*    */   public void removeEdgeWith(Vertex toBeRemoved)
/*    */   {
/* 43 */     for (int i = 0; i < this.edges.size(); i++) {
/* 44 */       Edge e = (Edge)this.edges.get(i);
/* 45 */       if ((e.first == toBeRemoved) || (e.second == toBeRemoved)) {
/* 46 */         this.edges.remove(i);
/* 47 */         return;
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   public int getDegree() {
/* 53 */     return this.edges.size();
/*    */   }
/*    */ 
/*    */   public void print()
/*    */   {
/* 58 */     System.out.print(this.name + ":");
/* 59 */     ArrayList adjacent = getAdjacent();
/* 60 */     for (Vertex v : adjacent) {
/* 61 */       System.out.print(v.name + ",");
/*    */     }
/* 63 */     System.out.println();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.Vertex
 * JD-Core Version:    0.6.2
 */