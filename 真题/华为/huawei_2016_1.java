package 真题.华为;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Scanner;
//输入包括多组测试数据。
//每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
//学生ID编号从1编到N。
//第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
//接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
//当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。 


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
