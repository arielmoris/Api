package pt.api.util;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DateDeserializer implements JsonDeserializer<Date>{

	@Override
	public Date deserialize(JsonElement json, Type typeOfT,JsonDeserializationContext context) throws JsonParseException {
		String strDate = json.getAsString();
		String[] formats = {"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss.SSS"};
		Date date = null;
		for(String format : formats){
			SimpleDateFormat formatter = new SimpleDateFormat(format);
			try {
				date = formatter.parse(strDate);
				break;
			} catch (ParseException e) {}
		}
		return date;
	}

}
