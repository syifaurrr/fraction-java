import java.util.*;
class Calc{
	public static Integer calculateGCD(Integer a, Integer b) {
		while(a!=0 && b!=0) {
			if(a>=b) a%=b; 
			else b%=a;
		}
		return (Math.max(a,b));
	}
	public static Integer calculateLCM(Integer a, Integer b) {
		a /= calculateGCD(a,b);
		return(a*b);
	}
}