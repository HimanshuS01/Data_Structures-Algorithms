/*    */ package DS;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class StackQueueUse
/*    */ {
/*    */   public static boolean isExpressionBalanced(String S)
/*    */   {
/*  6 */     StackUsingLinkList stack = new StackUsingLinkList();
/*  7 */     for (int i = 0; i < S.length(); i++) {
/*    */       try {
/*  9 */         if ((S.charAt(i) == '{') || (S.charAt(i) == '(') || (S.charAt(i) == '[')) {
/* 10 */           stack.push(Character.valueOf(S.charAt(i)));
/*    */         }
/* 13 */         else if (S.charAt(i) == '}') {
/* 14 */           if (((Character)stack.top()).charValue() == '{') {
/* 15 */             stack.pop();
/*    */           }
/*    */           else {
/* 18 */             return false;
/*    */           }
/*    */         }
/* 21 */         else if (S.charAt(i) == ')') {
/* 22 */           if (((Character)stack.top()).charValue() == '(') {
/* 23 */             stack.pop();
/*    */           }
/*    */           else {
/* 26 */             return false;
/*    */           }
/*    */         }
/* 29 */         else if (S.charAt(i) == ']') {
/* 30 */           if (((Character)stack.top()).charValue() == '[') {
/* 31 */             stack.pop();
/*    */           }
/*    */           else
/* 34 */             return false;
/*    */         }
/*    */       }
/*    */       catch (StackEmptyException e)
/*    */       {
/* 39 */         return false;
/*    */       }
/*    */     }
/* 42 */     if (stack.isEmpty()) {
/* 43 */       return true;
/*    */     }
/*    */ 
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   public static void reverseStack(StackUsingLinkList<Integer> Stack) throws StackEmptyException
/*    */   {
/* 51 */     StackUsingLinkList Stack1 = new StackUsingLinkList();
/* 52 */     StackUsingLinkList Stack2 = new StackUsingLinkList();
/* 53 */     while (!Stack.isEmpty()) {
/*    */       try {
/* 55 */         Stack1.push((Integer)Stack.pop());
/*    */       } catch (StackEmptyException e) {
/* 57 */         System.out.println("Not possible");
/*    */       }
/*    */     }
/* 60 */     while (!Stack1.isEmpty()) {
/*    */       try {
/* 62 */         Stack2.push((Integer)Stack1.pop());
/*    */       } catch (StackEmptyException e) {
/* 64 */         System.out.println("Not possible");
/*    */       }
/*    */     }
/* 67 */     while (!Stack2.isEmpty()) {
/*    */       try {
/* 69 */         Stack.push((Integer)Stack2.pop());
/*    */       } catch (StackEmptyException e) {
/* 71 */         System.out.println("Not possible");
/*    */       }
/*    */     }
/* 74 */     System.out.println("Stack in reverse order is");
/* 75 */     while (!Stack.isEmpty())
/* 76 */       System.out.println(Stack.pop());
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) throws StackEmptyException
/*    */   {
/* 81 */     String S = "{a+[b+(c+d)]+(e+f)}";
/* 82 */     boolean result = isExpressionBalanced(S);
/* 83 */     if (result) {
/* 84 */       System.out.println("String is balanced");
/*    */     }
/*    */     else {
/* 87 */       System.out.println("String is not balanced");
/*    */     }
/* 89 */     StackUsingLinkList s = new StackUsingLinkList();
/* 90 */     int[] A = { 1, 2, 3, 4, 5 };
/* 91 */     for (int i = 0; i < A.length; i++) {
/* 92 */       s.push(Integer.valueOf(A[i]));
/*    */     }
/* 94 */     s.printStack();
/* 95 */     reverseStack(s);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.StackQueueUse
 * JD-Core Version:    0.6.2
 */