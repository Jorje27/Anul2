import java.util.Scanner;

public class Book {

	String title;
    String author;
	String publisher;
	int pageCount;
	static Scanner s = new Scanner(System.in);
	
	Book()
	{
		this.title = null;
		this.author = null;
		this.publisher = null;
		this.pageCount = 0;
	}
	
	public String getTitle()
	{
		return "BOOK_TITLE: " + this.title;
	}
	public String getAuthor()
	{
		return "BOOK_AUTHOR:" + this.author;
	}
	public String getPublisher()
	{
		return "BOOK_PUBLISHER:"+this.publisher;
	}
	public int getPageCount()
	{
		return this.pageCount;
	}
	
	public void setTitle()
	{
		 
		Scanner s = new Scanner(System.in);
	     title = s.nextLine();
	     
	    
	}
	public void setAuthor()
	{
		 
		Scanner s = new Scanner(System.in);
	     author = s.nextLine();
	     
	}
	public void setPublisher()
	{
		 Scanner s = new Scanner(System.in);
		 if(s.hasNextInt()) 
		 {
			 publisher = s.nextLine();
		 }
		s.close();
	}
	public void setPageCount()
	{
		 s = new Scanner(System.in);
		 if(s.hasNextInt()) 
		 {
			 pageCount = s.nextInt();
		 }
	}
	public void addBook()
	{
		getTitle();
		getAuthor();
		getPublisher();
		getPageCount();
		
	}
	public static void main(String[] args) {
		
		Book myBook = new Book();
		Book myBook2 = new Book();
		myBook.setTitle();
		myBook2.setTitle();
		myBook.setPageCount();
		myBook2.setPageCount();
		//System.out.println(myBook.getTitle());
		BookstoreTest b = new BookstoreTest();
		BookstoreCheck c = new BookstoreCheck();
		//System.out.println(b.checkPageCount(myBook, myBook2));
		System.out.println(b.checkNull(myBook));
		System.out.println(b.checkNull(myBook2));
		
		System.out.println(c.doubleCheck(myBook, myBook2));
		System.out.println(c.biggerBook(myBook, myBook2));
		
		myBook.getTitle();
		myBook2.getTitle();
		Book.s.close();
	}

}
