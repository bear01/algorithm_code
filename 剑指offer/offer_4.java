package ��ָoffer;

public class offer_4 {

	public static void main(String[] args) {
		// ��ά�����еĲ���
		int[][] arry = {};
		int  finN =3;
		System.out.println(Find(arry,finN));
	}

	private static boolean Find(int[][] arry, int n) {
		// �����Ͻǿ�ʼ����  ���ߴ����½�Ҳ����
		int hlen = arry.length;	//����
		int wlen = arry[0].length;	//����
		for(int i=0,j=wlen-1;i<hlen&&j>=0;){	
				if(n==arry[i][j]) return true;
				if(n<arry[i][j]) --j;
				else ++i;		
		}
		return false;
	}

}
