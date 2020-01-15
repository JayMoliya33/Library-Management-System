package LMS.model;

public class Students extends User
{
	public String studentName,studentType,branch;
	public int studentId,balance;
	
	Students(){}
	
	Students(int studentId,String studentName,int balance,String branch)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.balance=balance;
		this.branch=branch;
	}	
	
}