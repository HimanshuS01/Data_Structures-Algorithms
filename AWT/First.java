/*    */ package AWT;
/*    */ 
/*    */ import java.awt.Button;
/*    */ import java.awt.Frame;
/*    */ 
/*    */ public class First extends Frame
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   First()
/*    */   {
/* 22 */     Button b = new Button("Click me");
/* 23 */     b.setBounds(100, 100, 80, 30);
/* 24 */     add(b);
/* 25 */     setSize(300, 300);
/* 26 */     setLayout(null);
/* 27 */     setVisible(true);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 33 */     First f = new First();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     AWT.First
 * JD-Core Version:    0.6.2
 */