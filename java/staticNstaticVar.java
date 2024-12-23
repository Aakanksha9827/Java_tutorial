 public class staticNstaticVar{

	static String collegeName="ABC college";
	int collegeCount=300;

 public static void main(String[]args){
	System.out.println(collegeName);
	vary obj1=new vary();
	System.out.println(obj1.collegeCount);
}
 public void printCollgeData(){
	System.out.println(collegeName);
	System.out.println(collegeCount);
}
 public static String getCollegeName(){
 return collegeName;
}
}