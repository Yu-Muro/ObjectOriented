package quiz2020.q131to134;

import use.common.KBInput;

public class Q134 {
	static double pow(double a, int b) {
		double result = 1;
		if (b < 0) for (int i = 0; i > b; i--) result /= a;
		else for (int i = 0; i < b; i++) result *= a;
		return result;
	}

	static long factorial(int n) {
		long r = 1L;
		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		return r;
	}

	public static void main(String[] args) {
		double p = KBInput.readDouble();
		int n = KBInput.readInt();
		int r = KBInput.readInt();
		double tmp = factorial(n) / (factorial(r) * factorial(1 - r));
		double ans = tmp * pow(p, r) * pow(1 - p, n - r);
		System.out.println(ans);
	}
}
