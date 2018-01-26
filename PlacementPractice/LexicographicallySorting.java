/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class LexicographicallySorting
/*    */ {
/*    */   public static int compare(int first, int second)
/*    */   {
/*  8 */     return String.valueOf(first).compareTo(String.valueOf(second));
/*    */   }
/*    */ 
/*    */   public static void PrintLexicographically(int[] arr, int beg, int end)
/*    */   {
/* 13 */     if (beg >= end) {
/* 14 */       return;
/*    */     }
/* 16 */     PrintLexicographically(arr, beg + 1, end);
/* 17 */     if (compare(arr[beg], arr[(beg + 1)]) > 0) {
/* 18 */       PrintLexicographically(arr, beg + 1, end);
/*    */     }
/*    */     else {
/* 21 */       int temp = arr[beg];
/* 22 */       arr[beg] = arr[(beg + 1)];
/* 23 */       arr[(beg + 1)] = arr[temp];
/* 24 */       PrintLexicographically(arr, beg + 1, end);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 30 */     Scanner s = new Scanner(System.in);
/* 31 */     int N = s.nextInt();
/* 32 */     int[] arr = new int[N];
/* 33 */     for (int i = 0; i < N; i++) {
/* 34 */       arr[i] = i;
/*    */     }
/* 36 */     PrintLexicographically(arr, 0, N - 1);
/* 37 */     for (int i = 0; i < N; i++)
/* 38 */       System.out.print(arr[i] + " ");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.LexicographicallySorting
 * JD-Core Version:    0.6.2
 */