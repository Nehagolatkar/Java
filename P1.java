import java.io.*;
class P1
{
public static void main(String args[])
{
Console c = System.console();
int length = Integer.parseInt(c.readLine("enter the length"));
int width = Integer.parseInt(c.readLine("enter the width"));
int rec = length*width;
System.out.println("the rec = " +rec);
}
}

