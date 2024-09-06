package Solution;

import java.util.Scanner;

public class StringProgram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.next();
		char[] excludeRepitingCharacter = new StringProgram().excludeRepitingCharacter(str);
		StringBuilder sb = new StringBuilder();
		for (char c : excludeRepitingCharacter) {
			if (c != '\u0000') {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		System.out.println(new StringProgram().vowelCount(str));
		
		
		char[] replaceWithSpaceIfRepetdmmoreThenThree = new StringProgram().replaceWithSpaceIfRepetdmmoreThenThree(str);
		StringBuilder sb2 = new StringBuilder();
		for (char c : replaceWithSpaceIfRepetdmmoreThenThree) {
			if (c != '\u0000') {
				sb2.append(c);
			}
		}
		System.out.println(sb2.toString());
		s.close();
	}

	public char[] excludeRepitingCharacter(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int counter = 0;
			if (ch[i] == '\u0000') {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '\u0000';
					counter++;
				}
			}
			if (counter != 0) {
				ch[i] = '\u0000';
			}
		}
		return ch;
	}

	public int vowelCount(String s) {
		String vowelList = "aeiouAEIOU";
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowelList.length(); j++) {
				if (s.charAt(i) == vowelList.charAt(j)) {
					counter++;
					break;
				}
			}
		}
		return counter;
	}

	public char[] replaceWithSpaceIfRepetdmmoreThenThree(String s) {
		char[] ch = s.toCharArray();
		char[] ch1 = new char[s.length()];
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\u0000') {
				continue;
			}
			boolean addedFlag = false;
			
			for (int j = 0; j < ch1.length; j++) {
				if (ch[i] == ch1[j]) {
					System.out.println("yes");
					break;
				}else {
					System.out.println("no");
					ch1[i] = ch[i];
				}
			}
			for (char c : ch1) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		
		return ch;
	}
}
