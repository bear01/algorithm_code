package ��ָoffer;

public class offer_10 {
	// ����һ���ݹ�˼��
	public static int Fibonacci(int n) {
		if(n<=0) return 0;
		if(n==1) return 1;
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	// �������� �������ϼ��� ʱ�临�Ӷ�O(n)
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
