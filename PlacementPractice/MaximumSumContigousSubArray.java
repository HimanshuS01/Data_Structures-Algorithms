/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class MaximumSumContigousSubArray
/*    */ {
/*    */   public static int getMaxContigousSum(int[] arr)
/*    */   {
/* 12 */     int sum = arr[0];
/* 13 */     for (int i = 0; i < arr.length; i++) {
/* 14 */       int x = 0;
/* 15 */       for (int j = i + 1; j < arr.length; j++) {
/* 16 */         x += arr[j];
/* 17 */         if (x + arr[i] > sum) {
/* 18 */           sum = x + arr[i];
/*    */         }
/*    */       }
/*    */     }
/* 22 */     return sum;
/*    */   }
/*    */ 
/*    */   public static int GetMissingNumber(int[] arr)
/*    */   {
/* 28 */     int missingNumber = 0;
/* 29 */     for (int i = 0; i < arr.length - 1; i++) {
/* 30 */       if (arr[i] + 1 != arr[(i + 1)]) {
/* 31 */         missingNumber = arr[i] + 1;
/* 32 */         return missingNumber;
/*    */       }
/*    */     }
/* 35 */     return arr[(arr.length - 2)] + 1;
/*    */   }
/*    */ 
/*    */   public static void GetMaxSubarraySumHavingNegativeNumbers(int[] arr)
/*    */   {
/* 42 */     HashMap map = new HashMap();
/* 43 */     int currentsum = 0; int k = -10;
/* 44 */     for (int i = 0; i < arr.length; i++)
/*    */     {
/* 46 */       currentsum += arr[i];
/*    */ 
/* 48 */       if (currentsum == k) {
/* 49 */         System.out.println("begIndex 0endIndex " + i);
/* 50 */         break;
/*    */       }
/*    */ 
/* 53 */       if (map.containsKey(Integer.valueOf(currentsum - k))) {
/* 54 */         System.out.println("begIndex " + (((Integer)map.get(Integer.valueOf(currentsum - k))).intValue() + 1) + "endIndex " + i);
/* 55 */         break;
/*    */       }
/* 57 */       map.put(Integer.valueOf(currentsum), Integer.valueOf(i));
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void getOutput(StringBuffer str)
/*    */   {
/* 64 */     if (str.length() == 0) {
/* 65 */       return;
/*    */     }
/* 67 */     if ((str.length() == 1) || (str.length() == 2)) {
/* 68 */       System.out.println(str);
/*    */     }
/*    */     else {
/* 71 */       int ans = 0;
/* 72 */       if (str.charAt(1) == 'A') {
/* 73 */         ans = Character.getNumericValue(str.charAt(0)) & Character.getNumericValue(str.charAt(2));
/*    */       }
/* 75 */       else if (str.charAt(1) == 'B') {
/* 76 */         ans = Character.getNumericValue(str.charAt(0)) | Character.getNumericValue(str.charAt(2));
/*    */       }
/* 78 */       else if (str.charAt(1) == 'C') {
/* 79 */         ans = Character.getNumericValue(str.charAt(0)) ^ Character.getNumericValue(str.charAt(2));
/*    */       }
/* 81 */       str.replace(0, 3, ans);
/* 82 */       getOutput(str);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 93 */     String str = "1A0B0C1A";
/* 94 */     StringBuffer sb = new StringBuffer(str);
/* 95 */     getOutput(sb);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.MaximumSumContigousSubArray
 * JD-Core Version:    0.6.2
 */