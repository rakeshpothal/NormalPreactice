package Solution;

import java.util.Scanner;

public class ArmStrongInRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter range");
		System.out.println("Enter lower range");
		int lower = s.nextInt();
		System.out.println("Enter highest range");
		int highest = s.nextInt();
		m1(lower, highest,0);

	}

	public static void m1(int lower, int highest, int countarmstrong) {
		if (lower > highest) {
			return;
		}
//		System.out.println(lower);
		int count = m2(lower, 0);
		int m3 = m3(lower,count,0);
		if(m3==lower) {
			System.out.println(lower + " is armstrong");
			countarmstrong++;
			if(countarmstrong==3) {
				return;
			}
		}

		lower++;
		m1(lower, highest,countarmstrong);
	}

	public static int m2(int n, int count) {
		if (n == 0) {
			return count;
		}
		n = n / 10;
		count++;
		return m2(n, count);
	}

	public static int m3(int n, int digitno, int add) {
		if (n == 0) {
			return add;
		}

		int rem = n % 10;
		n = n/10;
		int pow = (int) Math.pow(rem, digitno);
		add += pow;
		return m3(n, digitno, add);

	}
}
