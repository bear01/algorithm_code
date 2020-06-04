package ��ָoffer;

public class offer_14 {
	//��̬�滮 ʱ�临�Ӷ�O(N^2) �ռ临�Ӷ�O(N)
	public static int solution_1(int len) {
		
		if(len<2) return 0;
		if(len==2) return 1;
		if(len==3) return 2;
		int max = 0;
		int[] arr = new int[len+1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		for (int i = 4; i <=len; ++i) {
			max = 0;
			for (int j = 1; j <= i/2; ++j) {
				int sult = arr[j]*arr[i-j];
				if(max<sult) max = sult;
				arr[i] = max;
			}
		}
		max = arr[len];
		
		return max;
	}
	//̰���㷨 ʱ�临�Ӷȡ��ռ临�Ӷ�O(1)
	public static int solution_2(int len) {
		if(len<2) return 0;
		if(len==2) return 1;
		if(len==3) return 2;
		// �����ܶ�ļ�ȥ����Ϊ3�����Ӷ�
		int timesOf3 = len/3;
		// ���������ʣ�³���Ϊ4ʱ�������ټ�ȥ����Ϊ3�����ӶΡ�
		if(len-timesOf3*3==1)
			timesOf3-=1;
		int timesOf2 = (len-timesOf3*3)/2;
		
		return (int)(Math.pow(3,timesOf3))*(int)(Math.pow(2,timesOf2));
	}
	public static void main(String[] args) {
		System.out.println(solution_1(8));
		System.out.println(solution_2(8));
		
		
	}
}
