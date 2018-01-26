/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class SystemTime
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  9 */     long Total_MilliSeconds = System.currentTimeMillis();
/*    */ 
/* 11 */     long Total_Seconds = Total_MilliSeconds / 1000L;
/*    */ 
/* 13 */     long Total_CurrentSecond = Total_Seconds % 60L;
/*    */ 
/* 15 */     long Total_minutes = Total_Seconds / 60L;
/*    */ 
/* 17 */     long Total_currentMinutes = Total_minutes % 60L;
/*    */ 
/* 19 */     long Total_Hours = Total_minutes / 60L;
/*    */ 
/* 21 */     long Total_currentHours = Total_Hours % 24L;
/*    */ 
/* 24 */     System.out.println("System current time is:" + Total_currentHours + ":" + Total_currentMinutes + ":" + Total_CurrentSecond);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     SystemTime
 * JD-Core Version:    0.6.2
 */