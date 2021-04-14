package quiz2020.q161to191;


public class AccTest{
	public static void main(String args[]) {
		Accumulator acc;
		acc = new Accumulator();
		acc.add(10);
		acc.add(30);
		System.out.println(acc.value());
	}
}
