package ����.��Ϊ;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Scanner;
//�����������������ݡ�
//ÿ�������һ��������������N��M��0 < N <= 30000,0 < M < 5000��,�ֱ����ѧ������Ŀ�Ͳ�������Ŀ��
//ѧ��ID��Ŵ�1�ൽN��
//�ڶ��а���N��������������N��ѧ���ĳ�ʼ�ɼ������е�i��������IDΪi��ѧ���ĳɼ�
//��������M�У�ÿһ����һ���ַ�C��ֻȡ��Q����U������������������A,B,��CΪ'Q'��ʱ��, ��ʾ����һ��ѯ�ʲ�������ѯ��ID��A��B������A,B����ѧ�����У��ɼ���ߵ��Ƕ���
//��CΪ��U����ʱ�򣬱�ʾ����һ�����²�����Ҫ���IDΪA��ѧ���ĳɼ�����ΪB�� 


public class huawei_2016_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		do{
			int data[] = new int[2];
			data[0] = in.nextInt();
			data[1] = in.nextInt();
			ArrayList<Integer> array = new ArrayList<Integer>();
			for(int i=0;i<data[0];i++){
				array.add(in.nextInt());
			}
			int opt=0;
			char a;
			int b,c;
			while(opt<data[1]){
				a = in.next().charAt(0);
				b = in.nextInt();
				c = in.nextInt();
				if(a=='Q'){
					int start,end;
					if(b<c){
						start = b-1;
						end = c-1;
					}else {
						start = c-1;
						end = b-1;
					}
					int max = array.get(start);
					for (int i = start+1; i < end; i++) {
						if(max<array.get(i)){
							max = array.get(i);
						}
					}
					System.out.println(max);
					max = 0;
				}
				if(a=='U'){
					int index =b-1;
					int newValue = c;
					array.set(index, newValue);
				}
				opt++;
			}
				
		}while(in.hasNext());
		in.close();
	}

}
