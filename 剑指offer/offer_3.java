package 剑指offer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class offer_3 {
	
	
	public static void main(String[] args) {
		//找出数组中重复的数字
		int[] arry = {2,3,1,0,2,5,3,3};
		Duplicate_1(arry);	
	}

	private static void Duplicate_1(int[] arry) {
		// 方法1：利用排序
		Arrays.sort(arry);
		int temp = arry[0];
		int[] dup = {};
		int k=0;
		for(int i=1;i<arry.length-1;i++){
			if(arry[i]==arry[i+1]&&temp!=arry[i]) {
				System.out.print(arry[i]);
				temp = arry[i];
			}
		}
	}

}
