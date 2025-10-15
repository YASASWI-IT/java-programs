import java.util.*;
class BI
{
void arithmetic()
{
try
{
int a=20,b=0,c;
c=a/b;
System.out.println("c="+c);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception:\n"+e);
}
}
void arrayiob()
{
try
{
int a[]= {100,200,300,400};
a[100]=500;
System.out.println(a[100]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
void nullpe()
{
try
{
String str=null;
System.out.println(str.charAt(0));
}
catch(NullPointerException e)
{
System.out.println(e);
}
}
void numberfo()
{
try
{
int i=Integer.parseInt("Java");
System.out.println(i);
}
catch(NumberFormatException e)

{
System.out.println(e);
}
}
void stringiob()
{ try
{
String str="Welcome to Java";
char c=str.charAt(50);
System.out.println(c);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}
public class BuiltInException
{
public static void main(String args[])
{
    try{

   
int ch;
Scanner sc=new Scanner(System.in);
BI obj=new BI();
while(true)
{
/*System.out.println("1.Arithmetic Exception
"\n"2.ArrayIndexOutOfBounds
Exception "\n"3.NullPointer Exception\n4.NumberFormat
Exception\n5.StringIndexOutOfBounds Exception\n6.Exit: ");*/
System.out.println("enter yours");
ch=sc.nextInt();
switch(ch)
{
case 1:obj.arithmetic();
break;
case 2:obj.arrayiob();
break;
case 3:obj.nullpe();
break;
case 4:obj.numberfo();
break;
case 5:obj.stringiob();
break;
case 6:System.exit(0);
break;
default: System.out.println("Wrong Choice");
}
}
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}