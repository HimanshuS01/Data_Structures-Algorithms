/*     */ package CompetitivePractice;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Arrays;
/*     */ import java.util.InputMismatchException;
/*     */ 
/*     */ class FastInputOutput
/*     */ {
/*     */   public static int[] min_num_of_nimbdas(int[] goldPlates, int[] k_array)
/*     */   {
/*  12 */     Arrays.sort(goldPlates);
/*  13 */     int k = 0;
/*  14 */     int[] nimbdas = new int[k_array.length];
/*     */ 
/*  16 */     for (int l = 0; l < k_array.length; l++) {
/*  17 */       int num = k_array[l];
/*  18 */       int sum = 0;
/*  19 */       if (num == 0)
/*     */       {
/*  21 */         for (int m = 0; m < goldPlates.length; m++) {
/*  22 */           sum += goldPlates[m];
/*     */         }
/*  24 */         nimbdas[(k++)] = sum;
/*     */       }
/*     */       else
/*     */       {
/*  28 */         int m = 0; for (int n = goldPlates.length - num - 1; m <= n; n--)
/*     */         {
/*  30 */           if (m == n) {
/*  31 */             sum += goldPlates[m];
/*     */           }
/*     */           else
/*  34 */             sum = sum + goldPlates[m] + goldPlates[n];
/*  28 */           m++;
/*     */         }
/*     */ 
/*  37 */         nimbdas[(k++)] = sum;
/*     */       }
/*     */     }
/*  40 */     return nimbdas;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  45 */     StringBuffer output = new StringBuffer();
/*  46 */     scanner s = new scanner();
/*  47 */     long StartTime = System.currentTimeMillis();
/*     */ 
/*  49 */     int num = s.nextInt();
/*  50 */     int[] goldPlates = s.nextIntArray(num);
/*     */ 
/*  57 */     int Q = s.nextInt();
/*  58 */     int[] k_array = s.nextIntArray(Q);
/*     */ 
/*  64 */     int[] result = min_num_of_nimbdas(goldPlates, k_array);
/*  65 */     for (int i = 0; i < result.length; i++) {
/*  66 */       System.out.println(result[i]);
/*     */     }
/*  68 */     System.out.println((System.currentTimeMillis() - StartTime) / 1000L + " seconds");
/*     */   }
/*     */   static class scanner {
/*  73 */     private byte[] buf = new byte[1024];
/*     */     private int curChar;
/*     */     private int numChars;
/*     */ 
/*     */     public int read() {
/*  78 */       if (this.numChars == -1)
/*  79 */         throw new InputMismatchException();
/*  80 */       if (this.curChar >= this.numChars) {
/*  81 */         this.curChar = 0;
/*     */         try {
/*  83 */           this.numChars = System.in.read(this.buf);
/*     */         } catch (IOException e) {
/*  85 */           throw new InputMismatchException();
/*     */         }
/*  87 */         if (this.numChars <= 0)
/*  88 */           return -1;
/*     */       }
/*  90 */       return this.buf[(this.curChar++)];
/*     */     }
/*     */ 
/*     */     public String nextLine() {
/*  94 */       int c = read();
/*  95 */       while (isSpaceChar(c))
/*  96 */         c = read();
/*  97 */       StringBuilder res = new StringBuilder();
/*     */       do {
/*  99 */         res.appendCodePoint(c);
/* 100 */         c = read();
/* 101 */       }while (!isEndOfLine(c));
/* 102 */       return res.toString();
/*     */     }
/*     */ 
/*     */     public String nextString() {
/* 106 */       int c = read();
/* 107 */       while (isSpaceChar(c))
/* 108 */         c = read();
/* 109 */       StringBuilder res = new StringBuilder();
/*     */       do {
/* 111 */         res.appendCodePoint(c);
/* 112 */         c = read();
/* 113 */       }while (!isSpaceChar(c));
/* 114 */       return res.toString();
/*     */     }
/*     */ 
/*     */     public long nextLong() {
/* 118 */       int c = read();
/* 119 */       while (isSpaceChar(c))
/* 120 */         c = read();
/* 121 */       int sgn = 1;
/* 122 */       if (c == 45) {
/* 123 */         sgn = -1;
/* 124 */         c = read();
/*     */       }
/* 126 */       long res = 0L;
/*     */       do {
/* 128 */         if ((c < 48) || (c > 57))
/* 129 */           throw new InputMismatchException();
/* 130 */         res *= 10L;
/* 131 */         res += c - 48;
/* 132 */         c = read();
/* 133 */       }while (!isSpaceChar(c));
/* 134 */       return res * sgn;
/*     */     }
/*     */ 
/*     */     public int nextInt() {
/* 138 */       int c = read();
/* 139 */       while (isSpaceChar(c))
/* 140 */         c = read();
/* 141 */       int sgn = 1;
/* 142 */       if (c == 45) {
/* 143 */         sgn = -1;
/* 144 */         c = read();
/*     */       }
/* 146 */       int res = 0;
/*     */       do {
/* 148 */         if ((c < 48) || (c > 57))
/* 149 */           throw new InputMismatchException();
/* 150 */         res *= 10;
/* 151 */         res += c - 48;
/* 152 */         c = read();
/* 153 */       }while (!isSpaceChar(c));
/* 154 */       return res * sgn;
/*     */     }
/*     */ 
/*     */     public int[] nextIntArray(int n) {
/* 158 */       int[] arr = new int[n];
/* 159 */       for (int i = 0; i < n; i++) {
/* 160 */         arr[i] = nextInt();
/*     */       }
/* 162 */       return arr;
/*     */     }
/*     */ 
/*     */     public long[] nextLongArray(int n) {
/* 166 */       long[] arr = new long[n];
/* 167 */       for (int i = 0; i < n; i++) {
/* 168 */         arr[i] = nextLong();
/*     */       }
/* 170 */       return arr;
/*     */     }
/*     */ 
/*     */     private boolean isSpaceChar(int c) {
/* 174 */       return (c == 32) || (c == 10) || (c == 13) || (c == 9) || (c == -1);
/*     */     }
/*     */ 
/*     */     private boolean isEndOfLine(int c) {
/* 178 */       return (c == 10) || (c == 13) || (c == -1);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.FastInputOutput
 * JD-Core Version:    0.6.2
 */