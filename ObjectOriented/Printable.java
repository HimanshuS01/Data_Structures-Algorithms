/*    */ package ObjectOriented;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ class Printable
/*    */   implements First, Second
/*    */ {
/*    */   public void print()
/*    */   {
/* 19 */     System.out.println("Bike is created");
/*    */   }
/*    */   public void show() {
/* 22 */     System.out.println("Running successfully");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 26 */     Printable obj = new Printable();
/* 27 */     obj.print();
/* 28 */     obj.show();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ObjectOriented.Printable
 * JD-Core Version:    0.6.2
 */