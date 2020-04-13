public class MyFirstProgram{

public static void main(String[] args)
	{

		Point p = new Point(2,4,6,9);
		System.out.println("Kоординатами (x1=" + p.x1+":"+ "y1="+p.y1+") и(x2=" + p.x2+":"+ "y2="+p.y2+") равно "+p.distance());
	}
}
