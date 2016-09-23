package BookDescription;

public class Bookshelf {
	public static void main(String[] args) {
		//Creation for our objects
		Book book1 = new Book ("Java Software Solutions","Lewis & Luftus","Addison-Wesley","2011");
		//For book 1, I entered wrong date for to use our set method. (normal true date is 2012)
			
		Book book2 = new Book ("Faces in the World","Lewis Aleman","Megalodon Entertainment","2010");
		//For book 2, I entered wrong title for to use our set method. (normal true title is "Faces in Time")
				
		Book book3 = new Book ("Purple Cow","Bilal Onal","Dell","2002");
		//For book 3, I entered wrong author and publisher for to use our set methods. (normal true author is "Seth Godin")
		//Normal true publisher is "Portfolio"
		
		
		//Setting true date
		book1.setD("2012");
				
		//getting true date
		System.out.println("The true date for first book is " + book1.getD());
		
		//Setting true title
		book2.setT("Faces in Time");
		
		//getting true title
		System.out.println("The true title for first book is " + book2.getT());
		
		//Setting true author
		book3.setAut("Seth Godin");
		
		//getting true author
		System.out.println("The true author for first book is " + book3.getAut());
		
		//Setting true publisher
		book3.setPub("Portfolio");
		
		//getting true publisher
		System.out.println("The true date for first book is " + book3.getPub());
		
		//for good output 
		System.out.println();
		
		//toString statements for good formatted describe
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		
	}

}
