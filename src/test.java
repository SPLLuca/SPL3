
public class test {
	
	public static void main(String[] args) {
		
		//args[0] = "Hallo";
		System.out.println(args.length);
		
		for( int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		if( args[5].equals("kauf")) {
			System.out.println("Du kannst etwas kaufen unter,\nhttp://www.supremenewyork.com/shop/all");
		}
	}
}
