/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Writer;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URI;
/*     */ import java.net.URL;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ 
/*     */ public class WeatherReport
/*     */ {
/*  16 */   public static final String[] regions = { "UK", "England", "Wales", "Scotland" };
/*  17 */   public static final String[] params = { "Tmax", "Tmin", "Tmean", "Sunshine", "Rainfall" };
/*     */   public static final String base_url = "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/";
/*     */   public static final String directory_name = "C:\\KisanHubAssignment\\src\\";
/*     */   public static final String date = "/date/";
/*     */   private static FileWriter file_writer;
/*  22 */   private static String line = null;
/*     */   private static final String NOT_AVAILABLE = "N/A";
/*     */   private static String[] keys;
/*     */ 
/*     */   public static void Download_Weather_Report_Files()
/*     */   {
/*  32 */     for (int i = 0; i < regions.length; i++)
/*     */     {
/*  34 */       for (int j = 0; j < params.length; j++)
/*     */       {
/*  36 */         String url = "https://www.metoffice.gov.uk/pub/data/weather/uk/climate/datasets/" + params[j] + "/date/" + regions[i] + ".txt";
/*     */ 
/*  38 */         File dir = new File("C:\\KisanHubAssignment\\src\\" + regions[i]);
/*  39 */         dir.mkdir();
/*     */ 
/*  41 */         String path_to_store = "C:\\KisanHubAssignment\\src\\" + regions[i] + "\\" + regions[i] + "_" + params[j] + ".txt";
/*     */         try
/*     */         {
/*  45 */           download(url, path_to_store);
/*     */         }
/*     */         catch (Exception localException)
/*     */         {
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void download(String url, String path_to_store)
/*     */   {
/*  56 */     if (Files.exists(Paths.get(path_to_store, new String[0]), new LinkOption[0])) {
/*  57 */       return;
/*     */     }
/*     */ 
/*  60 */     Path path = Paths.get(path_to_store, new String[0]);
/*     */ 
/*  63 */     URI uri = URI.create(url);
/*     */     try { Object localObject1 = null; Object localObject4 = null;
/*     */       Object localObject3;
/*  64 */       label115: 
/*     */       try { in = uri.toURL().openStream(); }
/*     */       finally
/*     */       {
/*  66 */         InputStream in;
/*  66 */         localObject3 = localThrowable; break label115; if (localObject3 != localThrowable) localObject3.addSuppressed(localThrowable); 
/*     */       } } catch (MalformedURLException e) { e.printStackTrace();
/*     */     } catch (IOException e) {
/*  69 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void Write_To_CSV_File()
/*     */   {
/*  75 */     File dir = new File("C:\\KisanHubAssignment\\src\\Output");
/*  76 */     dir.mkdir();
/*     */ 
/*  78 */     String output_path = "C:\\KisanHubAssignment\\src\\Output\\output.csv";
/*     */     try {
/*  80 */       file_writer = new FileWriter(output_path);
/*  81 */       initial_setup_csv();
/*  82 */       parse_text_to_csv();
/*     */     } catch (IOException e) {
/*  84 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void initial_setup_csv()
/*     */     throws IOException
/*     */   {
/*  91 */     file_writer.append("region").append(",");
/*  92 */     file_writer.append("weather").append(",");
/*  93 */     file_writer.append("year").append(",");
/*  94 */     file_writer.append("keys").append(",");
/*  95 */     file_writer.append("values").append(",");
/*  96 */     file_writer.append(System.getProperty("line.separator"));
/*     */   }
/*     */ 
/*     */   public static void parse_text_to_csv() throws IOException
/*     */   {
/* 101 */     for (String region : regions)
/*     */     {
/* 103 */       for (String param : params)
/*     */       {
/* 105 */         String file_path_to_parse = "C:\\KisanHubAssignment\\src\\" + region + "\\" + region + "_" + param + ".txt";
/*     */         try
/*     */         {
/* 108 */           BufferedReader reader = new BufferedReader(new FileReader(file_path_to_parse));
/*     */ 
/* 110 */           int line_count = 1;
/* 111 */           while ((WeatherReport.line = reader.readLine()) != null)
/*     */           {
/* 114 */             if (line_count == 8) {
/* 115 */               storeKeys(line);
/*     */             }
/* 118 */             else if (line_count > 8) {
/* 119 */               parseRemainingLines(line, region, param);
/*     */             }
/* 121 */             line_count++;
/*     */           }
/*     */ 
/* 124 */           reader.close();
/*     */         }
/*     */         catch (FileNotFoundException e) {
/* 127 */           e.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void storeKeys(String line)
/*     */   {
/* 138 */     keys = line.split("\\s{1,5}");
/*     */   }
/*     */ 
/*     */   public static void parseRemainingLines(String line, String region, String param)
/*     */   {
/* 143 */     String[] values = line.split("\\s{1,6}");
/* 144 */     String year = values[0];
/* 145 */     for (int i = 1; i < values.length; i++) {
/* 146 */       if (("---".equals(values[i])) || ("".equals(values[i])))
/* 147 */         values[i] = "N/A";
/*     */       try
/*     */       {
/* 150 */         file_writer.append(region).append(",");
/* 151 */         file_writer.append(param).append(",");
/* 152 */         file_writer.append(year).append(",");
/* 153 */         file_writer.append(keys[i]).append(",");
/* 154 */         file_writer.append(values[i]).append(",");
/* 155 */         file_writer.append(System.getProperty("line.separator"));
/*     */       } catch (IOException e) {
/* 157 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private static void closing_files()
/*     */   {
/*     */     try
/*     */     {
/* 167 */       file_writer.flush();
/* 168 */       file_writer.close();
/*     */     } catch (IOException e) {
/* 170 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */     throws IOException
/*     */   {
/* 177 */     Download_Weather_Report_Files();
/* 178 */     Write_To_CSV_File();
/* 179 */     closing_files();
/*     */   }
/*     */ }

/* Location:           C:\Users\Himanshu\Desktop\JDGUI\JavaPrograms.jar
 * Qualified Name:     WeatherReport
 * JD-Core Version:    0.6.2
 */