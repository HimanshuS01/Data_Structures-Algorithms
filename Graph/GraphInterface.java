package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public abstract interface GraphInterface
{
  public abstract void addVertex(String paramString);

  public abstract void addEdge(String paramString1, String paramString2);

  public abstract void removeVertex(String paramString);

  public abstract void removeEdge(String paramString1, String paramString2);

  public abstract ArrayList<String> getAdjacent(String paramString);

  public abstract int getDegree(String paramString);

  public abstract int numberVertices();

  public abstract int numberOfEdges();

  public abstract boolean areTwoVerticesConnected(String paramString1, String paramString2, HashMap<Vertex, Boolean> paramHashMap);

  public abstract boolean isConnected();
}

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Graph.GraphInterface
 * JD-Core Version:    0.6.2
 */