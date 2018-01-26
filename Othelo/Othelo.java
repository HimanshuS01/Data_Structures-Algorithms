/*    */ package Othelo;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.JTextArea;
/*    */ 
/*    */ public class Othelo
/*    */ {
/*    */   public static void start()
/*    */     throws InvalidMoveException, InterruptedException
/*    */   {
/* 15 */     String first = JOptionPane.showInputDialog("Enter the name of the first player");
/* 16 */     String second = JOptionPane.showInputDialog("Enter the name of the second player");
/*    */ 
/* 18 */     Player p1 = new Player(first);
/* 19 */     Player p2 = new Player(second);
/*    */ 
/* 22 */     OtheloBoard board = new OtheloBoard();
/*    */ 
/* 25 */     board.Board();
/*    */ 
/* 27 */     Player currentplayer = p1;
/* 28 */     OtheloBoard.values playerNumber = OtheloBoard.values.PLAYER1;
/* 29 */     boolean done = false;
/* 30 */     while (!done) {
/* 31 */       board.display.setText(currentplayer.getname() + "your turn");
/* 32 */       boolean Is_Correct_Input = false;
/*    */ 
/* 34 */       Thread.sleep(2000L);
/*    */ 
/* 36 */       while (!Is_Correct_Input) {
/* 37 */         if (board.actionPerformed) {
/* 38 */           int row = OtheloBoard.buttonIndex / 8 + 1;
/* 39 */           int col = OtheloBoard.buttonIndex % 8 + 1;
/*    */           try
/*    */           {
/* 42 */             board.Update_Board(playerNumber, row, col);
/* 43 */             Is_Correct_Input = true;
/*    */           }
/*    */           catch (InvalidMoveException e) {
/* 46 */             board.display.setText(currentplayer.getname() + "Invalid move!Try again");
/*    */           }
/*    */ 
/*    */         }
/*    */ 
/*    */       }
/*    */ 
/* 54 */       if (board.Board_Status() == OtheloBoard.status.NOMOVE) {
/* 55 */         board.display.setText(p1.getname() + ":You have no valid moves");
/*    */       }
/*    */       else {
/* 58 */         if (board.Board_Status() == OtheloBoard.status.NOTDONE) {
/* 59 */           done = false;
/* 60 */           break;
/*    */         }
/* 62 */         currentplayer = currentplayer == p1 ? p2 : p1;
/* 63 */         playerNumber = playerNumber == OtheloBoard.values.PLAYER1 ? OtheloBoard.values.PLAYER2 : OtheloBoard.values.PLAYER1;
/* 64 */         board.actionPerformed = false;
/*    */       }
/*    */     }
/* 67 */     if (board.Board_Status() == OtheloBoard.status.DRAW) {
/* 68 */       JOptionPane.showInputDialog("DRAW!");
/*    */     }
/* 70 */     else if (board.Board_Status() == OtheloBoard.status.PLAYER1) {
/* 71 */       JOptionPane.showInputDialog("Winner :" + p1.getname());
/*    */     }
/*    */     else
/* 74 */       JOptionPane.showInputDialog("Winner :" + p2.getname());
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws InvalidMoveException, InterruptedException
/*    */   {
/* 80 */     start();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Othelo.Othelo
 * JD-Core Version:    0.6.2
 */