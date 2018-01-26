/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class IntersectionInArray
/*    */ {
/*    */   public static void Intersection(int[] A, int[] B)
/*    */   {
/* 11 */     System.out.println("Common elements from both the arrays are:");
/* 12 */     for (int i = 0; i < A.length; i++)
/* 13 */       for (int j = 0; j < B.length; j++)
/* 14 */         if (A[i] == B[j])
/* 15 */           System.out.print(A[i] + " ");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 23 */     System.out.println("Enter the number of elements of both the arrays:");
/* 24 */     Scanner s = new Scanner(System.in);
/* 25 */     int n = s.nextInt();
/* 26 */     int[] A = new int[n];
/* 27 */     int[] B = new int[n];
/* 28 */     System.out.println("Elements of array 1");
/* 29 */     for (int i = 0; i < A.length; i++) {
/* 30 */       A[i] = s.nextInt();
/*    */     }
/* 32 */     System.out.println("Elements of array 2");
/* 33 */     for (int j = 0; j < B.length; j++) {
/* 34 */       B[j] = s.nextInt();
/*    */     }
/* 36 */     Intersection(A, B);
/*    */ 
/* 38 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     IntersectionInArray
 * JD-Core Version:    0.6.2
 */