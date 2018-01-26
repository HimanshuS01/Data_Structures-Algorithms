/*    */ package CompetitivePractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class BeautifulArrays
/*    */ {
/*    */   public static boolean isBeautiful(int[] arr)
/*    */   {
/* 12 */     HashMap map = new HashMap();
/* 13 */     boolean result = false;
/* 14 */     for (int i = 0; i < arr.length; i++) {
/* 15 */       map.put(Integer.valueOf(arr[i]), Integer.valueOf(arr[i]));
/*    */     }
/*    */ 
/* 18 */     for (int j = 0; j < arr.length; j++)
/*    */     {
/* 20 */       for (int k = j + 1; k < arr.length; k++)
/*    */       {
/* 22 */         if (map.containsKey(Integer.valueOf(arr[j] * arr[k]))) {
/* 23 */           result = true;
/*    */         }
/*    */         else {
/* 26 */           result = false;
/*    */         }
/*    */       }
/*    */     }
/* 30 */     return result;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 36 */     Scanner s = new Scanner(System.in);
/*    */ 
/* 38 */     int t = s.nextInt();
/* 39 */     String[] output = new String[t];
/* 40 */     int k = 0;
/* 41 */     for (int i = 0; i < t; i++)
/*    */     {
/* 43 */       int n = s.nextInt();
/* 44 */       int[] arr = new int[n];
/*    */ 
/* 46 */       for (int j = 0; j < arr.length; j++) {
/* 47 */         arr[j] = s.nextInt();
/*    */       }
/*    */ 
/* 50 */       boolean result = isBeautiful(arr);
/* 51 */       if (result) {
/* 52 */         output[(k++)] = "yes";
/*    */       }
/*    */       else {
/* 55 */         output[(k++)] = "no";
/*    */       }
/*    */     }
/*    */ 
/* 59 */     for (int i = 0; i < output.length; i++)
/* 60 */       System.out.println(output[i]);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.BeautifulArrays
 * JD-Core Version:    0.6.2
 */