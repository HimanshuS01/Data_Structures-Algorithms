/*     */ import java.io.PrintStream;
/*     */ import java.util.Stack;
/*     */ 
/*     */ public class EvaluateString
/*     */ {
/*     */   private static Object String;
/*     */ 
/*     */   public static int evaluate(String expression)
/*     */   {
/*  11 */     char[] tokens = expression.toCharArray();
/*     */ 
/*  14 */     Stack values = new Stack();
/*     */ 
/*  17 */     Stack ops = new Stack();
/*     */ 
/*  19 */     for (int i = 0; i < tokens.length; i++)
/*     */     {
/*  22 */       if (tokens[i] != ' ')
/*     */       {
/*  26 */         if ((tokens[i] >= '0') && (tokens[i] <= '9'))
/*     */         {
/*  29 */           StringBuffer sbuf = new StringBuffer();
/*     */ 
/*  31 */           while ((i < tokens.length) && (tokens[i] >= '0') && (tokens[i] <= '9')) {
/*  32 */             sbuf.append(tokens[(i++)]);
/*     */           }
/*  34 */           values.push(Integer.valueOf(Integer.parseInt(sbuf.toString())));
/*  35 */           i--;
/*     */         }
/*  39 */         else if (tokens[i] == '(') {
/*  40 */           ops.push(Character.valueOf(tokens[i]));
/*     */         }
/*  43 */         else if (tokens[i] == ')')
/*     */         {
/*  45 */           while (((Character)ops.peek()).charValue() != '(')
/*  46 */             values.push(Integer.valueOf(applyOp(((Character)ops.pop()).charValue(), ((Integer)values.pop()).intValue(), ((Integer)values.pop()).intValue())));
/*  47 */           ops.pop();
/*     */         }
/*  51 */         else if ((tokens[i] != '+') && (tokens[i] != '-') && 
/*  52 */           (tokens[i] != '*')) {
/*  52 */           if (tokens[i] != '/');
/*     */         }
/*     */         else
/*     */         {
/*  57 */           while ((!ops.empty()) && (hasPrecedence(tokens[i], ((Character)ops.peek()).charValue()))) {
/*  58 */             values.push(Integer.valueOf(applyOp(((Character)ops.pop()).charValue(), ((Integer)values.pop()).intValue(), ((Integer)values.pop()).intValue())));
/*     */           }
/*     */ 
/*  61 */           ops.push(Character.valueOf(tokens[i]));
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  67 */     while (!ops.empty()) {
/*  68 */       values.push(Integer.valueOf(applyOp(((Character)ops.pop()).charValue(), ((Integer)values.pop()).intValue(), ((Integer)values.pop()).intValue())));
/*     */     }
/*     */ 
/*  71 */     return ((Integer)values.pop()).intValue();
/*     */   }
/*     */ 
/*     */   public static boolean hasPrecedence(char op1, char op2)
/*     */   {
/*  78 */     if ((op2 == '(') || (op2 == ')'))
/*  79 */       return false;
/*  80 */     if (((op1 == '*') || (op1 == '/')) && ((op2 == '+') || (op2 == '-'))) {
/*  81 */       return false;
/*     */     }
/*  83 */     return true;
/*     */   }
/*     */ 
/*     */   public static int applyOp(char op, int b, int a)
/*     */   {
/*  90 */     switch (op)
/*     */     {
/*     */     case '+':
/*  93 */       return a + b;
/*     */     case '-':
/*  95 */       return a - b;
/*     */     case '*':
/*  97 */       return a * b;
/*     */     case '/':
/*  99 */       if (b == 0)
/* 100 */         throw 
/* 101 */           new UnsupportedOperationException("Cannot divide by zero");
/* 102 */       return a / b;
/*     */     case ',':
/* 104 */     case '.': } return 0;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 110 */     System.out.println(evaluate("10+2*6"));
/* 111 */     System.out.println(evaluate("100*2+12"));
/* 112 */     System.out.println(evaluate("100*(2+12)"));
/* 113 */     System.out.println(evaluate("100*(2+12)/14"));
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     EvaluateString
 * JD-Core Version:    0.6.2
 */