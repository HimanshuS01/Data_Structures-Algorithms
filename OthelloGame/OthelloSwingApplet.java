/*    */ package OthelloGame;
/*    */ 
/*    */ import java.awt.Container;
/*    */ import java.awt.GridLayout;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JApplet;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class OthelloSwingApplet extends JApplet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   public void init()
/*    */   {
/* 27 */     getContentPane().setLayout(new GridLayout(1, 1));
/* 28 */     JButton button = new JButton("Start Othello");
/*    */ 
/* 30 */     getContentPane().add(button);
/*    */ 
/* 32 */     button.addActionListener(new ActionListener() {
/*    */       public void actionPerformed(ActionEvent evt) {
/* 34 */         OthelloSwingApplet.this.buttonPushed(evt);
/*    */       }
/*    */     });
/*    */   }
/*    */ 
/*    */   private void buttonPushed(ActionEvent evt) {
/* 40 */     OthelloTwoPlayerGame f = new OthelloTwoPlayerGame();
/* 41 */     f.setVisible(true);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     OthelloGame.OthelloSwingApplet
 * JD-Core Version:    0.6.2
 */