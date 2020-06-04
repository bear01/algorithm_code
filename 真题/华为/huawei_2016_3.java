package 真题.华为;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class huawei_2016_3 {
	private static int count(char str) {
		return "345678910JQKA2jokerJOKER".indexOf(str);
	}
	public static String compar(String A,String B) {		
		String strA = A.replaceAll(" ", "");
		String strB = B.replaceAll(" ", "");
        int lenA = A.length()-strA.length();
        int lenB = B.length()-strB.length();
//		System.out.print(arry_A.length);
		if (strA.equals("jokerJOKER")) {
			return A;
		}
		if (strB.equals("jokerJOKER")) {
			return B;
		}
        if(lenA==lenB){
            if(count(strA.charAt(0))>count(strB.charAt(0)))return A;
            else return B;
        }
        if(lenA==3) return A;
        if(lenB==3) return B;
        return "ERROR";
	
	}
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		String input = in.nextLine();
		int link;
		String A;
		String B;
		link = input.indexOf('-');
		A = input.substring(0,link);
		B = input.substring(link+1);
		System.out.println(compar(A, B));
		
		
		
	}

}