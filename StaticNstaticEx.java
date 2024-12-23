 public class StaticNstaticEx{

 public static void main (String[]args){
	pen obj1=new pen();
	int result=obj1.addition(10,20);
	System.out.println(result);
}
 public int addition(int x,int y){
	System.out.println("Addition...");
	int value=sub(20,10);
	System.out.println(value);
	int score=mul(20,30);
	System.out.println(score);
	return x+y;
}
 public static int sub(int a,int z){
 return a-z;
}
 public int mul(int r,int c){
 return r*c;
} 
}