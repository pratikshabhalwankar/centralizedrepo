package TypesOfMethod;

public class Assignment1 // (((((10+2)+2)-2)*2)/2)
{
	public int sum1(int p, int q) //defining method
	{
		int a;
		a= p+q;
		System.out.println("Result of sum1 is " + a); //syso is just printing, it can never be an output
		return a;

	}
	
	public int sum2(int a, int q) 
	//when the method is non-void and we want to use result important to declare the output data type
	//it is always a good practice to keep the input and output data type same
	//there is no relation between the input data type and output data type
	//meaning the input can be int output can be float, input can  be float output can be string
	//when the method is non-void - returning result - always 'return' the value
	{
		int b;
		b= a+q;
		System.out.println("Result of sum2 is " + b);
		return b;
	}
	
	public int sub(int b, int q)
	{
		int c;
		c= b-q;
		System.out.println("Result of sub is " +c);
		return c;
	}
	
	public int multi(int c, int q)
	{
		int d;
		d= c*q;
		System.out.println("Result of multi is " +d);
		return d;
	}
	
	public void div(int d, int q)
	{
		int e;
		e= d/q;
		System.out.println("(((((10+2)+2)-2)*2)/2) = " +e);
	}
	
	public static void main(String[] args) 
	{
		Assignment1 ref=new Assignment1();
		int sum1result = ref.sum1(10, 2);
		int sum2result = ref.sum2(sum1result, 2);
		int subresult = ref.sub(sum2result, 2);
		int multiresult = ref.multi(subresult, 2);
		ref.div(multiresult, 2);
			
	}
	
	
}
