package pkg1;

public class Practice extends Practice1 {
	public void main(int a, String b)
	{
		System.out.println(b);
	}
	
	public static void hide(int z)
	{
		System.out.println("method hiding"+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice p=new Practice();
		p.main(0, "onkar");
		
		Practice1 p1=new Practice1();
		p1.main(10, "veer");
		
		Practice1.hide(20);
		Practice.hide(1);
}
}
