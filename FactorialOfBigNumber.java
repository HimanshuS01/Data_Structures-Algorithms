/*    */ import java.io.PrintStream;
/*    */ import java.math.BigInteger;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class FactorialOfBigNumber
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws Exception
/*    */   {
/* 13 */     BigInteger fact = new BigInteger("1");
/*    */ 
/* 15 */     System.out.println("Enter the number");
/* 16 */     Scanner s = new Scanner(System.in);
/* 17 */     int factorialNo = s.nextInt();
/*    */ 
/* 19 */     for (int i = 2; i <= factorialNo; i++)
/*    */     {
/* 26 */       fact = fact.multiply(new BigInteger(String.valueOf(i)));
/*    */     }
/*    */ 
/* 33 */     System.out.println("The factorial of " + factorialNo + " is: " + fact);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     FactorialOfBigNumber
 * JD-Core Version:    0.6.2
 */