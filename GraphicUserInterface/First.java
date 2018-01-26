/*    */ package GraphicUserInterface;
/*    */ 
/*    */ import java.awt.Button;
/*    */ import java.awt.Frame;
/*    */ 
/*    */ public class First extends Frame
/*    */ {
/*    */   First()
/*    */   {
/*  9 */     Button b = new Button("Set click");
/* 10 */     Button close = new Button("Close");
/* 11 */     b.setBounds(100, 150, 80, 30);
/* 12 */     add(b);
/* 13 */     setSize(500, 300);
/* 14 */     setLayout(null);
/* 15 */     setVisible(true);
/* 16 */     setResizable(true);
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 21 */     First f = new First();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     GraphicUserInterface.First
 * JD-Core Version:    0.6.2
 */