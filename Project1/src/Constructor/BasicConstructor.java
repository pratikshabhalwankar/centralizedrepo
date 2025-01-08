package Constructor;

public class BasicConstructor 
{

	public BasicConstructor() // default constructor as no input is passed in ()
	// Name of the constructor is always same as the class name
	// Constructor is same as Method
	// no return type - even we cannot write void
	// no need to call constructor - it will be called automatically when we create object of the class
	// create those many objects as the constructor
	// for creating constructor just write the name of the class and Cntrl+space
	
	{
		System.out.println("Default Constructor"); //syso Cntrl + space
	}
	
	public BasicConstructor(int a) // one parameterized constructor as one input is passed in ()
		
	{
		System.out.println("One Parameterized Constructor"); //syso Cntrl + space
	}
	

	public BasicConstructor(int a, int b) // two parameterized constructor as two input is passed in ()
	
	{
		System.out.println("Two Parameterized Constructor"); //syso Cntrl + space
	}
	
	public static void main(String[] args) 
	{
		BasicConstructor ob = new BasicConstructor();
		BasicConstructor ob1 = new BasicConstructor(111);
		BasicConstructor ob2 = new BasicConstructor(121, 151);
		
	}
	
}
