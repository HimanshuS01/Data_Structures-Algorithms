/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class LexiographicSubsequence
/*    */ {
/*    */   public static String[] merge(String[] inp1, String[] inp2)
/*    */   {
/*  5 */     String[] out = new String[2 * inp1.length];
/*  6 */     int i = 0; int j = 0; int k = 0;
/*    */     do {
/*  8 */       String s1 = inp1[i]; String s2 = inp2[j];
/*    */ 
/* 10 */       if (s1 == null) {
/* 11 */         out[k] = s1;
/* 12 */         i++;
/* 13 */         k++;
/*    */       }
/* 15 */       else if (s2 == null) {
/* 16 */         out[k] = s2;
/* 17 */         j++;
/* 18 */         k++;
/*    */       }
/* 20 */       else if (s1.compareTo(s2) < 0) {
/* 21 */         out[k] = s1;
/* 22 */         i++;
/* 23 */         k++;
/*    */       }
/*    */       else {
/* 26 */         out[k] = s2;
/* 27 */         j++;
/* 28 */         k++;
/*    */       }
/*  7 */       if (i >= inp1.length) break;  } while (j < inp2.length);
/*    */ 
/* 31 */     while (i < inp1.length) {
/* 32 */       out[k] = inp1[i];
/* 33 */       i++;
/* 34 */       k++;
/*    */     }
/* 36 */     while (j < inp2.length) {
/* 37 */       out[k] = inp2[j];
/* 38 */       j++;
/* 39 */       k++;
/*    */     }
/* 41 */     return out;
/*    */   }
/*    */ 
/*    */   public static String[] subSequences(String s) {
/* 45 */     if (s.length() == 0) {
/* 46 */       String[] output = new String[1];
/* 47 */       output[0] = "";
/* 48 */       return output;
/*    */     }
/* 50 */     String[] add = subSequences(s.substring(1));
/* 51 */     String[] ans1 = new String[add.length];
/* 52 */     String[] ans2 = new String[add.length];
/* 53 */     for (int i = 0; i < add.length; i++) {
/* 54 */       ans1[i] = (s.charAt(0) + add[i]);
/* 55 */       ans2[i] = add[i];
/*    */     }
/* 57 */     String[] ans = merge(ans1, ans2);
/* 58 */     return ans;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 63 */     Scanner s = new Scanner(System.in);
/* 64 */     int T = s.nextInt();
/* 65 */     for (int t = 0; t < T; t++) {
/* 66 */       String input = s.next();
/* 67 */       String[] result = subSequences(input);
/* 68 */       for (int i = 0; i < result.length; i++)
/* 69 */         System.out.println(result[i]);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     LexiographicSubsequence
 * JD-Core Version:    0.6.2
 */