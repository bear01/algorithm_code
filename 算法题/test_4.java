package 算法题;

public class test_4 {
//截取字符串
	public static void main(String[] args) {
		System.out.print(test_4.stringcut("中aa国加油，武汉加油",2,6));
	}
	public static String stringcut(String str,int from,int to){
		byte[] a=str.getBytes();
		byte[] b= new byte[to-from];
		System.out.print(to-from);
		System.arraycopy(a, from, b, 0, to-from);
		String strcut =new String(b);
	//	System.out.print(b);
		return strcut;
	}
}
