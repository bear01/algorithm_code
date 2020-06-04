package leetcode;
import java.util.Scanner;
public class code_9 {
//ÅĞ¶Ï»ØÎÄÊı
	public static boolean sas(int x){
		  if(x<0) {return false;}
	        StringBuffer sas = new StringBuffer(Integer.toString(x));
	        sas.reverse();
	        Long y=Long.valueOf(sas.toString());
	        if(y.equals(Long.valueOf(x))) {
	        	return true;
	        }else{
	        	return false;
	        }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.print(sas(a));
		 
}
}
