package mar30;

public class Static2 {

	static int a,b,c;
	public static void add() {
		a=635;
		b=7596;
		c=a+b;
		System.out.println(c);
	}
	
	public static void mul() {
		a=562;
		b=652;
		c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Static2.add();
		mul();

	}

}
