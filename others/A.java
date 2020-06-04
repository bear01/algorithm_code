package others;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,2,4,5}; //t
		int[] arr1={1,2,2,2,3,2};// t
		int[] arr2={3,4,2,3}; // f
		int[] arr3={2,3,3,2,4}; //t
		int[] arr4={1,3,5,2,4}; // f
		int[] arr5={3,3,2,2};  //f
		int[] arr6={3,3,2,2};  //f
		
		
		System.out.print(opt(arr5));
	}
	public static boolean opt(int[] x){
		int count=0;
		int temp=0;
		for(int i=0;i<x.length-1;i++){
			if(x[i]>x[i+1]){
				count++;
				if((i-1)>=0&&(i+2)<x.length&&x[i+1]==x[i+2]&&x[i]==x[i-1]){
					count++;
				}
				if(i>0&&(i+2)<x.length&&x[i-1]>x[i+1]){
					count++;
				}
				
			}
		
			if(count >= 2){
				return false;
			}
		}			
		return true;
	}

}
