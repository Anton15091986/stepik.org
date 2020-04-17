class Main {
	public static String cleaningWord(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	public static String wordToUpperCase(String str) {
		return str.toUpperCase();
	}
	public static String wordReverse(String str) {
		StringBuffer str1 = new StringBuffer(str);
		str1 = str1.reverse();
		String str2 = new String(str1);
		return str2;
	}
	public static boolean isPalindrome(String str) {
		str = cleaningWord(str);
		str = wordToUpperCase(str);
		String str2 = wordReverse(str);
		return str.equals(str2);
	}
	public static void main (String[] args) {
		String s1 =  "";
		String s2 = "N'atan";
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
	}
}