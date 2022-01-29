
public class isPalindrome {
	int palindrome = 121;
	int nonPalin = -121;
	
	public static void main(String[] args) {
		isPalindrome yes = new isPalindrome();
		System.out.println(yes.isPalindrome(yes.nonPalin));
	}
	
	public String isPalindrome(int x) {
		String cloneBackwards  = "";
		String actual = String.valueOf(x);
		for(int i = actual.length() - 1 ; i >= 0; i--) {
			char charValue; 
			charValue = actual.charAt(i);
			cloneBackwards = cloneBackwards + charValue;
		}
		
		//System.out.println(cloneBackwards);
		if(cloneBackwards.contentEquals(actual)) {
			return true + "\t" + x + " is a palindrome";
		}else{
			return false + "\t" + x + " is not a palindrome";
		}
	}
}
