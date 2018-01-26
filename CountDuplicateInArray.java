/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class CountDuplicateInArray
/*    */ {
/*    */   public static void Count_Duplicate(int[] A)
/*    */   {
/*  6 */     int count = 0;
/*    */ 
/*  8 */     for (int i = 0; i < A.length; i++)
/*  9 */       for (int j = i + 1; j < A.length; j++)
/* 10 */         if (A[i] == A[j]) {
/* 11 */           count++;
/* 12 */           if (count >= 1)
/* 13 */             System.out.print(A[i] + ",");
/*    */         }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 23 */     Scanner s = new Scanner(System.in);
/* 24 */     System.out.println("Enter the  number of elements");
/* 25 */     int n = s.nextInt();
/* 26 */     int[] A = new int[n];
/* 27 */     for (int i = 0; i < n; i++) {
/* 28 */       System.out.println("Enter the  next number");
/* 29 */       A[i] = s.nextInt();
/*    */     }
/*    */ 
/* 32 */     System.out.println("Given Array is:");
/* 33 */     for (int i = 0; i < n; i++) {
/* 34 */       System.out.print(A[i] + " ");
/*    */     }
/* 36 */     System.out.println();
/*    */ 
/* 38 */     System.out.println("Number of repeated elements in an Array atleast once are:");
/* 39 */     Count_Duplicate(A);
/* 40 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CountDuplicateInArray
 * JD-Core Version:    0.6.2
 */