 public class practiceMethodEx{
   	static String email="aaku@gmail.com";
   	int age=30;
   	int weight=50;
	static String name="aaku";
	char gender='F';

 public static void main(String[]args){
	System.out.println(email);
	System.out.println(name);
	practice2 obj1=new practice2();
	int result=obj1.printInfo();
	System.out.println(result);
}
 public int printInfo(){
	System.out.println(age);
	System.out.println(weight);
	System.out.println(gender);
	return 0;
}
}
