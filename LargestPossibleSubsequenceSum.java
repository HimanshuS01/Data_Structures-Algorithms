/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class LargestPossibleSubsequenceSum
/*    */ {
/*    */   public static int[][] Subsets(int[] input, int begin)
/*    */   {
/*  7 */     if (begin >= input.length) {
/*  8 */       int[][] output = new int[1][0];
/*  9 */       return output;
/*    */     }
/*    */ 
/* 12 */     int[][] smallerOutput = Subsets(input, begin + 1);
/* 13 */     int[][] output = new int[(int)Math.pow(2.0D, input.length - begin)][input.length - begin];
/*    */ 
/* 15 */     for (int i = 0; i < smallerOutput.length; i++) {
/* 16 */       for (int j = 0; j < smallerOutput[i].length; j++) {
/* 17 */         output[(2 * i)][j] = smallerOutput[i][j];
/* 18 */         output[(2 * i + 1)][(j + 1)] = smallerOutput[i][j];
/*    */       }
/* 20 */       output[(2 * i + 1)][0] = input[begin];
/*    */     }
/* 22 */     return output;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 27 */     Scanner s = new Scanner(System.in);
/* 28 */     System.out.print("Enter the number of elements");
/* 29 */     int n = s.nextInt();
/* 30 */     int[] A = new int[n];
/* 31 */     System.out.println("Enter the array elements");
/* 32 */     for (int i = 0; i < A.length; i++) {
/* 33 */       A[i] = s.nextInt();
/*    */     }
/* 35 */     int beg = 0;
/* 36 */     int[][] output = Subsets(A, beg);
/* 37 */     for (int i = 0; i < output.length; i++) {
/* 38 */       for (int j = 0; j < output[i].length; j++) {
/* 39 */         System.out.print(output[i][j] + " ");
/*    */       }
/* 41 */       System.out.println();
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     LargestPossibleSubsequenceSum
 * JD-Core Version:    0.6.2
 */