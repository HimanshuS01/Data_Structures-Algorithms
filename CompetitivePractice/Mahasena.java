/*    */ package CompetitivePractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Mahasena
/*    */ {
/*    */   public static boolean isBattlePossible(int[] weapons)
/*    */   {
/*  9 */     if (weapons.length == 0) {
/* 10 */       return false;
/*    */     }
/*    */ 
/* 13 */     int count_of_even_weapons = 0; int count_of_odd_weapons = 0;
/* 14 */     for (int i = 0; i < weapons.length; i++) {
/* 15 */       if (weapons[i] % 2 == 0) {
/* 16 */         count_of_even_weapons++;
/*    */       }
/*    */       else {
/* 19 */         count_of_odd_weapons++;
/*    */       }
/*    */     }
/* 22 */     if (count_of_even_weapons > count_of_odd_weapons) {
/* 23 */       return true;
/*    */     }
/*    */ 
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 32 */     Scanner s = new Scanner(System.in);
/* 33 */     System.out.println("Enter the number of soldiers");
/* 34 */     int num = s.nextInt();
/* 35 */     int[] weapons = new int[num];
/* 36 */     System.out.println("Enter their weapons number");
/* 37 */     for (int i = 0; i < weapons.length; i++) {
/* 38 */       weapons[i] = s.nextInt();
/*    */     }
/* 40 */     if (isBattlePossible(weapons)) {
/* 41 */       System.out.println("READY FOR BATTLE");
/*    */     }
/*    */     else
/* 44 */       System.out.println("NOT READY");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.Mahasena
 * JD-Core Version:    0.6.2
 */