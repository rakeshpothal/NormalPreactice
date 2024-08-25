package Solution;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.next().toLowerCase();
		System.out.println(new StringPalindrom().isPalindrom(str));
		s.close();
	}

	public boolean isPalindrom(String s) {
		char[] ch = s.toCharArray();
		int length = ch.length - 1;
		for (int i = 0; i <= length; i++) {
			if (ch[i] == ch[length]) {
				length--;

			} else {
				return false;
			}
		}
		return true;
	}
}
