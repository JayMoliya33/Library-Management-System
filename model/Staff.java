package LMS.model;

public class Staff extends User
{
	public String staffName,staffType,branch;
	public int staffId;
	
	Staff(){}
	
	Staff(int staffId,String staffName,String branch)
	{
		this.staffId=staffId;
		this.staffName=staffName;
		this.branch=branch;
	}
	
	
}	