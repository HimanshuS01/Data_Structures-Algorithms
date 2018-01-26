/*     */ import java.io.PrintStream;
/*     */ import java.util.HashMap;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class ArrayOperationsGeeksForGeeks
/*     */ {
/*     */   public static void Array_Sort(int[] A, int beg, int end)
/*     */   {
/*   8 */     if (beg >= end) {
/*   9 */       return;
/*     */     }
/*  11 */     int count = 0;
/*  12 */     for (int i = beg; i <= end; i++) {
/*  13 */       if (A[i] == 0) {
/*  14 */         count++;
/*     */       }
/*     */     }
/*  17 */     int[] output = new int[end + 1];
/*  18 */     int k = 0;
/*  19 */     for (int j = 0; j < count; j++) {
/*  20 */       output[k] = 0;
/*  21 */       k++;
/*     */     }
/*  23 */     for (int i1 = beg; i1 <= end; i1++) {
/*  24 */       if (A[i1] != 0) {
/*  25 */         output[k] = A[i1];
/*  26 */         k++;
/*     */       }
/*     */     }
/*  29 */     for (int i2 = 0; i2 < output.length; i2++)
/*  30 */       System.out.print(output[i2] + " ");
/*     */   }
/*     */ 
/*     */   public static void Majority(int[] arr)
/*     */   {
/*  37 */     HashMap map = new HashMap();
/*  38 */     for (int i = 0; i < arr.length; i++) {
/*  39 */       if (map.containsKey(Integer.valueOf(arr[i]))) {
/*  40 */         int count = ((Integer)map.get(Integer.valueOf(arr[i]))).intValue();
/*  41 */         map.put(Integer.valueOf(arr[i]), Integer.valueOf(count + 1));
/*     */       }
/*     */       else {
/*  44 */         map.put(Integer.valueOf(arr[i]), Integer.valueOf(1));
/*     */       }
/*     */     }
/*  47 */     for (int i = 0; i < arr.length; i++) {
/*  48 */       if ((map.containsKey(Integer.valueOf(arr[i]))) && (((Integer)map.get(Integer.valueOf(arr[i]))).intValue() > arr.length / 2)) {
/*  49 */         System.out.println(arr[i]);
/*  50 */         map.remove(Integer.valueOf(arr[i]));
/*     */       }
/*  52 */       if ((map.containsKey(Integer.valueOf(arr[i]))) && (((Integer)map.get(Integer.valueOf(arr[i]))).intValue() == arr.length / 2)) {
/*  53 */         System.out.println("NONE");
/*  54 */         map.remove(Integer.valueOf(arr[i]));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void printRepeating(int[] arr, int size)
/*     */   {
/*  75 */     int[] count = new int[size];
/*     */ 
/*  78 */     System.out.println("Repeated elements are : ");
/*  79 */     for (int i = 0; i < size; i++)
/*     */     {
/*  81 */       if (count[arr[i]] >= 1) {
/*  82 */         System.out.print(arr[i] + " ");
/*     */       }
/*     */       else
/*  85 */         count[arr[i]] += 1;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void SortElementsByFrequency(int[] arr)
/*     */   {
/*  93 */     HashMap visited = new HashMap();
/*  94 */     int[][] newArr = new int[arr.length][2];
/*     */ 
/*  96 */     for (int i = 0; i < arr.length; i++) {
/*  97 */       if (!visited.containsKey(Integer.valueOf(arr[i])))
/*     */       {
/* 101 */         visited.put(Integer.valueOf(arr[i]), Boolean.valueOf(false));
/*     */       }
/*     */     }
/*     */ 
/* 105 */     for (int i = 0; i < arr.length; i++) {
/* 106 */       int count = 0;
/*     */ 
/* 108 */       if (!((Boolean)visited.get(Integer.valueOf(arr[i]))).booleanValue())
/*     */       {
/* 110 */         for (int j = 0; j < arr.length; j++) {
/* 111 */           if (arr[i] == arr[j]) {
/* 112 */             count++;
/*     */           }
/*     */         }
/* 115 */         newArr[i][0] = arr[i];
/* 116 */         newArr[i][1] = count;
/* 117 */         System.out.println(newArr[i][0] + "," + newArr[i][1]);
/* 118 */         visited.put(Integer.valueOf(arr[i]), Boolean.valueOf(true));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void combinationUtil(int[] arr, int n, int r, int index, int[] data, int i)
/*     */   {
/* 127 */     if (index == r)
/*     */     {
/* 129 */       for (int j = 0; j < r; j++) {
/* 130 */         System.out.print(data[j] + " ");
/*     */       }
/* 132 */       System.out.println("");
/* 133 */       return;
/*     */     }
/*     */ 
/* 137 */     if (i >= n) {
/* 138 */       return;
/*     */     }
/*     */ 
/* 141 */     data[index] = arr[i];
/* 142 */     combinationUtil(arr, n, r, index + 1, data, i + 1);
/*     */ 
/* 145 */     combinationUtil(arr, n, r, index, data, i + 1);
/*     */   }
/*     */ 
/*     */   public static void printCombination(int[] arr, int n, int r)
/*     */   {
/* 151 */     int[] data = new int[r];
/*     */ 
/* 154 */     combinationUtil(arr, n, r, 0, data, 0);
/*     */   }
/*     */ 
/*     */   public static void maxSum(int[] arr)
/*     */   {
/* 159 */     if (arr.length == 0) {
/* 160 */       return;
/*     */     }
/* 162 */     if (arr.length == 1) {
/* 163 */       System.out.println(arr[0]);
/*     */     }
/* 165 */     int i = 0; int j = arr.length - 1; int sum = 0;
/* 166 */     while (i <= j) {
/* 167 */       if (arr[i] == arr[j]) {
/* 168 */         sum += arr[i];
/*     */       }
/*     */       else {
/* 171 */         sum = sum + arr[i] + arr[j];
/*     */       }
/* 173 */       i += 2;
/* 174 */       j -= 2;
/*     */     }
/* 176 */     System.out.println(sum);
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 182 */     Scanner s = new Scanner(System.in);
/* 183 */     System.out.println("Enter the  number of elements");
/* 184 */     int n = s.nextInt();
/* 185 */     int[] A = new int[n];
/* 186 */     for (int i = 0; i < n; i++) {
/* 187 */       System.out.println("Enter the  next number");
/* 188 */       A[i] = s.nextInt();
/*     */     }
/*     */ 
/* 192 */     printCombination(A, A.length, 3);
/*     */ 
/* 210 */     s.close();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ArrayOperationsGeeksForGeeks
 * JD-Core Version:    0.6.2
 */