package À„∑®Ã‚;
//—°‘Ò≈≈–Ú
public class selectionSort {
	private static void Sort(int[] arr,int n) {
		int i,j;
		int minIndex,temp;
		for(i=0;i<n-1;i++){
			minIndex=i;
			for(j=i+1;j<n;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
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
