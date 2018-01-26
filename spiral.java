/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class spiral
/*    */ {
/*    */   public static void Spiral(int[][] a, int r, int c, int r1, int c1, int size, int count)
/*    */   {
/*  7 */     if (a.length == 0) {
/*  8 */       return;
/*    */     }
/* 10 */     for (int i = c1; i < c; i++) {
/* 11 */       System.out.print(a[r1][i] + " ");
/* 12 */       count++;
/* 13 */       if (count >= size) {
/* 14 */         return;
/*    */       }
/*    */     }
/* 17 */     for (int i = r1; i < r; i++) {
/* 18 */       System.out.print(a[i][c] + " ");
/* 19 */       count++;
/* 20 */       if (count >= size) {
/* 21 */         return;
/*    */       }
/*    */     }
/* 24 */     for (int i = c - 1; i > c1; i--) {
/* 25 */       System.out.print(a[r][i] + " ");
/* 26 */       count++;
/* 27 */       if (count >= size) {
/* 28 */         return;
/*    */       }
/*    */     }
/* 31 */     for (int i = r - 1; i > c; i--) {
/* 32 */       System.out.print(a[i][c1] + " ");
/* 33 */       count++;
/* 34 */       if (count >= size) {
/* 35 */         return;
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 40 */     Spiral(a, r1 + 1, c1 + 1, r - 1, c - 1, size, count);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 47 */     Scanner s = new Scanner(System.in);
/* 48 */     System.out.println("Enter the number of rows");
/* 49 */     int r = s.nextInt();
/* 50 */     System.out.println("Enter number of columns");
/* 51 */     int c = s.nextInt();
/* 52 */     int[][] a = new int[r][c];
/* 53 */     for (int i = 0; i < a.length; i++) {
/* 54 */       for (int j = 0; j < a[i].length; j++) {
/* 55 */         a[i][j] = s.nextInt();
/*    */       }
/*    */     }
/*    */ 
/* 59 */     System.out.println("Array before interchange is:");
/* 60 */     for (int i = 0; i < a.length; i++) {
/* 61 */       for (int j = 0; j < a[i].length; j++) {
/* 62 */         System.out.print(a[i][j]);
/*    */       }
/* 64 */       System.out.print("\n");
/*    */     }
/* 66 */     int size = r * c;
/* 67 */     int count = 0; int r1 = 0; int c1 = 0;
/* 68 */     Spiral(a, r1, c1, r - 1, c - 1, size, count);
/* 69 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     spiral
 * JD-Core Version:    0.6.2
 */