
public class BookstoreTest {

	BookstoreTest()
	{
		
	}
	public boolean checkPageCount(Book Book1,Book Book2)
	{
		return Book1.pageCount == Book2.pageCount; 
	}
	public boolean checkNull(Book Book1)
	{
		return Book1.getPageCount() == 0;
	}
}
