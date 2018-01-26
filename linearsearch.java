/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class linearsearch
/*    */ {
/*    */   public static int linear_search(int[] input, int x)
/*    */   {
/*  8 */     for (int i = 0; i < input.length; i++) {
/*  9 */       if (input[i] == x) {
/* 10 */         return i + 1;
/*    */       }
/*    */     }
/* 13 */     return -1;
/*    */   }
/*    */   public static int binarySearch(int[] arr, int num) {
/* 16 */     int beg = 0; int end = arr.length - 1;
/* 17 */     while (beg <= end) {
/* 18 */       int mid = (beg + end) / 2;
/* 19 */       if (arr[mid] == num) {
/* 20 */         return mid + 1;
/*    */       }
/* 22 */       if (arr[mid] > num) {
/* 23 */         end = mid - 1;
/*    */       }
/* 25 */       else if (arr[mid] < num) {
/* 26 */         beg = mid + 1;
/*    */       }
/*    */     }
/* 29 */     return -1;
/*    */   }
/*    */   public static void DecimalToBinary(int num) {
/* 32 */     int binary = 0;
/* 33 */     int number = num;
/* 34 */     while (number > 0) {
/* 35 */       int rem = number % 2;
/* 36 */       number /= 2;
/* 37 */       binary = binary * 10 + rem;
/*    */     }
/* 39 */     System.out.println("Binary Number of " + num + "is" + binary);
/* 40 */     StringBuffer sb = new StringBuffer(binary);
/* 41 */     System.out.println(sb.reverse());
/*    */   }
/*    */ 
/*    */   public static void searchPair(int[] arr) {
/* 45 */     for (int i = 0; i < arr.length; i++)
/* 46 */       for (int j = i + 1; j < arr.length; j++)
/* 47 */         if (arr[i] + arr[j] == 10)
/* 48 */           System.out.print(arr[i] + "&" + arr[j]);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 56 */     System.out.println("Enter the number of elements");
/* 57 */     Scanner s = new Scanner(System.in);
/* 58 */     int n = s.nextInt();
/* 59 */     int[] input = new int[n];
/*    */ 
/* 61 */     for (int i = 0; i < input.length; i++) {
/* 62 */       System.out.println("Enter the next number");
/* 63 */       input[i] = s.nextInt();
/*    */     }
/* 65 */     searchPair(input);
/* 66 */     System.out.println("Enter the number you want to search");
/* 67 */     int x = s.nextInt();
/* 68 */     int y = binarySearch(input, x);
/* 69 */     if (y > 0) {
/* 70 */       System.out.println("Element founds at position no " + y);
/*    */     }
/*    */     else {
/* 73 */       System.out.println("Element not found!!");
/*    */     }
/* 75 */     DecimalToBinary(13);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     linearsearch
 * JD-Core Version:    0.6.2
 */