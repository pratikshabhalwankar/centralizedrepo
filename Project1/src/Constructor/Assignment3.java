package Constructor;

public class Assignment3 

{
	public Assignment3() 
	
	{
		this (500, 1000, 1500);//this will call three parameterized constructor
		System.out.println("Default Constructor");
	}
	
	public Assignment3(int a) 
	
	{
		this ();//this will call the default constructor
		System.out.println("One Parameterized Constructor");
	}

	public Assignment3(int a, int b) 
	
	{
		this (100);//this will call one parameterized constructor
		System.out.println("Two Parameterized Constructor");
	}
	
	public Assignment3(int a, int b, int c) 
	
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	
	{
		Assignment3 obj = new Assignment3(111, 121);//control will go to two parameterized constructor	
	}
	
}
