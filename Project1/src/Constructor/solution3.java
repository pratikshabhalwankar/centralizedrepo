package Constructor;

public class solution3 //create the constructor and that constructor will construct(assign) the values for an object

{
	int a, b, c, d, e;
	
	public solution3(int a1, int b1, int c1, int d1, int e1) //creation of constructor for assigning the values 
	
	{
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1; 
	}
	
	public static void main(String[] args) 
	
	{
		solution3 obj = new solution3(111, 121, 131, 141, 151); //creating the object
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	}
	
//target is to give the values and print the values	
//here we will need 5 calls - because here constructor is assigning the values and we do not need to call the constructor
//for 10 object we will need 5*10 = 50 calls as the constructor will be called automatically when the object is created	
//so here the calls are reduced from 60 to 50	
	
}
