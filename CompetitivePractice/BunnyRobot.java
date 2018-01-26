/*    */ package CompetitivePractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class BunnyRobot
/*    */ {
/*    */   public static String FindDirection(int x1, int y1, int x2, int y2)
/*    */   {
/*    */     String command;
/*    */     String command;
/* 12 */     if ((x1 < x2) && (y1 == y2)) {
/* 13 */       command = "right";
/*    */     }
/*    */     else
/*    */     {
/*    */       String command;
/* 15 */       if ((y1 < y2) && (x1 == x2)) {
/* 16 */         command = "up";
/*    */       }
/*    */       else
/*    */       {
/*    */         String command;
/* 18 */         if ((x1 > x2) && (y1 == y2)) {
/* 19 */           command = "left";
/*    */         }
/*    */         else
/*    */         {
/*    */           String command;
/* 21 */           if ((y1 > y2) && (x1 == x2)) {
/* 22 */             command = "down";
/*    */           }
/*    */           else
/* 25 */             command = "sad"; 
/*    */         }
/*    */       }
/*    */     }
/* 28 */     return command;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 33 */     Scanner s = new Scanner(System.in);
/* 34 */     int t = s.nextInt();
/* 35 */     String[] output = new String[t];
/* 36 */     int k = 0;
/* 37 */     for (int i = 0; i < t; i++)
/*    */     {
/* 39 */       int x1 = s.nextInt();
/* 40 */       int y1 = s.nextInt();
/* 41 */       int x2 = s.nextInt();
/* 42 */       int y2 = s.nextInt();
/*    */ 
/* 44 */       String result = FindDirection(x1, y1, x2, y2);
/* 45 */       output[(k++)] = result;
/*    */     }
/*    */ 
/* 49 */     for (int j = 0; j < output.length; j++)
/* 50 */       System.out.println(output[j]);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     CompetitivePractice.BunnyRobot
 * JD-Core Version:    0.6.2
 */