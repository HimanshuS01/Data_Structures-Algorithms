/*    */ package CompetitivePractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Random;
/*    */ import org.junit.Assert;
/*    */ import org.junit.Test;
/*    */ 
/*    */ public class NumericStringTest
/*    */ {
/*    */   pallin3 pal;
/*    */ 
/*    */   @Test
/*    */   public void test_varying_length()
/*    */   {
/* 15 */     Random r = new Random();
/*    */ 
/* 18 */     int num_test_cases = 100;
/*    */ 
/* 21 */     for (int i = 0; i < num_test_cases; i++)
/*    */     {
/* 24 */       int str_length = r.nextInt(10);
/*    */ 
/* 28 */       StringBuilder sb = new StringBuilder();
/* 29 */       for (int j = 0; j < str_length; j++)
/*    */       {
/* 31 */         sb.append(r.nextInt(10));
/*    */       }
/*    */ 
/* 35 */       String s1 = sb.toString();
/*    */ 
/* 37 */       System.out.println("test case no.=" + i);
/* 38 */       System.out.println(s1);
/*    */ 
/* 41 */       Assert.assertEquals(pallin3.correctprogram(s1), pallin3.myprogram(s1));
/*    */     }
/*    */   }
/*    */ 
/*    */   @Test
/*    */   public void test_constant_length()
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.NumericStringTest
 * JD-Core Version:    0.6.2
 */