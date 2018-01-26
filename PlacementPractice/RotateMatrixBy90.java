/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class RotateMatrixBy90
/*    */ {
/*    */   public static void rotate(ArrayList<ArrayList<Integer>> a)
/*    */   {
/* 15 */     int row = a.size();
/* 16 */     int column = ((ArrayList)a.get(0)).size();
/* 17 */     ArrayList output = new ArrayList();
/* 18 */     for (int j = 0; j < column; j++) {
/* 19 */       ArrayList arr = new ArrayList();
/* 20 */       for (int k = row - 1; k >= 0; k--) {
/* 21 */         arr.add((Integer)((ArrayList)a.get(k)).get(j));
/*    */       }
/* 23 */       output.add(arr);
/*    */     }
/*    */ 
/* 26 */     for (int k = 0; k < output.size(); k++)
/* 27 */       System.out.println(output.get(k));
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 35 */     ArrayList arr1 = new ArrayList();
/* 36 */     ArrayList arr2 = new ArrayList();
/* 37 */     ArrayList arr3 = new ArrayList();
/* 38 */     arr1.add(Integer.valueOf(1)); arr1.add(Integer.valueOf(2)); arr1.add(Integer.valueOf(3));
/* 39 */     arr2.add(Integer.valueOf(4)); arr2.add(Integer.valueOf(5)); arr2.add(Integer.valueOf(6));
/* 40 */     arr3.add(Integer.valueOf(7)); arr3.add(Integer.valueOf(8)); arr3.add(Integer.valueOf(9));
/* 41 */     ArrayList a = new ArrayList();
/* 42 */     a.add(arr1); a.add(arr2); a.add(arr3);
/* 43 */     System.out.println(a.size());
/* 44 */     rotate(a);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.RotateMatrixBy90
 * JD-Core Version:    0.6.2
 */