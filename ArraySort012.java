/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ArraySort012
/*    */ {
/*    */   public static void Array_Sort(int[] A)
/*    */   {
/*  6 */     int count_zeroes = 0; int count_one = 0; int count_two = 0;
/*  7 */     for (int i = 0; i < A.length; i++) {
/*  8 */       if (A[i] == 0) {
/*  9 */         count_zeroes++;
/*    */       }
/* 11 */       else if (A[i] == 1) {
/* 12 */         count_one++;
/*    */       }
/*    */       else {
/* 15 */         count_two++;
/*    */       }
/*    */     }
/*    */ 
/* 19 */     int[] output = new int[A.length];
/* 20 */     int k = 0;
/* 21 */     for (int i1 = 0; i1 < count_zeroes; i1++) {
/* 22 */       output[k] = 0;
/* 23 */       k++;
/*    */     }
/* 25 */     for (int i1 = 0; i1 < count_one; i1++) {
/* 26 */       output[k] = 1;
/* 27 */       k++;
/*    */     }
/* 29 */     for (int i1 = 0; i1 < count_two; i1++) {
/* 30 */       output[k] = 2;
/* 31 */       k++;
/*    */     }
/* 33 */     for (int j = 0; j < output.length; j++)
/* 34 */       System.out.print(output[j] + " ");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 41 */     Scanner s = new Scanner(System.in);
/* 42 */     System.out.println("Enter the  number of elements");
/* 43 */     int n = s.nextInt();
/* 44 */     int[] A = new int[n];
/* 45 */     for (int i = 0; i < n; i++) {
/* 46 */       System.out.println("Enter the  next number");
/* 47 */       A[i] = s.nextInt();
/*    */     }
/*    */ 
/* 50 */     System.out.println("Array before change is");
/* 51 */     for (int i = 0; i < n; i++) {
/* 52 */       System.out.print(A[i] + " ");
/*    */     }
/* 54 */     System.out.println();
/*    */ 
/* 56 */     System.out.println("Array after sort is");
/* 57 */     Array_Sort(A);
/*    */ 
/* 59 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ArraySort012
 * JD-Core Version:    0.6.2
 */