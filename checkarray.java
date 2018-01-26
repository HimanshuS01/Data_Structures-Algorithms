/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class checkarray
/*    */ {
/*    */   public static boolean checkarray(int[] A, int x)
/*    */   {
/*  8 */     if (A.length == 0) {
/*  9 */       return false;
/*    */     }
/*    */ 
/* 12 */     if (A[0] == x) {
/* 13 */       return true;
/*    */     }
/*    */ 
/* 17 */     int[] smallerArray = new int[A.length - 1];
/* 18 */     for (int i = 1; i < A.length; i++) {
/* 19 */       smallerArray[(i - 1)] = A[i];
/*    */     }
/*    */ 
/* 22 */     boolean checkedArray = checkarray(smallerArray, x);
/* 23 */     return checkedArray;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 28 */     Scanner s = new Scanner(System.in);
/* 29 */     System.out.println("Enter the number of elements");
/* 30 */     int n = s.nextInt();
/* 31 */     int[] input = new int[n];
/* 32 */     for (int i = 0; i < input.length; i++) {
/* 33 */       input[i] = s.nextInt();
/*    */     }
/* 35 */     System.out.println("Enter the number you wants to search");
/* 36 */     int x = s.nextInt();
/* 37 */     boolean result = checkarray(input, x);
/* 38 */     if (result) {
/* 39 */       System.out.println("element found");
/*    */     }
/*    */     else
/* 42 */       System.out.println("element not found");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     checkarray
 * JD-Core Version:    0.6.2
 */