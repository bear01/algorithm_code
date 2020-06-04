package leetcode;

public class code_169 {
    public static int majorityElement(int[] nums) {
        int len = nums.length;
        int i=0,j=0;
        if(len==1) return nums[0];
        int x=0;
        for(i=0;i<=len;i++){
                if(nums[i]==nums[i+1]){
                    x++;
                    if(x>=len/2) return nums[i];
                    continue;
                }
                for(j=i;j<len-1;j++){
                    if(nums[i]==nums[j+1]) x++;
        
                    if(x>len/2) return nums[i];
                }
                x=0;
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums ={1,2,3,3,3};
			System.out.print(majorityElement(nums));
	}

}
