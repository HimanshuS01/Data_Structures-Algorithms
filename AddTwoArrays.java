/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class AddTwoArrays
/*    */ {
/*    */   public static void sumofarrays(int[] a, int[] b)
/*    */   {
/*  7 */     int sum = 0;
/*  8 */     int carry = 0;
/*  9 */     int i = a.length - 1;
/* 10 */     int j = b.length - 1;
/*    */     int[] c;
/*    */     int[] c;
/* 11 */     if (a.length > b.length) {
/* 12 */       c = new int[a.length + 1];
/*    */     }
/*    */     else {
/* 15 */       c = new int[b.length + 1];
/*    */     }
/* 17 */     int k = c.length - 1;
/* 18 */     while ((i >= 0) && (j >= 0)) {
/* 19 */       sum = carry + a[i] + b[j];
/* 20 */       c[k] = (sum % 10);
/* 21 */       carry = sum / 10;
/* 22 */       k--;
/* 23 */       i--;
/* 24 */       j--;
/*    */     }
/* 26 */     for (int m = 0; m < c.length; m++)
/* 27 */       System.out.print(c[m] + " ");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 34 */     Scanner s = new Scanner(System.in);
/* 35 */     System.out.print("Enter the  elements in first array");
/* 36 */     int n = s.nextInt();
/* 37 */     int[] a = new int[n];
/* 38 */     for (int i = 0; i < a.length; i++) {
/* 39 */       a[i] = s.nextInt();
/*    */     }
/* 41 */     System.out.print("Enter the elements in second array");
/* 42 */     int m = s.nextInt();
/* 43 */     int[] b = new int[m];
/* 44 */     for (int j = 0; j < b.length; j++) {
/* 45 */       b[j] = s.nextInt();
/*    */     }
/* 47 */     sumofarrays(a, b);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     AddTwoArrays
 * JD-Core Version:    0.6.2
 */