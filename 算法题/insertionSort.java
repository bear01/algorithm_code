package �㷨��;
// ��������
public class insertionSort {
	public static int[] Sort(int[] arr,int n){
		// ��i��Ԫ����ǰ���Ԫ�ؽ��мƽϣ��ҵ���arr[i]С��λ�ã��嵽���档
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			for(;j>=0&&arr[j]>key;j--){
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
			
			
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
