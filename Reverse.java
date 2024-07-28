import java.io.*;
class Reverse
{
public static void main(String args[])
{
Console c = System.console();
int n = Integer.parseInt(c.readLine("enter the number"));
int r;
while(n>0)
{
  r=n%10;
  n=n/10;
  System.out.println(r);
}
}
}
