import java.util.Scanner;
class SubThreeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
System.out.println("Enter 1st number");
int a=sc.nextInt();
System.out.println("Enter 2nd number");
int b=sc.nextInt();
System.out.println("Enter 3rd number");
int c=sc.nextInt();
int sub=a-b-c;
System.out.println("The Sub is");
System.out.println(sub);
}
}