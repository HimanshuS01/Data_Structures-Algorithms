/*     */ package Recursions;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class patterns
/*     */ {
/*     */   public static void pattern1(String[] args)
/*     */   {
/*   7 */     System.out.println("Enter the number of rows");
/*   8 */     Scanner s = new Scanner(System.in);
/*   9 */     int r = s.nextInt();
/*  10 */     int x = r;
/*  11 */     for (int i = 0; i < r; i++) {
/*  12 */       for (int j = 0; j <= i; j++) {
/*  13 */         System.out.print(x);
/*     */       }
/*  15 */       System.out.print("\n");
/*  16 */       x--;
/*  17 */       s.close();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void pattern(String[] args)
/*     */   {
/*  23 */     System.out.println("Enter the number of rows");
/*  24 */     Scanner s = new Scanner(System.in);
/*  25 */     int r = s.nextInt();
/*  26 */     for (int i = 0; i < r; i++) {
/*  27 */       System.out.print((int)Math.pow(11.0D, i) + "\n");
/*     */     }
/*  29 */     s.close();
/*     */   }
/*     */ 
/*     */   public static void pattern3(String[] args)
/*     */   {
/*  34 */     System.out.print("Enter the number of rows");
/*  35 */     Scanner s = new Scanner(System.in);
/*  36 */     int n = s.nextInt();
/*  37 */     int row_value = 1;
/*  38 */     while (row_value <= 2) {
/*  39 */       int next_value = 1;
/*  40 */       int next_column = 1;
/*  41 */       while (next_column <= row_value) {
/*  42 */         System.out.print(next_value);
/*  43 */         next_column++;
/*     */       }
/*  45 */       row_value++;
/*  46 */       System.out.print("\n");
/*     */     }
/*     */ 
/*  49 */     row_value = 3;
/*  50 */     while (row_value <= n) {
/*  51 */       int next_column = 1;
/*  52 */       int next_value = 1;
/*  53 */       System.out.print(next_value);
/*  54 */       next_column = 1;
/*  55 */       while (next_column <= row_value - 2) {
/*  56 */         next_value = 0;
/*  57 */         System.out.print(next_value);
/*  58 */         next_column++;
/*     */       }
/*     */ 
/*  61 */       next_column = 1;
/*  62 */       next_value = 1;
/*  63 */       System.out.print(next_value);
/*  64 */       row_value++;
/*  65 */       System.out.print("\n");
/*     */     }
/*  67 */     s.close();
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  72 */     System.out.print("Enter the number of rows");
/*  73 */     Scanner s = new Scanner(System.in);
/*  74 */     int n = s.nextInt();
/*  75 */     int row_value = 1;
/*  76 */     while (row_value <= 2) {
/*  77 */       int next_value = 1;
/*  78 */       int next_column = 1;
/*  79 */       while (next_column <= row_value) {
/*  80 */         System.out.print(next_value);
/*  81 */         next_column++;
/*     */       }
/*  83 */       row_value++;
/*  84 */       System.out.print("\n");
/*     */     }
/*     */ 
/*  87 */     row_value = 3;
/*  88 */     while (row_value <= n) {
/*  89 */       int next_column = 1;
/*  90 */       int next_value = row_value - 1;
/*  91 */       System.out.print(next_value);
/*  92 */       next_column = 1;
/*  93 */       while (next_column <= row_value - 2) {
/*  94 */         next_value = 0;
/*  95 */         System.out.print(next_value);
/*  96 */         next_column++;
/*     */       }
/*     */ 
/*  99 */       next_column = 1;
/* 100 */       next_value = row_value - 1;
/* 101 */       System.out.print(next_value);
/* 102 */       row_value++;
/* 103 */       System.out.print("\n");
/*     */     }
/* 105 */     s.close();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Recursions.patterns
 * JD-Core Version:    0.6.2
 */