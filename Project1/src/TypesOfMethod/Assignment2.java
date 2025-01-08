package TypesOfMethod;

public class Assignment2 // (((((10*2)-2)+2)-2)/2)

{
	public int multi(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println("Result of Multiplication is " +c);
		return c;
	}
	
	public int sub1(int x, int y)
	{
		int z;
		z = x-y;
		System.out.println("Result of Subtraction1 is " +z);
		return z;
	}

	public int sum(int p, int q)
	{
		int r;
		r = p+q;
		System.out.println("Result of Summation is " +r);
		return r;
	}
	
	public int sub2 (int l, int m)
	{
		int n;
		n = l-m;
		System.out.println("Result of Subtraction2 is " +n);
		return n;
	}
	
	public void div (int s, int t)
	{
		int u;
		u = s/t;
		System.out.println("(((((10*2)-2)+2)-2)/2) =" +u);
	}
	
	public static void main(String[] args) 
	{
		Assignment2 ref = new Assignment2();
		int multiresult = ref.multi(10, 2);
		int subresult1 = ref.sub1(multiresult, 2);
		int sumresult = ref.sum(subresult1, 2);
		int subresult2 = ref.sub2(sumresult, 2);
		ref.div(subresult2, 2);
		
	}
		
}
