package Constructor;

public class Solution1 // Create the object of the class, call the variables one by one , assign values and print the values

{
	int a, b, c, d, e; //declaration of the variables
	
	public static void main(String[] args) 
	{
		Solution1 obj = new Solution1(); //assigning the values by creation of the object
		obj.a = 11;
		obj.b = 21;
		obj.c = 31;
		obj.d = 41;
		obj.e = 51;
		
		System.out.println(obj.a);//printing the values with calling the variables 
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		
	}
	
//here target is to give the values and to print the values.
//so here in this solution, 10 calls are required --> 5 for assigning the values and 5 for printing the values
	
//here we are talking about 1object only
//suppose we have 10 objects then number of calls required will be 10*10 = 100 --> for each object 10 calls - 5 assign values, 5 print values
		
}
