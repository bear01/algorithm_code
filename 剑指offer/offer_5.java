package 剑指offer;

public class offer_5 {

	public static void main(String[] args) {
		// %20替换空格
		String str = "We are happy.";
		System.out.println(replace_1(str));
		System.out.println(replace_2(str));

	}
	private static String replace_2(String input) {
		// 解法二：从后往前复制
		if(input == null) return null;
		int len = input.length();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' ') len+=2;
		}
		char[] res = new char[len];
		len--;
		for(int i=input.length()-1;i>=0;i--){
			if(input.charAt(i)==' '){
				res[len--]='0';
				res[len--]='2';
				res[len--]='%';
			}
			else {
				res[len--]=input.charAt(i);
			}
		}
		return new String(res);
	}
	private static String replace_1(String str) {		
		// 解法一:使用StrinBuffershiji
		if(str == null) return null;
		StringBuffer res = new StringBuffer();
		int len=str.length();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ') res.append("%20");
			else {
				res.append(str.charAt(i));
			}
		}		
		return res.toString();
	}
	

}
