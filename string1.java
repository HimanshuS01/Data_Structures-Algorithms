/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class string1
/*    */ {
/*    */   public static void printTriplets(int[] input, int x)
/*    */   {
/*  6 */     for (int i = 0; i < input.length; i++)
/*  7 */       for (int j = i + 1; j < input.length; j++)
/*  8 */         for (int k = j + 1; k < input.length; k++)
/*  9 */           if (input[i] + input[j] + input[k] == x)
/*    */           {
/* 11 */             System.out.println(i + " " + j + " " + k);
/*    */           }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 20 */     System.out.println("Enter the number of elements");
/* 21 */     Scanner s = new Scanner(System.in);
/* 22 */     int n = s.nextInt();
/* 23 */     int[] input = new int[n];
/* 24 */     for (int i = 0; i < n; i++) {
/* 25 */       input[i] = s.nextInt();
/*    */     }
/* 27 */     System.out.println("Enter the integer");
/* 28 */     int x = s.nextInt();
/* 29 */     printTriplets(input, x);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     string1
 * JD-Core Version:    0.6.2
 */