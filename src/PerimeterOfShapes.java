import java.util.Scanner;
interface Shapes{
	double pi=3.174;
	void CollectData();
	void Calculate();
	void display();
}
class Square implements Shapes{
	double side,perimeter;
	Scanner sc=new Scanner(System.in);
	@Override
	public void CollectData() {
		System.out.println("Enter Length Of A Side:");
		side=sc.nextDouble();
	}
	@Override
	public void Calculate() {
		perimeter=4*side;
	}
	@Override
	public void display() {
		System.out.println("The Perimeter Of Square Is:"+perimeter);
	}
}
class Circle implements Shapes{
	double radius,perimeter;
	Scanner sc=new Scanner(System.in);
	@Override
	public void CollectData() {
		System.out.println("Enter Radius Of A Circle:");
		radius=sc.nextDouble();
	}
	@Override
	public void Calculate() {
		perimeter=2*pi*radius;
	}
	@Override
	public void display() {
		System.out.printf("The Perimeter Of Circle Is:%.2f",perimeter);
	}
}
class Triangle implements Shapes{
	double side1,side2,side3,perimeter;
	Scanner sc=new Scanner(System.in);
	@Override
	public void CollectData() {
		System.out.println("Enter Length Of Each Side Of A Triangle:");
		side1=sc.nextDouble();
		side2=sc.nextDouble();
		side3=sc.nextDouble();
	}
	@Override
	public void Calculate() {
		perimeter=side1+side2+side3;
	}
	@Override
	public void display() {
		System.out.println("The Perimeter Of Triangle Is:"+perimeter);
	}
}
public class PerimeterOfShapes {

	public static void main(String[] args) {
		Square s=new Square();
		s.CollectData();
		s.Calculate();
		s.display();
		Circle c=new Circle();
		c.CollectData();
		c.Calculate();
		c.display();
		Triangle t=new Triangle();
		t.CollectData();
		t.Calculate();
		t.display();

	}

}
