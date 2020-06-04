package leetcode;
public class code_20 {
	// ÓÐÐ§µÄÀ¨ºÅ
	 public static boolean isValid(String s) {
         int len =s.length();
	     if(len%2!=0) return false;
	     char[] str = s.toCharArray();
	     for(int i=0;i<len-2;i++){
	         for(int j=i+2;j<len;j+=2){
	            if(str[i]==str[j]){
	                  return false;
	            }
	         }
	     }


        return true;

    }
	public static void main(String[] args) {
		String s = "((){)}";
		System.out.print(isValid(s));
		
	}
	
}