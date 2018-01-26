/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Spiral1
/*    */ {
/*    */   public static void spiralPrint(int[][] array2D)
/*    */   {
/*  5 */     if (array2D.length == 0) {
/*  6 */       return;
/*    */     }
/*    */ 
/*  9 */     int up = 0;
/* 10 */     int down = array2D.length - 1;
/* 11 */     int left = 0;
/* 12 */     int right = array2D[0].length - 1;
/* 13 */     int turn = 0;
/* 14 */     while ((up <= down) && (left <= right))
/*    */     {
/* 16 */       if (turn == 0) {
/* 17 */         for (int col = left; col <= right; col++) {
/* 18 */           System.out.println(array2D[up][col]);
/*    */         }
/* 20 */         up++;
/*    */       }
/* 22 */       if (turn == 1) {
/* 23 */         for (int row = up; row <= down; row++) {
/* 24 */           System.out.println(array2D[row][right]);
/*    */         }
/* 26 */         right--;
/*    */       }
/* 28 */       if (turn == 2) {
/* 29 */         for (int col = right; col >= left; col--) {
/* 30 */           System.out.println(array2D[down][col]);
/*    */         }
/* 32 */         down--;
/*    */       }
/* 34 */       if (turn == 3) {
/* 35 */         for (int row = down; row >= up; row--) {
/* 36 */           System.out.println(array2D[row][left]);
/*    */         }
/* 38 */         left++;
/*    */       }
/* 40 */       turn = (turn + 1) % 4;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 48 */     Scanner s = new Scanner(System.in);
/* 49 */     System.out.println("Enter number of rows");
/* 50 */     int m = s.nextInt();
/* 51 */     System.out.println("Enter number of columns");
/* 52 */     int n = s.nextInt();
/* 53 */     int[][] a = new int[m][n];
/*    */ 
/* 55 */     for (int i = 0; i < a.length; i++) {
/* 56 */       for (int j = 0; j < a[i].length; j++) {
/* 57 */         System.out.println("Enter element at " + i + " and " + j);
/* 58 */         a[i][j] = s.nextInt();
/*    */       }
/*    */     }
/* 61 */     spiralPrint(a);
/* 62 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Spiral1
 * JD-Core Version:    0.6.2
 */