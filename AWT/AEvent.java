/*    */ package AWT;
/*    */ 
/*    */ import java.awt.Button;
/*    */ import java.awt.Frame;
/*    */ import java.awt.TextField;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ 
/*    */ public class AEvent extends Frame
/*    */   implements ActionListener
/*    */ {
/*    */   TextField tf;
/*    */ 
/*    */   AEvent()
/*    */   {
/* 16 */     this.tf = new TextField();
/* 17 */     this.tf.setText("Himanshu");
/* 18 */     this.tf.setBounds(60, 50, 120, 30);
/* 19 */     Button b = new Button("click me");
/* 20 */     b.setBounds(100, 200, 80, 30);
/*    */ 
/* 22 */     b.addActionListener(this);
/* 23 */     add(b);
/* 24 */     add(this.tf);
/* 25 */     setSize(300, 300);
/* 26 */     setLayout(null);
/* 27 */     setVisible(true);
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent e)
/*    */   {
/* 37 */     this.tf.setText("Welcome");
/*    */   }
/*    */   public static void main(String[] args) {
/* 40 */     AEvent A = new AEvent();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     AWT.AEvent
 * JD-Core Version:    0.6.2
 */