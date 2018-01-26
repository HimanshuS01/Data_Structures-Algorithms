/*    */ package ObjectOriented;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Student
/*    */ {
/*    */   public String name;
/*    */   int rollNumber;
/*    */   final int numStudents;
/*    */ 
/*    */   public int getRollNumber()
/*    */   {
/* 11 */     return this.rollNumber;
/*    */   }
/*    */ 
/*    */   public Student(String name) {
/* 15 */     this.name = name;
/* 16 */     this.rollNumber = 1000;
/* 17 */     this.numStudents = 40;
/*    */   }
/*    */   public Student(String name, int roll_number) {
/* 20 */     this.name = name;
/* 21 */     this.rollNumber = roll_number;
/* 22 */     this.numStudents = 60;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 29 */     Student s1 = new Student("Himanshu");
/* 30 */     System.out.println(s1.name);
/* 31 */     s1 = new Student("Prashant");
/* 32 */     System.out.println(s1.name);
/* 33 */     s1.name = "Geet";
/* 34 */     s1.rollNumber = 2000;
/*    */ 
/* 36 */     System.out.println(s1.rollNumber);
/* 37 */     System.out.println(s1.numStudents);
/*    */ 
/* 40 */     Student s2 = new Student("", 10);
/*    */ 
/* 42 */     s2.rollNumber = 30;
/* 43 */     System.out.println(s2.name);
/* 44 */     System.out.println(s2.rollNumber);
/* 45 */     System.out.println(s2.numStudents);
/*    */ 
/* 47 */     StudentUse.printStudent(s1);
/* 48 */     StudentUse2.printStudent(s1);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ObjectOriented.Student
 * JD-Core Version:    0.6.2
 */