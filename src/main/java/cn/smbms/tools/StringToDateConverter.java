package cn.smbms.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.cglib.core.Converter;

import com.jsptags.navigation.pager.parser.ParseException;

public class StringToDateConverter implements org.springframework.core.convert.converter.Converter<String,Date>{
    private String datePattern;
    public StringToDateConverter(String datePattern){
    	System.out.println("StringToDateConverter convert:"+datePattern);
    	this.datePattern = datePattern;
    }
	public Date convert(String s) {
		Date date = null;
		try {
			date = new SimpleDateFormat(datePattern).parse(s);
		   System.out.println("date"+date);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
    
}
