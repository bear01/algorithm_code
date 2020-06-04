package 剑指offer;
//旋转数组中的最小数字
public class offer_11 {
	// 方法一：循环, 后面一个数小于前一个，找到，停止循环。
	public static int min_1(int[] arr) {
		if(arr.length<=0) return 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]) return arr[i];
		}
		return arr[0];
	}
	// 方法二：二分查找思想
	public static int min_2(int[] arr){
		int n = arr.length;
		if(n<=0) return 0;
		int p1=0;
		int p2=n-1;
		int pm=0;
		while(true){
			pm= (p1+p2)/2;
			if(arr[pm]>arr[p1]){
				p1 = pm;
			}
			else{
				p2 = pm;
			}
			if(p1+1==p2) break;
		}
		return arr[pm];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,1,2,2};
		System.out.println(min_1(arr));
		System.out.println(min_2(arr));
	}

}
