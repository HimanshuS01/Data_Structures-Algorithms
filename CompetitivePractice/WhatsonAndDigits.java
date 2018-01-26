/*    */ package CompetitivePractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class WhatsonAndDigits
/*    */ {
/* 13 */   public static ArrayList<String> result = new ArrayList();
/*    */ 
/*    */   static boolean isInArray(int[] a, int ele) {
/* 16 */     for (int i = 0; i < a.length; i++)
/* 17 */       if (a[i] == ele)
/* 18 */         return false;
/* 19 */     return true;
/*    */   }
/*    */ 
/*    */   static int findSum(int[] ar, int end) {
/* 23 */     int sum = 0;
/* 24 */     for (int i = 0; i <= end; i++)
/* 25 */       sum += ar[i];
/* 26 */     return sum;
/*    */   }
/*    */ 
/*    */   static void printNum(int[] ar, int index, int num)
/*    */   {
/* 31 */     int sum = findSum(ar, index);
/* 32 */     int diff = num - sum;
/* 33 */     if (diff < 0)
/* 34 */       return;
/* 35 */     if (diff == 0) {
/* 36 */       String number = "";
/* 37 */       for (int i = 0; i <= index; i++) {
/* 38 */         number = number + ar[i];
/*    */       }
/*    */ 
/* 42 */       result.add(number);
/* 43 */       return;
/*    */     }
/* 45 */     for (int i = 1; i < 10; i++)
/* 46 */       if (isInArray(ar, i)) {
/* 47 */         ar[(index + 1)] = i;
/* 48 */         printNum(ar, index + 1, num);
/*    */       }
/*    */   }
/*    */ 
/*    */   public static int CalculateSum(int num)
/*    */   {
/* 56 */     int sum = 0;
/* 57 */     int input = num;
/* 58 */     while (input != 0) {
/* 59 */       int lastdigit = input % 10;
/* 60 */       sum += lastdigit;
/* 61 */       input /= 10;
/*    */     }
/* 63 */     return sum;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 68 */     Scanner in = new Scanner(System.in);
/* 69 */     int t = in.nextInt();
/*    */ 
/* 71 */     for (int i = 0; i < t; i++)
/*    */     {
/* 73 */       int num = in.nextInt();
/* 74 */       int[] ar = new int[9];
/* 75 */       for (int j = 1; j <= 9; j++) {
/* 76 */         ar[0] = j;
/* 77 */         printNum(ar, 0, num);
/*    */       }
/*    */ 
/*    */     }
/*    */ 
/* 94 */     int[] sumOfDigits = new int[result.size()];
/* 95 */     for (int i = 0; i < result.size(); i++) {
/* 96 */       sumOfDigits[i] = CalculateSum(Integer.parseInt((String)result.get(i)) + 1);
/*    */     }
/* 98 */     Arrays.sort(sumOfDigits);
/* 99 */     System.out.println(CalculateSum(sumOfDigits[1]));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.WhatsonAndDigits
 * JD-Core Version:    0.6.2
 */