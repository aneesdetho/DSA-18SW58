import java.util.*;
class Area
{
  public int length;
  public int width;
  public Area(int length,int width)
  {
	  this.length=length;
	  this.width=width;
	  
  }
  public int returnArea()
  {
	  int area=length*width;
	  return area;
  }

}//end of class

class Main
{
	public static void main(String arr[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length");
		int a=s.nextInt();
		System.out.println("Enter the width");
		int b=s.nextInt();
		Area d=new Area(a,b);
		d.returnArea();
		System.out.println("Area of Rectangle is = "+d.returnArea());
	}//end of main
	
}//end of class