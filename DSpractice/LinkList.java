/*     */ package DSpractice;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.HashMap;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class LinkList
/*     */ {
/*     */   public static Node<Integer> TakeLinkListInput()
/*     */   {
/*   9 */     Node head = null;
/*  10 */     Node prevNode = null;
/*  11 */     Scanner s = new Scanner(System.in);
/*  12 */     System.out.println("Enter the next element:");
/*  13 */     int input = s.nextInt();
/*  14 */     while (input != -1) {
/*  15 */       Node newNode = new Node();
/*  16 */       newNode.data = Integer.valueOf(input);
/*  17 */       newNode.next = null;
/*  18 */       if (head == null) {
/*  19 */         head = newNode;
/*     */       }
/*     */       else {
/*  22 */         prevNode.next = newNode;
/*     */       }
/*  24 */       prevNode = newNode;
/*  25 */       System.out.println("Enter the next element");
/*  26 */       input = s.nextInt();
/*     */     }
/*  28 */     return head;
/*     */   }
/*     */ 
/*     */   public static void PrintLinkList(Node<Integer> head) {
/*  32 */     if (head == null) {
/*  33 */       return;
/*     */     }
/*  35 */     while (head != null) {
/*  36 */       System.out.print(head.data + "-->");
/*  37 */       head = head.next;
/*     */     }
/*  39 */     System.out.print("null");
/*     */   }
/*     */ 
/*     */   public static Node<Integer> InsertNode(Node<Integer> head, int newElement, int position) {
/*  43 */     Node newNode = new Node();
/*  44 */     newNode.data = Integer.valueOf(newElement);
/*     */ 
/*  46 */     if (position == 1) {
/*  47 */       newNode.next = head;
/*  48 */       return newNode;
/*     */     }
/*  50 */     int count = 1;
/*  51 */     Node temp = head;
/*     */ 
/*  53 */     while (count < position - 1) {
/*  54 */       temp = temp.next;
/*  55 */       count++;
/*     */     }
/*  57 */     newNode.next = temp.next;
/*  58 */     temp.next = newNode;
/*  59 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Delete_A_Node(Node<Integer> head, int position) {
/*  63 */     if (position == 1) {
/*  64 */       head = head.next;
/*  65 */       return head;
/*     */     }
/*  67 */     int currentPosition = 1;
/*  68 */     Node temp = head;
/*  69 */     while (currentPosition < position - 1) {
/*  70 */       temp = temp.next;
/*  71 */       currentPosition++;
/*     */     }
/*  73 */     temp.next = temp.next.next;
/*  74 */     return head;
/*     */   }
/*     */ 
/*     */   public static int LengthOfLL(Node<Integer> head) {
/*  78 */     if (head == null) {
/*  79 */       return 0;
/*     */     }
/*  81 */     if (head.next == null) {
/*  82 */       return 1;
/*     */     }
/*  84 */     int length = 0;
/*  85 */     while (head != null) {
/*  86 */       head = head.next;
/*  87 */       length++;
/*     */     }
/*  89 */     return length;
/*     */   }
/*     */ 
/*     */   public static int midPoint(Node<Integer> head) {
/*  93 */     if ((head == null) || (head.next == null)) {
/*  94 */       return 0;
/*     */     }
/*  96 */     int length = LengthOfLL(head);
/*  97 */     Node slow = head;
/*  98 */     Node fast = head;
/*  99 */     int count = 1;
/* 100 */     if (length % 2 != 0) {
/* 101 */       while (fast.next != null) {
/* 102 */         slow = slow.next;
/* 103 */         fast = fast.next.next;
/* 104 */         count++;
/*     */       }
/*     */     }
/*     */     else {
/* 108 */       while (fast.next.next != null) {
/* 109 */         slow = slow.next;
/* 110 */         fast = fast.next.next;
/* 111 */         count++;
/*     */       }
/*     */     }
/* 114 */     return count;
/*     */   }
/*     */ 
/*     */   public static DoubleNode midNode(Node<Integer> head) {
/* 118 */     DoubleNode d = new DoubleNode();
/* 119 */     if ((head == null) || (head.next == null)) {
/* 120 */       return d;
/*     */     }
/* 122 */     int length = LengthOfLL(head);
/* 123 */     Node slow = head;
/* 124 */     Node fast = head;
/* 125 */     if (length % 2 != 0) {
/* 126 */       while (fast.next != null) {
/* 127 */         slow = slow.next;
/* 128 */         fast = fast.next.next;
/*     */       }
/* 130 */       d.FirstMidNode = slow;
/* 131 */       d.SecondMidNode = null;
/* 132 */       return d;
/*     */     }
/*     */ 
/* 135 */     while (fast.next.next != null) {
/* 136 */       slow = slow.next;
/* 137 */       fast = fast.next.next;
/*     */     }
/* 139 */     d.FirstMidNode = slow;
/* 140 */     d.SecondMidNode = slow.next;
/* 141 */     return d;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Remove_Duplicates_In_LL(Node<Integer> head)
/*     */   {
/* 147 */     if ((head == null) || (head.next == null)) {
/* 148 */       return head;
/*     */     }
/* 150 */     Node temp = head;
/* 151 */     Node tail = head;
/* 152 */     Node nextNode = tail.next;
/* 153 */     while ((tail != null) && (tail.next != null)) {
/* 154 */       if (tail.data == nextNode.data) {
/* 155 */         nextNode = nextNode.next;
/* 156 */         tail.next = nextNode;
/*     */       }
/*     */       else {
/* 159 */         tail = tail.next;
/* 160 */         nextNode = nextNode.next;
/*     */       }
/*     */     }
/* 163 */     return temp;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> RemoveDuplicatesFromUnsortedList(Node<Integer> head) {
/* 167 */     if ((head == null) || (head.next == null)) {
/* 168 */       return head;
/*     */     }
/* 170 */     Node temp = head;
/* 171 */     HashMap map = new HashMap();
/* 172 */     while (temp != null) {
/* 173 */       if (map.containsKey(temp.data)) {
/* 174 */         temp = temp.next;
/*     */       }
/*     */       else {
/* 177 */         map.put((Integer)temp.data, Boolean.valueOf(true));
/* 178 */         temp = temp.next;
/*     */       }
/*     */     }
/* 181 */     Node newHead = head;
/* 182 */     Node prevNode = null;
/* 183 */     Node temp1 = newHead;
/* 184 */     while (temp1 != null) {
/* 185 */       if (map.containsKey(temp1.data)) {
/* 186 */         prevNode = temp1;
/* 187 */         temp1 = temp1.next;
/* 188 */         prevNode.next = temp1;
/* 189 */         map.remove(prevNode.data);
/*     */       }
/*     */       else {
/* 192 */         prevNode.next = temp1.next;
/* 193 */         temp1 = prevNode.next;
/*     */       }
/*     */     }
/* 196 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Reverse_Iteratively(Node<Integer> head) {
/* 200 */     if ((head == null) || (head.next == null)) {
/* 201 */       return head;
/*     */     }
/* 203 */     Node prevNode = null;
/* 204 */     Node currentNode = head;
/*     */ 
/* 206 */     while (currentNode != null) {
/* 207 */       Node temp = currentNode.next;
/* 208 */       currentNode.next = prevNode;
/* 209 */       prevNode = currentNode;
/* 210 */       currentNode = temp;
/*     */     }
/* 212 */     head = prevNode;
/* 213 */     return head;
/*     */   }
/*     */ 
/*     */   public static void Reverse_Recursively(Node<Integer> head)
/*     */   {
/* 218 */     if (head == null) {
/* 219 */       return;
/*     */     }
/* 221 */     Reverse_Recursively(head.next);
/* 222 */     System.out.print(head.data + "-->");
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Even_After_Odd(Node<Integer> head) {
/* 226 */     if ((head == null) || (head.next == null)) {
/* 227 */       return head;
/*     */     }
/* 229 */     Node head1 = null;
/* 230 */     Node tail1 = null;
/* 231 */     Node head2 = null;
/* 232 */     Node tail2 = null;
/* 233 */     while (head != null) {
/* 234 */       Node newNode1 = new Node();
/* 235 */       Node newNode2 = new Node();
/* 236 */       if (((Integer)head.data).intValue() % 2 != 0) {
/* 237 */         newNode1.data = ((Integer)head.data);
/* 238 */         newNode1.next = null;
/* 239 */         head = head.next;
/*     */ 
/* 241 */         if (head1 == null) {
/* 242 */           head1 = newNode1;
/*     */         }
/*     */         else {
/* 245 */           tail1.next = newNode1;
/*     */         }
/* 247 */         tail1 = newNode1;
/*     */       }
/*     */       else {
/* 250 */         newNode2.data = ((Integer)head.data);
/* 251 */         newNode2.next = null;
/* 252 */         head = head.next;
/*     */ 
/* 254 */         if (head2 == null) {
/* 255 */           head2 = newNode2;
/*     */         }
/*     */         else {
/* 258 */           tail2.next = newNode2;
/*     */         }
/* 260 */         tail2 = newNode2;
/*     */       }
/*     */     }
/* 263 */     tail1.next = head2;
/* 264 */     return head1;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Swap(Node<Integer> head, int i, int j)
/*     */   {
/* 269 */     int length = LengthOfLL(head);
/* 270 */     if (j > length) {
/* 271 */       return head;
/*     */     }
/* 273 */     if (i == 0) {
/* 274 */       Node ith = head;
/* 275 */       Node prevj = null;
/* 276 */       Node jth = head;
/* 277 */       int count = 0;
/* 278 */       while (count < j) {
/* 279 */         prevj = jth;
/* 280 */         jth = jth.next;
/* 281 */         count++;
/*     */       }
/* 283 */       head = jth;
/* 284 */       Node nexti = ith.next;
/* 285 */       Node nextj = jth.next;
/* 286 */       if (i == j - 1) {
/* 287 */         jth.next = ith;
/* 288 */         ith.next = nextj;
/*     */       }
/*     */       else {
/* 291 */         jth.next = nexti;
/* 292 */         prevj.next = ith;
/* 293 */         ith.next = nextj;
/*     */       }
/* 295 */       return head;
/*     */     }
/*     */ 
/* 299 */     Node previ = null;
/* 300 */     Node ith = head;
/* 301 */     int count = 0;
/* 302 */     while (count < i) {
/* 303 */       previ = ith;
/* 304 */       ith = ith.next;
/* 305 */       count++;
/*     */     }
/*     */ 
/* 308 */     Node prevj = null;
/* 309 */     Node jth = head;
/* 310 */     count = 0;
/* 311 */     while (count < j) {
/* 312 */       prevj = jth;
/* 313 */       jth = jth.next;
/* 314 */       count++;
/*     */     }
/*     */ 
/* 317 */     Node nexti = ith.next;
/* 318 */     Node nextj = jth.next;
/* 319 */     if (i != j - 1) {
/* 320 */       previ.next = jth;
/* 321 */       prevj.next = ith;
/* 322 */       ith.next = nextj;
/* 323 */       jth.next = nexti;
/*     */     }
/*     */     else {
/* 326 */       previ.next = jth;
/* 327 */       ith.next = nextj;
/* 328 */       jth.next = ith;
/*     */     }
/* 330 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> KReverse(Node<Integer> head, int k)
/*     */   {
/* 335 */     if ((head == null) || (head.next == null)) {
/* 336 */       return head;
/*     */     }
/* 338 */     Node newHead = head;
/* 339 */     int length = LengthOfLL(head);
/* 340 */     int i = 0; int j = k - 1; int count = 0;
/* 341 */     while (count < length) {
/* 342 */       while ((i < j) && (i < length) && (j < length)) {
/* 343 */         newHead = Swap(newHead, i, j);
/* 344 */         i++;
/* 345 */         j--;
/*     */       }
/* 347 */       int temp = i;
/* 348 */       if (i == j)
/*     */       {
/* 351 */         i = i + k - k / 2;
/* 352 */         j = j + k + k / 2;
/*     */       }
/*     */       else
/*     */       {
/* 356 */         i = j + k - 1;
/* 357 */         j = temp + k + 1;
/*     */       }
/* 359 */       count += k;
/*     */     }
/* 361 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Merge(Node<Integer> head1, Node<Integer> head2)
/*     */   {
/* 366 */     if (head1 == null) {
/* 367 */       return head2;
/*     */     }
/* 369 */     if (head2 == null) {
/* 370 */       return head1;
/*     */     }
/* 372 */     Node newHead = null;
/* 373 */     if (((Integer)head1.data).intValue() <= ((Integer)head2.data).intValue()) {
/* 374 */       newHead = head1;
/* 375 */       newHead.next = Merge(head1.next, head2);
/*     */     }
/*     */     else {
/* 378 */       newHead = head2;
/* 379 */       newHead.next = Merge(head1, head2.next);
/*     */     }
/* 381 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Merge_Sort(Node<Integer> head) {
/* 385 */     if ((head == null) || (head.next == null)) {
/* 386 */       return head;
/*     */     }
/* 388 */     Node head1 = head;
/* 389 */     Node head2 = null;
/* 390 */     Node temp = head;
/* 391 */     DoubleNode midNode = midNode(head);
/* 392 */     while (temp.data != midNode.FirstMidNode.data) {
/* 393 */       temp = temp.next;
/*     */     }
/* 395 */     head2 = temp.next;
/* 396 */     temp.next = null;
/* 397 */     head1 = Merge_Sort(head1);
/* 398 */     head2 = Merge_Sort(head2);
/* 399 */     Node newHead = Merge(head1, head2);
/* 400 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Bubble_Sort_Without_Recursion(Node<Integer> head) {
/* 404 */     if ((head == null) || (head.next == null)) {
/* 405 */       return head;
/*     */     }
/* 407 */     int length = LengthOfLL(head);
/* 408 */     Node temp = head;
/* 409 */     Node newHead = null;
/* 410 */     Node temp1 = null;
/* 411 */     for (int i = 0; i < length; i++)
/*     */     {
/* 413 */       while (temp.next != null) {
/* 414 */         Node nextNode = temp.next;
/* 415 */         if (((Integer)temp.data).intValue() > ((Integer)nextNode.data).intValue()) {
/* 416 */           temp.next = nextNode.next;
/* 417 */           nextNode.next = temp;
/* 418 */           if (newHead == null) {
/* 419 */             newHead = nextNode;
/* 420 */             temp1 = newHead;
/*     */           }
/*     */ 
/* 425 */           temp = nextNode.next;
/* 426 */           temp1.next = temp;
/*     */         }
/* 429 */         else if (temp.next != null) {
/* 430 */           temp = temp.next;
/*     */         }
/*     */       }
/* 433 */       temp = newHead;
/*     */     }
/* 435 */     return temp;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 441 */     Node result = TakeLinkListInput();
/* 442 */     PrintLinkList(result);
/* 443 */     System.out.println();
/*     */ 
/* 465 */     PrintLinkList(Reverse_Iteratively(result));
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.LinkList
 * JD-Core Version:    0.6.2
 */