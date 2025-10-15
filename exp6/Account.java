class MyException extends RuntimeException
{
MyException(String str)
{
super(str);
}
}

class Account
{
private static int accno[]={101,102,103,104,105};
private static String name[]={"yasaswi","yashu","kavya","mouli"};
private static double bal[]={10000,15000,5600,5000,999.50,4000.00};
public static void main(String[] args) throws MyException
{
try
{
System.out.println("ACCONT NO "+"CUSTOMER NAME"+"BALANCE");
for(int i=0;i<5;i++)
{
if(bal[i]<1000)
{
throw new MyException("balance is less than 1000 at :"+accno[i]);
//MyException me=new MyException("balance is less than 1000 at :"+accno[i]);
//throw me;
}
System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
}
}
catch(MyException me)
{
me.printStackTrace();
}
}
}