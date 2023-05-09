package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		
		// AreaCirc.PI = 3.1415;
		
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(5));
		System.out.println(AreaCirc.PI);
	}
}
