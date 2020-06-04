package 剑指offer;

public class offer_4 {

	public static void main(String[] args) {
		// 二维数组中的查找
		int[][] arry = {};
		int  finN =3;
		System.out.println(Find(arry,finN));
	}

	private static boolean Find(int[][] arry, int n) {
		// 从右上角开始查找  或者从左下角也可以
		int hlen = arry.length;	//行数
		int wlen = arry[0].length;	//列数
		for(int i=0,j=wlen-1;i<hlen&&j>=0;){	
				if(n==arry[i][j]) return true;
				if(n<arry[i][j]) --j;
				else ++i;		
		}
		return false;
	}

}
