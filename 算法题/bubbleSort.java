package À„∑®Ã‚;
//√∞≈›≈≈–Ú
public class bubbleSort {
	public static int[] bubble_Sort(int[] arr){
		int i,j;
		int x=0;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int max=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=max;
					x++;
				}
			}
		}	
		System.out.println(x);
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 ={1,3,2,4};
		int[] arr2 ={4,3,2,1};
		bubble_Sort(arr1);
		bubble_Sort(arr2);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}

}
