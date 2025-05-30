interface Calculator1{
	int a=10;//Rule 10
	void Add();//Rule 9
	void Sub();//Rule 9
}
/*interface Calculator2 implements Calculator1{
	//Rule 7
}*/
interface Calculator3 extends Calculator1{//Rule 8
	void mul();
	void div();
}
interface Calculator4{
	void Add();
	void Sub();
}
class Samplecode1 implements Calculator1{
	@Override
	public void Add() {//Rule 1 Standardization
		System.out.println("Add Method In SampleCode 1");
	}
	@Override
	public void Sub() {//Rule 2
		System.out.println("SUb Method In SampleCode 1");
	}
}
class Samplecode2 implements Calculator1{
	@Override
	public void Add() {//Rule 1
		System.out.println("Add Method In SampleCode2");
	}
	public void Sub() {//Rule 2
		System.out.println("Sub Method In SampleCode2");
	}
}
class Samplecode3 implements Calculator1,Calculator3{//Rule 6
	@Override
	public void Add() {
		System.out.println("Add Method In Samplecode3");
	}
	public void Sub() {
		System.out.println("Sub Method in SampleCode3");
	}
	public void mul() {
		System.out.println("Multiplication Method In SamoleCode3");
	}
	public void div() {
		System.out.println("Div Method In SamoleCode3");
	}
}
interface Calculator5{
	//Rule 11 Tagged Interface
}
class Samplecode4{
	void display() {
		System.out.println("Inside Display Method");
	}
}
class Samplecode5 extends Samplecode4 implements Calculator1{//Rule 12
	@Override
	public void Add() {
		System.out.println("Add Method In SamoleCode5");
	}
	@Override
	public void Sub() {
		System.out.println("Sub Method In SamoleCode5");
	}
}
interface Calculator6{
	void addition();
	void subtraction();
	static void multiplication() {//Rule 14
		System.out.println("Multiplication");
	}
	default void division() {//Rule 14
		System.out.println("Division");
	}
}
abstract class Samplecode6 implements Calculator1{//Rule 15
	@Override
	public void Sub() {
		System.out.println("Subtraction Method In SamoleCode6");
	}
}
public class RulesOfInterface {
	public static void main(String[] args) {
		//Calculator1 c=new Calculator();//Rule 4
		//Calculator2 c2;//Rule 5
		Calculator3 c3=new Calculator3() {//Rule 13
			public void mul() {
				System.out.println("Multiplication Method In RulesOfInterface");
			}
			public void div() {
				System.out.println("Div Method In RulesOfInterface");
			}
			public void Add() {
				System.out.println("Add Method");
			}
			public void Sub() {
				System.out.println("Sub Method");
			}
			
		};
		c3.mul();
		c3.div();
		c3.Add();
		c3.Sub();
	}

}
