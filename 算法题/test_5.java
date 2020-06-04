package 算法题;
import java.util.Scanner;
public class test_5 {
//	编写一个程序,将浮点数转换成人民币读法字符串,例如,将1006333转换为壹千零陆元叁角。
	private static String [] RMB_num ={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private static String [] RMB_unit ={"元","拾","佰","仟","万"};
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
    System.out.println("请输入人民币大小：");
    float RMB = scanner.nextFloat();
    RMBreverse(RMB);
//    System.out.println(RMBreverse(RMB));
	}
	
}
