package pkg8;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new UserDefineException();
		}catch(UserDefineException e) {
			System.out.println(e);
		}
	}

}
