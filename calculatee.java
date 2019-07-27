import java.util.Scanner;

public class calculatee {


	public static double cal(double r)
	{

		double val=r;	
		boolean flag=true;
		//		int i=1;
		double v=1;

		int j=1;

		double n=1;
		boolean 				infFlag=true;

		for (int i=1;n>1E-300||-n> 1E-300 || infFlag  ;i++) { 

			n= Math.pow(val, i)/factorial(i);
			System.out.println("power value is"+power(val,i));
			System.out.println("fact value is"+factorial(i) );


			v=v+n;  System.out.println("N value is" +n);
			System.out.println("result value is"+v);
			if(Double.isInfinite(n))
			{
				infFlag=false;
				v=n;
			}
			if(i==100000)
			{
				break;
			}
		}
		return v;


	}

	//		while (j<500)
	//		{
	//			double n=power((val-1),j)/j ;
	//			System.out.println("power value is"+power(val,i));
	//			System.out.println("fact value is"+factorial(i) );
	//
	//			if(j==1) {
	//				z=n;
	//			}
	//			else
	//			{
	//				z=z-n;
	//			}
	//			j=j+1;
	//			System.out.println("N value is" +n);
	//
	//			if(n<(1E-16))
	//			{
	//				System.out.println(n>(1e-16));
	//				flag=false;	
	//				System.out.println("in flag");
	//			}
	//
	//			System.out.println("j value is"+j);
	//			System.out.println("result value is"+z);
	//		}


	static double factorial(int n){    
		if (n == 0)    
			return 1;    
		else    
			return(n * factorial(n-1));    
	} 

	static double power(double val, int y) 
	{ 
		double temp; 
		if( y == 0) 
			return 1; 
		temp = power(val, y/2);  

		if (y%2 == 0) 
			return temp*temp; 
		else
		{ 
			if(y > 0) 
				return val * temp * temp; 
			else
				return (temp * temp) / val; 
		} 
	}
}
