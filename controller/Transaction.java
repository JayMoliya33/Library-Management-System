package LMS.controller;
import LMS.model.*;
import java.util.*;

public class Transaction
{	
	public static int issueBook(int bookid,int userid)
	{
			int i,j,a=0,b=0;
			for(i=0;i<DAO.hardmedia.length;i++)
			{	
				if(DAO.hardmedia[i].bookId==bookid)
				{
					a=1;
					break;
				}
			}
			for(j=0;j<DAO.students.length;j++)
			{	
				
				if(DAO.students[j].studentId==userid)
				{
					b=1;
					break;
				}
			}
			if(a==0 && b==0)
			{	
				return -1;  // Invalid UserId & BookId
		    }
			if(a==0)
			{	
				return -2;  // Invalid BookId
			}
			if(b==0)
			{	
				return -3;  // Invalid UserId
		    }
			if(a==1 && b==1)
			{	
				if(DAO.students[j].balance>=0 && DAO.students[j].balance<5)
				{
					DAO.students[j].balance++;
					DAO.hardmedia[j].avail--;
					DAO.students[j].book[bookid] = bookid;
					DAO.hardmedia[j].user[userid] = userid;
				
					return 1;  // Book Issued Suceccfully
				}
				else
				{
					return -4; // Maximum book issue limit reach
				}
				
		    }
			return -1;		
	}
	
	
	public static int returnBook(int bookid,int userid)
	{
			int i,j,a=0,b=0;
			for(i=0;i<DAO.hardmedia.length;i++)
			{	
				if(DAO.hardmedia[i].bookId==bookid)
				{
					a=1;
					break;
				}
			}
			if(a==0)
			{	
				return -1;  // Invalid BookId
			}
			for(j=0;j<DAO.students.length;j++)
			{	
				
				if(DAO.students[j].studentId==userid)
				{
					b=1;
					break;
				}
			}
			if(b==0)
			{	
				return -2;  //Invalid UserId & BookId
		    }
			if(a==0 && b==0)
			{	
				return -3;  // Invalid UserId
		    }
			if(a==1 && b==1)
			{	
				if(DAO.students[j].balance>0 && DAO.students[j].balance<5)
				{
					DAO.students[j].balance++;
					DAO.hardmedia[j].avail--;
					
					DAO.students[j].book[bookid] = 0;
					DAO.hardmedia[j].user[userid] = 0;
					
					return 1;  // Book Returned Suceccfully
				}
				else
				{
					return -4; // Maximum book issue limit reach
				}
				
		    }
			return -3;
	}
	
	public static int checkBalance(int userid)
	{
		for(int j=0;j<DAO.students.length;j++)
		{	
				if(DAO.students[j].studentId==userid)
				{
					return (DAO.students[j].balance);
			    }
		}
		return -1;
	}

    public static int searchBookById(int bookid)
	{
		for(int i=0;i<DAO.hardmedia.length;i++)
			{	
				if(DAO.hardmedia[i].bookId==bookid && DAO.hardmedia[i].avail>0)
				{
					return (DAO.hardmedia[i].avail);
				}
			}
			return -1;
	}	
	
	public static int searchBookByTitle(String bookname)
	{
		for(int i=0;i<DAO.hardmedia.length;i++)
			{	
				if(DAO.hardmedia[i].bookName.equals(bookname))
				{
					return (DAO.hardmedia[i].avail);
				}
			}
			return -1;
	}	
}