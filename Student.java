/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Student
/*    */ {
/*    */   int rollno;
/*    */   String name;
/*    */   String city;
/*    */ 
/*    */   Student(int rollno, String name, String city)
/*    */   {
/* 12 */     this.rollno = rollno;
/* 13 */     this.name = name;
/* 14 */     this.city = city;
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 22 */     return this.rollno + " " + this.name + " " + this.city;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 27 */     Student s1 = new Student(101, "Raj", "lucknow");
/* 28 */     Student s2 = new Student(102, "Vijay", "ghaziabad");
/*    */ 
/* 30 */     System.out.println(s1);
/* 31 */     System.out.println(s2);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Student
 * JD-Core Version:    0.6.2
 */