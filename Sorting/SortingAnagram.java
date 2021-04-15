
public class SortingAnagram {

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		boolean answer = validAnagram(str1, str2);
		System.out.println(answer);
	}

	public static boolean validAnagram(String s, String t) {
		int[] letters = new int[26]; // 26 letters in the alphabets
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); // grabbed me a character
			letters[ch - 'a']++; // getting the specific index so 'a' - 'a' is at index 0 with the value so increment it
		}
		
		// Go through the 2nd string
		for(int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			letters[ch - 'a']--;
		}
		
		// Final run through the array
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] != 0) {
				return false;
			}
		}
		return true;
		
		
	}
}
