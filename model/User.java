package LMS.model;

public class User {

		String userName,userType;
		int userId;
		public int book[] = {0,0,0};
		
		User(){}
		
		User(int userId,String userName)
		{
			this.userId=userId;
			this.userName=userName;
		}
		
		User(int userId,String userName,String userType)
		{
			this.userId=userId;
			this.userName=userName;
			this.userType=userType;
		}
	
}