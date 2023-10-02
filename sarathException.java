import phill.welcomeException;
import java.util.*;

public class sarathException
{
	static Scanner hi = new Scanner(System.in);
	static String t = "vinay";
	static String p = "charan";
	static String e ="";

	public void s1(String a, String b,int sumt,int sumi,String kit) throws welcomeException
	{
		if((a.contains(e)||a.contains("-"))&&(sumt>sumi))
		{
			System.out.println(a);
			welcomeException obj = new welcomeException(kit+" is Winner with Score "+sumt);
			throw obj;
		}

		else if((a.contains(e)||a.contains("-"))&&(sumi>sumt))
		{
			System.out.println(a);
			welcomeException obj = new welcomeException(b+" is Winner with Score "+sumi);
			throw obj;
		}

		else if((a.contains(e)||a.contains("-"))&&(sumt==sumi))
		{
			System.out.println(a);
			welcomeException obj = new welcomeException(kit+" is last played so he is Winner with Score "+sumt);
			throw obj;
		}

		else
		{
			System.out.println(a);
		}
	}

	public static void main(String[]args) throws welcomeException
	{
		System.out.println("Enter a number");
		int r = hi.nextInt();
		
		int sum = 0;
		int sum2 = 0;
		int c=0;
		int mod = r; 
		while(mod>0)
		{
			int rem = mod%10;
			c++;
			mod /= 10;
		}

		if(r<0)
		{
			t =t+"-";
			p =p+"-";
		}

		e=""+r;
		try
		{
			int arr[] = {1,2,3,4,5,6,7};
			System.out.println("your input array index value is :"+arr[r]);
		}
		catch(Exception obj)
		{
			System.out.println(obj);
			System.out.println(" > It's Predefined Exception.");
			try
			{
				Thread.sleep(2564);
			}catch(Exception e){}
		}
		finally
		{
			System.out.println("\n > Customed Defined : ");
			for(int i = 0;i>=0;i++)
			{
				if(i%2==0)
				{
					int charancw = (1+(int)(Math.random()*(((int)(Math.pow(10,c)))-1)));
						sum = sum +charancw;
					new sarathException().s1(i+t+charancw,"Charan",sum,sum2,"Vinay");
				}
				else
				{
					int vinayram = (1+(int)(Math.random()*(((int)(Math.pow(10,c)))-1)));
						sum2 = sum2+vinayram;
					new sarathException().s1(i+p+vinayram,"Vinay",sum2,sum,"Charan");
				}
			}
		}
	}
}