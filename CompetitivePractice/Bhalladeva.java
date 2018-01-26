/*    */ package CompetitivePractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Arrays;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Bhalladeva
/*    */ {
/*    */   public static int[] min_num_of_nimbdas(int[] goldPlates, int[] k_array)
/*    */   {
/* 13 */     Arrays.sort(goldPlates);
/* 14 */     int k = 0;
/* 15 */     int[] nimbdas = new int[k_array.length];
/*    */ 
/* 17 */     for (int l = 0; l < k_array.length; l++) {
/* 18 */       int num = k_array[l];
/* 19 */       int sum = 0;
/* 20 */       if (num == 0)
/*    */       {
/* 22 */         for (int m = 0; m < goldPlates.length; m++) {
/* 23 */           sum += goldPlates[m];
/*    */         }
/* 25 */         nimbdas[(k++)] = sum;
/*    */       }
/*    */       else
/*    */       {
/* 29 */         int m = 0; for (int n = goldPlates.length - num - 1; m <= n; n--)
/*    */         {
/* 31 */           if (m == n) {
/* 32 */             sum += goldPlates[m];
/*    */           }
/*    */           else
/* 35 */             sum = sum + goldPlates[m] + goldPlates[n];
/* 29 */           m++;
/*    */         }
/*    */ 
/* 38 */         nimbdas[(k++)] = sum;
/*    */       }
/*    */     }
/* 41 */     return nimbdas;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 47 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 49 */     long StartTime = System.currentTimeMillis();
/* 50 */     int num = s.nextInt();
/* 51 */     int[] goldPlates = new int[num];
/* 52 */     for (int i = 0; i < goldPlates.length; i++) {
/* 53 */       goldPlates[i] = s.nextInt();
/*    */     }
/*    */ 
/* 56 */     int Q = s.nextInt();
/* 57 */     int[] k_array = new int[Q];
/* 58 */     for (int i = 0; i < k_array.length; i++) {
/* 59 */       k_array[i] = s.nextInt();
/*    */     }
/* 61 */     int[] output = min_num_of_nimbdas(goldPlates, k_array);
/* 62 */     for (int i = 0; i < output.length; i++) {
/* 63 */       System.out.println(output[i]);
/*    */     }
/* 65 */     System.out.println((System.currentTimeMillis() - StartTime) / 1000L + " seconds");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.Bhalladeva
 * JD-Core Version:    0.6.2
 */