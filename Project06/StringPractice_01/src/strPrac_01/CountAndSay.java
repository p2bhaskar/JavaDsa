package strPrac_01;

public class CountAndSay {
	// input aaabcBBaa
	// output a3b1c1B2a2

	public static void main(String[] args) {
		String str = "aaabcBBaa5";
		countAndSay(str);

	}

	static void countAndSay(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i)).append(count);
				count = 1;
			} else {
				count++;
			}

		}
		System.out.println(sb.append(str.charAt(str.length() - 1)).append(count));

		System.out.println(6 + 5 + " " + 5 + 5);// 11 55
	}

}
