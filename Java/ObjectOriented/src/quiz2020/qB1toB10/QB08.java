package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB08 {
	public static void main(String[] args) {
		int n = KBInput.readInt();
		boolean ans = true;
		for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) ans = false;
		if (ans) System.out.println("Yes");
		else System.out.println("No");
	}
}
