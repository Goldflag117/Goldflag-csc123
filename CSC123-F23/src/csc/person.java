package csc;
import java.util.Date;
import java.text.SimpleDateFormat;

public class person {
	//fields
	String Firstname;
	String LastName;
	String DOB = "(MM/DD/YY)";
	//constructor
	public person(String Firstname, String Lastname, String DOB) {
		
	}
	public String FullName(String Firstname, String Lastname) {
		return (Firstname + " " + Lastname);
	}
	
	private static long getAge(String date) throws Exception{
		SimpleDateFormat df=new SimpleDateFormat("MM/DD/YYYY");
		Date dob=df.parse(date); //Date of birth
 		Date today=new Date(); //today's date
		
 		//DOB milliseconds since 1970
		long dobInMilliseconds=dob.getTime();
		
		//Today's date, milliseconds since 1970
		long todayInMilliseconds=today.getTime();
		
		//Difference between today's date and DOB,  person's age in milliseconds 
		long delta=todayInMilliseconds-dobInMilliseconds;
		
		//Person's age in years
		long age=delta/1000/60/60/24/365;
		
		return age;
	}
	
	
	
	

}
