import java.util.Scanner;
public class  CalPercentage
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
float total=500;
System.out.println("Enter marks of 5 subjects");
System.out.println("English");
float a=sc.nextFloat();
System.out.println("Hindi");
float b=sc.nextFloat();
System.out.println("Mathematics");
float c=sc.nextFloat();
System.out.println("Geography");
float d=sc.nextFloat();
System.out.println("Marathi");
float e =sc.nextFloat();
float sum=a+b+c+d+e;
System.out.println("The sum of five subject is ");
System.out.println(sum);
float percentage=(sum/total)*100;
System.out.println("Marks percentage is:");
System.out.println(percentage);
}
}





