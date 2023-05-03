import java.io.*;
import java.util.*;
class medium1
{
public static void main(String[] args)
{
Scanner e=new Scanner(System.in);
System.out.println("Enter the number of numbers");
int n=e.nextInt();
int a[]=new int[n];
System.out.println("Enter the numbers");
int count=0,p=0,c=0;
for(int i=0;i<n;i++)
{
a[i]=e.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=1;j<=a[i];j++)
{
if(a[i]%j==0)
{
count+=1;
}
}
if(count==2)
{
p+=1;
}
else if(count>2)
c+=1;
}
System.out.println("No of Prime numbers is "+p);
System.out.println("No of composite Numbers is "+c);
}
}