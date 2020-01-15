package LMS.view;
import java.util.Scanner;
import LMS.model.DAO;
import LMS.controller.Transaction;

class LibView
{
	public static void main(String args[])
	{
		DAO.initData();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			int bookId,userId,ch,result;
			String bookName;
			System.out.println();
			System.out.println("**** Welcome to  Library Management System *****");	
			System.out.println();
			System.out.println("1. Issue Book");
			System.out.println("2. Return Book");
			System.out.println("3. Check Balance of Your Account");
			System.out.println("4. SearchBook By BookId");
			System.out.println("5. SearchBook By BookTitle");
			System.out.println("6. Exit");
			System.out.println();
			System.out.print("Enter Your Choice : ");
			ch = s.nextInt();
			s.nextLine();
			
			switch(ch)
			{
				case 1 :  System.out.print("Enter BookId : ");
						  bookId = s.nextInt();
						  System.out.print("Enter UserId : ");
						  userId = s.nextInt();
						  System.out.println();
						  result = Transaction.issueBook(bookId,userId);
						  if(result==-1)
						  {
							  System.out.println("Invalid BookId and UserId ...");
						  }
						  else if(result==-2)
						  {
							  System.out.println("Invalid BookId...");
						  }
						  else if(result==-3)
						  {
							  System.out.println("Invalid UserId...");
						  }
						  else if(result==-4)
	    				  {
							  System.out.println("Maximum book issue limit reach...");
						  }	
						  else if(result==1)
						  {
							  System.out.println("Book Issued Sucessfully...");
						  } 
						 else
						 {
							 System.out.println("Error...");
						 }
						 break;
						
						
				case 2 :  System.out.print("Enter BookId : ");
						  bookId = s.nextInt();
						  System.out.print("Enter UserId : ");
						  userId = s.nextInt();
						   System.out.println();
						  result = Transaction.returnBook(bookId,userId);
						  if(result==-1)
						  {
							  System.out.println("Invalid BookId...");
						  }
						  else if(result==-2)
						  {
							  System.out.println("Invalid UserId and BookId...");
						  }
						  else if(result==-3)
						  {
							  System.out.println("Invalid UserId...");
						  }
						  else if(result==-4)
	    				  {
							  System.out.println("First issue book than return book...");
						  }	
						  else if(result==1)
						  {
							  System.out.println("Book returned ucessfully....");
						  } 
						 else
						 {
							 System.out.println("Error...");
						 }
						 break;
						 
				case 3 : System.out.print("Enter UserId : ");
				         userId = s.nextInt();
						  System.out.println();
						 result = Transaction.checkBalance(userId);
						  if(result==-1)
						  {
							  System.out.println("Invalid UserId...");
						  }
						  else
						  {
							  System.out.println("Your Account Balance is :"+result);
						  } 
						  break;
						  
				case 4 : System.out.print("Enter BookId : ");
						  bookId = s.nextInt();
						   System.out.println();
						  result = Transaction.searchBookById(bookId);
						  if(result==-1)
						  {
							  System.out.println("Invalid BookId...");
						  }
						  else
						  {
							  System.out.println(result+" Books is Available of "+DAO.hardmedia[bookId].bookName);
						  }
						  break;
				case 5 : System.out.print("Enter BookTitle : ");
						  bookName = s.nextLine();
						   System.out.println();
						  result = Transaction.searchBookByTitle(bookName);
						  if(result==-1)
						  {
							  System.out.println("There is no Book of This Title...");
						  }
						  else
						  {
							  System.out.println(result+" Books is Available of "+bookName);
						  }
						  break;
				case 6 : System.exit(0);				
				
				default : System.out.println("Invalid Choice...");	  
						  
						  
			}
		}	
	}
}