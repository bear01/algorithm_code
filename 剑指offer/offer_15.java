package ��ָoffer;

public class offer_15 {
	// ������ⷨ�У�ѭ�������������������Ƶ�λ��
	public static int NumberOf1(int n){
		int count = 0;
		int flag =1;
		while(flag!=0){
			if((n&flag)!=0) count++; // ��� ture  count+1
			flag=flag << 1; // ����һλ
		}
		return count;
	}
	//ִֻ��count��,�Ƚ�n��1���ں�ԭ�����������㣬ÿ��ѭ����Ѹ��������ұߵ�1���0��������1���0��ͽ�����
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
