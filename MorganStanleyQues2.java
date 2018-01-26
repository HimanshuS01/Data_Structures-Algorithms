/*    */ import java.io.PrintStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collections;
/*    */ import java.util.Comparator;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class MorganStanleyQues2
/*    */ {
/*    */   public static String[] sort(String[] str_arr, int key, boolean reversal_value, String comparison_type)
/*    */   {
/*  8 */     ArrayList arr = new ArrayList();
/*    */ 
/* 11 */     for (int i = 0; i < str_arr.length; i++)
/*    */     {
/* 13 */       ArrayList a = new ArrayList(Arrays.asList(str_arr[i].split(" ")));
/* 14 */       arr.add(a);
/*    */     }
/*    */ 
/* 19 */     if (comparison_type.equals("lexicographic"))
/*    */     {
/* 21 */       Collections.sort(arr, new Comparator()
/*    */       {
/*    */         public int compare(ArrayList<String> a, ArrayList<String> b) {
/* 24 */           String first = (String)a.get(this.val$key - 1) + (String)b.get(this.val$key - 1);
/* 25 */           String second = (String)b.get(this.val$key - 1) + (String)a.get(this.val$key - 1);
/* 26 */           return first.compareTo(second);
/*    */         }
/*    */ 
/*    */       });
/*    */     }
/* 31 */     else if (comparison_type.equals("numeric")) {
/* 32 */       Collections.sort(arr, new Comparator()
/*    */       {
/*    */         public int compare(ArrayList<String> a, ArrayList<String> b) {
/* 35 */           String first = (String)a.get(this.val$key - 1);
/* 36 */           String second = (String)b.get(this.val$key - 1);
/* 37 */           return Integer.compare(Integer.valueOf(first).intValue(), Integer.valueOf(second).intValue());
/*    */         }
/*    */ 
/*    */       });
/*    */     }
/*    */ 
/* 43 */     if (reversal_value) {
/* 44 */       Collections.reverse(arr);
/*    */     }
/*    */ 
/* 48 */     for (int i = 0; i < str_arr.length; i++)
/*    */     {
/* 50 */       StringBuffer sb = new StringBuffer();
/* 51 */       for (String s : (ArrayList)arr.get(i))
/*    */       {
/* 53 */         sb.append(s + " ");
/*    */       }
/*    */ 
/* 56 */       str_arr[i] = sb.toString();
/*    */     }
/* 58 */     return str_arr;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 65 */     Scanner s = new Scanner(System.in);
/* 66 */     int n = s.nextInt();
/* 67 */     String[] str_arr = new String[n];
/* 68 */     String[] output = new String[n];
/* 69 */     str_arr[0] = s.nextLine();
/* 70 */     for (int i = 0; i < n; i++) {
/* 71 */       str_arr[i] = s.nextLine();
/*    */     }
/* 73 */     int key = s.nextInt();
/* 74 */     boolean reversal_value = s.nextBoolean();
/* 75 */     String comparison_type = s.next();
/* 76 */     output = sort(str_arr, key, reversal_value, comparison_type);
/*    */ 
/* 78 */     for (int i = 0; i < output.length; i++) {
/* 79 */       System.out.println(output[i]);
/*    */     }
/* 81 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     MorganStanleyQues2
 * JD-Core Version:    0.6.2
 */