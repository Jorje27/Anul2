
public class BookstoreCheck {

	public boolean doubleCheck(Book Book1, Book Book2)
	{
		return Book1.title == Book2.title && Book1.author == Book2.author && Book1.pageCount == Book2.pageCount && Book1.publisher == Book2.publisher;
	}
	public String biggerBook(Book Book1, Book Book2)
	{
		if ( Book1.pageCount >= Book2.pageCount)
			return Book1.title;
		else return Book2.title;
	}

}
