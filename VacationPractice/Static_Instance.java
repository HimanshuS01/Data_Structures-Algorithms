/*    */ package VacationPractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Static_Instance
/*    */ {
/*  6 */   static int count = 0;
/*    */ 
/*    */   static
/*    */   {
/* 19 */     System.out.println("Static block executes before the main method.");
/*    */   }
/*    */ 
/*    */   Static_Instance()
/*    */   {
/*  9 */     count += 1;
/* 10 */     System.out.println(count);
/*    */   }
/*    */ 
/*    */   public void Change_Static_Data_Value()
/*    */   {
/* 15 */     count = 1;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 26 */     Static_Instance obj = new Static_Instance();
/* 27 */     obj.Change_Static_Data_Value();
/* 28 */     count = 2;
/* 29 */     Static_Instance obj1 = new Static_Instance();
/* 30 */     Static_Instance obj2 = new Static_Instance();
/* 31 */     Static_Instance obj3 = new Static_Instance();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     VacationPractice.Static_Instance
 * JD-Core Version:    0.6.2
 */