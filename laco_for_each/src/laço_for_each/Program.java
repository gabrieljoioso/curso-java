package laço_for_each;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------");
		
		// laço for each
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
