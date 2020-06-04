package 剑指offer;

public class offer_15 {
	// 在这个解法中，循环次数等于整数二进制的位数
	public static int NumberOf1(int n){
		int count = 0;
		int flag =1;
		while(flag!=0){
			if((n&flag)!=0) count++; // 如果 ture  count+1
			flag=flag << 1; // 左移一位
		}
		return count;
	}
	//只执行count次,先将n减1，在和原整数做与运算，每次循环会把该整数最右边的1变成0，将所有1变成0后就结束。
	public static int NumberOf2(int n) {
		int count = 0;
		while(n!=0){
			++count;
			n = (n-1)&n;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		System.out.println(NumberOf1(n));
		System.out.println(NumberOf2(n));
	}

}
