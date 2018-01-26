/*    */ package ObjectOriented;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StudentUse
/*    */ {
/*    */   public static void printStudent(Student s1)
/*    */   {
/*  6 */     s1.name = "Manisha";
/*  7 */     s1.rollNumber = 40;
/*  8 */     System.out.println(s1.name + " " + s1.rollNumber);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 12 */     Student s = new Student("abc", 1);
/* 13 */     System.out.println(s.name + " " + s.rollNumber);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ObjectOriented.StudentUse
 * JD-Core Version:    0.6.2
 */