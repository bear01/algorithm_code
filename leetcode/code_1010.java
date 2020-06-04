package leetcode;

public class code_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] x= {30,20,150,100,40};
//		int count=0;
//		for(int i=0;i<x.length;i++){
//			for(int j=i+1;j<x.length;j++){
//				if((x[i]+x[j])%60==0){
//					count++;
//				}
//			}
//		}
//		System.out.print(count);
		
		
		   int[] time= {30,20,150,100,40};
		   int count=0;
	        int[] arr = new int[60];
	        for(int t : time){
	            t = t%60;
	            int index = t==0?0:(60-t);
	            count += arr[index];
	            arr[t]++;
	          
	        }
	        System.out.print(count);
//		
	}

}
