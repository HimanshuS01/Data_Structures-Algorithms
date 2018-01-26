/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ArraysDublicacy
/*    */ {
/*    */   public static void RemoveDuplicates(String S)
/*    */   {
/*  9 */     HashMap map = new HashMap();
/*    */     int count;
/* 10 */     for (int i = 0; i < S.length(); i++) {
/* 11 */       if (map.containsKey(Character.valueOf(S.charAt(i)))) {
/* 12 */         count = ((Integer)map.get(Character.valueOf(S.charAt(i)))).intValue();
/* 13 */         map.put(Character.valueOf(S.charAt(i)), Integer.valueOf(++count));
/*    */       }
/*    */       else {
/* 16 */         map.put(Character.valueOf(S.charAt(i)), Integer.valueOf(1));
/*    */       }
/*    */     }
/* 19 */     for (Character key : map.keySet())
/* 20 */       System.out.println(key + "-->" + map.get(key));
/*    */   }
/*    */ 
/*    */   public static void Findrepeter()
/*    */   {
/* 25 */     String s = "aabbccaabbccaaaaaaaaaa";
/* 26 */     int distinct = 0;
/*    */ 
/* 28 */     for (int i = 0; i < s.length(); i++)
/*    */     {
/* 30 */       for (int j = 0; j < s.length(); j++)
/*    */       {
/* 32 */         if (s.charAt(i) == s.charAt(j))
/*    */         {
/* 34 */           distinct++;
/*    */         }
/*    */       }
/*    */ 
/* 38 */       System.out.println(s.charAt(i) + "--" + distinct);
/*    */ 
/* 40 */       s = s.replaceAll(String.valueOf(s.charAt(i)), "");
/* 41 */       System.out.println(s);
/* 42 */       distinct = 0;
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 49 */     System.out.println("Enter the string");
/* 50 */     Scanner s = new Scanner(System.in);
/* 51 */     String A = s.nextLine();
/* 52 */     RemoveDuplicates(A);
/* 53 */     Findrepeter();
/* 54 */     int i = 0;
/*    */ 
/* 57 */     while (i < A.length()) {
/* 58 */       int count = 1;
/* 59 */       for (int j = i + 1; j < A.length(); j++) {
/* 60 */         if (A.charAt(i) == A.charAt(j)) {
/* 61 */           count++;
/*    */         }
/*    */       }
/*    */ 
/* 65 */       System.out.println(A.charAt(i) + ":" + count + "Times");
/* 66 */       i += count;
/*    */     }
/*    */ 
/* 69 */     s.close();
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     ArraysDublicacy
 * JD-Core Version:    0.6.2
 */