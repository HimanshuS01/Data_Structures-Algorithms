/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Armstrong_Number
/*    */ {
/*    */   public static boolean Check_Armstrong(int num)
/*    */   {
/*  7 */     int num1 = num;
/*  8 */     if (num == 0) {
/*  9 */       return false;
/*    */     }
/* 11 */     if (num == 1) {
/* 12 */       return true;
/*    */     }
/* 14 */     int sum = 0;
/* 15 */     while (num != 0) {
/* 16 */       int rem = num % 10;
/* 17 */       sum += rem * rem * rem;
/* 18 */       num /= 10;
/*    */     }
/* 20 */     if (sum == num1) {
/* 21 */       return true;
/*    */     }
/*    */ 
/* 24 */     return false;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 30 */     Scanner s = new Scanner(System.in);
/* 31 */     int b = Integer.parseInt("444", 16);
/* 32 */     System.out.println(b);
/* 33 */     System.out.println("Enter the number:");
/* 34 */     int num = s.nextInt();
/* 35 */     boolean result = Check_Armstrong(num);
/* 36 */     if (result) {
/* 37 */       System.out.println("Number is armstrong...");
/*    */     }
/*    */     else {
/* 40 */       System.out.println("Not an armstrong number");
/*    */     }
/* 42 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Armstrong_Number
 * JD-Core Version:    0.6.2
 */