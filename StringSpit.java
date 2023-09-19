package stringLogic;

public class StringSpit {

	public static void main(String[] args) {

		
		String a ="34AB85jfhbd%&#**%";
		
		String b =a.replaceAll("[^A-Za-z0-9]","");
		System.out.println(b);
		String c =a.replaceAll("[^A-Za-z]","");
		System.out.println(c);
		String d =a.replaceAll("[^0-9]","");
		System.out.println(d);

		
		
	}

}
