package LMS.model;

public class SoftMedia extends Media
{
	SoftMedia(int bookId,String bookName,int avail)
	{
		super(bookId,bookName,avail);
	}
	
	SoftMedia(int bookId,String bookName,String bookAuthor)
	{
		super(bookId,bookName,bookAuthor);
	}
}