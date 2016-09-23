package BookDescription;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private String CopyrightDate;

	//setter method? for what? we already have constructor. Do we need setter?
	//Constructor
	public Book(String NameBook, String writer, String press, String CRdate){
		title=NameBook;
		author=writer;
		publisher=press;
		CopyrightDate=CRdate;		
	}
	
	//setter for title
	public void setT(String bookName){
		title = bookName;
	}
	
	//setter for author
	public void setAut(String wrtr){
		author = wrtr;
	}
	
	//setter for publisher
	public void setPub(String pblshr){
		publisher = pblshr;
	}
	
	//setter for copyright date
	public void setD(String date){
		CopyrightDate = date;
	}
	
	//getter for title
	public String getT(){
		return title;
	}
	
	//getter for author
	public String getAut(){
		return author;
	}
	
	//getter for publisher
	public String getPub(){
		return publisher;
	}
	
	//getter for Copyright date
	public String getD(){
		return CopyrightDate;
	}
	
	//toString method for good formatting
	public String toString(){
		return "Title: " + title + "\n" + "Author: " + author + "\n" + "Publisher : " + 
	publisher + "\n" + "Copyright: " + CopyrightDate + "\n" ;
	}
}
