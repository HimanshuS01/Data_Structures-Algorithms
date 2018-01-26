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
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class Calculator extends JFrame
/*     */   implements ActionListener
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  17 */   JPanel[] row = new JPanel[5];
/*  18 */   JButton[] button = new JButton[19];
/*     */ 
/*  20 */   String[] buttonString = { "7", "8", "9", "+", 
/*  21 */     "4", "5", "6", "-", 
/*  22 */     "1", "2", "3", "*", 
/*  23 */     ".", "/", "C", "ï¿½", 
/*  24 */     "+/-", "=", "0" };
/*     */ 
/*  25 */   int[] dimW = { 280, 45, 100, 90 };
/*  26 */   int[] dimH = { 35, 40 };
/*  27 */   Dimension displayDimension = new Dimension(this.dimW[0], this.dimH[0]);
/*  28 */   Dimension regularDimension = new Dimension(this.dimW[1], this.dimH[1]);
/*  29 */   Dimension rColumnDimension = new Dimension(this.dimW[2], this.dimH[1]);
/*  30 */   Dimension zeroButDimension = new Dimension(this.dimW[3], this.dimH[1]);
/*  31 */   boolean[] function = new boolean[4];
/*  32 */   double[] temporary = { 0.0D, 0.0D };
/*     */ 
/*  34 */   JTextArea display = new JTextArea(1, 20);
/*  35 */   Font font = new Font("Times new Roman", 1, 14);
/*     */ 
/*     */   Calculator() {
/*  38 */     super("Calculator");
/*  39 */     setDesign();
/*  40 */     setSize(340, 250);
/*  41 */     setResizable(false);
/*  42 */     setDefaultCloseOperation(3);
/*  43 */     GridLayout grid = new GridLayout(5, 5);
/*  44 */     setLayout(grid);
/*     */ 
/*  46 */     for (int i = 0; i < 4; i++) {
/*  47 */       this.function[i] = false;
/*     */     }
/*     */ 
/*  51 */     FlowLayout f1 = new FlowLayout(1);
/*  52 */     FlowLayout f2 = new FlowLayout(1, 1, 1);
/*     */ 
/*  54 */     for (int i = 0; i < 5; i++) {
/*  55 */       this.row[i] = new JPanel();
/*     */     }
/*     */ 
/*  58 */     this.row[0].setLayout(f1);
/*  59 */     for (int i = 1; i < 5; i++) {
/*  60 */       this.row[i].setLayout(f2);
/*     */     }
/*  62 */     for (int i = 0; i < 19; i++) {
/*  63 */       this.button[i] = new JButton();
/*  64 */       this.button[i].setText(this.buttonString[i]);
/*  65 */       this.button[i].setBackground(Color.WHITE);
/*  66 */       this.button[i].setFont(this.font);
/*  67 */       this.button[i].addActionListener(this);
/*     */     }
/*     */ 
/*  70 */     this.display.setFont(this.font);
/*  71 */     this.display.setEditable(false);
/*  72 */     this.display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
/*  73 */     this.display.setPreferredSize(this.displayDimension);
/*     */ 
/*  75 */     for (int i = 0; i < 14; i++) {
/*  76 */       this.button[i].setPreferredSize(this.regularDimension);
/*     */     }
/*     */ 
/*  79 */     for (int i = 14; i < 18; i++) {
/*  80 */       this.button[i].setPreferredSize(this.rColumnDimension);
/*     */     }
/*     */ 
/*  83 */     this.button[18].setPreferredSize(this.zeroButDimension);
/*     */ 
/*  85 */     this.row[0].add(this.display);
/*  86 */     add(this.row[0]);
/*     */ 
/*  88 */     for (int i = 0; i < 4; i++)
/*  89 */       this.row[1].add(this.button[i]);
/*  90 */     this.row[1].add(this.button[14]);
/*  91 */     add(this.row[1]);
/*     */ 
/*  93 */     for (int i = 4; i < 8; i++)
/*  94 */       this.row[2].add(this.button[i]);
/*  95 */     this.row[2].add(this.button[15]);
/*  96 */     add(this.row[2]);
/*     */ 
/*  98 */     for (int i = 8; i < 12; i++)
/*  99 */       this.row[3].add(this.button[i]);
/* 100 */     this.row[3].add(this.button[16]);
/* 101 */     add(this.row[3]);
/*     */ 
/* 103 */     this.row[4].add(this.button[18]);
/* 104 */     for (int i = 12; i < 14; i++)
/* 105 */       this.row[4].add(this.button[i]);
/* 106 */     this.row[4].add(this.button[17]);
/* 107 */     add(this.row[4]);
/*     */ 
/* 109 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void clear() {
/*     */     try {
/* 114 */       this.display.setText("");
/* 115 */       for (int i = 0; i < 4; i++)
/* 116 */         this.function[i] = false;
/* 117 */       for (int i = 0; i < 2; i++)
/* 118 */         this.temporary[i] = 0.0D;
/*     */     }
/*     */     catch (NullPointerException localNullPointerException) {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void getSqrt() {
/*     */     try {
/* 126 */       double value = Math.sqrt(Double.parseDouble(this.display.getText()));
/* 127 */       this.display.setText(Double.toString(value));
/*     */     }
/*     */     catch (NumberFormatException localNumberFormatException) {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void getPosNeg() {
/*     */     try {
/* 135 */       double value = Double.parseDouble(this.display.getText());
/* 136 */       if (value != 0.0D) {
/* 137 */         value *= -1.0D;
/* 138 */         this.display.setText(Double.toString(value));
/*     */       }
/*     */     }
/*     */     catch (NumberFormatException localNumberFormatException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void getResult()
/*     */   {
/* 148 */     double result = 0.0D;
/* 149 */     this.temporary[1] = Double.parseDouble(this.display.getText());
/*     */     try
/*     */     {
/* 152 */       if (this.function[2] != 0)
/* 153 */         result = this.temporary[0] * this.temporary[1];
/* 154 */       else if (this.function[3] != 0)
/* 155 */         result = this.temporary[0] / this.temporary[1];
/* 156 */       else if (this.function[0] != 0)
/* 157 */         result = this.temporary[0] + this.temporary[1];
/* 158 */       else if (this.function[1] != 0)
/* 159 */         result = this.temporary[0] - this.temporary[1];
/* 160 */       this.display.setText(Double.toString(result));
/* 161 */       for (int i = 0; i < 4; i++)
/* 162 */         this.function[i] = false;
/*     */     } catch (NumberFormatException localNumberFormatException) {
/*     */     }
/*     */   }
/*     */ 
/*     */   public final void setDesign() {
/*     */     try {
/* 169 */       UIManager.setLookAndFeel(
/* 170 */         "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
/*     */     }
/*     */     catch (Exception localException) {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void actionPerformed(ActionEvent ae) {
/* 177 */     if (ae.getSource() == this.button[0])
/* 178 */       this.display.append("7");
/* 179 */     if (ae.getSource() == this.button[1])
/* 180 */       this.display.append("8");
/* 181 */     if (ae.getSource() == this.button[2])
/* 182 */       this.display.append("9");
/* 183 */     if (ae.getSource() == this.button[3])
/*     */     {
/* 186 */       this.temporary[0] = Double.parseDouble(this.display.getText());
/* 187 */       this.function[0] = true;
/* 188 */       this.display.setText("");
/*     */     }
/* 190 */     if (ae.getSource() == this.button[4])
/* 191 */       this.display.append("4");
/* 192 */     if (ae.getSource() == this.button[5])
/* 193 */       this.display.append("5");
/* 194 */     if (ae.getSource() == this.button[6])
/* 195 */       this.display.append("6");
/* 196 */     if (ae.getSource() == this.button[7])
/*     */     {
/* 198 */       this.temporary[0] = Double.parseDouble(this.display.getText());
/* 199 */       this.function[1] = true;
/* 200 */       this.display.setText("");
/*     */     }
/* 202 */     if (ae.getSource() == this.button[8])
/* 203 */       this.display.append("1");
/* 204 */     if (ae.getSource() == this.button[9])
/* 205 */       this.display.append("2");
/* 206 */     if (ae.getSource() == this.button[10])
/* 207 */       this.display.append("3");
/* 208 */     if (ae.getSource() == this.button[11])
/*     */     {
/* 210 */       this.temporary[0] = Double.parseDouble(this.display.getText());
/* 211 */       this.function[2] = true;
/* 212 */       this.display.setText("");
/*     */     }
/* 214 */     if (ae.getSource() == this.button[12])
/* 215 */       this.display.append(".");
/* 216 */     if (ae.getSource() == this.button[13])
/*     */     {
/* 218 */       this.temporary[0] = Double.parseDouble(this.display.getText());
/* 219 */       this.function[3] = true;
/* 220 */       this.display.setText("");
/*     */     }
/* 222 */     if (ae.getSource() == this.button[14])
/* 223 */       clear();
/* 224 */     if (ae.getSource() == this.button[15])
/* 225 */       getSqrt();
/* 226 */     if (ae.getSource() == this.button[16])
/* 227 */       getPosNeg();
/* 228 */     if (ae.getSource() == this.button[17])
/* 229 */       getResult();
/* 230 */     if (ae.getSource() == this.button[18])
/* 231 */       this.display.append("0");
/*     */   }
/*     */ 
/*     */   public static void main(String[] arguments) {
/* 235 */     Calculator c = new Calculator();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Calculator
 * JD-Core Version:    0.6.2
 */