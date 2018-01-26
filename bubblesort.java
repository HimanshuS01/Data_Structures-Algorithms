/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class bubblesort
/*    */ {
/*    */   public static void BubbleSort(int[] A, int endIndex)
/*    */   {
/*  7 */     if (endIndex == 0) {
/*  8 */       return;
/*    */     }
/* 10 */     for (int i = 0; i < endIndex; i++) {
/* 11 */       if (A[i] > A[(i + 1)]) {
/* 12 */         int temp = A[i];
/* 13 */         A[i] = A[(i + 1)];
/* 14 */         A[(i + 1)] = temp;
/*    */       }
/*    */     }
/*    */ 
/* 18 */     BubbleSort(A, endIndex - 1);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 24 */     Scanner s = new Scanner(System.in);
/* 25 */     System.out.println("Enter the number of elements");
/* 26 */     int n = s.nextInt();
/* 27 */     int[] input = new int[n];
/* 28 */     for (int i = 0; i < input.length; i++) {
/* 29 */       input[i] = s.nextInt();
/*    */     }
/*    */ 
/* 32 */     int endIndex = input.length - 1;
/* 33 */     BubbleSort(input, endIndex);
/*    */ 
/* 35 */     for (int i = 0; i < input.length; i++) {
/* 36 */       System.out.print(input[i] + " ");
/*    */     }
/* 38 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     bubblesort
 * JD-Core Version:    0.6.2
 */