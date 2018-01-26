/*    */ package TicTacToe;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class TicTacToe
/*    */ {
/*    */   public static Player getPlayer(int playerNumber)
/*    */   {
/* 10 */     Scanner s = new Scanner(System.in);
/* 11 */     System.out.println("Enter the player" + playerNumber + "name");
/* 12 */     String name = s.nextLine();
/* 13 */     char symbol = ' ';
/* 14 */     System.out.println("Enter the player" + playerNumber + "symbol");
/* 15 */     symbol = s.nextLine().charAt(0);
/* 16 */     return new Player(name, symbol);
/*    */   }
/*    */ 
/*    */   public static void start() {
/* 20 */     Player p1 = getPlayer(1);
/* 21 */     boolean done = false;
/* 22 */     Player p2 = null;
/* 23 */     while (!done) {
/* 24 */       p2 = getPlayer(2);
/* 25 */       if (p1.symbol != p2.symbol) {
/* 26 */         done = true;
/*    */       }
/*    */       else {
/* 29 */         System.out.println("Two players cannot have same symbol!");
/*    */       }
/*    */     }
/* 32 */     Board b = new Board(p1.symbol, p2.symbol);
/*    */ 
/* 34 */     boolean isPlayer1Turn = true;
/* 35 */     b.print();
/*    */ 
/* 37 */     while (b.getGameStatus() == 4) {
/* 38 */       Player currentPlayer = null;
/* 39 */       if (isPlayer1Turn) {
/* 40 */         currentPlayer = p1;
/*    */       }
/*    */       else {
/* 43 */         currentPlayer = p2;
/*    */       }
/*    */ 
/* 46 */       System.out.println(currentPlayer.name + "'s turn");
/* 47 */       Scanner s = new Scanner(System.in);
/* 48 */       System.out.println("Enter  x coordinate:");
/* 49 */       int x = s.nextInt();
/* 50 */       System.out.println("Enter  y coordinate:");
/* 51 */       int y = s.nextInt();
/*    */       try {
/* 53 */         b.makeaMove(x, y, currentPlayer.symbol);
/* 54 */         isPlayer1Turn = !isPlayer1Turn;
/*    */       }
/*    */       catch (InvalidMoveException e) {
/* 57 */         System.out.println("Invalid move Try again!");
/*    */       }
/* 59 */       b.print();
/*    */     }
/* 61 */     int result = b.getGameStatus();
/*    */ 
/* 63 */     if (result == 1) {
/* 64 */       System.out.println(p1.name + "Won!");
/*    */     }
/* 66 */     else if (result == 2) {
/* 67 */       System.out.println(p2.name + "Won!");
/*    */     }
/*    */     else
/* 70 */       System.out.println("Draw!");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 76 */     start();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     TicTacToe.TicTacToe
 * JD-Core Version:    0.6.2
 */