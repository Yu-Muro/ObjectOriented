package quiz2020.q131to134;

import use.common.KBInput;

public class Q133 {
	static int primeCheck(int n) {
		if (n == 0 || n == 1) return 0;
		for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return 0;
		return 1;
	}

	public static void main(String[] args) {
		int a = KBInput.readInt();
		int b = KBInput.readInt();
		int n = 0;
		for (int i = a; i <= b; i++) if (primeCheck(i) == 1) n++;
		System.out.println(n);
	}
}
