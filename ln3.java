import java.util.Scanner;

public class ln3 {


	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		double x=in.nextDouble();
		double y=in.nextDouble();
		int sel = 0;

		String xstr= String.valueOf(x);
		String ystr= String.valueOf(y);
		boolean yb=false;

		if(checkInteger(ystr.substring(ystr.indexOf('.')+1,ystr.length())))
		{
			yb=true;
			sel=1;
		}

		if(ystr.contains("-") && yb && !xstr.contains("-"))
		{
			sel=2;
		}

		if(ystr.contains("-") && yb && xstr.contains("-"))
		{
			sel=3;
		}

		if(!ystr.contains("-") && !yb && !xstr.contains("-"))
		{
			sel=4;
		}
		if(ystr.contains("-") && !yb && !xstr.contains("-"))
		{
			sel=5;
		}
		if(ystr.contains("-") && !yb && xstr.contains("-"))
		{
			sel=6;
		}



		double result=0;
		switch (sel) {
		case 1:
			result=power(x, y)	;	 
			System.out.println(result);
			break;
		case 2:
			result =1/power(x, (y*-1))	;
			System.out.println(result);

			break;
		case 3:
			if(y%2==0)
				result= 1/power((x*-1), (y*-1));

			else
				result= -1/power((x*-1), (y*-1));
			System.out.println(result);


			break;
		case 4:
			result=realpower(x, y);
			System.out.println(result);

			break;
		case 5:
			result =1/realpower(x, (y*-1))	;
			System.out.println(result);

			break;
		case 6:
			System.out.println("If base is negative and exponent is real, The value may lead to complex number.Hence, not calulcated.");
			break;

		}
	}
	static double realpower(double x,double y)
	{
		double val=x;	
		boolean flag=true;
		double v=1;

		double z=0;

		double n=1;
		boolean infFlag=true;


		for (int j=1;n>1E-278||-n> 1E-278||infFlag;j++) 
		{

			n=power((val-1)/val,j)/j;
			z=z+n;
			if(Double.isInfinite(n))
			{
				break;
			}
			if(j==100000)
			{
				break;
			}
			System.out.println("N value is" +n);

			System.out.println("j value is"+j);
			System.out.println("result value is"+z);
		}
		if(infFlag)
		{

			double res=z*y;
			double total=calculatee.cal(res);
			return total;
		}
		else
		{
			return z;
		}

	}
	static double factorial(int n){    
		if (n == 0)    
			return 1;    
		else    
			return(n * factorial(n-1));    
	} 

	/**
	 * @param val
	 * @param y
	 * @return
	 */

	static  boolean checkInteger(String name)
	{
		if(name.matches("[1-9]+"))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	static double power(double x, double  y)
	{
		if(y==0)
			return 1;
		if(x==1)
		{
			return 1;
		}

		else
		{
			double product =1;
			int i=0;

			while(i<y)
			{
				product=product*x;
				i+=1;
			}
			return product;
		}
	}
}
