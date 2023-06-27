import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String pecahan = sc.nextLine();
		Fraction f = new Fraction(pecahan);
		
		String pchn = sc.nextLine();
		Fraction g = new Fraction(pchn);
		
		Fraction sum  = new Fraction(f.addFrac(g));
		sum.printFrac();
	}
}