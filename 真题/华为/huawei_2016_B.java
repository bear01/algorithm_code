package ����.��Ϊ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 ����һ���ַ�����������ַ����������ַ�����
��������:
ÿ����������һ���ַ������ַ�����󳤶�Ϊ100����ֻ������ĸ��������Ϊ�մ������ִ�Сд��
�������:
ÿ������һ�У����ַ���ԭ�е��ַ�˳������ַ����ϣ����ظ����ֲ��������ĸ�������

��������1:   abcqweracb
�������1:   abcqwer
 * 
 * @author bear
 *
 */
public class huawei_2016_B {
	public static void main(String[] args) {
		Scanner in =  new  Scanner(System.in);
		while(in.hasNext()){
			char[] x = in.next().toCharArray();
			StringBuffer sb = new StringBuffer();
			Set<Character>set = new HashSet<Character>();
			for (int i = 0; i < x.length; i++) {
				if (set.add(x[i])) {
					sb.append(x[i]);
				}
				
			}
			System.out.print(sb.toString());
		}
	}
}

