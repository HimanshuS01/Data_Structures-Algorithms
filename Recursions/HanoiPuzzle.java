/*    */ package Recursions;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class HanoiPuzzle
/*    */ {
/*    */   public static void Tower_of_Hanoi(int n, String pole1, String pole2, String pole3)
/*    */   {
/*  8 */     if (n == 0) {
/*  9 */       return;
/*    */     }
/* 11 */     if (n == 1) {
/* 12 */       System.out.println("Disc is transfer from " + pole1 + " to " + pole3);
/* 13 */       return;
/*    */     }
/* 15 */     Tower_of_Hanoi(n - 1, pole1, pole3, pole2);
/* 16 */     System.out.println("Transfer disc from " + pole1 + " to " + pole3);
/* 17 */     Tower_of_Hanoi(n - 1, pole2, pole1, pole3);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 23 */     Scanner s = new Scanner(System.in);
/* 24 */     System.out.println("Enter the number of discs");
/* 25 */     int n = s.nextInt();
/* 26 */     String S1 = "Pillar1";
/* 27 */     String S2 = "Pillar2";
/* 28 */     String S3 = "Pillar3";
/* 29 */     Tower_of_Hanoi(n, S1, S2, S3);
/* 30 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.HanoiPuzzle
 * JD-Core Version:    0.6.2
 */