package leetcode;


public class code_221 {
	public static int maxmalSquare(char[][] maxrix) {
		int maxSide = 0;
		if(maxrix==null||maxrix.length==0||maxrix[0].length==0) 
			return maxSide;
		int rows = maxrix.length;
		int cols = maxrix[0].length;
		int[][] dp = new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(maxrix[i][j]=='1'){
					if(i==0||j==0){
						dp[i][j] = 1;
					}else {
						dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1])+1;
					}
					maxSide = Math.max(maxSide, dp[i][j]);
				}
			}
		}
		int maxSquare = maxSide * maxSide;
		return maxSquare;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] s = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		System.out.println(maxmalSquare(s));
	}

}
