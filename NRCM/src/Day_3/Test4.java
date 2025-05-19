package Day_3;

public class Test4 {
	public static void main(String[] args) {
		String str1= "listen";
		String str2= "silent";
		if(str1.length() ==str2.length()) {
			int[] count = new int[26];
			for (int i=0;i<str1.length();i++) {
				count[str1.charAt(i) - 'a']++;
		        count[str2.charAt(i) - 'a']--;
		}
		boolean  isanagram  = true;
		for (int i = 0;i < 26; i++) {
			if(count[i] !=0) {
				isanagram = false;
				break;
			}
		}
		System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
		
	}

}
