package �㷨��;

public class test_4 {
//��ȡ�ַ���
	public static void main(String[] args) {
		System.out.print(test_4.stringcut("��aa�����ͣ��人����",2,6));
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
