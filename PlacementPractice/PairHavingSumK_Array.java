/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ class PairHavingSumK_Array
/*    */ {
/* 10 */   static int[] arr = { 4, 3, 1, 0, 0, 0, 2, 2 };
/*    */ 
/*    */   static int getPairsCount(int n, int sum)
/*    */   {
/* 16 */     HashMap hm = new HashMap();
/*    */ 
/* 19 */     for (int i = 0; i < n; i++)
/*    */     {
/* 22 */       if (!hm.containsKey(Integer.valueOf(arr[i]))) {
/* 23 */         hm.put(Integer.valueOf(arr[i]), Integer.valueOf(0));
/*    */       }
/* 25 */       hm.put(Integer.valueOf(arr[i]), Integer.valueOf(((Integer)hm.get(Integer.valueOf(arr[i]))).intValue() + 1));
/*    */     }
/* 27 */     int twice_count = 0;
/*    */ 
/* 31 */     for (int i = 0; i < n; i++)
/*    */     {
/* 33 */       twice_count += ((Integer)hm.get(Integer.valueOf(sum - arr[i]))).intValue();
/*    */ 
/* 39 */       if (sum - arr[i] == arr[i]) {
/* 40 */         twice_count--;
/*    */       }
/*    */     }
/*    */ 
/* 44 */     return twice_count / 2;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 50 */     int sum = 4;
/* 51 */     System.out.println("Count of pairs is " + 
/* 52 */       getPairsCount(arr.length, sum));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.PairHavingSumK_Array
 * JD-Core Version:    0.6.2
 */