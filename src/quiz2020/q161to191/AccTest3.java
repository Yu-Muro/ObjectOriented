package quiz2020.q161to191;

public class AccTest3{
	public static void main(String args[]) {
		Accumulator acc1=new Accumulator();
		Accumulator acc2=new Accumulator();
		acc1.add(10);
		acc2.add(20);
		acc1=acc2;
		acc1.add(30);
		acc2.add(40);
		System.out.println(acc1.value());
		System.out.println(acc2.value());
	}
}