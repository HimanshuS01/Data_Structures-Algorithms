/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class pattern
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     System.out.println("Enter the number of rows");
/*  9 */     Scanner s = new Scanner(System.in);
/* 10 */     int n = s.nextInt();
/* 11 */     int row_value = 1;
/* 12 */     while (row_value <= n)
/*    */     {
/* 15 */       int spaces = 1;
/* 16 */       while (spaces <= n - row_value)
/*    */       {
/* 18 */         System.out.print(" ");
/* 19 */         spaces++;
/*    */       }
/* 21 */       int next_value = row_value;
/* 22 */       int next_column = 1;
/*    */ 
/* 24 */       while (next_column <= row_value)
/*    */       {
/* 27 */         System.out.print(next_value);
/* 28 */         next_value++;
/* 29 */         next_column++;
/*    */       }
/* 31 */       next_value -= 2;
/* 32 */       next_column = 1;
/*    */ 
/* 34 */       while (next_column <= row_value - 1)
/*    */       {
/* 36 */         System.out.print(next_value);
/* 37 */         next_value--;
/* 38 */         next_column++;
/*    */       }
/*    */ 
/* 41 */       row_value++;
/* 42 */       System.out.print("\n");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     pattern
 * JD-Core Version:    0.6.2
 */