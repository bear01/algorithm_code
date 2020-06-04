package 剑指offer;

public class offer_16 {
	
	
	public static void main(String[] args) {
		// 求数值的整数次方
		double base = 2;
		int exponent = 10;
		System.out.println(Power(base,exponent));
	}

	private static double Power(double base, int exponent) {
		// 
		if(exponent == 0)return 1;
		if(exponent == 1) return base;
		double result = Power(base, exponent>>1);
		result*=result;
		if ((exponent&0x1) == 1) {
			result*=base;
			
		}
		
		return result;
	}

}
