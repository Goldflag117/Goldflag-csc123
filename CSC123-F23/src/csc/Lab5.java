package csc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
public class Lab5 {

	public static void main(String[] args) {
		
		//String data="Some new informatiojn.... This is some data that I want to write into a file!!";
		String sourceFile="\"C:\\Users\\creep\\Desktop\\TextTest.txt\"";
		String targetFile="\"C:\\Users\\creep\\Desktop\\TargetTest.txt\"";
		System.out.println(sourceFile);
		try {
			//System.out.println(2/0);
			String File="Some new informatiojn.... This is some data that I want to write into a file!!";
			System.out.println(File);
		}
		catch(ArithmeticException ae) {
			System.out.println("slap");
		}
		//catch(ParseException pe) {
			System.out.println("invalid format");
		//}
	}

}
