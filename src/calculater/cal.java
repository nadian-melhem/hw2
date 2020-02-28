package calculater;

public class cal {
	int c ;
	public int add(int a, int b ) 
	{
		c=a+b ;
		return c ; 
	}

	public int sub ( int a ,int b)
	{
		c=a-b ;
		return c ;
	}
	public int mul ( int a, int b  )
	{
		c =a*b ;
		return c ;
	}
	public int div (int a, int b ) 
	{
		if (b!=0)
		{
			c=a/b ;
			return c ;
		}
		else 
		 return -1 ;
	}
}
