package csc;
import java.util.ArrayList;
public class Book {
	//fields
	private int pages;
	private String ISBN;
	private String author;
	private String title;
	ArrayList<String> notebook = new ArrayList<String>();
	
	//constructor
	public Book(int pages, String iSBN, String author, String title) {
		super();
		this.pages = pages;
		ISBN = iSBN;
		this.author = author;
		this.title = title;
	}
	// getters/setters
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public ArrayList<String> getNotebook() {
		return notebook;
	}
	public void setNotebook(ArrayList<String> notebook) {
		this.notebook = notebook;
	}
	
 

}


