package LMS.model;

public class HardMedia extends Media
{
	public HardMedia(int bookId,String bookName,int avail)
	{
		super(bookId,bookName,avail);
	}
	
	public HardMedia(int bookId,String bookName,String bookAuthor)
	{
		super(bookId,bookName,bookAuthor);
	}
}