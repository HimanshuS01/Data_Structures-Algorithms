/*     */ package DS;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class MinPriorityQueue<V>
/*     */ {
/*     */   private ArrayList<HeapPair<V>> heapArray;
/*     */ 
/*     */   public int size()
/*     */   {
/*  15 */     return this.heapArray.size() - 1;
/*     */   }
/*     */ 
/*     */   public boolean isEmpty() {
/*  19 */     if (size() == 0) {
/*  20 */       return true;
/*     */     }
/*  22 */     return false;
/*     */   }
/*     */ 
/*     */   public MinPriorityQueue() {
/*  26 */     this.heapArray = new ArrayList();
/*  27 */     this.heapArray.add(null);
/*     */   }
/*     */ 
/*     */   public V min() throws HeapEmptyException {
/*  31 */     if (size() == 0) {
/*  32 */       HeapEmptyException e = new HeapEmptyException();
/*  33 */       throw e;
/*     */     }
/*  35 */     return ((HeapPair)this.heapArray.get(1)).value;
/*     */   }
/*     */ 
/*     */   public void insert(int priority, V value)
/*     */   {
/*  40 */     HeapPair P = new HeapPair();
/*  41 */     P.priority = priority;
/*  42 */     P.value = value;
/*  43 */     this.heapArray.add(P);
/*     */ 
/*  45 */     int childIndex = this.heapArray.size() - 1;
/*  46 */     int ParentIndex = childIndex / 2;
/*     */ 
/*  48 */     while (childIndex > 1) {
/*  49 */       if (((HeapPair)this.heapArray.get(ParentIndex)).priority <= ((HeapPair)this.heapArray.get(childIndex)).priority) break;
/*  50 */       HeapPair temp = (HeapPair)this.heapArray.get(ParentIndex);
/*  51 */       this.heapArray.set(ParentIndex, (HeapPair)this.heapArray.get(childIndex));
/*  52 */       this.heapArray.set(childIndex, temp);
/*     */ 
/*  58 */       childIndex = ParentIndex;
/*  59 */       ParentIndex /= 2;
/*     */     }
/*     */   }
/*     */ 
/*     */   public V removeMin() throws HeapEmptyException {
/*  64 */     if (size() == 0) {
/*  65 */       HeapEmptyException e = new HeapEmptyException();
/*  66 */       throw e;
/*     */     }
/*     */ 
/*  70 */     HeapPair minPair = (HeapPair)this.heapArray.get(1);
/*     */ 
/*  72 */     int lastIndex = this.heapArray.size() - 1;
/*  73 */     this.heapArray.set(1, (HeapPair)this.heapArray.get(lastIndex));
/*  74 */     this.heapArray.remove(lastIndex);
/*     */ 
/*  80 */     int currentPosition = 1;
/*  81 */     int firstChildPosition = 2 * currentPosition;
/*  82 */     int secondChildPosition = 2 * currentPosition + 1;
/*     */ 
/*  84 */     while (firstChildPosition < this.heapArray.size()) {
/*  85 */       HeapPair current = (HeapPair)this.heapArray.get(currentPosition);
/*  86 */       HeapPair FirstChild = (HeapPair)this.heapArray.get(firstChildPosition);
/*  87 */       HeapPair SecondChild = null;
/*  88 */       if (secondChildPosition < this.heapArray.size()) {
/*  89 */         SecondChild = (HeapPair)this.heapArray.get(secondChildPosition);
/*     */       }
/*     */ 
/*  92 */       HeapPair ToBeSwappedWith = null;
/*  93 */       int ToBeSwappedPosition = -1;
/*  94 */       if (FirstChild.priority < current.priority) {
/*  95 */         ToBeSwappedWith = FirstChild;
/*  96 */         ToBeSwappedPosition = firstChildPosition;
/*     */       }
/*  98 */       if ((SecondChild != null) && (SecondChild.priority < FirstChild.priority) && (SecondChild.priority < current.priority)) {
/*  99 */         ToBeSwappedWith = SecondChild;
/* 100 */         ToBeSwappedPosition = secondChildPosition;
/*     */       }
/* 102 */       if (ToBeSwappedPosition == -1) break;
/* 103 */       HeapPair temp = (HeapPair)this.heapArray.get(ToBeSwappedPosition);
/* 104 */       this.heapArray.set(ToBeSwappedPosition, (HeapPair)this.heapArray.get(currentPosition));
/* 105 */       this.heapArray.set(currentPosition, temp);
/*     */ 
/* 110 */       currentPosition = ToBeSwappedPosition;
/* 111 */       firstChildPosition = currentPosition * 2;
/* 112 */       secondChildPosition = currentPosition * 2 + 1;
/*     */     }
    4C:/Program Files/Java/jre1.8.0_144/lib/resources.jar ?C:/Program Files/Java/jre1.8.0_144/lib/ext/access-bridge-64.jar 9C:/Program Files/Java/jre1.8.0_144/lib/ext/localedata.jar 7C:/Program Files/Java/jre1.8.0_144/lib/ext/cldrdata.jar 6C:/Program Files/Java/jre1.8.0_144/lib/ext/nashorn.jar /C:/Program Files/Java/jre1.8.0_144/lib/jsse.jar 6C:/Program Files/Java/jre1.8.0_144/lib/ext/jaccess.jar 8C:/Program Files/Java/jre1.8.0_144/lib/ext/sunmscapi.jar 4C:/Program Files/Java/jre1.8.0_144/lib/ext/jfxrt.jar -C:/Program Files/Java/jre1.8.0_144/lib/rt.jar 3C:/Program Files/Java/jre1.8.0_144/lib/charsets.jar 4C:/Program Files/Java/jre1.8.0_144/lib/ext/dnsns.jar 4C:/Program Files/Java/jre1.8.0_144/lib/ext/zipfs.jar .C:/Program Files/Java/jre1.8.0_144/lib/jfr.jar >C:/Program Files/Java/jre1.8.0_144/lib/ext/sunjce_provider.jar 8C:/Program Files/Java/jre1.8.0_144/lib/ext/sunp