public class MyFirstProgram{

public static void main(String[] args)
	{

		Point p1 = new Point();
		Point p2 = new Point();
		p1.x = 5;
		p1.y = 10;
		p2.x = 2;
		p2.y = 3;

		System.out.println("Kоординатами (x1=" + p1.x+":"+ "y1="+p1.y+") и(x2=" + p2.x+":"+ "y2="+p2.y+") равно "+distance(p1, p2));
	}
	public static double distance(Point p1, Point p2){
		return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
	}
}