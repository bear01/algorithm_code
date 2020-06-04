package 算法题;

public class test_2 {
	//等腰三角形
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n;i++){
			for(int x=1;x<=n-i;x++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
