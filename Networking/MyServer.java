/*    */ package Networking;
/*    */ 
/*    */ import java.io.DataInputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.net.ServerSocket;
/*    */ import java.net.Socket;
/*    */ 
/*    */ public class MyServer
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*    */     try
/*    */     {
/* 14 */       ServerSocket ss = new ServerSocket(6666);
/* 15 */       Socket s = ss.accept();
/* 16 */       DataInputStream dis = new DataInputStream(s.getInputStream());
/* 17 */       String str = dis.readUTF();
/* 18 */       System.out.println("message=" + str);
/* 19 */       ss.close();
/*    */     }
/*    */     catch (Exception e) {
/* 22 */       System.out.println(e);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     Networking.MyServer
 * JD-Core Version:    0.6.2
 */