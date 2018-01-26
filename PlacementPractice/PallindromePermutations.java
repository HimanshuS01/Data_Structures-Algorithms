/*    */ package PlacementPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class PallindromePermutations
/*    */ {
/*    */   public static boolean isPallindromePermutations(String str)
/*    */   {
/*  7 */     int[] table = getCharacterFrequency(str);
/*  8 */     return CheckAtMostOneOdd(table);
/*    */   }
/*    */ 
/*    */   public static boolean CheckAtMostOneOdd(int[] table)
/*    */   {
/* 13 */     int countOdd = 0;
/* 14 */     int[] arrayOfInt = table; int j = table.length; for (int i = 0; i < j; i++) { int count = arrayOfInt[i];
/*    */ 
/* 16 */       if (count % 2 == 1) {
/* 17 */         countOdd++;
/*    */       }
/* 20 */       else if (count != 0) {
/* 21 */         countOdd--;
/*    */       }
/*    */     }
/*    */ 
/* 25 */     return countOdd <= 1;
/*    */   }
/*    */ 
/*    */   public static int getCharValue(char c) {
/* 29 */     int a = Character.getNumericValue('a');
/* 30 */     int z = Character.getNumericValue('z');
/* 31 */     int val = Character.getNumericValue(c);
/* 32 */     if ((val >= a) && (val <= z)) {
/* 33 */       return val - a;
/*    */     }
/*    */ 
/* 36 */     return -1;
/*    */   }
/*    */ 
/*    */   public static int[] getCharacterFrequency(String str)
/*    */   {
/* 42 */     int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
/*    */ 
/* 44 */     for (char c : str.toCharArray())
/*    */     {
/* 46 */       int charValue = getCharValue(c);
/*    */ 
/* 48 */       if (charValue != -1) {
/* 49 */         table[charValue] += 1;
/*    */       }
/*    */     }
/* 52 */     return table;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 64 */     String str = "tact coa";
/* 65 */     boolean result = isPallindromePermutations(str);
/* 66 */     System.out.println(result);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.PallindromePermutations
 * JD-Core Version:    0.6.2
 */