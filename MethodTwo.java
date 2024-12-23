public class MethodTwo{

    public static void main(String[]args){
	 printCourseInfo();
	
}
public static long myMobileNumber(){
System.out.println("returning my mobile number");
 return 9021897645l;
}
public static String getCourseName(){
long myNumber=myMobileNumber();
System.out.println(myNumber);
System.out.println("returning course name");
 return "java Full Stack";
}
public static void  printCourseInfo(){
String courseName=getCourseName();
System.out.println(courseName);
System.out.println("hey all");
System.out.println("i am from karad");
}

}

