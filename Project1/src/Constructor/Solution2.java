package Constructor;

public class Solution2 //creation of method to call the variables

{
	int a, b, c, d, e;//declaration of variables
	
	public void method1(int a1, int b1, int c1, int d1, int e1)//creation of method for assigning the values
	{
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;
	}
	
	public static void main(String[] args) 
	
	{
	Solution2 obj = new Solution2();//creation of the reference variable/object
	
	obj.method1(111, 121, 131, 141, 151);//calling the method
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	System.out.println(obj.e);

	}

//target is to assign and print the values
//here 6 calls will be required --> 1 for assigning the values with the help of method + 5 calls for printing the values
//so if we have 10 object for each object 6 calls then for 10 objects calls will be 10*6 = 60 calls
//here number of calls are reduced from 100 to 60 with creation or usage of method for assigning the values to the variables
	
}
