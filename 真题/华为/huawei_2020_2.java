package ����.��Ϊ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class huawei_2020_2 {
    // ����һ����������1,2,3 ���1 1 1 2 2 2 3 3 3
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet();
		ArrayList<Integer> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			set.add(in.nextInt());
		}
		for(int x :set){
			list.add(x);
			list.add(x);
			list.add(x);
		}
		System.out.print(list);
	}
}
