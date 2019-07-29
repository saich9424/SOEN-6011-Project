package com.project.calculator.power;
import java.util.Scanner;

public class XToYCalculate {


	public static void main(String args[])
	{
		FunctionsCal fc = new FunctionsCal();
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
		if(!ystr.contains("-") && yb && xstr.contains("-"))
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
		if(!ystr.contains("-") && !yb && xstr.contains("-"))
		{
			sel=6;
		}



		double result=0;
		switch (sel) {
		case 1:
			result=fc.power(x, y)	;	 
			System.out.println(result);
			break;
		case 2:
			result =1/fc.power(x, (y*-1))	;
			System.out.println(result);

			break;
		case 3:
			if(y%2==0)
				result= 1/fc.power((x*-1), (y*-1));

			else
				result= -1/fc.power((x*-1), (y*-1));
			System.out.println(result);


			break;
		case 4:
			result=fc.calLn(x, y);
			System.out.println(result);

			break;
		case 5:
			result =1/fc.calLn(x, (y*-1))	;
			System.out.println(result);

			break;
		case 6:
			System.out.println("If base is negative and exponent is real, The value may lead to complex number.Hence, not calulcated.");
			break;

		}
	}
	
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
}
