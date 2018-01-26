/*    */ package PlacementPractice;
/*    */ 
/*    */ import DS.QueueEmptyException;
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class QueueUsingArray
/*    */ {
/*    */   private int[] queue;
/*    */   private int front;
/*    */   private int rear;
/*    */   private int size;
/*    */ 
/*    */   public QueueUsingArray(int length)
/*    */   {
/* 16 */     this.queue = new int[length];
/* 17 */     this.front = -1;
/* 18 */     this.rear = -1;
/*    */   }
/*    */ 
/*    */   public int size() {
/* 22 */     return this.size;
/*    */   }
/*    */ 
/*    */   public boolean isEmpty() {
/* 26 */     if (size() == 0) {
/* 27 */       return true;
/*    */     }
/* 29 */     return false;
/*    */   }
/*    */ 
/*    */   public int Front() throws QueueEmptyException {
/* 33 */     if (size() == 0) {
/* 34 */       QueueEmptyException e = new QueueEmptyException();
/* 35 */       throw e;
/*    */     }
/* 37 */     return this.queue[this.front];
/*    */   }
/*    */ 
/*    */   public void Enqueue(int newElement) throws QueueEmptyException
/*    */   {
/* 42 */     if (size() == this.queue.length) {
/* 43 */       QueueEmptyException e = new QueueEmptyException();
/* 44 */       throw e;
/*    */     }
/* 46 */     this.rear += 1;
/* 47 */     this.queue[this.rear] = newElement;
/* 48 */     System.out.print(this.queue[this.rear] + ",");
/* 49 */     if (this.front == -1) {
/* 50 */       this.front += 1;
/*    */     }
/* 52 */     this.size += 1;
/*    */   }
/*    */ 
/*    */   public void Dequeue()
/*    */     throws QueueEmptyException
/*    */   {
/* 58 */     if (isEmpty()) {
/* 59 */       QueueEmptyException e = new QueueEmptyException();
/* 60 */       throw e;
/*    */     }
/* 62 */     int dequeuedElement = this.queue[this.front];
/* 63 */     if (size() == 1) {
/* 64 */       this.front = -1;
/* 65 */       this.rear = -1;
/*    */     }
/*    */     else {
/* 68 */       this.front += 1;
/*    */     }
/* 70 */     this.size -= 1;
/* 71 */     System.out.print(dequeuedElement + ",");
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */     throws QueueEmptyException
/*    */   {
/* 77 */     Scanner s = new Scanner(System.in);
/* 78 */     int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
/* 79 */     QueueUsingArray obj = new QueueUsingArray(arr.length);
/* 80 */     for (int i : arr) {
/* 81 */       obj.Enqueue(i);
/*    */     }
/* 83 */     System.out.println();
/* 84 */     int upto = obj.size();
/* 85 */     for (int i = 0; i < upto; i++)
/* 86 */       obj.Dequeue();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.QueueUsingArray
 * JD-Core Version:    0.6.2
 */