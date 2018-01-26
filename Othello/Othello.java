/*     */ package Othello;
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
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class Othello extends JFrame
/*     */   implements ActionListener
/*     */ {
/*  14 */   public static int buttonIndex = 0;
/*  15 */   public static boolean actionPerformed = false;
/*  16 */   public static boolean invalid = false;
/*     */   private static final long serialVersionUID = 1L;
/*  18 */   JPanel[] row = new JPanel[10];
/*  19 */   JButton[] button = new JButton[64];
/*  20 */   String[] buttonString = { " " };
/*     */ 
/*  22 */   int[] dimW = { 280, 45, 100, 90 };
/*  23 */   int[] dimH = { 50, 40 };
/*  24 */   Dimension displayDimension = new Dimension(this.dimW[0], this.dimH[0]);
/*  25 */   Dimension regularDimension = new Dimension(this.dimW[1], this.dimH[1]);
/*     */ 
/*  27 */   JTextArea display = new JTextArea(1, 30);
/*  28 */   Font font = new Font("Times new Roman", 1, 14);
/*     */ 
/*     */   public Othello() {
/*  31 */     super("Othello");
/*  32 */     setDesign();
/*  33 */     setSize(450, 450);
/*  34 */     setResizable(true);
/*  35 */     setDefaultCloseOperation(3);
/*     */ 
/*  37 */     GridLayout grid = new GridLayout(10, 10);
/*  38 */     setLayout(grid);
/*     */ 
/*  40 */     FlowLayout f1 = new FlowLayout(1);
/*  41 */     FlowLayout f2 = new FlowLayout(1, 1, 1);
/*     */ 
/*  43 */     for (int i = 0; i < 10; i++) {
/*  44 */       this.row[i] = new JPanel();
/*     */     }
/*  46 */     this.row[0].setLayout(f1);
/*  47 */     this.row[9].setLayout(f1);
/*     */ 
/*  49 */     for (int i = 1; i < 9; i++) {
/*  50 */       this.row[i].setLayout(f2);
/*     */     }
/*     */ 
/*  53 */     for (int i = 0; i < 64; i++) {
/*  54 */       this.button[i] = new JButton();
/*  55 */       this.button[i].setText(" ");
/*  56 */       this.button[i].setFont(this.font);
/*  57 */       this.button[i].addActionListener(this);
/*     */     }
/*     */ 
/*  60 */     this.display.setFont(this.font);
/*  61 */     this.display.setEditable(false);
/*  62 */     this.display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
/*  63 */     this.display.setPreferredSize(this.displayDimension);
/*     */ 
/*  65 */     for (int i = 0; i < 64; i++) {
/*  66 */       this.button[i].setPreferredSize(this.regularDimension);
/*     */     }
/*     */ 
/*  70 */     this.row[0].add(this.display);
/*  71 */     add(this.row[0]);
/*     */ 
/*  73 */     for (int i = 0; i < 8; i++) {
/*  74 */       this.row[1].add(this.button[i]);
/*     */     }
/*     */ 
/*  77 */     add(this.row[1]);
/*     */ 
/*  79 */     for (int i = 8; i < 16; i++) {
/*  80 */       this.row[2].add(this.button[i]);
/*     */     }
/*     */ 
/*  83 */     add(this.row[2]);
/*     */ 
/*  85 */     for (int i = 16; i < 24; i++) {
/*  86 */       this.row[3].add(this.button[i]);
/*     */     }
/*     */ 
/*  89 */     add(this.row[3]);
/*     */ 
/*  91 */     for (int i = 24; i < 32; i++) {
/*  92 */       this.row[4].add(this.button[i]);
/*     */     }
/*     */ 
/*  95 */     add(this.row[4]);
/*     */ 
/*  97 */     for (int i = 32; i < 40; i++) {
/*  98 */       this.row[5].add(this.button[i]);
/*     */     }
/*     */ 
/* 101 */     add(this.row[5]);
/*     */ 
/* 103 */     for (int i = 40; i < 48; i++) {
/* 104 */       this.row[6].add(this.button[i]);
/*     */     }
/*     */ 
/* 107 */     add(this.row[6]);
/*     */ 
/* 109 */     for (int i = 48; i < 56; i++) {
/* 110 */       this.row[7].add(this.button[i]);
/*     */     }
/*     */ 
/* 113 */     add(this.row[7]);
/*     */ 
/* 115 */     for (int i = 56; i < 64; i++) {
/* 116 */       this.row[8].add(this.button[i]);
/*     */     }
/*     */ 
/* 119 */     add(this.row[8]);
/*     */ 
/* 121 */     setVisible(true);
/*     */ 
/* 123 */     this.button[27].setText("X");
/* 124 */     this.button[28].setText("0");
/* 125 */     this.button[35].setText("0");
/* 126 */     this.button[36].setText("X");
/*     */   }
/*     */ 
/*     */   public final void setDesign() {
/*     */     try {
/* 131 */       UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void actionPerformed(ActionEvent ae)
/*     */   {
/* 140 */     for (int k = 0; k < 64; k++) {
/* 141 */       if (ae.getSource() == this.button[k]) {
/*     */         break;
/*     */       }
/*     */     }
/* 145 */     buttonIndex = k;
/* 146 */     actionPerformed = true;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) throws InterruptedException
/*     */   {
/* 151 */     Othello oth = new Othello();
/* 152 */     String first = JOptionPane.showInputDialog("Please enter the name of first player");
/* 153 */     String second = JOptionPane.showInputDialog("Please enter the name of second player");
/* 154 */     Player player1 = new Player(first);
/* 155 */     Player player2 = new Player(second);
/*     */ 
/* 158 */     OthelloBoard board = new OthelloBoard();
/* 159 */     boolean done = false;
/* 160 */     Player currentPlayer = player1;
/* 161 */     OthelloBoard.values playerNumber = OthelloBoard.values.PLAYER1;
/* 162 */     while (!done)
/*     */     {
/* 164 */       oth.display.setText(currentPlayer.getName() + "  your move");
/*     */ 
/* 167 */       boolean wasCorrectInput = false;
/*     */ 
/* 171 */       Thread.sleep(1000L);
/* 172 */       while (!wasCorrectInput) {
/* 173 */         if (actionPerformed) {
/* 174 */           int row = buttonIndex / 8;
/* 175 */           int column = buttonIndex % 8;
/*     */           try
/*     */           {
/* 178 */             board.updateBoard(playerNumber, row, column, oth.button);
/* 179 */             wasCorrectInput = true;
/*     */           } catch (InvalidMoveException e) {
/* 181 */             oth.display.setText(currentPlayer.getName() + " : Invalid input. Please Try again ");
/*     */           }
/*     */         }
/*     */       }
/* 185 */       if (board.boardStatus() == OthelloBoard.status.NOMOVE) {
/* 186 */         oth.display.setText(player1.getName() + " has no moves left. ");
/* 187 */         actionPerformed = false;
/*     */       }
/* 190 */       else if (board.boardStatus() != OthelloBoard.status.NOTDONE) {
/* 191 */         done = false;
/*     */       }
/*     */       else {
/* 194 */         currentPlayer = currentPlayer == player1 ? player2 : player1;
/* 195 */         playerNumber = playerNumber == OthelloBoard.values.PLAYER1 ? OthelloBoard.values.PLAYER2 : OthelloBoard.values.PLAYER1;
/* 196 */         actionPerformed = false;
/*     */       }
/*     */     }
/*     */ 
/* 200 */     if (board.boardStatus() == OthelloBoard.status.DRAW)
/* 201 */       JOptionPane.showInputDialog("DRAW!");
/* 202 */     else if (board.boardStatus() == OthelloBoard.status.PLAYER1)
/* 203 */       JOptionPane.showInputDialog("Winner : " + player1.getName());
/*     */     else
/* 205 */       JOptionPane.showInputDialog("Winner : " + player2.getName());
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Othello.Othello
 * JD-Core Version:    0.6.2
 */