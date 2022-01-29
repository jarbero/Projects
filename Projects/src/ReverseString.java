
public class ReverseString {
	public static void main(String[] args) {
		reverse("yas");
	}
	
	public static String reverse(String s) {
		String p = "";
		char[] reverseString = new char[s.length()];
		
		for(int i = s.length() - 1 ; i >= 0; i--) {
			
			p = p + s.charAt(i);
		}
		System.out.println(p);
		return s;
	}
}
