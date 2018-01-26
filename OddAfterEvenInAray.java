/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class OddAfterEvenInAray
/*    */ {
/*    */   public static int[] OddAfterEven(int[] A)
/*    */   {
/*  7 */     int begIndex = 0;
/*  8 */     int endIndex = A.length - 1;
/*  9 */     while (begIndex < endIndex) {
/* 10 */       if ((A[begIndex] % 2 != 0) && (A[endIndex] % 2 == 0)) {
/* 11 */         begIndex++;
/* 12 */         endIndex--;
/*    */       }
/* 14 */       else if ((A[begIndex] % 2 != 0) && (A[endIndex] % 2 != 0)) {
/* 15 */         begIndex++;
/*    */       }
/* 17 */       else if ((A[begIndex] % 2 == 0) && (A[endIndex] % 2 != 0)) {
/* 18 */         int temp = A[begIndex];
/* 19 */         A[begIndex] = A[endIndex];
/* 20 */         A[endIndex] = temp;
/* 21 */         begIndex++;
/* 22 */         endIndex--;
/*    */       }
/*    */       else {
/* 25 */         endIndex--;
/*    */       }
/*    */     }
/* 28 */     return A;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 34 */     Scanner s = new Scanner(System.in);
/* 35 */     System.out.println("Enter the number of elements:");
/* 36 */     int n = s.nextInt();
/* 37 */     int[] A = new int[n];
/* 38 */     for (int i = 0; i < n; i++) {
/* 39 */       A[i] = s.nextInt();
/*    */     }
/* 41 */     System.out.println("Initial array is:");
/* 42 */     for (int i = 0; i < n; i++) {
/* 43 */       System.out.print(A[i] + " ");
/*    */     }
/* 45 */     int[] B = OddAfterEven(A);
/* 46 */     System.out.println("After change array is:");
/* 47 */     for (int i = 0; i < B.length; i++)
/* 48 */       System.out.print(B[i] + " ");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     OddAfterEvenInAray
 * JD-Core Version:    0.6.2
 */