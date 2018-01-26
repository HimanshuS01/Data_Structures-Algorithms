/*     */ package Othello;
/*     */ 
/*     */ import javax.swing.JButton;
/*     */ 
/*     */ public class OthelloBoard
/*     */ {
/*     */   private status currentStatus;
/*  14 */   private values[][] board = new values[8][8];
/*     */ 
/*     */   public OthelloBoard() {
/*  17 */     for (int i = 0; i < 8; i++) {
/*  18 */       for (int j = 0; j < 8; j++) {
/*  19 */         this.board[i][j] = values.NONE;
/*     */       }
/*     */     }
/*  22 */     this.board[3][4] = values.PLAYER1;
/*  23 */     this.board[4][3] = values.PLAYER1;
/*  24 */     this.board[3][3] = values.PLAYER2;
/*  25 */     this.board[4][4] = values.PLAYER2;
/*     */ 
/*  27 */     this.currentStatus = status.NOTDONE;
/*     */   }
/*     */ 
/*     */   public void updateBoard(values currentPlayer, int row, int column, JButton[] input)
/*     */     throws InvalidMoveException, InterruptedException
/*     */   {
/*  33 */     values opponent = currentPlayer == values.PLAYER1 ? values.PLAYER2 : values.PLAYER1;
/*     */ 
/*  35 */     if ((this.board[row][column] != values.NONE) || (!isMoveValid(currentPlayer, row, column))) {
/*  36 */       throw new InvalidMoveException();
/*     */     }
/*     */ 
/*  39 */     if (isMovePossible(currentPlayer)) {
/*  40 */       changeValues(currentPlayer, row, column, input);
/*  41 */       if (isMovePossible(opponent)) {
/*  42 */         this.currentStatus = status.NOTDONE;
/*  43 */         return;
/*  44 */       }if (isMovePossible(currentPlayer)) {
/*  45 */         this.currentStatus = status.NOMOVE;
/*  46 */         return;
/*     */       }
/*     */ 
/*  49 */       if (countplayer1() > countplayer2())
/*  50 */         this.currentStatus = status.PLAYER1;
/*  51 */       else if (countplayer2() > countplayer1())
/*  52 */         this.currentStatus = status.PLAYER2;
/*     */       else
/*  54 */         this.currentStatus = status.DRAW;
/*     */     }
/*     */   }
/*     */ 
/*     */   private boolean isMovePossible(values player)
/*     */   {
/*  62 */     for (int i = 0; i < 8; i++) {
/*  63 */       for (int j = 0; j < 8; j++) {
/*  64 */         if ((this.board[i][j] == values.NONE) && 
/*  65 */           (isMoveValid(player, i, j))) {
/*  66 */           return true;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   private boolean isMoveValid(values currentPlayer, int row, int col)
/*     */   {
/*  76 */     values opponent = currentPlayer == values.PLAYER1 ? values.PLAYER2 : values.PLAYER1;
/*     */ 
/*  79 */     int[][] adj = { { 0, 1, 1, 1, 0, -1, -1, -1 }, { 1, 1, 0, -1, -1, -1, 0, 1 } };
/*  80 */     int i = 0;
/*  81 */     while (i < 8) {
/*  82 */       int checkRow = row;
/*  83 */       int checkCol = col;
/*  84 */       while ((checkRow < 8) && (checkCol < 8)) {
/*  85 */         if ((checkRow + adj[0][i] < 0) || (checkCol + adj[1][i] < 0) || (checkRow + adj[0][i] > 7) || (checkCol + adj[1][i] > 7)) {
/*  86 */           i++;
/*  87 */           break;
/*     */         }
/*  89 */         if (this.board[(checkRow + adj[0][i])][(checkCol + adj[1][i])] == opponent) {
/*  90 */           checkRow += adj[0][i];
/*  91 */           checkCol += adj[1][i]; } else {
/*  92 */           if (this.board[(checkRow + adj[0][i])][(checkCol + adj[1][i])] == currentPlayer) {
/*  93 */             if ((checkRow + adj[0][i] - row > 1) || (checkCol + adj[1][i] - col > 1) || (checkRow + adj[0][i] - row < -1) || (checkCol + adj[1][i] - col < -1)) {
/*  94 */               return true;
/*     */             }
/*  96 */             i++;
/*  97 */             break;
/*     */           }
/*     */ 
/* 100 */           i++;
/* 101 */           break;
/*     */         }
/*     */       }
/*     */     }
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */   private void changeValues(values currentPlayer, int row, int col, JButton[] input) throws InterruptedException
/*     */   {
/* 110 */     values opponent = currentPlayer == values.PLAYER1 ? values.PLAYER2 : values.PLAYER1;
/*     */ 
/* 112 */     int[][] adj = { { 0, 1, 1, 1, 0, -1, -1, -1 }, { 1, 1, 0, -1, -1, -1, 0, 1 } };
/* 113 */     int i = 0; int value = 0;
/* 114 */     int[][] ui = new int[8][8];
/* 115 */     for (int j = 0; j < 8; j++) {
/* 116 */       for (int k = 0; k < 8; k++) {
/* 117 */         ui[j][k] = value;
/* 118 */         value++;
/*     */       }
/*     */     }
/* 121 */     while (i < 8) {
/* 122 */       int checkRow = row;
/* 123 */       int checkCol = col;
/* 124 */       while ((checkRow < 8) || (checkCol < 8)) {
/* 125 */         if ((checkRow + adj[0][i] < 0) || (checkCol + adj[1][i] < 0) || (checkRow + adj[0][i] > 7) || (checkCol + adj[1][i] > 7)) {
/* 126 */           i++;
/* 127 */           break;
/*     */         }
/* 129 */         if (this.board[(checkRow + adj[0][i])][(checkCol + adj[1][i])] == opponent) {
/* 130 */           checkRow += adj[0][i];
/* 131 */           checkCol += adj[1][i]; } else {
/* 132 */           if (this.board[(checkRow + adj[0][i])][(checkCol + adj[1][i])] == currentPlayer) {
/* 133 */             if ((checkRow + adj[0][i] - row <= 1) && (checkCol + adj[1][i] - col <= 1) && (checkRow + adj[0][i] - row >= -1)) { if (checkCol + adj[1][i] - col >= -1); } else {
/* 134 */               while ((checkRow != row) || (checkCol != col)) {
/* 135 */                 int counter = ui[checkRow][checkCol];
/* 136 */                 if (currentPlayer == values.PLAYER1) {
/* 137 */                   Thread.sleep(120L);
/* 138 */                   input[counter].setText("0");
/*     */                 } else {
/* 140 */                   Thread.sleep(120L);
/* 141 */                   input[counter].setText("X");
/*     */                 }
/* 143 */                 Thread.sleep(120L);
/* 144 */                 this.board[checkRow][checkCol] = currentPlayer;
/* 145 */                 checkRow -= adj[0][i];
/* 146 */                 checkCol -= adj[1][i];
/*     */               }
/* 148 */               int counter = ui[row][col];
/* 149 */               if (currentPlayer == values.PLAYER1)
/* 150 */                 input[counter].setText("0");
/*     */               else {
/* 152 */                 input[counter].setText("X");
/*     */               }
/* 154 */               this.board[row][col] = currentPlayer;
/* 155 */               i++;
/* 156 */               break;
/*     */             }
/* 158 */             i++;
/* 159 */             break;
/*     */           }
/*     */ 
/* 162 */           i++;
/* 163 */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public int countplayer1()
/*     */   {
/* 171 */     int player1 = 0;
/* 172 */     for (int i = 0; i < 8; i++) {
/* 173 */       for (int j = 0; j < 8; j++) {
/* 174 */         if (this.board[i][j] == values.PLAYER1) {
/* 175 */           player1++;
/*     */         }
/*     */       }
/*     */     }
/* 179 */     return player1;
/*     */   }
/*     */ 
/*     */   public int countplayer2() {
/* 183 */     int player2 = 0;
/* 184 */     for (int i = 0; i < 8; i++) {
/* 185 */       for (int j = 0; j < 8; j++) {
/* 186 */         if (this.board[i][j] == values.PLAYER2) {
/* 187 */           player2++;
/*     */         }
/*     */       }
/*     */     }
/* 191 */     return player2;
/*     */   }
/*     */ 
/*     */   public status boardStatus() {
/* 195 */     return this.currentStatus;
/*     */   }
/*     */ 
/*     */   public static enum status
/*     */   {
/*  10 */     NOTDONE, PLAYER1, PLAYER2, DRAW, NOMOVE;
/*     */   }
/*     */ 
/*     */   public static enum values
/*     */   {
/*   7 */     NONE, PLAYER1, PLAYER2;
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Othello.OthelloBoard
 * JD-Core Version:    0.6.2
 */