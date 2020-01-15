package LMS.model;

public class Media
{
	public int bookId,avail;
	public String bookName,bookAuthor;
	public int user[] = {0,0,0,0};
	
	Media(int bookId,String bookName,int avail)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.avail=avail;
	}
	
	Media(int bookId,String bookName,String bookAuthor)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
	}
}