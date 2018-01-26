/*    */ package DynamicProgramming;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class FactorialUsingDP
/*    */ {
/*    */   public static long factorial_using_dp(long number, ArrayList<Long> arr)
/*    */   {
/* 10 */     if (number == 0L) {
/* 11 */       return 1L;
/*    */     }
/* 13 */     if (number == 1L) {
/* 14 */       arr.add(Long.valueOf(1L));
/*    */     }
/*    */     else {
/* 17 */       long n = number * ((Long)arr.get((int)(number - 2L))).longValue();
/* 18 */       arr.add(Long.valueOf(n));
/*    */     }
/*    */ 
/* 29 */     return ((Long)arr.get(arr.size() - 1)).longValue();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) throws Exception {
/* 33 */     Scanner s = new Scanner(System.in);
/* 34 */     int TestCases = s.nextInt();
/* 35 */     long[] result = new long[TestCases];
/* 36 */     ArrayList arr = new ArrayList();
/* 37 */     for (int i = 0; i < TestCases; i++) {
/* 38 */       long n = s.nextInt();
/* 39 */       result[i] = factorial_using_dp(n, arr);
/*    */     }
/* 41 */     for (int j = 0; j < result.length; j++)
/* 42 */       System.out.println(result[j]);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DynamicProgramming.FactorialUsingDP
 * JD-Core Version:    0.6.2
 */