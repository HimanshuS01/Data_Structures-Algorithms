/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Findminelement
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner s = new Scanner(System.in);
/*  9 */     System.out.println("Enter the  number of elements");
/* 10 */     int n = s.nextInt();
/* 11 */     int[] A = new int[n];
/* 12 */     for (int i = 0; i < n; i++) {
/* 13 */       System.out.println("Enter the  next number");
/* 14 */       A[i] = s.nextInt();
/*    */     }
/* 16 */     int min = A[0];
/* 17 */     int position = 0;
/* 18 */     for (int i = 0; i < A.length; i++) {
/* 19 */       if (A[i] < min) {
/* 20 */         min = A[i];
/* 21 */         position = i;
/*    */       }
/*    */     }
/* 24 */     System.out.println(min + " " + (position + 1));
/* 25 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Findminelement
 * JD-Core Version:    0.6.2
 */