import java.util.*;
public class Binary
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Array size:");
int size = scanner.nextInt();
System.out.println("Enter"+size+"elements in the array:");
int a[]=new int[size];
for(int i=0;i<size;i++)
{
a[i]=scanner.nextInt();
}
System.out.println("Enter the element to search:");
int key=scanner.nextInt();
int low=0,high=size-1,mid,f=0;
while(low<=high)
{
mid=(low+high)/2;
if(a[mid]==key)
{
f=1;
System.out.println("Element found at index:"+mid);
break;
}else
{
if(key>a[mid])
{
low=mid+1;
}
if(key<a[mid])
{
high=mid-1;
}
}
if(f==0)
{
System.out.println("Element not found in the array.");
}
}
scanner.close();
}
}

