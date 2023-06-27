import java.util.*;

class Fraction {
	String frac;
	Integer nominator;
	Integer denominator;
	
	Fraction(String s) {
		this.frac = s;
		setNominator(s);
		setDenominator(s);
		simplify();
	}
	Fraction(Fraction fraction) {
		this.frac = fraction.frac;
		this.nominator = fraction.nominator;
		this.denominator = fraction.denominator;
	}
	
	public void setNominator(String s){
		this.nominator = Integer.parseInt(s.substring(0,s.indexOf('/')));
	}
	
	public void setDenominator(String s){
		this.denominator = Integer.parseInt(s.substring(s.indexOf('/')+1,s.length() ));
	}
	
	public void printFrac(){
		System.out.println(this.frac);
	}
	
	public void simplify() {
		Integer gcd = Calc.calculateGCD(this.nominator, this.denominator);
		this.nominator /= gcd;
		this.denominator /= gcd;
		this.frac = Integer.toString(this.nominator) + '/' + Integer.toString(this.denominator);
	}
	
	public Fraction addFrac(Fraction a) {
		Integer denom = Calc.calculateLCM(this.denominator, a.denominator);
		Integer numer = this.nominator*denom/this.denominator + a.nominator*denom/a.denominator;
		String s = Integer.toString(numer)+'/'+ Integer.toString(denom);
		Fraction result = new Fraction(s);
		return result;
	}
		
}