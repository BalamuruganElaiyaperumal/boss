package stringLogic;

public class StringPyramid {
public static void main(String[]args) {
	
	String a="Balaji";
	
	for(int i=0; i<a.length(); i++) {

		System.out.println(a.substring(i));
	}
	for(int i=0; i<a.length(); i++) {
		System.out.println(a.substring(0,i+1));

}
}
}
