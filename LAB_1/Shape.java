class Shape
{
 int length;
 int base;
 int height;
}
class Square extends Shape
{
	public void drawShape(int length)
	{
		this.length=length;
		int area=length*length;
		System.out.println("Area of Square is "+area);
	}
	public void eraseShape(int length)
	{
		this.length=length;
		int parameter=4*length;
		System.out.println("Parameter of square is "+parameter);
	}
}
class Triangle extends Shape
{
	public void drawShape(int base,int height)
	{
		this.base=base;
		this.height=height;
		int area=(1/2)*(base*height);
		System.out.println("Area of Triangle is "+area);
	}
	public void eraseShape()
	{
		System.out.println("Nothing else ");
	}
}
class Main
{
	public static void main(String arr[])
	{
		Square s=new Square();
		  s.drawShape(5);
		  s.eraseShape(4);
		Triangle tr=new Triangle();
		  tr.drawShape(3,2);
		  
	}
}