/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SpecialPrimeNumber
/*    */ {
/*  8 */   HashMap<Integer, Boolean> map = new HashMap();
/*    */ 
/*    */   public static boolean isPrimeNumber(int number) {
/* 11 */     for (int i = 2; i <= number / 2; i++) {
/* 12 */       if (number % i == 0) {
/* 13 */         return false;
/*    */       }
/*    */     }
/* 16 */     return true;
/*    */   }
/*    */ 
/*    */   public static boolean isIncluded(int p, int i) {
/* 20 */     int[] arr = new int[i];
/* 21 */     for (int k = 0; k < i; k++) {
/* 22 */       arr[k] = (2 * p + 1);
/* 23 */       p = arr[k];
/*    */     }
/* 25 */     for (int j = 0; j < arr.length; j++) {
/* 26 */       boolean result = isPrimeNumber(arr[j]);
/* 27 */       if (!result) {
/* 28 */         return false;
/*    */       }
/*    */     }
/* 31 */     return true;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 36 */     Scanner s = new Scanner(System.in);
/* 37 */     int num = s.nextInt();
/* 38 */     int i = s.nextInt();
/* 39 */     ArrayList output = new ArrayList();
/*    */ 
/* 41 */     for (int j = 2; j < num; j++) {
/* 42 */       if (isPrimeNumber(j)) {
/* 43 */         boolean canInclude = isIncluded(j, i);
/* 44 */         if (canInclude) {
/* 45 */           output.add(Integer.valueOf(j));
/*    */         }
/*    */       }
/*    */     }
/* 49 */     for (int l = 0; l < output.size(); l++)
/* 50 */       System.out.print(output.get(l) + " ");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     SpecialPrimeNumber
 * JD-Core Version:    0.6.2
 */