package csc;
import java.util.ArrayList;
public class Library {
	//fields
	String name;
	String address;
	String city;
	String state;
	ArrayList<String> lib = new ArrayList<String>();
	Book myBook;
	//constructor
	public Library(String name, String address, String city, String state) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		
	}
	//getters/setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Book getMyBook() {
		return myBook;
	}
	public void setMyBook(Book myBook) {
		this.myBook = myBook;
	}
	//get,set ArrayList
	public ArrayList<String> getLib() {
		return lib;
	}
	public void setLib(ArrayList<String> lib) {
		
		this.lib = lib;
	}
	
	//chajfiqlfileq

}
