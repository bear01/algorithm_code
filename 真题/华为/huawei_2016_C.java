package ����.��Ϊ;

import java.util.Scanner;

public class huawei_2016_C {
/**
  ������һ�����Ƕ��ǳ���Ϥ�ľ�����Ϸ�����ü�������ǿ��Ժܿ�ؽ⿪�������⣬������һЩ�򵥵�������Ŀ�����дһ��������⡣

��������:
����9�У�ÿ��Ϊ�ո������9�����֣�Ϊ0�ĵط�������Ҫ���ġ�

�������:
������У�ÿ�оŸ��ո���������֣�Ϊ����Ĵ𰸡�
 * @param args
 */
	public static boolean DFS(int[][] a,boolean[][] cols,boolean[][] rows,boolean[][] blocks) {
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(a[i][j]==0){
					int k = i/3*3 +j/3;
					for(int l=0;i<9;l++){
						if(!cols[j][l]&&!rows[i][l]&&!blocks[k][l]){
							rows[i][l] =cols[j][l] = blocks[k][l]=true;
							a[i][j] =1+l;
							if(DFS(a,cols,rows,blocks)) return true;
							rows[i][l] =cols[j][l] = blocks[k][l]=false;
							a[i][j] = 0 ;
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] a = new int[9][9];
		boolean[][] cols = new boolean[9][9];
		boolean[][] rows = new boolean[9][9];
		boolean[][] blocks = new boolean[9][9];
		
		while(in.hasNextInt()){
			for(int i=0;i<9;i++){
				for (int j = 0; j < 9; j++) {
					a[i][j] = in.nextInt();
					if(a[i][j]!=0){
						int k = i/3*3+j/3;
						int val = a[i][j]-1;
						rows[i][val] = true;
						cols[j][val] = true;
						blocks[k][val]=true;
					}
				}
			}
		}
		DFS(a,cols,rows,blocks);
		   for (int i = 0; i < 9; i++) {  
               for (int j = 0; j < 8; j++) {  
                   System.out.print(a[i][j]+" ");  
               }  
               System.out.println(a[i][8]);  
           }  
	}

}
