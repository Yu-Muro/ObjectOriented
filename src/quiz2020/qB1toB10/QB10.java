package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB10 {
	static boolean primeCheck(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
		return true;
	}

	public static void main(String[] args) {
		int n = KBInput.readInt();
		int s = 0;
		for (int i = 2; i <= n; i++) {
			if (primeCheck(i)) {
				s++;
				System.out.println(i);
			}
		}
		System.out.println(s);

	}
}
