package leetcode;
//罗马数字转整数
public class code_13 {
	 public static int revert(char x){
	        switch(x){
	            case 'I': return 1;
	            case 'V': return 5;
	            case 'X': return 10;
	            case 'L': return 50;
	            case 'C': return 100;
	            case 'D': return 500;
	            case 'M': return 1000;
	            default:; return 0;
	        }

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "IV";
	        int len = s.length();
	        int result =0;
	        int temp = revert(s.charAt(0));
	        int i;
	        for(i=1;i<len;i++){
	            int one = revert(s.charAt(i));
	            if(temp>=one){
	                result = result+temp;
	            }
	            else{
	                result = result - temp;
	            }
	            temp = one;
	        }
	        System.out.print( result+revert(s.charAt(i-1)));
	}

}
