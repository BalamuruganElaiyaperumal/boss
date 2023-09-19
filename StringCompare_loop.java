package stringLogic;

public class StringCompare_loop {

	public static void main(String[] args) {
    
	String a ="Balaji";
	String b ="Balaji";
	for(int i=0; i<a.length(); i++) {
		for(int j=0; j<b.length(); j++) {
			if(a==b) {	
				System.out.println("yes");
			}
			else {
				
				System.out.println("no");
			}
			
			
		}
		
	}
		
	}

}
