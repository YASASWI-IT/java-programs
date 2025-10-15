import java.io.*;
import java.util.*;
class area
{
	double a;

	public double area(double r){
		a=3.14*r*r;
		return a;
	}
}

class circle
{
	public static void main(String args[])
		throws IOException
	{
		area ob=new area();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of a circle:");
		double r=sc.nextDouble();
		double ar=ob.area(r);
		System.out.println("area of a circle is:"+ar);
	}
}