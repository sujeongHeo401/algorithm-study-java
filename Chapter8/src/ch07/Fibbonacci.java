package ch07;

public class Fibbonacci {
	
	int[] value;
	int number;
	
	public Fibbonacci(int number) {
		this.number = number;
		value = new int [number];
	}
	
	public int fibonacciRecur(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
	}
	
	public int fibonacciIter(int n) {
		int ppre = 0;
		int pre = 1;
		
		int current = 0;
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		for(int i = 2; i <=n; i++) {
			current = ppre + pre;
			
			ppre = pre;
			pre = current;
			
		}
		
		return current;
		
	}
	
	public int fibbonacciMem(int n) {
		int result = 0;
		value[0] = 0;
		value[1] = 1;
		
		if(n == 0) 
			return value[0];
		if(n == 1) 
			return value[1];
		
		for(int i = 2; i <= n; i++) {
			value[i] = value[i - 1] + value[i - 2];
			result = value[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibbonacci fib = new Fibbonacci(100);
		
		int result = fib.fibonacciRecur(10);
		System.out.println(result);
		
		result = fib.fibonacciRecur(10);
		System.out.println(result);
		
		result = fib.fibbonacciMem(10);
		System.out.println(result);

	}

}
