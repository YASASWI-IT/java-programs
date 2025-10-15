import java.util.*;
public class Bubble
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Array Size:");
int size=scanner.nextInt();
System.out.println("Enter"+size+"element in the array:");
int a[]=new int[size];
for(int i=0;i<size;i++)
{
a[i]=scanner.nextInt();
}
System.out.println("array before sorting:");
for(int i=0;i<size;i++)
{
System.out.println(a[i]+" ");
}
for(int i=0;i<size-1;i++)
{
for(int j=0;j<size-1;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("\nArray after sorting:");
for(int i=0;i<size;i++){
System.out.println(a[i]+" ");
}
scanner.close();
}
}