package Fibonacci_2;

public class Fibonacci {
	static long fib(int n) {
    if (n < 2) {
        return n;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}

public static void main(String[] args) {

// demonstra 15 primeiros elementos  de fibonacci 
for (int i = 0; i < 16; i++) {
	System.out.print("(" + i + "):" + Fibonacci.fib(i) + "\t");
	{
		if( Fibonacci.fib(i) == 400 )
			System.out.print("apareceu");
		else
			System.out.print("Não apareceu");
		
		
	

}

}
}
}
