/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class waveinarray
/*    */ {
/*    */   public static void printwave(int[][] input)
/*    */   {
/*  7 */     System.out.println("Array in a wave form is:");
/*  8 */     for (int j = 0; j < input[0].length; j++)
/*  9 */       if (j % 2 == 0) {
/* 10 */         for (int i = 0; i < input.length; i++) {
/* 11 */           System.out.print(input[i][j]);
/*    */         }
/*    */       }
/*    */       else
/* 15 */         for (int i = input.length - 1; i >= 0; i--)
/* 16 */           System.out.print(input[i][j]);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 26 */     Scanner s = new Scanner(System.in);
/* 27 */     System.out.println("Enter the number of rows");
/* 28 */     int m = s.nextInt();
/* 29 */     System.out.println("Enter number of columns");
/* 30 */     int n = s.nextInt();
/* 31 */     int[][] a = new int[m][n];
/* 32 */     for (int i = 0; i < a.length; i++) {
/* 33 */       for (int j = 0; j < a[i].length; j++) {
/* 34 */         a[i][j] = s.nextInt();
/*    */       }
/*    */     }
/*    */ 
/* 38 */     System.out.println("Array before interchange is:");
/* 39 */     for (int i = 0; i < a.length; i++) {
/* 40 */       for (int j = 0; j < a[i].length; j++) {
/* 41 */         System.out.print(a[i][j]);
/*    */       }
/* 43 */       System.out.print("\n");
/*    */     }
/* 45 */     printwave(a);
/* 46 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     waveinarray
 * JD-Core Version:    0.6.2
 */