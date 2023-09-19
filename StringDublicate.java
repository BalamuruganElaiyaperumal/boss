package stringLogic;

public class StringDublicate {
	public static void main(String[]args) {
		
		String a ="balajjji";
		int count=0;
		String s="";
		for(int i=0; i<a.length();i++) {
			for(int j=i+1; j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
					s=s+a.charAt(i);
				}
			}
			
		}
		System.out.println(s);
		System.out.println(count);


	}

}
