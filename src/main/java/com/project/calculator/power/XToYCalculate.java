package com.project.calculator.power;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The Class perform the power of two numbers.
 * @author saich9424
 *
 */
public class XToYCalculate {


	/**It is a main method of the program.
	 * @param args The command line arguments.
	 */
	public static void main(String args[])

	{
		LinkedList<String> history = new LinkedList<String>(); 
		Scanner in = new Scanner(System.in);

		FunctionsCal fc = new FunctionsCal();


		boolean flag= true;
		while(flag)
		{
			
			System.out.println("Press 1 to enter numbers ,2 to get History and 3 to exit ");
			String number=in.nextLine();

			boolean numberFlag= true;
			try {

			while(numberFlag)
			{
				if(number.matches("[0-9]+") && Integer.parseInt(number)<4 )
				{
					numberFlag=false;
				}
				else
				{
					System.out.println("Please enter the Correct input in numbers and range");
					number=in.nextLine();
				}
			}

			if(!(Integer.parseInt(number)==2))
			{
				if(Integer.parseInt(number)==3)
				{
					System.exit(0);
					flag=false;

					
				}

				System.out.println("Enter the value of x");

				String xStr=in.nextLine();

				boolean xFlag=true;

				while(xFlag)
				{
					if(xStr.substring(xStr.indexOf("-")+1,xStr.length()).matches("[0-9]*\\.?[0-9]*") &&(Double.parseDouble(xStr)<50000))
					{
						xFlag=false;
					}
					else
					{
						System.out.println("Please enter the Correct input in numbers");
						xStr=in.nextLine();
					}
				}

				double x= Double.parseDouble(xStr);

				System.out.println("Enter the value of y");

				boolean yFlag=true;
				String yStr=in.nextLine();


				while(yFlag)
				{
					if(yStr.substring(yStr.indexOf("-")+1,yStr.length()).matches("[0-9]*\\.?[0-9]*") && (Double.parseDouble(yStr)<50000))
					{
						yFlag=false;
					}
					else
					{
						System.out.println("Please enter the Correct input in numbers");
						yStr=in.nextLine();

					}
				}

				double y= Double.parseDouble(yStr);


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
					sel=7;
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
				case 7:
					if(y%2==0)
						result= fc.power((x*-1), (y));

					else
						result= -1* fc.power((x*-1), (y));
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
					result=Double.NaN;
					break;

				}
				
				history.add("X is " +x +", Y is "+y+", Result is " +result);


			}
			else
			{
				if(history.isEmpty())
				{
					System.out.println("History is empty");
				}
				else
				{
					for(String s:history)
					{
						System.out.println(s);
					}
					
				}
			}
		}catch (Exception e){
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());

		    
		}
		}
		in.close();
	}

	/**
	 * The method checks if given number is Integer or not.
	 * @param name The number to be check for IsNumber validity.
	 * @return Return true if it is a number or else false.
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
}
