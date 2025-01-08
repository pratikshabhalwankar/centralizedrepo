package TypesOfMethod;

public class MethodType 
{
	public void abc() //Method Type 1 - can't take input can't give output
	//default method - as no inputs are defined ()is empty
	//void method - as there is no return result - no further use of the result
	{
		System.out.println("Method can't take the input and can't give any output");
	}

	public void pqr(int p, int q) //Method Type 2 - can take the input and can't give output
	//two parameterized method - as taking 2 input values
	//void method - as there is no return result - no further use of the result
	{
		System.out.println("Method can take the inputs and can't give any output");
	}
	
	public String xyz() //Method Type 3 - can't take input and can give output
	//default method - as no inputs are defined ()is empty
	//non-void method - as there is return of the result for further use
	{
		String R;
		R = "Method Type 3";
		System.out.println("Method can't take any input and can give the output");
		return R;
	}
	
	public int jkl(int j, int k, int l) //Method Type 4 - can take input and can give output of same data type as input
	//three parameterized method - as taking 3 input values
	//non-void method - as there is return of the result for further use
	{
		int m;
		m = j+k+l;
		System.out.println("Method can take input and can give output");
		return m;				
	}
	
	public Float stu(int s, int t, int u, int v) // Method Type 5 - can take different data types input and give diffrent data type output
	//four parameterized method - as taking 4 input values
	//non-void method - as there is return of the result for further use
	{
		Float w;
		w = 95.5f;
		System.out.println("Method can take input of one data taype and give output of different data type");
		return w;
	}
	
	public void def(String g, int t, Float f)
	{
		System.out.println("I am the Final Output");
	}
	
	public static void main(String[] args) //type 'main' cntrl+space
	{
		MethodType imp = new MethodType();
		imp.abc();
		imp.pqr(5, 10);
		String Note = imp.xyz();
		int numbers = imp.jkl(10, 15, 20);
		imp.stu(10, 12, 15, 20);
		imp.def(Note, numbers, 12.5f);
		
	}

}
