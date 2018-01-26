/*     */ package CompetitivePractice;
/*     */ 
/*     */ import java.io.DataInputStream;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ public class pallin3
/*     */ {
/*   9 */   static HashMap<String, Boolean> map = new HashMap();
/*     */ 
/*     */   public static int correctprogram(String str)
/*     */   {
/* 132 */     int count = 0;
/* 133 */     int len = str.length();
/* 134 */     for (int i = 0; i < len; i++)
/*     */     {
/* 136 */       for (int j = i + 1; j <= len; j++)
/*     */       {
/* 138 */         if ((i == j - 1) && (str.charAt(i) == '0'))
/*     */         {
/* 141 */           count++;
/*     */         }
/* 144 */         else if ((checkpalindrome(str.substring(i, j))) && (isdivisible(str.substring(i, j))) && (str.charAt(i) != '0'))
/*     */         {
/* 147 */           count++;
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 153 */     return count;
/*     */   }
/*     */ 
/*     */   public static int myprogram(String str)
/*     */   {
/* 158 */     int count = 0;
/* 159 */     int len = str.length();
/* 160 */     for (int i = 0; i < len; i++)
/*     */     {
/* 163 */       for (int j = 0; (i - j >= 0) && (i + j < len); j++)
/*     */       {
/* 165 */         if (j == 0) {
/* 166 */           if (isdivisible(str.charAt(i - j)))
/*     */           {
/* 169 */             count++;
/*     */           }
/*     */ 
/*     */         }
/* 176 */         else if ((str.charAt(i - j) == str.charAt(i + j)) && (str.charAt(i - j) != '0') && (isdivisible(str.substring(i - j, i + j + 1))))
/*     */         {
/* 179 */           count++;
/*     */         }
/*     */         else
/*     */         {
/* 183 */           if (str.charAt(i - j) != str.charAt(i + j))
/*     */           {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */ 
/* 190 */       if (i != len - 1)
/*     */       {
/* 192 */         for (int j = 0; (i + j + 1 < len) && (i - j >= 0); j++)
/*     */         {
/* 194 */           if ((str.charAt(i + j + 1) == str.charAt(i - j)) && (str.charAt(i - j) != '0') && (isdivisible(str.substring(i - j, i + j + 2))))
/*     */           {
/* 199 */             count++;
/*     */           }
/*     */           else
/*     */           {
/* 203 */             if (str.charAt(i - j) != str.charAt(i + j + 1)) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 210 */     return count;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) throws IOException {
/* 214 */     Reader s = new Reader();
/* 215 */     String str = s.nextInt();
/*     */ 
/* 217 */     System.out.println(myprogram(str));
/*     */   }
/*     */ 
/*     */   public static boolean isdivisible(String substring) {
/* 221 */     if (map.containsKey(substring))
/* 222 */       return ((Boolean)map.get(substring)).booleanValue();
/* 223 */     int sum = 0;
/* 224 */     for (int i = 0; i < substring.length(); i++)
/* 225 */       sum += substring.charAt(i);
/* 226 */     boolean ans = sum % 3 == 0;
/* 227 */     map.put(substring, Boolean.valueOf(ans));
/* 228 */     return ans;
/*     */   }
/*     */ 
/*     */   public static boolean checkpalindrome(String s)
/*     */   {
/* 234 */     int n = s.length();
/* 235 */     for (int i = 0; i < n / 2; i++) {
/* 236 */       if (s.charAt(i) != s.charAt(n - i - 1)) {
/* 237 */         return false;
/*     */       }
/*     */     }
/* 240 */     return true;
/*     */   }
/*     */ 
/*     */   static class Reader
/*     */   {
/*  12 */     private final int BUFFER_SIZE = 65536;
/*     */     private DataInputStream din;
/*     */     private byte[] buffer;
/*     */     private int bufferPointer;
/*     */     private int bytesRead;
/*     */ 
/*     */     public Reader()
/*     */     {
/*  19 */       this.din = new DataInputStream(System.in);
/*  20 */       this.buffer = new byte[65536];
/*  21 */       this.bufferPointer = (this.bytesRead = 0);
/*     */     }
/*     */ 
/*     */     public Reader(String file_name) throws IOException
/*     */     {
/*  26 */       this.din = new DataInputStream(new FileInputStream(file_name));
/*  27 */       this.buffer = new byte[65536];
/*  28 */       this.bufferPointer = (this.bytesRead = 0);
/*     */     }
/*     */ 
/*     */     public String readLine() throws IOException
/*     */     {
/*  33 */       byte[] buf = new byte[64];
/*  34 */       int cnt = 0;
/*     */       int c;
/*  35 */       while ((c = read()) != -1)
/*     */       {
/*     */         int c;
/*  37 */         if (c == 10)
/*     */           break;
/*  39 */         buf[(cnt++)] = ((byte)c);
/*     */       }
/*  41 */       return new String(buf, 0, cnt);
/*     */     }
/*     */ 
/*     */     public int nextInt() throws IOException
/*     */     {
/*  46 */       int ret = 0;
/*  47 */       byte c = read();
/*  48 */       while (c <= 32)
/*  49 */         c = read();
/*  50 */       boolean neg = c == 45;
/*  51 */       if (neg) {
/*  52 */         c = read();
/*     */       }
/*     */       do
/*  55 */         ret = ret * 10 + c - 48;
/*  56 */       while (((c = read()) >= 48) && (
/*  56 */         c <= 57));
/*     */ 
/*  58 */       if (neg)
/*  59 */         return -ret;
/*  60 */       return ret;
/*     */     }
/*     */ 
/*     */     public long nextLong() throws IOException
/*     */     {
/*  65 */       long ret = 0L;
/*  66 */       byte c = read();
/*  67 */       while (c <= 32)
/*  68 */         c = read();
/*  69 */       boolean neg = c == 45;
/*  70 */       if (neg)
/*  71 */         c = read();
/*     */       do {
/*  73 */         ret = ret * 10L + c - 48L;
/*     */       }
/*  75 */       while (((c = read()) >= 48) && (
/*  75 */         c <= 57));
/*  76 */       if (neg)
/*  77 */         return -ret;
/*  78 */       return ret;
/*     */     }
/*     */ 
/*     */     public double nextDouble() throws IOException
/*     */     {
/*  83 */       double ret = 0.0D; double div = 1.0D;
/*  84 */       byte c = read();
/*  85 */       while (c <= 32)
/*  86 */         c = read();
/*  87 */       boolean neg = c == 45;
/*  88 */       if (neg) {
/*  89 */         c = read();
/*     */       }
/*     */       do {
/*  92 */         ret = ret * 10.0D + c - 48.0D;
/*     */       }
/*  94 */       while (((c = read()) >= 48) && (
/*  94 */         c <= 57));
/*     */ 
/*  96 */       if (c == 46)
/*     */       {
/*  98 */         while (((c = read()) >= 48) && (c <= 57))
/*     */         {
/* 100 */           ret += (c - 48) / (div *= 10.0D);
/*     */         }
/*     */       }
/*     */ 
/* 104 */       if (neg)
/* 105 */         return -ret;
/* 106 */       return ret;
/*     */     }
/*     */ 
/*     */     private void fillBuffer() throws IOException
/*     */     {
/* 111 */       this.bytesRead = this.din.read(this.buffer, this.bufferPointer = 0, 65536);
/* 112 */       if (this.bytesRead == -1)
/* 113 */         this.buffer[0] = -1;
/*     */     }
/*     */ 
/*     */     private byte read() throws IOException
/*     */     {
/* 118 */       if (this.bufferPointer == this.bytesRead)
/* 119 */         fillBuffer();
/* 120 */       return this.buffer[(this.bufferPointer++)];
/*     */     }
/*     */ 
/*     */     public void close() throws IOException
/*     */     {
/* 125 */       if (this.din == null)
/* 126 */         return;
/* 127 */       this.din.close();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.pallin3
 * JD-Core Version:    0.6.2
 */