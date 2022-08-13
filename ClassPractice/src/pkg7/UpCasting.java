package pkg7;

public class UpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA a=new ClassB();
		
		a.main();;
		
		a.methodA();
		System.out.println(a.a);
		System.out.println(a.b);
	}

}
