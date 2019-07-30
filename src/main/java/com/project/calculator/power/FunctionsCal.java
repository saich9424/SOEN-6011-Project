package com.project.calculator.power;

/**
 * It has all the functions to perform the power
 * @author saich9424
 *
 */
public class FunctionsCal {


	/**
	 * Calculates the e value of the given number.
	 * @param r The number whose exponent need to be calculated.
	 * @return It return the calculated exponent value.
	 */
	public static double calExponent(double r)
	{

		double val=r;	
		double v=1;

		int j=1;

		double n=1;

		for (int i=1;n>1E-306|| -n> 1E-306  ;i++) { 

			n= n*val/i;
			v=v+n;  
			
			if(Double.isInfinite(n))
			{
				v=n;
				break;
			}
			if(i==100000)
			{
				break;
			}

			String valueCheck= String.valueOf(n);
			if(valueCheck.contains("E"))
			{
				valueCheck=valueCheck.substring(valueCheck.indexOf('E')+1,valueCheck.length());

				int value=Integer.parseInt(valueCheck);
				if(value>306)
				{
					break;
				}
			}

		}
		return v;


	}




	/**
	 * Calculates the factorial of given number.
	 * @param n The number whose factorial needs to be calculated.
	 * @return Calculates the factorial and returns the value.
	 */
	static double factorial(int n){    
		if (n == 0) 
		{
			return 1;    
		}
		else    
		{
			return(n * factorial(n-1));  
		}
	} 

	/**
	 * This function calculates the NaturalLog of the numbers which is mainly for real numbers.
	 * @param x Calculates the ln of the number.
	 * @param y Multiplies ln result with y .
	 * @return returns the value of e^yln(x) value.
	 */
	static double calLn(double x,double y)
	{
		double val=x;	
		boolean flag=true;
		double v=1;

		double z=0;

		double n=1;
		boolean infFlag=true;


		for (int j=1;n>1E-278||-n> 1E-278;j++) 
		{

			n=power((val-1)/val,j)/j;
			z=z+n;
			if(Double.isInfinite(n))
			{
				break;
			}
			if(j==80000)
			{
				break;
			}
			String valueCheck= String.valueOf(z);

			if(valueCheck.contains("E"))
			{
				valueCheck=valueCheck.substring(valueCheck.indexOf('E')+1,valueCheck.length());

				int value=Integer.parseInt(valueCheck);
				if(value>278)
				{
					break;
				}
			}
		}
		if(infFlag)
		{

			double res=z*y;
			double total=FunctionsCal.calExponent(res);
			return total;
		}
		else
		{
			return z;
		}

	}

	/**
	 * Calculates the power of the two given numbers.
	 * @param x it is the base value.
	 * @param y It is the exponent value.
	 * @return returns the power of two given numbers.
	 */
	
	static double power(double x, double  y)
	{
		if(y==0)
		{
			return 1;
		}
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
