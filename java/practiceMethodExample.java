 public class practiceMethodExample{

 public static void main (String[]args){
	 int result=sub(20,10);
	System.out.println(result);
	practice obj1=new practice();
	int value=(int) obj1.addition(3.14,15000000l);
	System.out.println(value);
}
 public static int sub(int a,int b){
 return a-b;
}
 public double addition(double x,long y){
 return x+y;
}
}