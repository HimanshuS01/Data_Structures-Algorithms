/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class ScanArrayZeroOneTwo
/*    */ {
/*    */   public static void swap(int[] A, int number1, int number2)
/*    */   {
/*  6 */     int temp = A[number1];
/*  7 */     A[number1] = A[number2];
/*  8 */     A[number2] = temp;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 13 */     int[] A = { 1, 0, 2, 1, 2, 0, 1 };
/* 14 */     int beg = 0; int med = 0; int end = A.length - 1;
/* 15 */     while (med <= end) {
/* 16 */       if (A[med] == 0) {
/* 17 */         swap(A, beg, med);
/* 18 */         beg++;
/* 19 */         med++;
/*    */       }
/* 21 */       else if (A[med] == 1) {
/* 22 */         med++;
/*    */       }
/* 24 */       else if (A[med] == 2) {
/* 25 */         swap(A, med, end);
/* 26 */         end--;
/*    */       }
/*    */     }
/* 29 */     for (int i = 0; i < A.length; i++)
/* 30 */       System.out.print(A[i] + " ");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ScanArrayZeroOneTwo
 * JD-Core Version:    0.6.2
 */