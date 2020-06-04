package leetcode;

public class code_7 {

	public static void main(String[] args) {
			int x= 1111112499;
	        int absX=Math.abs(x);
	        StringBuffer strX = new StringBuffer(Integer.toString(absX));
	        strX.reverse();
	        int y=0;
	        try{
	        	y=Integer.parseInt(strX.toString());
	        }catch(Exception e){
	        	y=0;
	        } 
	      
	        if(x<0){
	            y=-y;
	        }        
	        System.out.print((int)y);
	  
	}
	

}
