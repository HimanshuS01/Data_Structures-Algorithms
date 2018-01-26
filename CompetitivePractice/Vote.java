/*     */ package CompetitivePractice;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class Vote
/*     */ {
/*     */   public static int Fact(int length)
/*     */   {
/*  16 */     int result = 1;
/*  17 */     for (int i = length; i > 0; i--) {
/*  18 */       result *= i;
/*     */     }
/*  20 */     return result;
/*     */   }
/*     */ 
/*     */   public static String[] permutation(String N)
/*     */   {
/*  26 */     if (N.length() == 0)
/*     */     {
/*  28 */       String[] output = new String[1];
/*  29 */       output[0] = "";
/*  30 */       return output;
/*     */     }
/*  32 */     String[] SmallerOutput = permutation(N.substring(1));
/*  33 */     String CurrentPossChar = N.charAt(0);
/*  34 */     String[] output = new String[Fact(N.length())];
/*  35 */     int k = 0;
/*  36 */     for (int i = 0; i < SmallerOutput.length; i++) {
/*  37 */       for (int j = 0; j <= SmallerOutput[i].length(); j++) {
/*  38 */         output[k] = (SmallerOutput[i].substring(0, j) + CurrentPossChar + SmallerOutput[i].substring(j));
/*  39 */         k++;
/*     */       }
/*     */     }
/*     */ 
/*  43 */     return output;
/*     */   }
/*     */ 
/*     */   public static double getProbability(int N, int M, int[][] dp) {
/*  47 */     String str = "";
/*  48 */     for (int i = 0; i < N; i++) {
/*  49 */       str = str + "A";
/*     */     }
/*  51 */     for (int j = 0; j < M; j++) {
/*  52 */       str = str + "B";
/*     */     }
/*  54 */     String[] output = permutation(str);
/*     */ 
/*  56 */     int favourable = 0;
/*     */ 
/*  58 */     for (int i = 0; i < output.length; i++)
/*     */     {
/*  60 */       int countA = 0; int countB = 0;
/*     */ 
/*  62 */       if (output[i].charAt(0) != 'A') break;
/*  63 */       countA++;
/*     */ 
/*  70 */       if (countA > countB)
/*     */       {
/*  72 */         for (int j = 1; j < output[i].length(); j++)
/*     */         {
/*  74 */           if (output[i].charAt(j) == 'A') {
/*  75 */             countA++;
/*     */           }
/*     */           else
/*     */           {
/*  79 */             countB++;
/*     */ 
/*  81 */             if (countB >= countA)
/*     */             {
/*     */               break;
/*     */             }
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*  89 */         if (countA > countB) {
/*  90 */           favourable++;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  97 */     dp[N][M] = favourable;
/*     */ 
/* 101 */     double probability = favourable / output.length;
/*     */ 
/* 103 */     return probability;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 109 */     Scanner s = new Scanner(System.in);
/* 110 */     int t = s.nextInt();
/* 111 */     double[] result = new double[t];
/* 112 */     int[][] dp = new int[10][10];
/* 113 */     for (int i = 0; i < t; i++)
/*     */     {
/* 115 */       int N = s.nextInt();
/* 116 */       int M = s.nextInt();
/* 117 */       result[i] = getProbability(N, M, dp);
/*     */     }
/*     */ 
/* 120 */     for (int i = 0; i < result.length; i++) {
/* 121 */       System.out.println("Case #" + (i + 1) + ": " + result[i]);
/*     */     }
/* 123 */     s.close();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.Vote
 * JD-Core Version:    0.6.2
 */