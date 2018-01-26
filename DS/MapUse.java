/*     */ package DS;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class MapUse
/*     */ {
/*     */   public static void printIntersection(int[] first, int[] second)
/*     */   {
/*  18 */     HashMap map = new HashMap();
/*     */ 
/*  20 */     for (int i = 0; i < first.length; i++) {
/*  21 */       map.put(Integer.valueOf(first[i]), Boolean.valueOf(true));
/*     */     }
/*     */ 
/*  24 */     for (int i = 0; i < second.length; i++)
/*  25 */       if (map.containsKey(Integer.valueOf(second[i])))
/*  26 */         System.out.println(second[i]);
/*     */   }
/*     */ 
/*     */   public static void PrintMaximumFrequency(int[] array)
/*     */   {
/*  33 */     HashMap map = new HashMap();
/*  34 */     int max = 1;
/*  35 */     for (int i = 0; i < array.length; i++) {
/*  36 */       if (map.containsKey(Integer.valueOf(array[i]))) {
/*  37 */         int count = ((Integer)map.get(Integer.valueOf(array[i]))).intValue();
/*  38 */         map.put(Integer.valueOf(array[i]), Integer.valueOf(count + 1));
/*  39 */         if (count + 1 > max)
/*  40 */           max = count + 1;
/*     */       }
/*     */       else
/*     */       {
/*  44 */         map.put(Integer.valueOf(array[i]), Integer.valueOf(1));
/*     */       }
/*     */     }
/*     */ 
/*  48 */     for (int i = 0; i < array.length; i++)
/*  49 */       if ((map.containsKey(Integer.valueOf(array[i]))) && 
/*  50 */         (((Integer)map.get(Integer.valueOf(array[i]))).intValue() == max)) {
/*  51 */         System.out.println(array[i]);
/*  52 */         break;
/*     */       }
/*     */   }
/*     */ 
/*     */   public static void extract(String a)
/*     */   {
/*  60 */     HashMap map = new HashMap();
/*  61 */     for (int i = 0; i < a.length(); i++) {
/*  62 */       if (map.containsKey(Character.valueOf(a.charAt(i)))) {
/*  63 */         int count = ((Integer)map.get(Character.valueOf(a.charAt(i)))).intValue();
/*  64 */         map.put(Character.valueOf(a.charAt(i)), Integer.valueOf(count + 1));
/*     */       }
/*     */       else {
/*  67 */         map.put(Character.valueOf(a.charAt(i)), Integer.valueOf(1));
/*     */       }
/*     */     }
/*  70 */     for (int i = 0; i < a.length(); i++)
/*  71 */       if (map.containsKey(Character.valueOf(a.charAt(i)))) {
/*  72 */         System.out.println(a.charAt(i) + "-->" + map.get(Character.valueOf(a.charAt(i))));
/*  73 */         map.remove(Character.valueOf(a.charAt(i)));
/*     */       }
/*     */   }
/*     */ 
/*     */   public static void RemoveDuplicatesFromArray(int[] arr)
/*     */   {
/*  80 */     HashMap map = new HashMap();
/*  81 */     for (int i = 0; i < arr.length; i++) {
/*  82 */       if (!map.containsKey(Integer.valueOf(arr[i])))
/*     */       {
/*  86 */         map.put(Integer.valueOf(arr[i]), Boolean.valueOf(true));
/*     */       }
/*     */     }
/*     */ 
/*  90 */     for (Iterator localIterator = map.keySet().iterator(); localIterator.hasNext(); ) { int i = ((Integer)localIterator.next()).intValue();
/*  91 */       System.out.print(i + " ");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void PrintPairsHavingSumZero(int[] arr, int sum)
/*     */   {
/* 105 */     HashMap map = new HashMap();
/*     */ 
/* 107 */     for (int i = 0; i < arr.length; i++) {
/* 108 */       map.put(Integer.valueOf(arr[i]), Boolean.valueOf(false));
/*     */     }
/*     */ 
/* 111 */     for (int i = 0; i < arr.length; i++)
/*     */     {
/* 113 */       int secondNumber = sum - arr[i];
/*     */ 
/* 115 */       if ((map.containsKey(Integer.valueOf(secondNumber))) && (!((Boolean)map.get(Integer.valueOf(secondNumber))).booleanValue()))
/*     */       {
/* 117 */         System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + secondNumber + ")");
/*     */       }
/* 119 */       map.put(Integer.valueOf(arr[i]), Boolean.valueOf(true));
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 127 */     Map m = new Map();
/* 128 */     int[] A = { 1, 2, 3, 4, 5 };
/* 129 */     int[] B = { 2, 4, 5, 8, 9 };
/* 130 */     printIntersection(A, B);
/*     */ 
/* 135 */     ArrayList a = new ArrayList();
/*     */ 
/* 137 */     a.add(Integer.valueOf(3)); a.add(Integer.valueOf(2)); a.add(Integer.valueOf(3)); a.add(Integer.valueOf(1)); a.add(Integer.valueOf(4));
/* 138 */     System.out.println(a.get(2));
/*     */ 
/* 146 */     System.out.println("duplicates");
/* 147 */     int temp = 0;
/* 148 */     for (int i = 0; i < a.size(); i++) {
/* 149 */       temp = temp ^ ((Integer)a.get(i)).intValue() ^ i;
/*     */     }
/* 151 */     if (temp == 0) {
/* 152 */       System.out.println(-1);
/*     */     }
/* 154 */     System.out.println(temp);
/* 155 */     List aa = new ArrayList();
/* 156 */     a.add(Integer.valueOf(0)); a.add(Integer.valueOf(0)); a.add(Integer.valueOf(1)); a.add(Integer.valueOf(0)); a.add(Integer.valueOf(0));
/*     */ 
/* 162 */     while (((Integer)a.get(0)).intValue() == 0) {
/* 163 */       a.remove(0);
/*     */     }
/*     */ 
/* 166 */     System.out.println(a);
/* 167 */     int[] array = { 1, 2, 1, 1, 4, 4, 4, 4, 4, 4 };
/* 168 */     System.out.println("Element with maximum frequency is:");
/* 169 */     PrintMaximumFrequency(array);
/*     */ 
/* 171 */     System.out.println("Remove duplicates from array");
/* 172 */     int[] arr = { 9, 9, 1, 2, 1, 2, 4, 5, 4, 6, 8, 9 };
/* 173 */     RemoveDuplicatesFromArray(arr);
/*     */ 
/* 175 */     int[] input = { 1, 2, -1, 3, -2, -3 };
/* 176 */     PrintPairsHavingSumZero(input, 0);
/* 177 */     System.out.println();
/*     */ 
/* 179 */     extract("1232352352311");
/*     */ 
/* 182 */     m.add("abc", "def");
/* 183 */     System.out.println("abc".hashCode() + " " + "def".hashCode() + " " + "ghi".hashCode());
/* 184 */     m.add("ghi", "xyz");
/* 185 */     m.add("abc", "oppo");
/* 186 */     System.out.println(m.getvalue("abc"));
/* 187 */     System.out.println(m.getvalue("ghi"));
/* 188 */     m.add("jkl", "mnop");
/* 189 */     System.out.println(m.getvalue("jkl"));
/*     */ 
/* 191 */     System.out.println("Printing the bucket");
/* 192 */     PairNode[] bucket = m.bucket;
/* 193 */     for (int i = 0; i < bucket.length; i++)
/* 194 */       if (bucket[i] != null)
/* 195 */         System.out.println(bucket[i].data.key);
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DS.MapUse
 * JD-Core Version:    0.6.2
 */