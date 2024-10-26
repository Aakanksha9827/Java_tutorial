import java.util.Scanner;
class AddTwoNumber{
public static void main (String args[]){
System.out.println("Taking input from user");
Scanner sc=new Scanner(System.in);
//we are using below only next the use  of next is print only first word in that particular statement
//if we have whole statement then use nextLine()
//for word use next() and for line use nextLine()
//String str=sc.next();
//System.out.println(str);
System.out.println("Enter no 1");
int a=sc.nextInt();
System.out.println("Enter no 2");
int b=sc.nextInt();
int sum=a+b;
System.out.println("the sum of two number is");
System.out.println(sum);
}
}

