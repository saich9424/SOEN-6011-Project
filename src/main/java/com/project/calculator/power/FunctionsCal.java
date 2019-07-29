package com.project.calculator.power;
import java.util.Scanner;

public class FunctionsCal {


	public static double calExponent(double r)
	{

		double val=r;	
		double v=1;

		int j=1;

		double n=1;

		for (int i=1;n>1E-123   ;i++) { 

			n= Math.pow(val, i)/factorial(i);
			System.out.println("power value is"+power(val,i));
			System.out.println("fact value is"+factorial(i) );


			v=v+n;  System.out.println("N value is" +n);
			System.out.println("result value is"+v);
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
				if(value>21)
				{
					break;
				}
			}
			
		}
		return v;


	}

	


	static double factorial(int n){    
		if (n == 0)    
			return 1;    
		else    
			return(n * factorial(n-1));    
	} 

	/**
	 * This function calculates the 
	 * @param x
	 * @param y
	 * @return
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
			double total=FunctionsCal.calExponent(res);
			return total;
		}
		else
		{
			return z;
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
