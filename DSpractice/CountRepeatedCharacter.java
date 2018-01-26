/*    */ package DSpractice;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class CountRepeatedCharacter
/*    */ {
/*    */   public static void Count_Repeated_Character(String s)
/*    */   {
/*  8 */     HashMap map = new HashMap();
/*  9 */     for (int i = 0; i < s.length(); i++) {
/* 10 */       if (map.containsKey(Character.valueOf(s.charAt(i)))) {
/* 11 */         int count = ((Integer)map.get(Character.valueOf(s.charAt(i)))).intValue();
/* 12 */         map.put(Character.valueOf(s.charAt(i)), Integer.valueOf(count + 1));
/*    */       }
/*    */       else {
/* 15 */         map.put(Character.valueOf(s.charAt(i)), Integer.valueOf(1));
/*    */       }
/*    */     }
/* 18 */     for (int i = 0; i < s.length(); i++)
/* 19 */       if (map.containsKey(Character.valueOf(s.charAt(i)))) {
/* 20 */         System.out.println(s.charAt(i) + " " + map.get(Character.valueOf(s.charAt(i))));
/* 21 */         map.remove(Character.valueOf(s.charAt(i)));
/*    */       }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 28 */     String s = "abaacdbbad";
/* 29 */     Count_Repeated_Character(s);
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     DSpractice.CountRepeatedCharacter
 * JD-Core Version:    0.6.2
 */