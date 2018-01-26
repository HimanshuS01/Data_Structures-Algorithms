/*     */ package PlacementPractice;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Queue;
/*     */ import java.util.Scanner;
/*     */ import java.util.Stack;
/*     */ 
/*     */ public class checkPrime
/*     */ {
/*     */   private static int selectCrew(int applicant)
/*     */   {
/*  19 */     for (int x = 0; Math.pow(2.0D, x) <= applicant; x++);
/*  21 */     return (int)Math.pow(2.0D, x - 1);
/*     */   }
/*     */ 
/*     */   private static void findNumberFromCoordinates(int x, int y)
/*     */   {
/*  27 */     if ((y > x) || (y == x - 1) || (x - y >= 3))
/*  28 */       System.out.println("No Number");
/*  29 */     else if ((x % 2 != 0) && (x == y + 2))
/*  30 */       System.out.println(x + y - 1);
/*  31 */     else if ((x % 2 == 0) && (x == y + 2))
/*  32 */       System.out.println(x + y);
/*  33 */     else if ((x % 2 == 0) && (x == y))
/*  34 */       System.out.println(2 * x);
/*  35 */     else if ((x % 2 != 0) && (x == y))
/*  36 */       System.out.println(2 * x - 1);
/*     */   }
/*     */ 
/*     */   public static void printIntersection(int[] arr1, int[] arr2)
/*     */   {
/*  46 */     for (int i = 0; i < arr1.length; i++)
/*  47 */       for (int j = 0; j < arr2.length; j++)
/*  48 */         if (arr1[i] == arr2[j])
/*  49 */           System.out.print(arr1[i] + " ");
/*     */   }
/*     */ 
/*     */   public static void printStringWithoutConsecutiveCharacter(String str)
/*     */   {
/*  57 */     String newStr = "";
/*     */     int count;
/*  59 */     for (int i = 0; i < str.length(); i += count) {
/*  60 */       count = 1;
/*  61 */       char ch = str.charAt(i);
/*  62 */       int j = i + 1;
/*  63 */       while ((j < str.length()) && (ch == str.charAt(j))) {
/*  64 */         count++;
/*  65 */         j++;
/*     */       }
/*  67 */       newStr = newStr + ch;
/*     */     }
/*  69 */     System.out.println(newStr);
/*     */   }
/*     */ 
/*     */   public static void pairsSumToX(int[] arr, int beg, int end, int sum)
/*     */   {
/*  74 */     Arrays.sort(arr);
/*  75 */     while (beg < end)
/*  76 */       if (arr[beg] + arr[end] == sum) {
/*  77 */         System.out.println(arr[beg] + "&" + arr[end]);
/*  78 */         beg++;
/*  79 */         end--;
/*     */       }
/*  81 */       else if (arr[beg] + arr[end] < sum) {
/*  82 */         beg++;
/*     */       }
/*     */       else {
/*  85 */         end--;
/*     */       }
/*     */   }
/*     */ 
/*     */   public static void sumOfArrayFromEnd(int[] arr1, int[] arr2)
/*     */   {
/*  93 */     int[] c = new int[arr1.length + 1];
/*  94 */     int carry = 0;
/*  95 */     int end_of_c = c.length - 1;
/*  96 */     for (int end = arr1.length - 1; end >= 0; end--)
/*     */     {
/*  98 */       int sum = arr1[end] + arr2[end] + carry;
/*  99 */       if (sum < 9) {
/* 100 */         c[(end_of_c--)] = sum;
/* 101 */         carry = 0;
/*     */       }
/*     */       else {
/* 104 */         int rem = sum % 10;
/* 105 */         carry = sum / 10;
/* 106 */         c[(end_of_c--)] = rem;
/*     */       }
/*     */     }
/* 109 */     if (carry > 0) {
/* 110 */       c[0] = carry;
/*     */     }
/* 112 */     for (int i = 0; i < c.length; i++)
/* 113 */       System.out.print(c[i] + ",");
/*     */   }
/*     */ 
/*     */   public static void SelectionSort(int[] arr)
/*     */   {
/* 119 */     for (int i = 0; i < arr.length - 1; i++)
/*     */     {
/* 121 */       int min = arr[i];
/* 122 */       int pos = i;
/*     */ 
/* 124 */       for (int j = i + 1; j < arr.length; j++) {
/* 125 */         if (arr[j] < min) {
/* 126 */           min = arr[j];
/* 127 */           pos = j;
/*     */         }
/*     */       }
/* 130 */       int temp = arr[i];
/* 131 */       arr[i] = arr[pos];
/* 132 */       arr[pos] = temp;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void Remove_X(String str)
/*     */   {
/* 139 */     if (str.length() == 0) {
/* 140 */       return;
/*     */     }
/*     */ 
/* 143 */     if (str.charAt(0) == 'x') {
/* 144 */       Remove_X(str.substring(1));
/*     */     }
/*     */     else
/*     */     {
/* 148 */       System.out.print(str.charAt(0));
/* 149 */       Remove_X(str.substring(1));
/*     */     }
/*     */   }
/*     */ 
/*     */   public static int StringToInteger(String str)
/*     */   {
/* 155 */     int sum = 0;
/* 156 */     if (str.length() == 0) {
/* 157 */       return -1;
/*     */     }
/*     */ 
/* 160 */     if (str.length() == 1) {
/* 161 */       return str.charAt(0) - '0';
/*     */     }
/*     */ 
/* 164 */     return sum + (str.charAt(0) - '0') * (int)Math.pow(10.0D, str.length() - 1) + StringToInteger(str.substring(1));
/*     */   }
/*     */ 
/*     */   public static void ReverseString(String str, int end)
/*     */   {
/* 170 */     if (str.length() == 0) {
/* 171 */       return;
/*     */     }
/* 173 */     if (end >= 0) {
/* 174 */       System.out.print(str.charAt(end));
/* 175 */       ReverseString(str, end - 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void Reverse_String(String str)
/*     */   {
/* 181 */     if (str.length() == 0) {
/* 182 */       return;
/*     */     }
/* 184 */     Reverse_String(str.substring(1));
/* 185 */     System.out.print(str.charAt(0));
/*     */   }
/*     */ 
/*     */   public static void LargestSequenceOfConsecutiveNumbers(int[] arr)
/*     */   {
/* 191 */     Arrays.sort(arr);
/*     */ 
/* 193 */     int max = -2147483648;
/* 194 */     int count = 0; int beg = 0; int start_index = 0;
/*     */ 
/* 196 */     for (int i = 0; i < arr.length - 1; i++) {
/* 197 */       if (beg == 0) {
/* 198 */         beg = i;
/*     */       }
/*     */ 
/* 201 */       if (arr[(i + 1)] == arr[i] + 1) {
/* 202 */         count++;
/*     */       }
/* 205 */       else if (count > max) {
/* 206 */         max = count;
/* 207 */         start_index = beg;
/* 208 */         count = 0;
/* 209 */         beg = 0;
/*     */       }
/*     */       else
/*     */       {
/* 213 */         beg = 0;
/* 214 */         count = 0;
/*     */       }
/*     */     }
/*     */ 
/* 218 */     for (int i = start_index; i <= start_index + max; i++)
/* 219 */       System.out.print(arr[i] + " ");
/*     */   }
/*     */ 
/*     */   public static void findLongestConseqSubseq(int[] arr)
/*     */   {
/* 230 */     HashSet S = new HashSet();
/* 231 */     int ans = 0;
/* 232 */     Queue queue = new LinkedList();
/* 233 */     ArrayList array = new ArrayList();
/*     */ 
/* 235 */     for (int i = 0; i < arr.length; i++) {
/* 236 */       S.add(Integer.valueOf(arr[i]));
/*     */     }
/*     */ 
/* 240 */     for (int i = 0; i < arr.length; i++)
/*     */     {
/* 243 */       if (!S.contains(Integer.valueOf(arr[i] - 1)))
/*     */       {
/* 246 */         int j = arr[i];
/* 247 */         queue.clear();
/* 248 */         while (S.contains(Integer.valueOf(j))) {
/* 249 */           queue.add(Integer.valueOf(j));
/* 250 */           j++;
/*     */         }
/*     */ 
/* 254 */         if (ans < j - arr[i]) {
/* 255 */           array.clear();
/* 256 */           while (!queue.isEmpty()) {
/* 257 */             int number = ((Integer)queue.poll()).intValue();
/* 258 */             array.add(Integer.valueOf(number));
/*     */           }
/* 260 */           ans = j - arr[i];
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 265 */     for (int i = 0; i < array.size(); i++)
/* 266 */       System.out.print(array.get(i) + " ");
/*     */   }
/*     */ 
/*     */   public static void removeConsecutiveDuplicatesFromString(String str)
/*     */   {
/* 272 */     String result = "";
/* 273 */     int i = 0;
/* 274 */     while (i < str.length() - 1)
/*     */     {
/* 276 */       if (str.charAt(i) == str.charAt(i + 1)) {
/* 277 */         i++;
/*     */       }
/*     */       else {
/* 280 */         result = result + str.charAt(i);
/* 281 */         i++;
/*     */       }
/*     */     }
/* 284 */     System.out.println(result);
/*     */   }
/*     */ 
/*     */   public static void RemoveDuplicatesFromAnArray(int[] arr)
/*     */   {
/* 290 */     int j = 0;
/* 291 */     for (int i = 0; i < arr.length - 1; i++) {
/* 292 */       if (arr[i] != arr[(i + 1)]) {
/* 293 */         arr[(j++)] = arr[i];
/*     */       }
/*     */     }
/* 296 */     arr[(j++)] = arr[(arr.length - 1)];
/*     */ 
/* 298 */     for (int i = 1; i <= j; i++)
/* 299 */       System.out.print(i + " ");
/*     */   }
/*     */ 
/*     */   public static void removeAdjacentDuplicatesUsingStack(String str)
/*     */   {
/* 306 */     Stack stack = new Stack();
/* 307 */     char poppedElement = str.charAt(0);
/* 308 */     for (int i = 0; i < str.length(); i++)
/*     */     {
/* 310 */       if (stack.isEmpty()) {
/* 311 */         stack.push(Character.valueOf(str.charAt(i)));
/*     */       }
/*     */       else {
/* 314 */         char topElement = ((Character)stack.peek()).charValue();
/*     */ 
/* 316 */         if ((str.charAt(i) != topElement) && (str.charAt(i) != poppedElement)) {
/* 317 */           stack.push(Character.valueOf(str.charAt(i)));
/*     */         }
/* 320 */         else if (str.charAt(i) == topElement) {
/* 321 */           poppedElement = ((Character)stack.pop()).charValue();
/*     */         }
/*     */         else
/*     */         {
/* 325 */           i++;
/*     */         }
/*     */       }
/*     */     }
/* 329 */     System.out.print(stack);
/*     */   }
/*     */ 
/*     */   public static String removeAdjacentDuplicates(char prevChar, String str, int beg)
/*     */   {
/* 347 */     if ((str.length() == 0) || (str.length() == 1)) {
/* 348 */       return str;
/*     */     }
/* 350 */     if ((str.charAt(0) != str.charAt(1)) && ((beg == 0) || (prevChar != str.charAt(0)))) {
/* 351 */       return str.charAt(0) + removeAdjacentDuplicates(str.charAt(0), str.substring(1), beg++);
/*     */     }
/* 353 */     if (prevChar == str.charAt(0)) {
/* 354 */       return removeAdjacentDuplicates(str.charAt(0), str.substring(1), beg++);
/*     */     }
/*     */ 
/* 357 */     return removeAdjacentDuplicates(str.charAt(0), str.substring(2), beg++);
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 367 */     Scanner s = new Scanner(System.in);
/* 368 */     removeAdjacentDuplicatesUsingStack("acaaabbbacdddd");
/*     */ 
/* 370 */     char ch1 = 'B';
/*     */ 
/* 374 */     String st = "12345";
/* 375 */     for (int i = 0; i < st.length(); i++) {
/* 376 */       System.out.println(Character.getNumericValue(st.charAt(i)));
/*     */     }
/*     */ 
/* 379 */     int i1 = Character.getNumericValue(ch1);
/* 380 */     System.out.println(i1);
/*     */ 
/* 383 */     int testCases = s.nextInt();
/* 384 */     String strr = s.nextLine();
/* 385 */     String[] output = new String[testCases];
/* 386 */     for (int i = 0; i < testCases; i++)
/*     */     {
/* 388 */       strr = s.nextLine();
/* 389 */       output[i] = removeAdjacentDuplicates(strr.charAt(0), strr, 0);
/*     */     }
/*     */ 
/* 393 */     for (int i = 0; i < output.length; i++) {
/* 394 */       System.out.println(output[i]);
/*     */     }
/*     */ 
/* 398 */     int[] inp = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 5, 5, 5 };
/* 399 */     RemoveDuplicatesFromAnArray(inp);
/* 400 */     removeConsecutiveDuplicatesFromString("aabbcccdd");
/*     */ 
/* 407 */     int[] input = { 1, 9, 3, 10, 4, 20, 2 };
/* 408 */     findLongestConseqSubseq(input);
/*     */ 
/* 410 */     System.out.println();
/* 411 */     String N = "Himanshu";
/* 412 */     Reverse_String(N);
/*     */ 
/* 415 */     System.out.println();
/*     */ 
/* 417 */     System.out.println(StringToInteger("1234"));
/*     */ 
/* 419 */     Remove_X("xabxcxdx");
/* 420 */     System.out.println();
/*     */ 
/* 423 */     int[] arr3 = { 5, 1, 3, 0, 7, 6 };
/* 424 */     SelectionSort(arr3);
/* 425 */     for (int i : arr3) {
/* 426 */       System.out.print(i + " ");
/*     */     }
/* 428 */     System.out.println();
/*     */ 
/* 430 */     int[] arr1 = { 9, 9, 9, 9 };
/* 431 */     int[] arr2 = { 9, 9, 9, 9 };
/* 432 */     sumOfArrayFromEnd(arr1, arr2);
/* 433 */     System.out.println();
/*     */ 
/* 435 */     int[] arr = { 1, 4, 45, 6, 10, -8 };
/* 436 */     pairsSumToX(arr, 0, arr.length - 1, 2);
/*     */ 
/* 439 */     String str = s.next();
/* 440 */     printStringWithoutConsecutiveCharacter(str);
/*     */ 
/* 443 */     printIntersection(arr1, arr2);
/*     */ 
/* 445 */     int x = s.nextInt();
/* 446 */     int y = s.nextInt();
/* 447 */     findNumberFromCoordinates(x, y);
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     PlacementPractice.checkPrime
 * JD-Core Version:    0.6.2
 */