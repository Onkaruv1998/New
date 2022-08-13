package pkg7;

public class DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA a=new ClassB();
		
		ClassB b=(ClassB)a;
		
		b.methodB();
		b.ABC();
		
	}

}
