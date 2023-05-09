package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		// Byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt("1000");
		Integer i = 1000; // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
	}
}
