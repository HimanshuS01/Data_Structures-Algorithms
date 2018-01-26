/*     */ import java.io.PrintStream;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class QuickSort
/*     */ {
/*     */   static int partition(int[] arr, int low, int high)
/*     */   {
/*   9 */     int pivot = arr[high];
/*     */ 
/*  12 */     int i = low - 1;
/*  13 */     for (int j = low; j <= high - 1; j++)
/*     */     {
/*  17 */       if (arr[j] <= pivot)
/*     */       {
/*  19 */         i++;
/*     */ 
/*  22 */         int temp = arr[i];
/*  23 */         arr[i] = arr[j];
/*  24 */         arr[j] = temp;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  29 */     int temp = arr[(i + 1)];
/*  30 */     arr[(i + 1)] = arr[high];
/*  31 */     arr[high] = temp;
/*     */ 
/*  33 */     return i + 1;
/*     */   }
/*     */ 
/*     */   static void sort(int[] arr, int low, int high)
/*     */   {
/*  44 */     if (low < high)
/*     */     {
/*  48 */       int pi = partition(arr, low, high);
/*     */ 
/*  52 */       sort(arr, low, pi - 1);
/*  53 */       sort(arr, pi + 1, high);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  91 */     Scanner s = new Scanner(System.in);
/*  92 */     System.out.println("Enter the number of elements");
/*  93 */     int n = s.nextInt();
/*  94 */     int[] arr = new int[n];
/*  95 */     for (int i = 0; i < arr.length; i++) {
/*  96 */       System.out.println("Enter the next number:");
/*  97 */       arr[i] = s.nextInt();
/*     */     }
/*  99 */     int beg = 0;
/* 100 */     int end = arr.length - 1;
/* 101 */     sort(arr, beg, end);
/* 102 */     for (int i = 0; i < arr.length; i++)
/* 103 */       System.out.print(arr[i] + " ");
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     QuickSort
 * JD-Core Version:    0.6.2
 */