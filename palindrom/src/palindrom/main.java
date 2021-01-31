package palindrom;

public class main {

	public static void main(String[] args) {
		
		main obj = new main();
		if (obj.isPalindrome("ana **voli, @milovana") == true) {
		    System.out.println("Palindrom je!");
		}else {
		    System.out.println("Nije palindrom!");
		}
		
	}
	
	public main() {
		
	}
	
	public boolean isPalindrome(String text) {
	    String clean = text.replaceAll("[^a-zA-Z0-9_-]", "").toLowerCase();
	  
	    int length = clean.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = clean.charAt(forward++);
	        char backwardChar = clean.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;

	    }
	    return true;
	}
	
	
}
