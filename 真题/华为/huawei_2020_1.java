package 真题.华为;

import java.util.Arrays;
import java.util.Scanner;

public class huawei_2020_1 {
	// 选出票数最多的人
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String[] arr = str.split(",");
		Arrays.sort(arr);
		int max=0;
		int count=1;
		int x=0;
		int i;
		for(i=1;i<arr.length;i++){
			if(arr[i-1].equals(arr[i])) {
				count++;			
			}
			else if(count>max){
				max = count;
				x = i-1;
				count=1;
			}			
		}
		if(count>max){
			max = count;
			x = i-1;		
		}
		System.out.print(arr[x]);
	}

}
