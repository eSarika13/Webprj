package mar30;

public class NonStatic1 {
	int a,b,c;
	public void sub() {
		a=6759;
		b=3676;
		c=a-b;
		System.out.println(c);
	}
	public void div() {
		a=6525;
		b=25;
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		NonStatic1 a = new NonStatic1();
		a.sub();
		a.div();
				
	}

}
