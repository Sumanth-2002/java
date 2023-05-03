import java.io.*;
import java.util.*;
class easy1{
public static void main(String[] args)
{
Scanner e=new Scanner(System.in);
String s=e.nextLine();
int a=s.length();
String r="";
for(int i=a-1;i>=0;i--)
{
r=r+s.charAt(i);
}
System.out.println(r);
}
}