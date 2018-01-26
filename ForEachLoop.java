/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class ForEachLoop
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 12 */     int[] arr = { 1, 2, 3, 4, 5 };
/* 13 */     ArrayList arr1 = new ArrayList();
/* 14 */     arr1.add("Gagan");
/* 15 */     arr1.add("Himanshu");
/* 16 */     arr1.add("Manisha");
/* 17 */     for (int i : arr) {
/* 18 */       System.out.println(i);
/*    */     }
/* 20 */     for (String s : arr1)
/* 21 */       System.out.println(s);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ForEachLoop
 * JD-Core Version:    0.6.2
 */