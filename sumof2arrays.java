/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class sumof2arrays
/*    */ {
/*    */   public static void PrintSum(int[] A, int[] B)
/*    */   {
/*  6 */     int[] C = new int[A.length + 1];
/*  7 */     int carry = 0;
/*  8 */     for (int i = A.length - 1; i >= 0; i--)
/*    */     {
/* 10 */       C[(i + 1)] = (A[i] + B[i] + carry);
/* 11 */       carry = C[(i + 1)] / 10;
/* 12 */       C[(i + 1)] %= 10;
/*    */     }
/* 14 */     C[0] = carry;
/* 15 */     for (int i = 0; i < A.length + 1; i++)
/* 16 */       System.out.print(C[i] + " ");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 22 */     Scanner s = new Scanner(System.in);
/* 23 */     System.out.println("Enter the number of elements of both the Array");
/* 24 */     int n = s.nextInt();
/* 25 */     int[] A = new int[n];
/* 26 */     int[] B = new int[n];
/* 27 */     for (int i = 0; i < n; i++) {
/* 28 */       System.out.println("Enter the next number 1st array :");
/* 29 */       A[i] = s.nextInt();
/*    */     }
/* 31 */     for (int i = 0; i < n; i++) {
/* 32 */       System.out.println("Enter the next number of 2nd array:");
/* 33 */       B[i] = s.nextInt();
/*    */     }
/* 35 */     PrintSum(A, B);
/*    */ 
/* 37 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     sumof2arrays
 * JD-Core Version:    0.6.2
 */