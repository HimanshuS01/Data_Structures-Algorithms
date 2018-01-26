/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class largest_smallestarray
/*    */ {
/*    */   public static int getlargest(int[] input1)
/*    */   {
/*  8 */     System.out.println(input1);
/*  9 */     int largest = -2147483648;
/* 10 */     int i = 0;
/* 11 */     while (i < input1.length) {
/* 12 */       if (input1[i] > largest)
/*    */       {
/* 14 */         largest = input1[i];
/*    */       }
/* 16 */       i++;
/*    */     }
/* 18 */     return largest;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 25 */     System.out.println("Enter the number of inputs");
/* 26 */     Scanner s = new Scanner(System.in);
/* 27 */     int n = s.nextInt();
/* 28 */     int[] input = new int[n];
/* 29 */     System.out.println(input);
/* 30 */     int i = 0;
/* 31 */     while (i < n) {
/* 32 */       System.out.println("Enter the next number");
/* 33 */       input[i] = s.nextInt();
/* 34 */       i++;
/*    */     }
/* 36 */     System.out.println("Largest number is");
/* 37 */     System.out.println(getlargest(input));
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     largest_smallestarray
 * JD-Core Version:    0.6.2
 */