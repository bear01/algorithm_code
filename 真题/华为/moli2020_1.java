package 真题.华为;

import java.util.Scanner;

public class moli2020_1 {

	public static void main(String[] args) {
		// 两数之和
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int[] arr = new int[2];
			arr[0] = in.nextInt();
			arr[1] = in.nextInt();	
			System.out.println(arr[0]+arr[1]);
		}
	}

}
