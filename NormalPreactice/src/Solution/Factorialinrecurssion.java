package Solution;


public class Factorialinrecurssion {
	public static void main(String[] args) {
		int n = 5;
		int factorial = factorial(n, 1);
		System.out.println(factorial);
		
	}
	public static int factorial(int n,int fact) {
		if(n==1) {
			return fact;
		}
		fact = n*fact;
		n--;
		return factorial(n, fact);
		
	}
	
}
