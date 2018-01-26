/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class sumofarrays1
/*    */ {
/*    */   public static void PrintSum(int[] A, int[] B)
/*    */   {
/*    */     int size3;
/*    */     int size3;
/*  7 */     if (A.length < B.length) {
/*  8 */       size3 = B.length + 1;
/*    */     }
/*    */     else
/*    */     {
/* 12 */       size3 = A.length + 1;
/*    */     }
/* 14 */     int[] C = new int[size3];
/* 15 */     int carry = 0;
/* 16 */     if (A.length > B.length) {
/* 17 */       size3 = A.length + 1;
/* 18 */       for (int i = size3 - 2; i >= B.length - 1; i--)
/*    */       {
/* 20 */         C[(i + 1)] = (A[i] + B[(i - B.length + 1)] + carry);
/* 21 */         carry = C[(i + 1)] / 10;
/* 22 */         C[(i + 1)] %= 10;
/*    */       }
/*    */     }
/*    */ 
/* 26 */     for (int i = A.length - B.length - 1; i >= 0; i--) {
/* 27 */       C[(i + 1)] = (A[i] + carry);
/* 28 */       carry = C[(i + 1)] / 10;
/* 29 */       C[(i + 1)] %= 10;
/*    */     }
/*    */ 
/* 32 */     for (int i = 0; i < A.length + 1; i++)
/* 33 */       System.out.print(C[i] + " ");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 40 */     Scanner s = new Scanner(System.in);
/* 41 */     System.out.println("Enter the number of elements  Array 1");
/* 42 */     int size1 = s.nextInt();
/* 43 */     int[] A = new int[size1];
/* 44 */     System.out.println("Enter the number of elements  Array 2");
/* 45 */     int size2 = s.nextInt();
/* 46 */     int[] B = new int[size2];
/* 47 */     for (int i = 0; i < size1; i++) {
/* 48 */       System.out.println("Enter the next number 1st array :");
/* 49 */       A[i] = s.nextInt();
/*    */     }
/* 51 */     for (int i = 0; i < size2; i++) {
/* 52 */       System.out.println("Enter the next number of 2nd array:");
/* 53 */       B[i] = s.nextInt();
/*    */     }
/*    */ 
/* 56 */     if (A.length > B.length)
/*    */     {
/* 58 */       PrintSum(A, B);
/*    */     }
/*    */     else
/*    */     {
/* 63 */       PrintSum(B, A);
/*    */     }
/*    */ 
/* 66 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     sumofarrays1
 * JD-Core Version:    0.6.2
 */