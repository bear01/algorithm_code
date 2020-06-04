package Ëã·¨Ìâ;

public class shellSort {
	private static int[] Sort(int[] arr, int n) {
		int gap=n/2;
		for(int i=0;i<1;i++){
			for(int j=0;j<4;j++){
				if(arr[j]>arr[j+gap]){
					int temp=arr[j];
					arr[j]=arr[j+gap];
					arr[j+gap]=temp;
				}
			}
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		int n=arr.length;
		Sort(arr,n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");//2 3 4 5 15 19 26 27 36 38 44 46 47 48 50 
		}

	}
}
