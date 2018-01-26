/*    */ package CompetitivePractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class HouseHoldIncomeEditor
/*    */ {
/*    */   public static ArrayList<Integer> insert1(ArrayList<Integer> array, int x)
/*    */   {
/*  9 */     if (array.size() == 0) {
/* 10 */       array.add(Integer.valueOf(x));
/* 11 */       return array;
/*    */     }
/* 13 */     if (((Integer)array.get(0)).intValue() >= x) {
/* 14 */       array.add(0, Integer.valueOf(x));
/* 15 */       return array;
/*    */     }
/* 17 */     if (((Integer)array.get(array.size() - 1)).intValue() <= x) {
/* 18 */       array.add(Integer.valueOf(x));
/* 19 */       return array;
/*    */     }
/*    */ 
/* 22 */     for (int i = 0; i < array.size() - 1; i++) {
/* 23 */       if ((((Integer)array.get(i)).intValue() < x) && (((Integer)array.get(i + 1)).intValue() >= x))
/*    */         break;
/*    */     }
/* 26 */     array.add(i + 1, Integer.valueOf(x));
/* 27 */     return array;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 31 */     Scanner s = new Scanner(System.in);
/* 32 */     int n = s.nextInt();
/* 33 */     ArrayList input = new ArrayList();
/* 34 */     ArrayList out = new ArrayList();
/* 35 */     for (int i = 0; i < n; i++) {
/* 36 */       int x = s.nextInt();
/* 37 */       input.add(Integer.valueOf(x));
/* 38 */       out = insert1(out, x);
/* 39 */       int m = input.size();
/* 40 */       if (m % 2 != 0) {
/* 41 */         System.out.printf("%.2f ", new Object[] { Float.valueOf(((Integer)out.get(m / 2)).intValue()) });
/*    */       }
/*    */       else {
/* 44 */         float rs = (((Integer)out.get(m / 2)).intValue() + ((Integer)out.get(m / 2 - 1)).intValue()) / 2.0F;
/* 45 */         System.out.printf("%.2f ", new Object[] { Float.valueOf(rs) });
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.HouseHoldIncomeEditor
 * JD-Core Version:    0.6.2
 */