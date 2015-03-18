package pt.api.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	static String logdir;
	static String name = "pt-api";
	
	public Logger(){
		try{
			logdir = "/";
			if (!(new File(logdir).exists())){
				new File(logdir).mkdir();
			}
		}catch(Exception e){}
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
