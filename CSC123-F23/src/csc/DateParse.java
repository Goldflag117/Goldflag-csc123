package csc;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateParse {
	public static final String PATTERN="dd-MM-yy";
	public static void main(String[] args) {
		
		SimpleDateFormat df=new SimpleDateFormat(PATTERN);
		//Date d2=df.parse("10-12-00");
		//System.out.println(d2);
		
		try {
			//System.out.println(2/0);
			Date d2=df.parse("10-12-00");
			System.out.println(d2);
		}
		catch(ArithmeticException ae) {
			System.out.println("slap");
		}
		catch(ParseException pe) {
			System.out.println("invalid format");
		}
		
		
			
		
		
		
	}

}

