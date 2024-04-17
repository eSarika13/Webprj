package mar30;

public class SampleUserdefined {
	public static void add(int a, int b) {
		int c=b+a;
		System.out.println(c);
	}
	public static String ver_str(String s1 , String s2) {
		String str;
		if(s1.equalsIgnoreCase(s2))
		{
			str="Both are equal strings";
		}
		else {
			str="Both are not equal strings";
		}
		return str;
		
	}

	public static void main(String[] args) {
		SampleUserdefined.add(6325,6325);
		
		String a= SampleUserdefined.ver_str("hello", "Sleep");
		System.out.println(a);
	}

}
