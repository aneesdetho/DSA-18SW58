import java.util.*;
class Emplyee
{   double salary;
    int nohour;
	public Emplyee()
	{
		salary=0;
		nohour=0;
	}
  public void  getInf(double sa,int no)
  {
     salary=sa;
	 nohour=no;
	 
  }

  public double addsalary()
  {
	  if(salary>500)
	  {
		  salary+=10;
	  }
	  return salary;
  }
  public double work()
  {
	  if(nohour>5)
	  {
		  salary+=5;
	  }
	  return salary;
  }
  
  
}
class Test
{
	double salary;
	public Test(double ss)
	{
		salary=ss;
	}
	public void printsalary()
	{
		System.out.println("salary "+salary);
	}
	
}  
class Main
{
  public static void main(String arr[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the salary");
	  double salary=s.nextDouble();
	  System.out.println("Enter the num of hours");
	  int nohour=s.nextInt(); 
     Emplyee e=new Emplyee();
	  e.getInf(salary,nohour);
	  salary=e.addsalary();
	  salary=e.work();
	  Test t=new Test(salary);
	  t.printsalary();
	  
  }
 }
 