package �㷨��;
import java.util.Scanner;
public class test_5 {
//	��дһ������,��������ת��������Ҷ����ַ���,����,��1006333ת��ΪҼǧ��½Ԫ���ǡ�
	private static String [] RMB_num ={"��","Ҽ","��","��","��","��","½","��","��","��"};
	private static String [] RMB_unit ={"Ԫ","ʰ","��","Ǫ","��"};
	public static void RMBreverse(float num){
		String input = Float.toString(num);
		int n=input.length();
		for(int i=1;i<input.length();i++){
			Object s=input.subSequence(i-1, i);
			int x=Integer.parseInt(String.valueOf(s));
//			System.out.println(x);
			for(int j=0;j<10;j++){				
				if(x==j){
					System.out.print(RMB_num[j]+RMB_unit[n-3]);
					n--;
					break;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("����������Ҵ�С��");
    float RMB = scanner.nextFloat();
    RMBreverse(RMB);
//    System.out.println(RMBreverse(RMB));
	}
	
}
