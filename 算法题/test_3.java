package �㷨��;

public class test_3 {
//   ����뾶���Բ��ͼ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			    int r=100;
			    double x;
			    for(int y=r;y>=(-r);y-=3)
			    {
			        x = Math.round(Math.sqrt(r * r - y * y));
			        for(int i=0;i<=(2*r);i++) {
			            if (i == (r - x) || i == (r + x)) {
			                System.out.print("*");
			            } else {
			                System.out.print(" ");
			            }
			        }
			        System.out.println();
			    }
	}

}
