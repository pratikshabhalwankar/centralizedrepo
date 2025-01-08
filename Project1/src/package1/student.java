package package1;

public class student 

{
int rollNo;
int age;

public void display1()
{
	System.out.println("Welcome to all of you"); //type syso cntrl+space
}

public void display2()
{
	System.out.println("Automation is very easy");
}

public static void main (String[] args) // type main Cntrl+space
{
	student Somer=new student();
	Somer.display1();
	Somer.display2();
	Somer.rollNo=201;
	System.out.println(Somer.rollNo);
	Somer.age=21;
	System.out.println(Somer.age);
	
}

}
