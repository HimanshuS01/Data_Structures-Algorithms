/*     */ package DS;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class LinkedList
/*     */ {
/*     */   public static Node<Integer> takeLinkedListInput()
/*     */   {
/*   8 */     Node head = null;
/*   9 */     Node prevNode = null;
/*  10 */     System.out.println("Enter next element");
/*  11 */     Scanner s = new Scanner(System.in);
/*  12 */     int input = s.nextInt();
/*  13 */     while (input != -1) {
/*  14 */       Node newNode = new Node();
/*  15 */       newNode.data = Integer.valueOf(input);
/*  16 */       newNode.next = null;
/*     */ 
/*  18 */       if (head == null)
/*     */       {
/*  20 */         head = newNode;
/*     */       }
/*  22 */       else prevNode.next = newNode;
/*     */ 
/*  25 */       prevNode = newNode;
/*  26 */       System.out.println("Enter next element");
/*     */ 
/*  28 */       input = s.nextInt();
/*     */     }
/*  30 */     return head;
/*     */   }
/*     */ 
/*     */   public static void printLinkedList(Node<Integer> input) {
/*  34 */     Node currentNode = input;
/*  35 */     while (currentNode != null) {
/*  36 */       System.out.print(currentNode.data + " ");
/*  37 */       currentNode = currentNode.next;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static Node<Integer> insertNode(Node<Integer> head, int newElement, int position) {
/*  42 */     Node newNode = new Node();
/*  43 */     newNode.data = Integer.valueOf(newElement);
/*     */ 
/*  45 */     if (position == 1) {
/*  46 */       newNode.next = head;
/*  47 */       return newNode;
/*     */     }
/*     */ 
/*  50 */     int currentPosition = 1;
/*  51 */     Node temp = head;
/*     */ 
/*  53 */     while (currentPosition < position - 1) {
/*  54 */       temp = temp.next;
/*  55 */       currentPosition++;
/*     */     }
/*     */ 
/*  58 */     newNode.next = temp.next;
/*  59 */     temp.next = newNode;
/*  60 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> deleteNode(Node<Integer> head, int position) {
/*  64 */     if (position == 0) {
/*  65 */       return head.next;
/*     */     }
/*     */ 
/*  68 */     int currentPosition = 1;
/*  69 */     Node temp = head;
/*     */ 
/*  71 */     while (currentPosition < position) {
/*  72 */       temp = temp.next;
/*  73 */       currentPosition++;
/*     */     }
/*     */ 
/*  76 */     temp.next = temp.next.next;
/*  77 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> deleteRandomNode(Node<Integer> head, int numToBeDeleted) {
/*  81 */     Node currentHead = head;
/*  82 */     Node prev = null;
/*     */ 
/*  84 */     if ((head == null) || ((head.next == null) && (((Integer)head.data).intValue() == numToBeDeleted))) {
/*  85 */       return null;
/*     */     }
/*  87 */     while (((Integer)head.data).intValue() != numToBeDeleted) {
/*  88 */       prev = head;
/*  89 */       head = head.next;
/*     */     }
/*  91 */     prev.next = prev.next.next;
/*  92 */     return currentHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> PairWiseSwap(Node<Integer> head)
/*     */   {
/*  98 */     if ((head == null) || (head.next == null)) {
/*  99 */       return null;
/*     */     }
/* 101 */     Node temp = head;
/* 102 */     while ((temp != null) && (temp.next != null)) {
/* 103 */       int tempData = ((Integer)temp.data).intValue();
/* 104 */       temp.data = ((Integer)temp.next.data);
/* 105 */       temp.next.data = Integer.valueOf(tempData);
/*     */ 
/* 107 */       temp = temp.next.next;
/*     */     }
/* 109 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> PairWiseSwapByChangingPointer(Node<Integer> head)
/*     */   {
/* 115 */     if ((head == null) || (head.next == null)) {
/* 116 */       return null;
/*     */     }
/* 118 */     Node prev = head;
/* 119 */     Node currentNode = head.next;
/* 120 */     Node newHead = currentNode;
/*     */     while (true)
/*     */     {
/* 124 */       Node next = currentNode.next;
/* 125 */       currentNode.next = prev;
/*     */ 
/* 127 */       if ((next == null) || (next.next == null)) {
/* 128 */         prev.next = next;
/* 129 */         break;
/*     */       }
/*     */ 
/* 132 */       prev.next = next.next;
/* 133 */       prev = next;
/* 134 */       currentNode = prev.next;
/*     */     }
/*     */ 
/* 137 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static int IntersectionPointOfTwoLL(Node<Integer> head1, Node<Integer> head2)
/*     */   {
/* 143 */     if ((head1 == null) || (head2 == null)) {
/* 144 */       return -1;
/*     */     }
/* 146 */     int length1 = LengthOfLL(head1);
/* 147 */     int length2 = LengthOfLL(head2);
/*     */ 
/* 149 */     if (length1 > length2) {
/* 150 */       int count = length1 - length2;
/* 151 */       return getIntersectedPoint(count, head1, head2);
/*     */     }
/*     */ 
/* 154 */     int count = length2 - length1;
/* 155 */     return getIntersectedPoint(count, head2, head1);
/*     */   }
/*     */ 
/*     */   public static int getIntersectedPoint(int count, Node<Integer> head1, Node<Integer> head2)
/*     */   {
/* 161 */     Node current1 = head1;
/* 162 */     Node current2 = head2;
/*     */ 
/* 164 */     for (int i = 0; i < count; i++) {
/* 165 */       if (current1 == null) {
/* 166 */         return -1;
/*     */       }
/* 168 */       current1 = current1.next;
/*     */     }
/*     */ 
/* 171 */     while ((current1 != null) && (current2 != null)) {
/* 172 */       if (current1.data == current2.data) {
/* 173 */         return ((Integer)current1.data).intValue();
/*     */       }
/* 175 */       current1 = current1.next;
/* 176 */       current2 = current2.next;
/*     */     }
/*     */ 
/* 179 */     return -1;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> AddTwoNumbersRepresentedByLL(Node<Integer> head1, Node<Integer> head2)
/*     */   {
/* 186 */     Node res = null;
/* 187 */     Node prev = null;
/* 188 */     Node newNode = null;
/* 189 */     int carry = 0;
/*     */ 
/* 191 */     while ((head1 != null) || (head2 != null))
/*     */     {
/* 194 */       int sum = carry + (head1 != null ? ((Integer)head1.data).intValue() : 0) + (head2 != null ? ((Integer)head2.data).intValue() : 0);
/*     */ 
/* 196 */       carry = sum >= 10 ? 1 : 0;
/*     */ 
/* 198 */       sum %= 10;
/*     */ 
/* 200 */       newNode = new Node();
/* 201 */       newNode.data = Integer.valueOf(sum);
/*     */ 
/* 203 */       if (res == null) {
/* 204 */         res = newNode;
/*     */       }
/*     */       else
/*     */       {
/* 208 */         prev.next = newNode;
/*     */       }
/*     */ 
/* 211 */       prev = newNode;
/*     */ 
/* 213 */       if (head1 != null) {
/* 214 */         head1 = head1.next;
/*     */       }
/* 216 */       if (head2 != null) {
/* 217 */         head2 = head2.next;
/*     */       }
/*     */     }
/*     */ 
/* 221 */     if (carry > 0) {
/* 222 */       newNode = new Node();
/* 223 */       newNode.data = Integer.valueOf(carry);
/* 224 */       prev.next = newNode;
/*     */     }
/*     */ 
/* 228 */     return res;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> swap(Node<Integer> head, int i, int j) {
/* 232 */     if (i == 0) {
/* 233 */       Node ith = head;
/* 234 */       Node prevj = null;
/* 235 */       Node jth = head;
/* 236 */       int count = 0;
/* 237 */       while (count < j) {
/* 238 */         prevj = jth;
/* 239 */         jth = jth.next;
/* 240 */         count++;
/*     */       }
/* 242 */       head = jth;
/* 243 */       Node nexti = ith.next;
/* 244 */       Node nextj = jth.next;
/*     */ 
/* 246 */       if (i == j - 1) {
/* 247 */         jth.next = ith;
/* 248 */         ith.next = nextj;
/*     */       } else {
/* 250 */         ith.next = nextj;
/* 251 */         prevj.next = ith;
/* 252 */         jth.next = nexti;
/*     */       }
/* 254 */       return head;
/*     */     }
/*     */ 
/* 257 */     Node previ = null;
/* 258 */     Node ith = head;
/* 259 */     int count = 0;
/* 260 */     while (count < i) {
/* 261 */       previ = ith;
/* 262 */       ith = ith.next;
/* 263 */       count++;
/*     */     }
/*     */ 
/* 266 */     Node prevj = null;
/* 267 */     Node jth = head;
/* 268 */     count = 0;
/* 269 */     while (count < j) {
/* 270 */       prevj = jth;
/* 271 */       jth = jth.next;
/* 272 */       count++;
/*     */     }
/* 274 */     Node nexti = ith.next;
/* 275 */     Node nextj = jth.next;
/*     */ 
/* 277 */     if (i != j - 1)
/*     */     {
/* 279 */       previ.next = jth;
/* 280 */       prevj.next = ith;
/*     */ 
/* 282 */       ith.next = nextj;
/* 283 */       jth.next = nexti;
/*     */     } else {
/* 285 */       previ.next = jth;
/* 286 */       ith.next = nextj;
/* 287 */       jth.next = ith;
/*     */     }
/*     */ 
/* 290 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> MidPoint(Node<Integer> head)
/*     */   {
/* 297 */     if (head == null) {
/* 298 */       return head;
/*     */     }
/*     */ 
/* 304 */     Node Slow = head;
/* 305 */     Node Fast = head;
/* 306 */     Node Mid = null;
/*     */ 
/* 308 */     int count = 0;
/* 309 */     while (head != null) {
/* 310 */       head = head.next;
/* 311 */       count++;
/*     */     }
/*     */ 
/* 314 */     if (count % 2 != 0) {
/* 315 */       while (Fast.next != null) {
/* 316 */         Slow = Slow.next;
/* 317 */         Fast = Fast.next.next;
/*     */       }
/* 319 */       Mid = Slow;
/*     */     }
/*     */     else
/*     */     {
/* 323 */       while (Fast.next.next != null) {
/* 324 */         Slow = Slow.next;
/* 325 */         Fast = Fast.next.next;
/*     */       }
/*     */ 
/* 329 */       Mid = Slow;
/*     */     }
/* 331 */     return Mid;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> RemoveDuplicates(Node<Integer> head)
/*     */   {
/* 338 */     if ((head == null) || (head.next == null)) {
/* 339 */       return head;
/*     */     }
/*     */ 
/* 342 */     Node newHead = head;
/* 343 */     Node temp = head.next;
/*     */ 
/* 345 */     while (head != null)
/*     */     {
/* 347 */       while ((temp != null) && (temp.data == head.data)) {
/* 348 */         temp = temp.next;
/*     */       }
/*     */ 
/* 351 */       head.next = temp;
/* 352 */       head = temp;
/* 353 */       if ((temp == null) || (temp.next == null)) {
/* 354 */         head = null;
/*     */       }
/* 356 */       else if (temp.next != null) {
/* 357 */         temp = temp.next;
/*     */       }
/*     */     }
/* 360 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> RemoveDuplicates_Method2(Node<Integer> head)
/*     */   {
/* 387 */     if ((head == null) || (head.next == null)) {
/* 388 */       return head;
/*     */     }
/* 390 */     Node newHead = null;
/* 391 */     Node temp = null;
/*     */ 
/* 393 */     while (head != null)
/*     */     {
/* 395 */       if ((newHead == null) || (temp == null)) {
/* 396 */         newHead = head;
/* 397 */         temp = head;
/*     */       }
/* 400 */       else if (temp.data == temp.next.data) {
/* 401 */         temp = temp.next.next;
/* 402 */         head.next = temp;
/*     */       }
/*     */       else {
/* 405 */         head = head.next;
/* 406 */         temp = temp.next;
/*     */       }
/* 408 */       head = temp;
/*     */     }
/* 410 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> RemoveDuplicatesFromUnSortedLL(Node<Integer> head)
/*     */   {
/* 417 */     Node temp1 = head;
/* 418 */     Node temp2 = temp1.next;
/* 419 */     Node prev = temp1;
/* 420 */     int size = LengthOfLL(head);
/* 421 */     for (int i = 0; i < size - 1; i++)
/*     */     {
/* 423 */       for (int j = i + 1; j < size; j++)
/*     */       {
/* 425 */         if (temp2 != null)
/*     */         {
/* 427 */           if (temp2.data == temp1.data) {
/* 428 */             prev.next = prev.next.next;
/* 429 */             temp2 = temp2.next;
/*     */           }
/*     */           else
/*     */           {
/* 433 */             prev = temp2;
/* 434 */             temp2 = temp2.next;
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 440 */       if (temp1.next != null) {
/* 441 */         temp1 = temp1.next;
/* 442 */         prev = temp1;
/* 443 */         temp2 = temp1.next;
/*     */       }
/*     */     }
/*     */ 
/* 447 */     return head;
/*     */   }
/*     */ 
/*     */   public static int LengthOfLL(Node<Integer> head) {
/* 451 */     if (head == null) {
/* 452 */       return 0;
/*     */     }
/* 454 */     if (head.next == null) {
/* 455 */       return 1;
/*     */     }
/* 457 */     int length = 0;
/* 458 */     while (head != null) {
/* 459 */       head = head.next;
/* 460 */       length++;
/*     */     }
/* 462 */     return length;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> mergeTwoSortedLinkedList(Node<Integer> head1, Node<Integer> head2)
/*     */   {
/* 468 */     Node newHead = null;
/* 469 */     Node temp = null;
/*     */     do
/*     */     {
/* 472 */       if (((Integer)head1.data).intValue() <= ((Integer)head2.data).intValue()) {
/* 473 */         if (newHead == null) {
/* 474 */           newHead = head1;
/* 475 */           temp = newHead;
/*     */         }
/*     */         else {
/* 478 */           temp.next = head1;
/* 479 */           temp = head1;
/*     */         }
/* 481 */         head1 = head1.next;
/*     */       }
/*     */       else
/*     */       {
/* 485 */         if (newHead == null) {
/* 486 */           newHead = head2;
/* 487 */           temp = newHead;
/*     */         }
/*     */         else {
/* 490 */           temp.next = head2;
/* 491 */           temp = head2;
/*     */         }
/* 493 */         head2 = head2.next;
/*     */       }
/* 470 */       if (head1 == null) break;  } while (head2 != null);
/*     */ 
/* 497 */     while (head1 != null) {
/* 498 */       temp.next = head1;
/* 499 */       temp = head1;
/* 500 */       head1 = head1.next;
/*     */     }
/* 502 */     while (head2 != null) {
/* 503 */       temp.next = head2;
/* 504 */       temp = head2;
/* 505 */       head2 = head2.next;
/*     */     }
/* 507 */     return newHead;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> mergeSortedLLUsingRecursion(Node<Integer> head1, Node<Integer> head2)
/*     */   {
/* 515 */     Node result = null;
/*     */ 
/* 517 */     if (head1 == null) {
/* 518 */       return head2;
/*     */     }
/*     */ 
/* 521 */     if (head2 == null) {
/* 522 */       return head1;
/*     */     }
/*     */ 
/* 525 */     if (((Integer)head1.data).intValue() <= ((Integer)head2.data).intValue()) {
/* 526 */       result = head1;
/* 527 */       result.next = mergeSortedLLUsingRecursion(head1.next, head2);
/*     */     }
/*     */     else {
/* 530 */       result = head2;
/* 531 */       result.next = mergeSortedLLUsingRecursion(head1, head2.next);
/*     */     }
/* 533 */     return result;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> AppendLast_N_Elements(Node<Integer> head, int n) {
/* 537 */     if ((head == null) || (head.next == null)) {
/* 538 */       return head;
/*     */     }
/* 540 */     Node head1 = head;
/* 541 */     Node tail1 = head;
/* 542 */     Node head2 = null;
/* 543 */     Node tail2 = null;
/*     */ 
/* 545 */     int i = 1;
/* 546 */     int length = LengthOfLL(head);
/* 547 */     while (i < length - n) {
/* 548 */       tail1 = tail1.next;
/* 549 */       i++;
/*     */     }
/* 551 */     head2 = tail1.next;
/* 552 */     tail1.next = null;
/* 553 */     tail2 = head2;
/*     */ 
/* 555 */     while (tail2.next != null)
/*     */     {
/* 557 */       tail2 = tail2.next;
/*     */     }
/*     */ 
/* 561 */     tail2.next = head1;
/* 562 */     return head2;
/*     */   }
/*     */ 
/*     */   public static boolean Check_Pallindrome(Node<Integer> head1)
/*     */   {
/* 570 */     if ((head1 == null) || (head1.next == null)) {
/* 571 */       return true;
/*     */     }
/* 573 */     Node MidNode = MidPoint(head1);
/* 574 */     Node currentNode = head1;
/* 575 */     Node head2 = null;
/*     */ 
/* 577 */     break label51;
/* 578 */     if (currentNode == MidNode) {
/* 579 */       head2 = ReverseA_LL_Iteratively(currentNode.next);
/* 580 */       currentNode.next = null;
/*     */     }
/*     */     else
/*     */     {
/* 584 */       currentNode = currentNode.next;
/*     */     }
/*     */ 
/* 587 */     label51: while ((head1 != null) && (head2 != null)) if ((goto 79) && 
/* 588 */         (head1.data == head2.data)) {
/* 589 */         head1 = head1.next;
/* 590 */         head2 = head2.next;
/*     */       }
/*     */ 
/* 593 */     if (((head1 == MidNode) || (head1 == null)) && (head2 == null)) {
/* 594 */       return true;
/*     */     }
/* 596 */     return false;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> reverseLL(Node<Integer> head)
/*     */   {
/* 601 */     if ((head == null) || (head.next == null)) {
/* 602 */       return head;
/*     */     }
/* 604 */     Node smallerHead = reverseLL(head.next);
/* 605 */     head.next.next = head;
/* 606 */     head.next = null;
/* 607 */     return smallerHead;
/*     */   }
/*     */ 
/*     */   public static boolean isPallindrome(Node<Integer> head)
/*     */   {
/* 612 */     if (head == null) {
/* 613 */       return true;
/*     */     }
/* 615 */     Node reversedHead = reverseLL(head);
/*     */ 
/* 617 */     while ((head != null) && (reversedHead != null)) {
/* 618 */       if (head.data != reversedHead.data) {
/* 619 */         return false;
/*     */       }
/* 621 */       head = head.next;
/* 622 */       reversedHead = reversedHead.next;
/*     */     }
/* 624 */     return true;
/*     */   }
/*     */ 
/*     */   public static int findMinPosition(Node<Integer> head)
/*     */   {
/* 630 */     int minPosition = 0;
/* 631 */     int currentPosition = 0;
/* 632 */     int min_node = ((Integer)head.data).intValue();
/* 633 */     while (head != null) {
/* 634 */       if (((Integer)head.data).intValue() < min_node) {
/* 635 */         min_node = ((Integer)head.data).intValue();
/* 636 */         minPosition = currentPosition;
/*     */       }
/* 638 */       head = head.next;
/* 639 */       currentPosition++;
/*     */     }
/*     */ 
/* 653 */     return minPosition;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> Even_After_Odd(Node<Integer> head)
/*     */   {
/* 658 */     if ((head == null) || (head.next == null)) {
/* 659 */       return head;
/*     */     }
/* 661 */     Node temp = head;
/*     */ 
/* 663 */     Node newHead1 = null;
/* 664 */     Node newHead2 = null;
/* 665 */     Node temp1 = null;
/* 666 */     Node temp2 = null;
/*     */ 
/* 668 */     while (temp != null) {
/* 669 */       Node newNode = new Node();
/* 670 */       if (((Integer)temp.data).intValue() % 2 != 0) {
/* 671 */         newNode.data = ((Integer)temp.data);
/* 672 */         newNode.next = null;
/*     */ 
/* 674 */         if (newHead1 == null) {
/* 675 */           newHead1 = newNode;
/*     */         }
/*     */         else {
/* 678 */           temp1.next = newNode;
/*     */         }
/* 680 */         temp1 = newNode;
/*     */       }
/*     */       else {
/* 683 */         newNode.data = ((Integer)temp.data);
/* 684 */         newNode.next = null;
/*     */ 
/* 686 */         if (newHead2 == null) {
/* 687 */           newHead2 = newNode;
/*     */         }
/*     */         else {
/* 690 */           temp2.next = newNode;
/*     */         }
/* 692 */         temp2 = newNode;
/*     */       }
/* 694 */       temp = temp.next;
/*     */     }
/* 696 */     temp1.next = newHead2;
/* 697 */     return newHead1;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> ReverseA_LL_Iteratively(Node<Integer> head)
/*     */   {
/* 702 */     if ((head == null) || (head.next == null)) {
/* 703 */       return head;
/*     */     }
/* 705 */     Node prevNode = null;
/* 706 */     Node currentNode = head;
/*     */ 
/* 708 */     while (currentNode != null) {
/* 709 */       Node temp = currentNode.next;
/* 710 */       currentNode.next = prevNode;
/* 711 */       prevNode = currentNode;
/* 712 */       currentNode = temp;
/*     */     }
/* 714 */     head = prevNode;
/* 715 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> InsertionSort(Node<Integer> head) {
/* 719 */     if ((head == null) || (head.next == null)) {
/* 720 */       return head;
/*     */     }
/* 722 */     Node sortedSoFar = head;
/* 723 */     Node remaining = head.next;
/* 724 */     head.next = null;
/*     */ 
/* 726 */     while (remaining != null) {
/* 727 */       Node currentNode = remaining;
/* 728 */       remaining = remaining.next;
/*     */ 
/* 730 */       Node temp = sortedSoFar;
/* 731 */       Node prevTemp = null;
/* 732 */       while (temp != null) {
/* 733 */         if (((Integer)temp.data).intValue() > ((Integer)currentNode.data).intValue()) {
/* 734 */           if (prevTemp == null) {
/* 735 */             currentNode.next = sortedSoFar;
/* 736 */             sortedSoFar = currentNode;
/* 737 */             break;
/* 738 */           }currentNode.next = temp;
/* 739 */           prevTemp.next = currentNode;
/*     */ 
/* 741 */           break;
/*     */         }
/* 743 */         prevTemp = temp;
/* 744 */         temp = temp.next;
/*     */       }
/*     */ 
/* 747 */       if (temp == null) {
/* 748 */         prevTemp.next = currentNode;
/* 749 */         currentNode.next = null;
/*     */       }
/*     */     }
/* 752 */     return sortedSoFar;
/*     */   }
/*     */ 
/*     */   public static void ReverseLinkList(Node<Integer> head)
/*     */   {
/* 759 */     if (head == null) {
/* 760 */       return;
/*     */     }
/* 762 */     ReverseLinkList(head.next);
/* 763 */     System.out.println(head.data + " ");
/*     */   }
/*     */ 
/*     */   public static Node<Integer> selectionSortRecursive(Node<Integer> head) {
/* 767 */     if ((head == null) || (head.next == null)) {
/* 768 */       return head;
/*     */     }
/* 770 */     int minP = findMinPosition(head);
/* 771 */     head = swap(head, 0, minP);
/* 772 */     head.next = selectionSortRecursive(head.next);
/* 773 */     return head;
/*     */   }
/*     */ 
/*     */   public static Node<Integer> SortLL_Zero_One_Two(Node<Integer> head)
/*     */   {
/* 779 */     int[] count = new int[3];
/* 780 */     Node temp = head;
/* 781 */     while (temp != null) {
/* 782 */       count[((Integer)temp.data).intValue()] += 1;
/* 783 */       temp = temp.next;
/*     */     }
/* 785 */     temp = head;
/* 786 */     int i = 0;
/* 787 */     while (temp != null) {
/* 788 */       if (count[i] == 0) {
/* 789 */         i++;
/*     */       }
/*     */       else {
/* 792 */         temp.data = Integer.valueOf(i);
/* 793 */         count[i] -= 1;
/* 794 */         temp = temp.next;
/*     */       }
/*     */     }
/* 797 */     return head;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 802 */     Node input = takeLinkedListInput();
/*     */ 
/* 804 */     printLinkedList(RemoveDuplicates(input));
/*     */ 
/* 806 */     Node input2 = takeLinkedListInput();
/* 807 */     System.out.println("First list");
/* 808 */     printLinkedList(input);
/* 809 */     System.out.println("Second list");
/* 810 */     printLinkedList(input2);
/* 811 */     System.out.println();
/* 812 */     printLinkedList(mergeSortedLLUsingRecursion(input, input2));
/* 813 */     printLinkedList(AddTwoNumbersRepresentedByLL(input, input2));
/* 814 */     System.out.println("Pairwise swap of a link list is:");
/* 815 */     printLinkedList(PairWiseSwapByChangingPointer(input));
/* 816 */     System.out.println();
/* 817 */     printLinkedList(InsertionSort(input));
/*     */ 
/* 839 */     System.out.println();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.LinkedList
 * JD-Core Version:    0.6.2
 */