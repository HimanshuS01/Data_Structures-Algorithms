/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class MoveZeroes
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 27 */     Scanner s = new Scanner(System.in);
/* 28 */     System.out.println("Enter the  number of elements");
/* 29 */     int n = s.nextInt();
/* 30 */     int[] A = new int[n];
/* 31 */     for (int i = 0; i < n; i++) {
/* 32 */       System.out.println("Enter the  next number");
/* 33 */       A[i] = s.nextInt();
/*    */     }
/*    */ 
/* 37 */     System.out.println("Array before change is");
/* 38 */     for (int i = 0; i < n; i++) {
/* 39 */       System.out.print(A[i] + " ");
/*    */     }
/* 41 */     System.out.println();
/*    */ 
/* 48 */     int[] output = new int[A.length];
/* 49 */     int k = 0;
/* 50 */     for (int i = 0; i < A.length; i++) {
/* 51 */       if (A[i] != 0) {
/* 52 */         output[k] = A[i];
/* 53 */         k++;
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 59 */     for (int i = 0; i < output.length; i++) {
/* 60 */       System.out.print(output[i] + " ");
/*    */     }
/*    */ 
/* 63 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.MoveZeroes
 * JD-Core Version:    0.6.2
 */