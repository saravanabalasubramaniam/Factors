import java.io.*;
import java.util.*;
class Factors
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			System.out.println(i);
			System.out.println(" ");
		}
	}
  }
}
