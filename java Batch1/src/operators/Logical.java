package operators;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b=20;
		System.out.println("and operator");
		System.out.println(a<b && a>b);
		System.out.println(a<b && a==10);
		System.out.println("or operator");
		System.out.println(a<b || a>b);
		System.out.println(a>b  ||a!=10);
		System.out.println("not operator");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println("----------");
		System.out.println(!(a>b));
		System.out.println(!(a==10));
		
		
	}

}
