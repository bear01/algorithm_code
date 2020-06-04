package 剑指offer;

public class offer_10 {
	// 方法一：递归思想
	public static int Fibonacci(int n) {
		if(n<=0) return 0;
		if(n==1) return 1;
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	// 方法二： 从下往上计算 时间复杂度O(n)
	public static int Fibonacci_2(int n) {
		
		if (n<=1) return n;
		int f1 = 0;
		int f2 = 1;
		int fn = 0;
		for (int i = 2; i <= n; i++) {
			fn = f1+f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
	}
	public static  void main(String[] args) {
		System.out.print(Fibonacci(3));
		System.out.print(Fibonacci_2(3));
	}
}
