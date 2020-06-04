package 真题.华为;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class moli2020_2 {

	public static void main(String[] args) {
		// 删除字符串中重复的字符
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] chars =  str.toCharArray();
		LinkedList<String> list = new LinkedList<>();
		StringBuffer strr = new StringBuffer();
		for(int i=0;i<chars.length;i++){
			if(list.contains(String.valueOf(chars[i]))){
				continue;
			}else {
				list.add(String.valueOf(chars[i]));
				strr.append(String.valueOf(chars[i]));
				
			}
		}
		System.out.print(strr.toString());
	}

}
