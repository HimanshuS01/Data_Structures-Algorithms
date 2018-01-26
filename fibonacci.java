/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class fibonacci
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 14 */     int x = 0; int y = 1; int i = 1;
/*    */ 
/* 17 */     String s1 = "Himanshu";
/* 18 */     System.out.println(s1.hashCode());
/* 19 */     s1 = s1 + "Singhal";
/* 20 */     System.out.println(s1.hashCode());
/*    */ 
/* 23 */     StringBuffer sb = new StringBuffer("Java");
/* 24 */     System.out.println(sb.hashCode());
/* 25 */     sb.append("Tpoint");
/* 26 */     System.out.println(sb.hashCode());
/*    */ 
/* 28 */     System.out.println("Enter the number:");
/* 29 */     Scanner s = new Scanner(System.in);
/* 30 */     int n = s.nextInt();
/* 31 */     System.out.print(x + " ");
/* 32 */     System.out.print(y + " ");
/* 33 */     while (i <= n)
/*    */     {
/* 35 */       int z = x + y;
/* 36 */       if (z <= n)
/* 37 */         System.out.print(z + " ");
/* 38 */       x = y;
/* 39 */       y = z;
/* 40 */       i++;
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     fibonacci
 * JD-Core Version:    0.6.2
 */