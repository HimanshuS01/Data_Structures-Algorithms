/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class binarysearch
/*    */ {
/*    */   public static int binary_search(int[] input, int x)
/*    */   {
/*  7 */     int beg = 0; int end = input.length - 1;
/*  8 */     while (beg <= end) {
/*  9 */       int mid = (beg + end) / 2;
/* 10 */       if (input[mid] == x) {
/* 11 */         return mid + 1;
/*    */       }
/* 13 */       if (x > input[mid]) {
/* 14 */         beg = mid + 1;
/*    */       }
/*    */       else {
/* 17 */         end = mid - 1;
/*    */       }
/*    */     }
/* 20 */     return -1;
/*    */   }
/*    */ 
/*    */   public static void printSubstrings(String str)
/*    */   {
/* 26 */     for (int i = 0; i < str.length(); i++)
/*    */     {
/* 28 */       for (int j = i + 1; j <= str.length(); j++)
/*    */       {
/* 30 */         System.out.println(str.substring(i, j));
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 38 */     System.out.println("Enter the string");
/* 39 */     Scanner s = new Scanner(System.in);
/* 40 */     String str = s.nextLine();
/* 41 */     printSubstrings(str);
/*    */ 
/* 43 */     System.out.println("Enter the number of elements");
/* 44 */     int n = s.nextInt();
/* 45 */     int[] input = new int[n];
/*    */ 
/* 47 */     for (int i = 0; i < input.length; i++) {
/* 48 */       System.out.println("Enter the next number");
/* 49 */       input[i] = s.nextInt();
/*    */     }
/* 51 */     System.out.println("Enter the number you want to search");
/* 52 */     int x = s.nextInt();
/* 53 */     int position = binary_search(input, x);
/* 54 */     if (position > 0) {
/* 55 */       System.out.println("Element found at position no " + position);
/*    */     }
/*    */     else
/* 58 */       System.out.println("Element not found!!");
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     binarysearch
 * JD-Core Version:    0.6.2
 */