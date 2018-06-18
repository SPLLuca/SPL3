
public class Taschenrechenr {

	public static void main(String[] args) {
		
		
		int zahl1 = Integer.parseInt(args[0]);
		int zahl2 = Integer.parseInt(args[2]);
		
		if(args[1].equals("+")) {
			System.out.println("Ergebnis: " + addition(zahl1, zahl2));
		}
		else if(args[1].equals("-")){
			System.out.println("Ergebnis: " + subtraktion(zahl1, zahl2));
		} 
		else if(args[1].equals("x")) {
			System.out.println("Ergebnis: " + multiplikation(zahl1, zahl2));
		}
		else if(args[1].equals("/")) {
			System.out.println("Ergebnis: " + division(zahl1, zahl2));
		}
		
		
		
	}
	public static int addition(int zahl1, int zahl2) {
		int summe;
		
		summe = zahl1+zahl2;
		
		return summe;
	}
	public static int subtraktion(int zahl1, int zahl2) {
		int summe;
		
		summe = zahl1-zahl2;
		
		return summe;
	}
	public static int multiplikation(int zahl1, int zahl2) {
		int summe;
		
		summe = zahl1*zahl2;
		
		return summe;
	}
	public static int division(int zahl1, int zahl2) {
		int summe;
		
		summe = zahl1/zahl2;
		
		return summe;
	}
	

}
