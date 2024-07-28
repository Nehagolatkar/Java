import java.io.*;
class Fact
{
public static void main(String args[])
{
Console c = System.console();
int n = Integer.parseInt(c.readLine("enter the number"));
int f=1;
int i=1;
while(i<=n)
{
   f=f*i;
   i=i+1;  
}
System.out.println("the fact is = " +f);
}
}
