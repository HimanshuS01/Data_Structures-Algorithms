/*    */ package ObjectOriented;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class UseOfStaticKeyword
/*    */ {
/*    */   int rollno;
/*    */   String name;
/* 10 */   static String college = "NIEC";
/*    */ 
/*    */   static void change()
/*    */   {
/* 14 */     college = "MAIT";
/*    */   }
/*    */ 
/*    */   UseOfStaticKeyword(int r, String n) {
/* 18 */     this.rollno = r;
/* 19 */     this.name = n;
/*    */   }
/*    */ 
/*    */   void display() {
/* 23 */     System.out.println(this.rollno + " " + this.name + " " + college);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 31 */     change();
/* 32 */     UseOfStaticKeyword s1 = new UseOfStaticKeyword(111, "Karan");
/* 33 */     UseOfStaticKeyword s2 = new UseOfStaticKeyword(222, "Aryan");
/* 34 */     UseOfStaticKeyword s3 = new UseOfStaticKeyword(333, "Sonoo");
/*    */ 
/* 36 */     s1.display();
/* 37 */     s2.display();
/* 38 */     s3.display();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ObjectOriented.UseOfStaticKeyword
 * JD-Core Version:    0.6.2
 */