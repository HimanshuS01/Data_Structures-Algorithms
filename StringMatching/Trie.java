/*     */ package StringMatching;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.HashMap;
/*     */ import java.util.Stack;
/*     */ 
/*     */ public class Trie
/*     */ {
/*     */   TrieNode rootNode;
/*     */   int size;
/*     */ 
/*     */   public Trie()
/*     */   {
/*  11 */     this.rootNode = new TrieNode();
/*  12 */     this.rootNode.isRoot = true;
/*     */   }
/*     */ 
/*     */   public int dictionarySize() {
/*  16 */     return this.size;
/*     */   }
/*     */ 
/*     */   public boolean isPresent(String word)
/*     */   {
/*  22 */     if (word.length() == 0) {
/*  23 */       return true;
/*     */     }
/*  25 */     TrieNode currentRoot = this.rootNode;
/*  26 */     for (int i = 0; i < word.length(); i++) {
/*  27 */       char currentChar = word.charAt(i);
/*  28 */       if (!currentRoot.children.containsKey(Character.valueOf(currentChar))) {
/*  29 */         return false;
/*     */       }
/*  31 */       currentRoot = (TrieNode)currentRoot.children.get(Character.valueOf(currentChar));
/*     */     }
/*     */ 
/*  34 */     if (currentRoot.isTerminal) {
/*  35 */       return true;
/*     */     }
/*  37 */     return false;
/*     */   }
/*     */ 
/*     */   public void insert(String word)
/*     */   {
/*  42 */     if (word.length() == 0) {
/*  43 */       return;
/*     */     }
/*  45 */     TrieNode currentRoot = this.rootNode;
/*  46 */     for (int i = 0; i < word.length(); i++) {
/*  47 */       char currentChar = word.charAt(i);
/*  48 */       if (currentRoot.children.containsKey(Character.valueOf(currentChar))) {
/*  49 */         currentRoot = (TrieNode)currentRoot.children.get(Character.valueOf(currentChar));
/*     */       } else {
/*  51 */         TrieNode node = new TrieNode();
/*  52 */         node.data = currentChar;
/*  53 */         currentRoot.children.put(Character.valueOf(currentChar), node);
/*  54 */         currentRoot = node;
/*     */       }
/*     */     }
/*     */ 
/*  58 */     if (!currentRoot.isTerminal) {
/*  59 */       currentRoot.isTerminal = true;
/*  60 */       this.size += 1;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void delete(String word) {
/*  65 */     if (!isPresent(word)) {
/*  66 */       return;
/*     */     }
/*  68 */     TrieNode currentRoot = this.rootNode;
/*  69 */     Stack parents = new Stack();
/*     */ 
/*  71 */     for (int i = 0; i < word.length(); i++) {
/*  72 */       char currentChar = word.charAt(i);
/*  73 */       parents.add(currentRoot);
/*  74 */       currentRoot = (TrieNode)currentRoot.children.get(Character.valueOf(currentChar));
/*     */     }
/*     */ 
/*  77 */     currentRoot.isTerminal = false;
/*  78 */     this.size -= 1;
/*     */ 
/*  80 */     TrieNode child = currentRoot;
/*  81 */     TrieNode parent = (TrieNode)parents.pop();
/*     */ 
/*  84 */     while ((!child.isTerminal) && (child.children.size() == 0)) {
/*  85 */       parent.children.remove(Character.valueOf(child.data));
/*  86 */       child = parent;
/*  87 */       if (parents.isEmpty())
/*     */         break;
/*  89 */       parent = (TrieNode)parents.pop();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  99 */     Trie t = new Trie();
/* 100 */     t.insert("are");
/* 101 */     t.insert("do");
/* 102 */     t.insert("dote");
/* 103 */     System.out.println(t.size);
/* 104 */     t.insert("dot");
/* 105 */     System.out.println(t.size);
/* 106 */     System.out.println(t.isPresent("do"));
/* 107 */     t.delete("dot");
/* 108 */     System.out.println(t.isPresent("dot"));
/* 109 */     t.delete("are");
/* 110 */     System.out.println(t.isPresent("are"));
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     StringMatching.Trie
 * JD-Core Version:    0.6.2
 */