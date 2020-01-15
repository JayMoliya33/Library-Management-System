package LMS.model;

public class DAO
{
	public static Students students[] = new Students[3];
	public static HardMedia hardmedia[] = new HardMedia[3];
	
	public static void initData()
	{
		students[0]=new Students(1,"Jay",0,"CE");
		students[1]=new Students(2,"Vimal",0,"CE");
		students[2]=new Students(3,"Mayank",0,"CE");
		
		hardmedia[0]=new HardMedia(1,"OOPJ",4);
		hardmedia[1]=new HardMedia(2,"ADA",4);
		hardmedia[2]=new HardMedia(3,"System Programming",4);
	}	
}