package quiz2020.q131to134;

import use.common.KBInput;

public class Q132 {
	static double pow(int a, int b) {
		double result = 1;
		if (b < 0) for (int i = 0; i > b; i--) result /= a;
		else for (int i = 0; i < b; i++) result *= a;
		return result;
	}

	public static void main(String[] args) {
		int a = KBInput.readInt();
		int b = KBInput.readInt();
		double ans = pow(a, b);
		if (b >= 0) System.out.println((int)ans);
		else System.out.println(ans);
	}
}
