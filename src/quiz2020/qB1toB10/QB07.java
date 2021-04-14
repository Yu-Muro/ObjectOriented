package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB07 {
	public static void main(String[] args) {
		int principal = KBInput.readInt();
		double rate = KBInput.readDouble();
		int money = principal;
		int year = 0;
		do {
			money *= (1 + rate);
			year++;
		} while (money < principal * 2);
		System.out.println(year);
		System.out.println(money);
	}
}
