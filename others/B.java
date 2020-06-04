package others;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i;
		outer:for(n=100;n<=200;n++){
			for( i=2;i<Math.sqrt(n);){
				if(n%i==0){
					continue outer;
				}else i=i+1;	
			}
		    System.out.print(n);
			
		}
	}

}
