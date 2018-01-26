/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class himanshu
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  9 */     System.out.println("himanshu");
/* 10 */     Scanner s = new Scanner(System.in);
/* 11 */     int limit = s.nextInt();
/* 12 */     int x = 0;
/* 13 */     int a = 5;
/* 14 */     double b = 5.0D;
/* 15 */     if (a == b) {
/* 16 */       System.out.println(a);
/*    */     }
/*    */ 
/* 19 */     while (x <= limit)
/*    */     {
/* 21 */       int c = (int)(0.5555555555555556D * (x - 32));
/* 22 */       System.out.print(x);
/* 23 */       System.out.print(" ");
/* 24 */       System.out.print(c);
/* 25 */       System.out.print("\n");
/* 26 */       x += 20;
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     himanshu
 * JD-Core Version:    0.6.2
 */