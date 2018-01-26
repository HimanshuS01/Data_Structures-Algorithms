/*     */ package Othelo;
/*     */ 
/*     */ import java.awt.ComponentOrientation;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextArea;
/*     */ 
/*     */ public class OtheloBoard extends JFrame
/*     */   implements ActionListener
/*     */ {
/*     */   status currentStatus;
/*  22 */   private final values[][] board = new values[9][];
/*  23 */   public static int buttonIndex = 0;
/*  24 */   public boolean actionPerformed = false;
/*     */   private static final long serialVersionUID = 1L;
/*  27 */   JPanel[] row = new JPanel[9];
/*  28 */   JButton[] button = new JButton[64];
/*     */ 
/*  30 */   int[] dimW = { 300, 45 };
/*  31 */   int[] dimH = { 30, 40 };
/*     */ 
/*  33 */   Dimension displayDimension = new Dimension(this.dimW[0], this.dimH[0]);
/*  34 */   Dimension regularDimension = new Dimension(this.dimW[1], this.dimH[1]);
/*     */ 
/*  36 */   boolean[] function = new boolean[4];
/*  37 */   double[] temporary = { 0.0D, 0.0D };
/*     */ 
/*  40 */   JTextArea display = new JTextArea(1, 100);
/*  41 */   Font font = new Font("Times new Roman", 1, 14);
/*     */ 
/*     */   public OtheloBoard()
/*     */   {
/*  45 */     super("OTHELLO");
/*  46 */     setSize(450, 450);
/*  47 */     setResizable(false);
/*  48 */     setDefaultCloseOperation(3);
/*     */ 
/*  50 */     GridLayout grid = new GridLayout(10, 10);
/*  51 */     setLayout(grid);
/*     */ 
/*  53 */     FlowLayout f1 = new FlowLayout(1);
/*  54 */     FlowLayout f2 = new FlowLayout(1, 1, 1);
/*  55 */     setVisible(true);
/*     */ 
/*  57 */     for (int i = 0; i < 9; i++) {
/*  58 */       this.row[i] = new JPanel();
/*     */     }
/*  60 */     this.row[0].setLayout(f1);
/*     */ 
/*  62 */     for (int i = 1; i < 9; i++) {
/*  63 */       this.row[i].setLayout(f2);
/*     */     }
/*     */ 
/*  66 */     for (int i = 0; i < 64; i++) {
/*  67 */       this.button[i] = new JButton();
/*  68 */       this.button[i].setText(" ");
/*  69 */       this.button[i].setFont(this.font);
/*  70 */       this.button[i].setPreferredSize(this.regularDimension);
/*  71 */       this.button[i].addActionListener(this);
/*     */     }
/*     */ 
/*  75 */     this.display.setFont(this.font);
/*  76 */     this.display.setEditable(false);
/*  77 */     this.display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
/*  78 */     this.display.setPreferredSize(this.displayDimension);
/*     */ 
/*  80 */     this.board[0] = new values[1];
/*  81 */     this.row[0].add(this.display);
/*     */ 
/*  83 */     add(this.row[0]);
/*     */ 
/*  85 */     for (int i = 0; i < 8; i++) {
/*  86 */       this.row[1].add(this.button[i]);
/*     */     }
/*  88 */     add(this.row[1]);
/*     */ 
/*  90 */     for (int i = 8; i < 16; i++) {
/*  91 */       this.row[2].add(this.button[i]);
/*     */     }
/*  93 */     add(this.row[2]);
/*     */ 
/*  95 */     for (int i = 16; i < 24; i++) {
/*  96 */       this.row[3].add(this.button[i]);
/*     */     }
/*  98 */     add(this.row[3]);
/*     */ 
/* 100 */     for (int i = 24; i < 32; i++) {
/* 101 */       this.row[4].add(this.button[i]);
/*     */     }
/* 103 */     add(this.row[4]);
/*     */ 
/* 105 */     for (int i = 32; i < 40; i++) {
/* 106 */       this.row[5].add(this.button[i]);
/*     */     }
/* 108 */     add(this.row[5]);
/*     */ 
/* 110 */     for (int i = 40; i < 48; i++) {
/* 111 */       this.row[6].add(this.button[i]);
/*     */     }
/* 113 */     add(this.row[6]);
/*     */ 
/* 115 */     for (int i = 48; i < 56; i++) {
/* 116 */       this.row[7].add(this.button[i]);
/*     */     }
/* 118 */     add(this.row[7]);
/*     */ 
/* 120 */     for (int i = 56; i < 64; i++) {
/* 121 */       this.row[8].add(this.button[i]);
/*     */     }
/* 123 */     add(this.row[8]);
/*     */ 
/* 126 */     this.button[27].setText("X");
/* 127 */     this.button[28].setText("0");
/* 128 */     this.button[35].setText("0");
/* 129 */     this.button[36].setText("X");
/* 130 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void Update_Board(values CurrentPlayerNumber, int row, int col)
/*     */     throws InvalidMoveException
/*     */   {
/* 136 */     values OpponetPlayerNumber = CurrentPlayerNumber == values.PLAYER1 ? values.PLAYER2 : values.PLAYER1;
/*     */ 
/* 138 */     if ((this.board[row][col] != values.NONE) || (!Is_Move_Possible(CurrentPlayerNumber, row, col))) {
/* 139 */       throw new InvalidMoveException();
/*     */     }
/*     */ 
/* 142 */     if (Is_Move_Possible(CurrentPlayerNumber, row, col)) {
/* 143 */       this.board[row][col] = CurrentPlayerNumber;
/* 144 */       Change_Values(CurrentPlayerNumber, row, col);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void Change_Values(values CurrentPlayerNumber, int row, int col)
/*     */   {
/* 167 */     int[] Row_Inc = { 1, 1, 1, 0, 0, -1, -1, -1 };
/* 168 */     int[] Col_Inc = { 0, -1, 1, 1, -1, 1, -1 };
/* 169 */     int check_row = row;
/* 170 */     int check_col = col;
/*     */   }
/*     */ 
/*     */   public void Board()
/*     */   {
/* 175 */     for (int i = 1; i <= 8; i++) {
/* 176 */       for (int j = 1; j <= 8; j++) {
/* 177 */         this.board[i][j] = values.NONE;
/*     */       }
/*     */     }
/* 180 */     this.board[4][5] = values.PLAYER1;
/* 181 */     this.board[5][4] = values.PLAYER1;
/* 182 */     this.board[4][4] = values.PLAYER2;
/* 183 */     this.board[5][5] = values.PLAYER2;
/*     */ 
/* 185 */     this.currentStatus = status.NOTDONE;
/*     */   }
/*     */ 
/*     */   public status Board_Status() {
/* 189 */     return this.currentStatus;
/*     */   }
/*     */ 
/*     */   public int countplayer1() {
/* 193 */     int player1 = 0;
/* 194 */     for (int i = 1; i <= 8; i++) {
/* 195 */       for (int j = 1; j <= 8; j++) {
/* 196 */         if (this.board[i][j] == values.PLAYER1)
/* 197 */           player1++;
/*     */       }
/*     */     }
/* 200 */     return player1;
/*     */   }
/*     */ 
/*     */   public int countplayer2() {
/* 204 */     int player2 = 0;
/* 205 */     for (int i = 1; i <= 8; i++) {
/* 206 */       for (int j = 1; j <= 8; j++) {
/* 207 */         if (this.board[i][j] == values.PLAYER2)
/* 208 */           player2++;
/*     */       }
/*     */     }
/* 211 */     return player2;
/*     */   }
/*     */ 
/*     */   public boolean Is_Move_Possible(values CurrentPlayerNumber, int row, int col)
/*     */   {
/* 216 */     if ((this.board[row][col] == values.NONE) && 
/* 217 */       (Is_Move_valid(CurrentPlayerNumber, row, col))) {
/* 218 */       return true;
/*     */     }
/*     */ 
/* 221 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean Is_Move_valid(values CurrentPlayerNumber, int row, int col) {
/* 225 */     boolean answer = false;
/* 226 */     while ((row > 0) && (col > 0)) {
/* 227 */       if (this.board[(row + 1)][col] != CurrentPlayerNumber) {
/* 228 */         int i = row + 1; int j = col;
/* 229 */         while ((this.board[i][j] != CurrentPlayerNumber) && (i <= 8)) {
/* 230 */           i++;
/*     */         }
/* 232 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 233 */           answer = true;
/*     */         }
/*     */       }
/* 236 */       else if (this.board[(row - 1)][col] != CurrentPlayerNumber) {
/* 237 */         int i = row - 1; int j = col;
/* 238 */         while ((this.board[i][j] != CurrentPlayerNumber) && (i > 0)) {
/* 239 */           i--;
/*     */         }
/* 241 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 242 */           answer = true;
/*     */         }
/*     */       }
/* 245 */       else if (this.board[row][(col + 1)] != CurrentPlayerNumber) {
/* 246 */         int i = row; int j = col + 1;
/* 247 */         while ((this.board[i][j] != CurrentPlayerNumber) && (j <= 8)) {
/* 248 */           j++;
/*     */         }
/* 250 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 251 */           answer = true;
/*     */         }
/*     */       }
/* 254 */       else if (this.board[row][(col - 1)] != CurrentPlayerNumber) {
/* 255 */         int i = row; int j = col - 1;
/* 256 */         while ((this.board[i][j] != CurrentPlayerNumber) && (j > 0)) {
/* 257 */           j--;
/*     */         }
/* 259 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 260 */           answer = true;
/*     */         }
/*     */       }
/* 263 */       else if (this.board[(row - 1)][(col + 1)] != CurrentPlayerNumber) {
/* 264 */         int i = row - 1; int j = col + 1;
/* 265 */         while ((this.board[i][j] != CurrentPlayerNumber) && (i > 0) && (j <= 8)) {
/* 266 */           i--;
/* 267 */           j++;
/*     */         }
/* 269 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 270 */           answer = true;
/*     */         }
/*     */       }
/* 273 */       else if (this.board[(row + 1)][(col - 1)] != CurrentPlayerNumber) {
/* 274 */         int i = row + 1; int j = col - 1;
/* 275 */         while ((this.board[i][j] != CurrentPlayerNumber) && (i <= 8) && (j > 0)) {
/* 276 */           i++;
/* 277 */           j--;
/*     */         }
/* 279 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 280 */           answer = true;
/*     */         }
/*     */       }
/* 283 */       else if (this.board[(row + 1)][(col + 1)] != CurrentPlayerNumber) {
/* 284 */         int i = row + 1; int j = col + 1;
/* 285 */         while ((this.board[i][j] != CurrentPlayerNumber) && (i <= 8) && (j <= 8)) {
/* 286 */           i++;
/* 287 */           j++;
/*     */         }
/* 289 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 290 */           answer = true;
/*     */         }
/*     */       }
/* 293 */       else if (this.board[(row - 1)][(col - 1)] != CurrentPlayerNumber) {
/* 294 */         int i = row - 1; int j = col - 1;
/* 295 */         while ((this.board[i][j] != CurrentPlayerNumber) && (i > 0) && (j > 0)) {
/* 296 */           i--;
/* 297 */           j--;
/*     */         }
/* 299 */         if (this.board[i][j] == CurrentPlayerNumber) {
/* 300 */           answer = true;
/*     */         }
/*     */       }
/*     */ 
/* 304 */       if (answer) {
/* 305 */         return true;
/*     */       }
/*     */     }
/* 308 */     return false;
/*     */   }
/*     */ 
/*     */   public void actionPerformed(ActionEvent ae) {
/* 312 */     int k = 0;
/* 313 */     for (k = 0; k < 64; k++) {
/* 314 */       if (ae.getSource() == this.button[k]) {
/*     */         break;
/*     */       }
/*     */     }
/* 318 */     buttonIndex = k;
/* 319 */     this.actionPerformed = true;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */   }
/*     */ 
/*     */   public static enum status
/*     */   {
/*  17 */     NOTDONE, PLAYER1, PLAYER2, DRAW, NOMOVE;
/*     */   }
/*     */ 
/*     */   public static enum values
/*     */   {
/*  14 */     NONE, PLAYER1, PLAYER2;
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Othelo.OtheloBoard
 * JD-Core Version:    0.6.2
 */