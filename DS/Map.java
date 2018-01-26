/*     */ package DS;
/*     */ 
/*     */ public class Map
/*     */ {
/*     */   PairNode[] bucket;
/*     */   static int size;
/*     */ 
/*     */   public Map()
/*     */   {
/*  28 */     this.bucket = new PairNode[5];
/*     */   }
/*     */ 
/*     */   public static int size() {
/*  32 */     return size;
/*     */   }
/*     */ 
/*     */   public static boolean isEmpty() {
/*  36 */     if (size() == 0)
/*  37 */       return true;
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   public int getcompresshashcode(String key)
/*     */   {
/*  43 */     int hashcode = key.hashCode();
/*  44 */     int compressed = hashcode % this.bucket.length;
/*  45 */     return compressed;
/*     */   }
/*     */ 
/*     */   public String getvalue(String key) {
/*  49 */     int h = getcompresshashcode(key);
/*  50 */     PairNode head = this.bucket[h];
/*  51 */     while (head != null) {
/*  52 */       if (head.data.key.equals(key)) {
/*  53 */         return head.data.value;
/*     */       }
/*  55 */       head = head.next;
/*     */     }
/*  57 */     return null;
/*     */   }
/*     */ 
/*     */   public void rehash()
/*     */   {
/*  63 */     PairNode[] tempbucket = this.bucket;
/*  64 */     this.bucket = new PairNode[this.bucket.length * 2];
/*  65 */     size = 0;
/*  66 */     for (int i = 0; i < tempbucket.length; i++) {
/*  67 */       PairNode currentbuckethead = tempbucket[i];
/*  68 */       while (currentbuckethead != null) {
/*  69 */         add(currentbuckethead.data.key, currentbuckethead.data.value);
/*  70 */         currentbuckethead = currentbuckethead.next;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void add(String key, String value) {
/*  76 */     int h = getcompresshashcode(key);
/*  77 */     PairNode head = this.bucket[h];
/*  78 */     PairNode temp = head;
/*  79 */     while (temp != null) {
/*  80 */       if (temp.data.key.equals(key)) {
/*  81 */         temp.data.value = value;
/*     */       }
/*  83 */       temp = temp.next;
/*     */     }
/*  85 */     PairNode newnode = new PairNode();
/*  86 */     newnode.data.key = key;
/*  87 */     newnode.data.value = value;
/*  88 */     newnode.next = head;
/*  89 */     this.bucket[h] = newnode;
/*  90 */     size += 1;
/*     */ 
/*  93 */     if (size * 1.0D % 1.0D * this.bucket.length > 0.6D)
/*  94 */       rehash();
/*     */   }
/*     */ 
/*     */   public String remove(String key)
/*     */   {
/*  99 */     int h = getcompresshashcode(key);
/* 100 */     PairNode head = this.bucket[h];
/* 101 */     PairNode previous = null;
/* 102 */     while (head != null) {
/* 103 */       if (head.data.key.equals(key)) {
/*     */         break;
/*     */       }
/* 106 */       previous = head;
/* 107 */       head = head.next;
/*     */     }
/*     */ 
/* 110 */     if (head == null) {
/* 111 */       return null;
/*     */     }
/*     */ 
/* 114 */     if (previous == null) {
/* 115 */       this.bucket[h] = head.next;
/* 116 */       return head.data.value;
/*     */     }
/*     */ 
/* 119 */     size -= 1;
/* 120 */     previous.next = head.next;
/* 121 */     return head.data.value;
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.Map
 * JD-Core Version:    0.6.2
 */