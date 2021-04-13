package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB04 {
	public static void main(String[] args) {
		int principal = KBInput.readInt();
		int years = KBInput.readInt();
		double rate = KBInput.readDouble();
		long tmp = 0L; long interest = 0L;
		for (int i = 0; i < years; i++) tmp += (long)(principal * (1 + rate));
		interest = tmp - principal;
		System.out.println(interest);
	}
}
