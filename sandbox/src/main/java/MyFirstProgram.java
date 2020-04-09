public class MyFirstProgram{

public static void main(String[] args)
	{
		hello("world");
		hello("user");
		hello("Alexei");
		double i = 5;
		double a = 5;
		double b = 6;
		System.out.println(" Ploshad kvadrata so storonoi: "+i+ "=" + area(i));
		System.out.println(" Ploshad kvadrata so storonoi: "+a+ "*"+b+"=" + area(a,b));
	}

	public static void hello(String world){
		System.out.println("Hello, " + world+"!");
	}

	public static double area(double dlina){
		return dlina * dlina;
	}

	public static double area(double a, double b){
		return a*b;
	}
}