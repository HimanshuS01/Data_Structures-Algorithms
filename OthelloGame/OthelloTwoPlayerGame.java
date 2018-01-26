/*     */ package OthelloGame;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.ComponentOrientation;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class OthelloTwoPlayerGame extends JFrame
/*     */   implements ActionListener
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   boolean isPlayerBlackTurn;
/*  30 */   Color defaultColour = Color.orange;
/*     */   Color flipColour;
/*  33 */   String black = getPlayerName("First");
/*  34 */   String white = getPlayerName("Second");
/*     */ 
/*  37 */   JPanel[] row = new JPanel[10];
/*     */ 
/*  39 */   JButton[][] button = new JButton[8][8];
/*  40 */   JButton newGame = new JButton("New Game");
/*  41 */   JButton exit = new JButton("Exit");
/*     */ 
/*  43 */   int[] dimW = { 300, 70, 150 };
/*  44 */   int[] dimH = { 30, 40, 30 };
/*     */ 
/*  46 */   Dimension displayDimension = new Dimension(this.dimW[0], this.dimH[0]);
/*  47 */   Dimension ButtonDimension = new Dimension(this.dimW[1], this.dimH[1]);
/*  48 */   Dimension newGameDimension = new Dimension(this.dimW[2], this.dimH[2]);
/*     */ 
/*  50 */   JTextArea display = new JTextArea(1, 10);
/*     */ 
/*  52 */   JTextField[] score = new JTextField[2];
/*     */ 
/*  55 */   JLabel[] player = new JLabel[2];
/*     */ 
/*  57 */   Font font1 = new Font("Times new Roman", 1, 28);
/*  58 */   Font font2 = new Font("Times new Roman", 1, 20);
/*     */ 
/*  62 */   FlowLayout f1 = new FlowLayout(1);
/*  63 */   FlowLayout f2 = new FlowLayout(1, 1, 1);
/*     */ 
/*  69 */   Coordinates temporarySourceButtonCoordinates = new Coordinates();
/*  70 */   Coordinates temporaryButtonCoordinates = new Coordinates();
/*     */ 
/*     */   public OthelloTwoPlayerGame()
/*     */   {
/*  75 */     super("Othello");
/*  76 */     setDesign();
/*  77 */     setSize(670, 600);
/*  78 */     setResizable(true);
/*  79 */     setDefaultCloseOperation(3);
/*  80 */     GridLayout grid = new GridLayout(10, 10);
/*  81 */     setLayout(grid);
/*     */ 
/*  84 */     for (int i = 0; i < 10; i++) {
/*  85 */       this.row[i] = new JPanel();
/*     */     }
/*     */ 
/*  89 */     this.row[0].setLayout(this.f1);
/*  90 */     this.row[9].setLayout(this.f1);
/*     */ 
/*  93 */     for (int i = 1; i < 9; i++) {
/*  94 */       this.row[i].setLayout(this.f2);
/*     */     }
/*     */ 
/*  98 */     for (int i = 0; i < 8; i++) {
/*  99 */       for (int j = 0; j < 8; j++) {
/* 100 */         this.button[i][j] = new JButton();
/* 101 */         this.button[i][j].addActionListener(this);
/* 102 */         this.button[i][j].setPreferredSize(this.ButtonDimension);
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 108 */     buttonSetting(this.newGame);
/*     */ 
/* 111 */     buttonSetting(this.exit);
/*     */ 
/* 115 */     this.display.setFont(this.font1);
/* 116 */     this.display.setEditable(false);
/* 117 */     this.display.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
/* 118 */     this.display.setPreferredSize(this.displayDimension);
/*     */ 
/* 121 */     this.row[0].add(this.newGame);
/* 122 */     this.row[0].add(this.display);
/* 123 */     this.row[0].add(this.exit);
/* 124 */     add(this.row[0]);
/*     */ 
/* 127 */     for (int i = 8; i > 0; i--) {
/* 128 */       for (int j = 0; j < 8; j++) {
/* 129 */         this.row[i].add(this.button[(i - 1)][j]);
/*     */       }
/* 131 */       add(this.row[i]);
/*     */     }
/*     */ 
/* 135 */     for (int i = 0; i < 2; i++)
/*     */     {
/* 137 */       this.player[i] = new JLabel();
/* 138 */       this.player[i].setPreferredSize(this.ButtonDimension);
/* 139 */       this.player[i].setFont(this.font2);
/* 140 */       this.player[i].setForeground(Color.red);
/* 141 */       this.player[i].setVisible(true);
/*     */ 
/* 143 */       this.score[i] = new JTextField();
/* 144 */       this.score[i].setPreferredSize(this.ButtonDimension);
/* 145 */       this.score[i].setEditable(false);
/* 146 */       this.score[i].setFont(this.font2);
/* 147 */       this.score[i].setForeground(Color.red);
/* 148 */       this.score[i].setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
/*     */     }
/*     */ 
/* 153 */     this.row[9].add(this.player[0]);
/* 154 */     for (int i = 0; i < 2; i++) {
/* 155 */       this.row[9].add(this.score[i]);
/*     */     }
/* 157 */     this.row[9].add(this.player[1]);
/* 158 */     add(this.row[9]);
/*     */ 
/* 160 */     this.score[0].setBackground(Color.black);
/* 161 */     this.score[1].setBackground(Color.white);
/*     */ 
/* 163 */     this.player[0].setText("First");
/* 164 */     this.player[1].setText("Second");
/*     */ 
/* 166 */     initialise();
/*     */   }
/*     */ 
/*     */   public void buttonSetting(JButton setButton)
/*     */   {
/* 172 */     setButton.setEnabled(true);
/* 173 */     setButton.setForeground(Color.red);
/* 174 */     setButton.setBackground(Color.gray);
/* 175 */     setButton.setFont(this.font2);
/* 176 */     setButton.addActionListener(this);
/* 177 */     setButton.setPreferredSize(this.newGameDimension);
/* 178 */     setDesign2();
/*     */   }
/*     */ 
/*     */   public final void setDesign()
/*     */   {
/*     */     try
/*     */     {
/* 185 */       UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
/*     */     } catch (Exception localException) {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void setDesign2() {
/*     */     try {
/* 192 */       UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void initialise()
/*     */   {
/* 202 */     for (int i = 0; i < 8; i++) {
/* 203 */       for (int j = 0; j < 8; j++) {
/* 204 */         this.button[i][j].setEnabled(false);
/* 205 */         this.button[i][j].setForeground(Color.gray);
/* 206 */         this.button[i][j].setBackground(this.defaultColour);
/*     */       }
/*     */     }
/*     */ 
/* 210 */     this.isPlayerBlackTurn = true;
/* 211 */     this.display.setText(this.black + "'s turn");
/*     */ 
/* 213 */     this.button[3][3].setEnabled(true);
/* 214 */     this.button[4][4].setEnabled(true);
/* 215 */     this.button[3][4].setEnabled(true);
/* 216 */     this.button[4][3].setEnabled(true);
/*     */ 
/* 218 */     this.button[3][3].setBackground(Color.BLACK);
/* 219 */     this.button[4][4].setBackground(Color.BLACK);
/*     */ 
/* 221 */     this.button[3][4].setBackground(Color.WHITE);
/* 222 */     this.button[4][3].setBackground(Color.WHITE);
/*     */ 
/* 224 */     this.score[0].setText("0");
/* 225 */     this.score[1].setText("0");
/*     */ 
/* 227 */     showPossibleMoves(Color.BLACK);
/* 228 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void changeColour(Coordinates buttonCoordinates, Color currentPlayerColor)
/*     */   {
/* 235 */     if (this.isPlayerBlackTurn)
/* 236 */       this.flipColour = Color.WHITE;
/*     */     else {
/* 238 */       this.flipColour = Color.BLACK;
/*     */     }
/*     */ 
/* 241 */     Coordinates left = this.temporaryButtonCoordinates;
/*     */ 
/* 243 */     buttonCoordinates.x -= 1;
/* 244 */     left.y = buttonCoordinates.y;
/*     */ 
/* 246 */     if ((left.x >= 0) && (!this.button[left.x][left.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 248 */       while ((left.x >= 0) && (this.button[left.x][left.y].getBackground().equals(this.flipColour))) {
/* 249 */         left.x -= 1;
/*     */       }
/* 251 */       if ((left.x != -1) && (!this.button[left.x][left.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 255 */         for (int i = left.x + 1; i <= buttonCoordinates.x; i++) {
/* 256 */           this.button[i][left.y].setBackground(currentPlayerColor);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 261 */     Coordinates right = this.temporaryButtonCoordinates;
/*     */ 
/* 263 */     buttonCoordinates.x += 1;
/* 264 */     right.y = buttonCoordinates.y;
/*     */ 
/* 266 */     if ((right.x <= 7) && (!this.button[right.x][right.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 268 */       while ((right.x <= 7) && (this.button[right.x][right.y].getBackground().equals(this.flipColour))) {
/* 269 */         right.x += 1;
/*     */       }
/* 271 */       if ((right.x != 8) && (!this.button[right.x][right.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 275 */         for (int i = right.x - 1; i >= buttonCoordinates.x; i--) {
/* 276 */           this.button[i][right.y].setBackground(currentPlayerColor);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 281 */     Coordinates north = this.temporaryButtonCoordinates;
/*     */ 
/* 283 */     north.x = buttonCoordinates.x;
/* 284 */     buttonCoordinates.y += 1;
/*     */ 
/* 286 */     if ((north.y <= 7) && (!this.button[north.x][north.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 288 */       while ((north.y <= 7) && (this.button[north.x][north.y].getBackground().equals(this.flipColour))) {
/* 289 */         north.y += 1;
/*     */       }
/* 291 */       if ((north.y != 8) && (!this.button[north.x][north.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 295 */         for (int i = north.y - 1; i >= buttonCoordinates.y; i--) {
/* 296 */           this.button[north.x][i].setBackground(currentPlayerColor);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 301 */     Coordinates south = this.temporaryButtonCoordinates;
/*     */ 
/* 303 */     south.x = buttonCoordinates.x;
/* 304 */     buttonCoordinates.y -= 1;
/*     */ 
/* 306 */     if ((south.y >= 0) && (!this.button[south.x][south.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 308 */       while ((south.y >= 0) && (this.button[south.x][south.y].getBackground().equals(this.flipColour))) {
/* 309 */         south.y -= 1;
/*     */       }
/* 311 */       if ((south.y != -1) && (!this.button[south.x][south.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 315 */         for (int i = south.y + 1; i <= buttonCoordinates.y; i++) {
/* 316 */           this.button[south.x][i].setBackground(currentPlayerColor);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 321 */     Coordinates northWest = this.temporaryButtonCoordinates;
/*     */ 
/* 323 */     buttonCoordinates.x -= 1;
/* 324 */     buttonCoordinates.y += 1;
/*     */ 
/* 326 */     if ((northWest.x >= 0) && (northWest.y <= 7) && 
/* 327 */       (!this.button[northWest.x][northWest.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 329 */       while ((northWest.x >= 0) && (northWest.y <= 7) && 
/* 330 */         (this.button[northWest.x][northWest.y].getBackground().equals(this.flipColour))) {
/* 331 */         northWest.y += 1;
/* 332 */         northWest.x -= 1;
/*     */       }
/*     */ 
/* 335 */       if ((northWest.x != -1) && (northWest.y != 8) && 
/* 336 */         (!this.button[northWest.x][northWest.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 340 */         for (int i = northWest.y - 1; i >= buttonCoordinates.y; i--) {
/* 341 */           northWest.x += 1;
/* 342 */           this.button[northWest.x][i].setBackground(currentPlayerColor);
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 348 */     Coordinates northEast = this.temporaryButtonCoordinates;
/*     */ 
/* 350 */     buttonCoordinates.x += 1;
/* 351 */     buttonCoordinates.y += 1;
/*     */ 
/* 353 */     if ((northEast.x <= 7) && (northEast.y <= 7) && 
/* 354 */       (!this.button[northEast.x][northEast.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 356 */       while ((northEast.x <= 7) && (northEast.y <= 7) && 
/* 357 */         (this.button[northEast.x][northEast.y].getBackground().equals(this.flipColour))) {
/* 358 */         northEast.y += 1;
/* 359 */         northEast.x += 1;
/*     */       }
/*     */ 
/* 362 */       if ((northEast.x != 8) && (northEast.y != 8) && 
/* 363 */         (!this.button[northEast.x][northEast.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 367 */         for (int i = northEast.y - 1; i >= buttonCoordinates.y; i--) {
/* 368 */           northEast.x -= 1;
/* 369 */           this.button[northEast.x][i].setBackground(currentPlayerColor);
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 375 */     Coordinates southEast = this.temporaryButtonCoordinates;
/*     */ 
/* 377 */     buttonCoordinates.x += 1;
/* 378 */     buttonCoordinates.y -= 1;
/*     */ 
/* 380 */     if ((southEast.x <= 7) && (southEast.y >= 0) && (!this.button[southEast.x][southEast.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 382 */       while ((southEast.x <= 7) && (southEast.y >= 0) && 
/* 383 */         (this.button[southEast.x][southEast.y].getBackground().equals(this.flipColour))) {
/* 384 */         southEast.y -= 1;
/* 385 */         southEast.x += 1;
/*     */       }
/*     */ 
/* 388 */       if ((southEast.x != 8) && (southEast.y != -1) && 
/* 389 */         (!this.button[southEast.x][southEast.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 393 */         for (int i = southEast.y + 1; i <= buttonCoordinates.y; i++) {
/* 394 */           southEast.x -= 1;
/* 395 */           this.button[southEast.x][i].setBackground(currentPlayerColor);
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 401 */     Coordinates southWest = this.temporaryButtonCoordinates;
/*     */ 
/* 403 */     buttonCoordinates.x -= 1;
/* 404 */     buttonCoordinates.y -= 1;
/*     */ 
/* 406 */     if ((southWest.x >= 0) && (southWest.y >= 0) && 
/* 407 */       (!this.button[southWest.x][southWest.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 409 */       while ((southWest.x >= 0) && (southWest.y >= 0) && 
/* 410 */         (this.button[southWest.x][southWest.y].getBackground().equals(this.flipColour))) {
/* 411 */         southWest.y -= 1;
/* 412 */         southWest.x -= 1;
/*     */       }
/*     */ 
/* 415 */       if ((southWest.x != -1) && (southWest.y != -1) && 
/* 416 */         (!this.button[southWest.x][southWest.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 420 */         for (int i = southWest.y + 1; i <= buttonCoordinates.y; i++) {
/* 421 */           southWest.x += 1;
/* 422 */           this.button[southWest.x][i].setBackground(currentPlayerColor);
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 429 */     for (int i = 0; i < 8; i++)
/* 430 */       for (int j = 0; j < 8; j++) {
/* 431 */         this.button[i][j].setForeground(Color.gray);
/* 432 */         if (this.button[i][j].getBackground().equals(Color.orange))
/* 433 */           this.button[i][j].setEnabled(false);
/*     */       }
/*     */   }
/*     */ 
/*     */   public int countPossibleMoves(Coordinates buttonCoordinates, Color currentPlayerColor)
/*     */   {
/* 443 */     int countNoOfFlippable = 0;
/*     */ 
/* 445 */     if (this.isPlayerBlackTurn)
/* 446 */       this.flipColour = Color.WHITE;
/*     */     else {
/* 448 */       this.flipColour = Color.BLACK;
/*     */     }
/*     */ 
/* 451 */     Coordinates left = this.temporaryButtonCoordinates;
/*     */ 
/* 453 */     buttonCoordinates.x -= 1;
/* 454 */     left.y = buttonCoordinates.y;
/*     */ 
/* 456 */     if ((left.x >= 0) && (!this.button[left.x][left.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 458 */       while ((left.x >= 0) && (this.button[left.x][left.y].getBackground().equals(this.flipColour))) {
/* 459 */         left.x -= 1;
/*     */       }
/* 461 */       if ((left.x != -1) && (!this.button[left.x][left.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 465 */         for (int i = left.x + 1; i <= buttonCoordinates.x - 1; i++) {
/* 466 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 471 */     Coordinates right = this.temporaryButtonCoordinates;
/*     */ 
/* 473 */     buttonCoordinates.x += 1;
/* 474 */     right.y = buttonCoordinates.y;
/*     */ 
/* 476 */     if ((right.x <= 7) && (!this.button[right.x][right.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 478 */       while ((right.x <= 7) && (this.button[right.x][right.y].getBackground().equals(this.flipColour))) {
/* 479 */         right.x += 1;
/*     */       }
/* 481 */       if ((right.x != 8) && (!this.button[right.x][right.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 485 */         for (int i = right.x - 1; i >= buttonCoordinates.x + 1; i--) {
/* 486 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 491 */     Coordinates north = this.temporaryButtonCoordinates;
/*     */ 
/* 493 */     north.x = buttonCoordinates.x;
/* 494 */     buttonCoordinates.y += 1;
/*     */ 
/* 496 */     if ((north.y <= 7) && (!this.button[north.x][north.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 498 */       while ((north.y <= 7) && (this.button[north.x][north.y].getBackground().equals(this.flipColour))) {
/* 499 */         north.y += 1;
/*     */       }
/* 501 */       if ((north.y != 8) && (!this.button[north.x][north.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 505 */         for (int i = north.y - 1; i >= buttonCoordinates.y + 1; i--) {
/* 506 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 511 */     Coordinates south = this.temporaryButtonCoordinates;
/*     */ 
/* 513 */     south.x = buttonCoordinates.x;
/* 514 */     buttonCoordinates.y -= 1;
/*     */ 
/* 516 */     if ((south.y >= 0) && (!this.button[south.x][south.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 518 */       while ((south.y >= 0) && (this.button[south.x][south.y].getBackground().equals(this.flipColour))) {
/* 519 */         south.y -= 1;
/*     */       }
/* 521 */       if ((south.y != -1) && (!this.button[south.x][south.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 525 */         for (int i = south.y + 1; i <= buttonCoordinates.y - 1; i++) {
/* 526 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 531 */     Coordinates northWest = this.temporaryButtonCoordinates;
/*     */ 
/* 533 */     buttonCoordinates.x -= 1;
/* 534 */     buttonCoordinates.y += 1;
/*     */ 
/* 536 */     if ((northWest.x >= 0) && (northWest.y <= 7) && 
/* 537 */       (!this.button[northWest.x][northWest.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 539 */       while ((northWest.x >= 0) && (northWest.y <= 7) && 
/* 540 */         (this.button[northWest.x][northWest.y].getBackground().equals(this.flipColour))) {
/* 541 */         northWest.y += 1;
/* 542 */         northWest.x -= 1;
/*     */       }
/*     */ 
/* 545 */       if ((northWest.x != -1) && (northWest.y != 8) && 
/* 546 */         (!this.button[northWest.x][northWest.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 550 */         for (int i = northWest.y - 1; i >= buttonCoordinates.y + 1; i--) {
/* 551 */           this.temporaryButtonCoordinates.x += 1;
/* 552 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 558 */     Coordinates northEast = this.temporaryButtonCoordinates;
/*     */ 
/* 560 */     buttonCoordinates.x += 1;
/* 561 */     buttonCoordinates.y += 1;
/*     */ 
/* 563 */     if ((northEast.x <= 7) && (northEast.y <= 7) && 
/* 564 */       (!this.button[northEast.x][northEast.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 566 */       while ((northEast.x <= 7) && (northEast.y <= 7) && 
/* 567 */         (this.button[northEast.x][northEast.y].getBackground().equals(this.flipColour))) {
/* 568 */         northEast.y += 1;
/* 569 */         northEast.x += 1;
/*     */       }
/*     */ 
/* 572 */       if ((northEast.x != 8) && (northEast.y != 8) && 
/* 573 */         (!this.button[northEast.x][northEast.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 577 */         for (int i = northEast.y - 1; i >= buttonCoordinates.y + 1; i--) {
/* 578 */           northEast.x -= 1;
/* 579 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 585 */     Coordinates southEast = this.temporaryButtonCoordinates;
/*     */ 
/* 587 */     buttonCoordinates.x += 1;
/* 588 */     buttonCoordinates.y -= 1;
/*     */ 
/* 590 */     if ((southEast.x <= 7) && (southEast.y >= 0) && 
/* 591 */       (!this.button[southEast.x][southEast.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 593 */       while ((southEast.x <= 7) && (southEast.y >= 0) && 
/* 594 */         (this.button[southEast.x][southEast.y].getBackground().equals(this.flipColour))) {
/* 595 */         southEast.y -= 1;
/* 596 */         southEast.x += 1;
/*     */       }
/*     */ 
/* 599 */       if ((southEast.x != 8) && (southEast.y != -1) && 
/* 600 */         (!this.button[southEast.x][southEast.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 604 */         for (int i = southEast.y + 1; i <= buttonCoordinates.y - 1; i++) {
/* 605 */           southEast.x -= 1;
/* 606 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 611 */     Coordinates southWest = this.temporaryButtonCoordinates;
/*     */ 
/* 613 */     buttonCoordinates.x -= 1;
/* 614 */     buttonCoordinates.y -= 1;
/*     */ 
/* 616 */     if ((southWest.x >= 0) && (southWest.y >= 0) && 
/* 617 */       (!this.button[southWest.x][southWest.y].getBackground().equals(this.defaultColour)))
/*     */     {
/* 619 */       while ((southWest.x >= 0) && (southWest.y >= 0) && 
/* 620 */         (this.button[southWest.x][southWest.y].getBackground().equals(this.flipColour))) {
/* 621 */         southWest.y -= 1;
/* 622 */         southWest.x -= 1;
/*     */       }
/*     */ 
/* 625 */       if ((southWest.x != -1) && (southWest.y != -1) && 
/* 626 */         (!this.button[southWest.x][southWest.y].getBackground().equals(this.defaultColour)))
/*     */       {
/* 630 */         for (int i = southWest.y + 1; i <= buttonCoordinates.y - 1; i++) {
/* 631 */           southWest.x += 1;
/* 632 */           countNoOfFlippable++;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 637 */     return countNoOfFlippable;
/*     */   }
/*     */ 
/*     */   public void showPossibleMoves(Color nextPlayerColour)
/*     */   {
/* 646 */     Coordinates buttonCoordinates = new Coordinates();
/*     */ 
/* 648 */     for (int i = 0; i < 8; i++)
/* 649 */       for (int j = 0; j < 8; j++)
/*     */       {
/* 651 */         JButton nextPossibleMove = this.button[i][j];
/* 652 */         buttonCoordinates.x = i;
/* 653 */         buttonCoordinates.y = j;
/*     */ 
/* 655 */         int countOfNextMove = 0;
/*     */ 
/* 657 */         if (nextPossibleMove.getBackground().equals(this.defaultColour))
/*     */         {
/* 659 */           countOfNextMove = countPossibleMoves(buttonCoordinates, nextPlayerColour);
/*     */ 
/* 661 */           if (countOfNextMove != 0)
/*     */           {
/* 666 */             nextPossibleMove.setForeground(Color.red);
/* 667 */             nextPossibleMove.setEnabled(true);
/*     */           }
/*     */         }
/*     */       }
/*     */   }
/*     */ 
/*     */   public void getGameStatus(Color playerColour)
/*     */   {
/* 681 */     int countPossibleMovesForNextPlayer = 0; int countPossibleMovesForCurrentPlayer = 0;
/* 682 */     int blackScore = 0; int whiteScore = 0;
/*     */ 
/* 686 */     for (int i = 0; i < 8; i++) {
/* 687 */       for (int j = 0; j < 8; j++)
/*     */       {
/* 689 */         if (this.button[i][j].getBackground().equals(Color.BLACK)) {
/* 690 */           blackScore++;
/*     */         }
/* 692 */         else if (this.button[i][j].getBackground().equals(Color.WHITE))
/* 693 */           whiteScore++;
/*     */       }
/*     */     }
/* 696 */     this.score[0].setText(blackScore);
/* 697 */     this.score[1].setText(whiteScore);
/*     */ 
/* 701 */     this.isPlayerBlackTurn = (!this.isPlayerBlackTurn);
/*     */     Color nextPlayerColour;
/*     */     Color nextPlayerColour;
/* 703 */     if (this.isPlayerBlackTurn)
/* 704 */       nextPlayerColour = Color.BLACK;
/*     */     else {
/* 706 */       nextPlayerColour = Color.WHITE;
/*     */     }
/* 708 */     showPossibleMoves(nextPlayerColour);
/*     */ 
/* 712 */     for (int i = 0; i < 8; i++) {
/* 713 */       for (int j = 0; j < 8; j++) {
/* 714 */         if (this.button[i][j].getForeground().equals(Color.RED))
/*     */         {
/* 716 */           countPossibleMovesForNextPlayer++;
/*     */         }
/*     */       }
/*     */     }
/* 720 */     if (countPossibleMovesForNextPlayer == 0)
/*     */     {
/* 723 */       this.isPlayerBlackTurn = (!this.isPlayerBlackTurn);
/*     */       Color currentPlayerColour;
/*     */       Color currentPlayerColour;
/* 725 */       if (this.isPlayerBlackTurn)
/* 726 */         currentPlayerColour = Color.BLACK;
/*     */       else {
/* 728 */         currentPlayerColour = Color.WHITE;
/*     */       }
/* 730 */       showPossibleMoves(currentPlayerColour);
/*     */ 
/* 733 */       for (int i = 0; i < 8; i++) {
/* 734 */         for (int j = 0; j < 8; j++) {
/* 735 */           if (this.button[i][j].getForeground().equals(Color.RED))
/*     */           {
/* 737 */             countPossibleMovesForCurrentPlayer++;
/*     */           }
/*     */         }
/*     */       }
/* 741 */       if (countPossibleMovesForCurrentPlayer == 0)
/*     */       {
/* 744 */         this.display.setText(" ");
/*     */ 
/* 746 */         if (blackScore == whiteScore) {
/* 747 */           JOptionPane.showMessageDialog(this, "THIS MATCH IS A DRAW!");
/*     */         }
/* 749 */         else if (blackScore > whiteScore)
/* 750 */           JOptionPane.showMessageDialog(this, "CONGRATULATIONS \n" + this.black + " WINS!");
/*     */         else {
/* 752 */           JOptionPane.showMessageDialog(this, "CONGRATULATIONS  \n" + this.white + " WINS!");
/*     */         }
/*     */ 
/*     */       }
/* 757 */       else if (this.isPlayerBlackTurn) {
/* 758 */         this.display.setText(this.white + ":NO VALID MOVE." + this.black + "'s turn ");
/* 759 */         playerColour = Color.BLACK;
/*     */       }
/*     */       else
/*     */       {
/* 763 */         this.display.setText(this.black + ":NO VALID MOVE." + this.white + "'s turn");
/* 764 */         playerColour = Color.WHITE;
/*     */       }
/*     */ 
/*     */     }
/* 772 */     else if (this.isPlayerBlackTurn) {
/* 773 */       this.display.setText(this.black + "'s turn");
/* 774 */       playerColour = Color.BLACK;
/*     */     }
/*     */     else
/*     */     {
/* 778 */       this.display.setText(this.white + "'s turn");
/* 779 */       playerColour = Color.WHITE;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void actionPerformed(ActionEvent ae)
/*     */   {
/* 789 */     JButton clickedButton = (JButton)ae.getSource();
/*     */ 
/* 791 */     Coordinates buttonCoordinates = this.temporarySourceButtonCoordinates;
/*     */ 
/* 793 */     if (clickedButton.getBackground().equals(this.defaultColour))
/*     */     {
/* 795 */       for (int i = 0; i < 8; i++)
/* 796 */         for (int j = 0; j < 8; j++)
/* 797 */           if (clickedButton == this.button[i][j]) {
/* 798 */             buttonCoordinates.x = i;
/* 799 */             buttonCoordinates.y = j;
/*     */           }
/*     */       Color playerColour;
/*     */       Color playerColour;
/* 804 */       if (this.isPlayerBlackTurn) {
/* 805 */         playerColour = Color.BLACK;
/*     */       }
/*     */       else {
/* 808 */         playerColour = Color.WHITE;
/*     */       }
/*     */ 
/* 813 */       changeColour(buttonCoordinates, playerColour);
/* 814 */       getGameStatus(playerColour);
/*     */     }
/* 818 */     else if (clickedButton == this.exit)
/*     */     {
/* 820 */       int n = JOptionPane.showConfirmDialog(this, "EXIT CURRENT GAME?", "", 0);
/*     */ 
/* 822 */       if (n == 0) {
/* 823 */         System.exit(0);
/*     */       }
/*     */ 
/*     */     }
/* 827 */     else if (clickedButton == this.newGame)
/*     */     {
/* 829 */       int n = JOptionPane.showConfirmDialog(this, "START NEW GAME?", "", 0);
/*     */ 
/* 831 */       if (n == 0)
/* 832 */         initialise();
/*     */     }
/*     */     else
/*     */     {
/* 836 */       JOptionPane.showMessageDialog(this, "INVALID MOVE!", "ERROR!", 0);
/*     */     }
/*     */   }
/*     */ 
/*     */   public String getPlayerName(String currentPlayer)
/*     */   {
/* 843 */     String input = JOptionPane.showInputDialog("Enter " + currentPlayer + " Player Name");
/* 844 */     return input;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 850 */     OthelloTwoPlayerGame othelloTwoPlayerGame = new OthelloTwoPlayerGame();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     OthelloGame.OthelloTwoPlayerGame
 * JD-Core Version:    0.6.2
 */