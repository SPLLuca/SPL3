
public class Taschenrechenr {

	public static void main(String[] args) {

		if (args.length == 3) {

			int zahl1 = Integer.parseInt(args[0]);
			int zahl2 = Integer.parseInt(args[2]);

			if (args[1].equals("+")) {
				System.out.println("Ergebnis: " + addition(zahl1, zahl2));
			} else if (args[1].equals("-")) {
				System.out.println("Ergebnis: " + subtraktion(zahl1, zahl2));
			} else if (args[1].equals("x")) {
				System.out.println("Ergebnis: " + multiplikation(zahl1, zahl2));
			} else if (args[1].equals("/")) {
				System.out.println("Ergebnis: " + division(zahl1, zahl2));
			} else {
				System.out.println("Operator ungültig!");
			}
		}else if(args.length == 5) {
			
			int zahl1 = Integer.parseInt(args[0]);
			int zahl2 = Integer.parseInt(args[2]);
			int zahl3 = Integer.parseInt(args[4]);
			int summe = 0;

			if((args[1].equals("+")) && ((args[3].equals("x")))){
				summe = (zahl2 * zahl3)+zahl1;
				
			} else if((args[1].equals("-")) && ((args[3].equals("/")))){
				summe = (zahl2 / zahl3)-zahl1;
			}
			if((args[1].equals("-")) && ((args[3].equals("x")))){
				
				summe = (zahl2 * zahl3)-zahl1;
				
			} else if(args[1].equals("+")  && ((args[3].equals("/")))){
				summe = (zahl2 / zahl3)+zahl1;
			}
			
			if((args[1].equals("x")) && ((args[3].equals("+")))){
				summe = (zahl1 * zahl2)+zahl3;
			} else if((args[1].equals("x")) && ((args[3].equals("-")))){
				summe = (zahl1 * zahl2)-zahl3;
			}
			if((args[1].equals("/")) && ((args[3].equals("+")))){
				summe = (zahl1 / zahl2)+zahl3;
			} else if(args[1].equals("/")  && ((args[3].equals("/")))){
				summe = (zahl1 / zahl2)-zahl3;
			}
			
			System.out.println("Ergebnis: " + summe);
			
		}

	}

	public static int addition(int zahl1, int zahl2) {
		int summe;

		summe = zahl1 + zahl2;

		return summe;
	}

	public static int subtraktion(int zahl1, int zahl2) {
		int summe;

		summe = zahl1 - zahl2;

		return summe;
	}

	public static int multiplikation(int zahl1, int zahl2) {
		int summe;

		summe = zahl1 * zahl2;

		return summe;
	}

	public static int division(int zahl1, int zahl2) {
		int summe;

		summe = zahl1 / zahl2;

		return summe;
	}

}
