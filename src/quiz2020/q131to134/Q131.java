package quiz2020.q131to134;

import use.common.KBInput;

public class Q131 {
	static int findInterest(int m, int y, double r) {
		int n = m;
		for (int i = 0; i < y; i++) {
			n *= (1 + r);
		}
		return n - m;
	}
	
	public static void main(String[] args) {
		int principal, years, interest1, interest2; double rate1, rate2;
		principal = KBInput.readInt();
		years = KBInput.readInt();
		rate1 = KBInput.readDouble();
		rate2 = KBInput.readDouble();
		interest1 = findInterest(principal, years, rate1);
		interest2 = findInterest(principal, years, rate2);
		System.out.println(Math.abs(interest1 - interest2));
	}
}
