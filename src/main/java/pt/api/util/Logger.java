package pt.api.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Logger {
	private String logdir;
	private String name = "pt-api";

	public Logger(){
		try {
			Properties properties = new Properties();
			FileInputStream in = new FileInputStream("kabu.config");
			properties.load(in);
			logdir = properties.getProperty("LOGDIR");
			if (new Boolean(properties.getProperty("LOGGER").trim()).booleanValue())
				if (!(new File(logdir).exists())){
					new File(logdir).mkdir();
				}
					
			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		logdir = "/";
	}
	
	public Logger(String name) {
      this.name = name;
      try {
         Properties properties = new Properties();
         FileInputStream in = new FileInputStream("kabu.config");
         properties.load(in);
         logdir = properties.getProperty("LOGDIR");
         if (new Boolean(properties.getProperty("LOGGER").trim()).booleanValue())
            if (!(new File(logdir).exists())){
            	new File(logdir).mkdir();
            }
         in.close();

      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
//      logdir = "/";
   }
	
	public void Log_Data(String data) {
		try {
			String filename = new String();
			filename = logdir+"logs/" + name + formatDate("ddMMMyyyy") + ".log";
			Writer writer = new FileWriter(filename, true);
			PrintWriter out = new PrintWriter(writer);
			out.println("----------------------------------------------");
			out.println("Date/Time :" + formatDate("MMM dd yyyy 'at' HH:mm:ss aaa ") +
					" ");
			out.println("INFO:\"" + data + "\"");
			writer.close(); 
			out.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public void Log_Error(Throwable data) {
		try {
			String filename = new String();
			filename = logdir+"logs/" + name + formatDate("ddMMMyyyy") + ".error";
			Writer writer = new FileWriter(filename, true);
			PrintWriter out = new PrintWriter(writer);
			out.println("----------------------------------------------");
			out.println("Date/Time :" + formatDate("MMM dd yyyy 'at' HH:mm:ss aaa") +
					"  ");
			data.printStackTrace(out);
			writer.close();
			out.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	}

	private static String formatDate(String format) {
		Format formatter;
		Date date = new Date();
		formatter = new SimpleDateFormat(format);
		String formattedDate = formatter.format(date);
		return formattedDate;
	}
}
