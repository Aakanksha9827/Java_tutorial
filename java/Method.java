public class Method{

 public static void main (String[]args){
	int a=10;
	int b=20;
	System.out.println(a+b);
 	 int resultofAdd=addition(); //method calling here
	System.out.println(resultofAdd);
	printMyInformation();

	
	
}
//this is method declaration
public static int addition(){
	int x=30;
	int y=40;
	int result=x+y;
	System.out.println(result);
	return 20;

}
public static void printMyInformation(){
 System.out.println("i am aaku");
 System.out.println("love u all");
}


