/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ArrayReverse
/*    */ {
/*    */   public static int[] reverse(int[] a)
/*    */   {
/*  6 */     int i = 0;
/*  7 */     int j = a.length - 1;
/*  8 */     while (i < j)
/*    */     {
/* 10 */       int temp = a[i];
/* 11 */       a[i] = a[j];
/* 12 */       a[j] = temp;
/* 13 */       j--;
/* 14 */       i++;
/*    */     }
/* 16 */     return a;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 22 */     Scanner s = new Scanner(System.in);
/* 23 */     System.out.print("Enter the elements of an array");
/* 24 */     int n = s.nextInt();
/* 25 */     int[] a = new int[n];
/* 26 */     for (int i = 0; i < a.length; i++) {
/* 27 */       System.out.println("Enter" + i + "elements of an array");
/* 28 */       a[i] = s.nextInt();
/*    */     }
/* 30 */     int[] b = reverse(a);
/* 31 */     for (int i = 0; i < b.length; i++)
/* 32 */       System.out.print(b[i] + " ");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ArrayReverse
 * JD-Core Version:    0.6.2
 */