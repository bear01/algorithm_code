package others;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ��һ�仰���ܼ�����<br> 
 * ������������⡵
 *
 * @author Administrator
 * @create 2020/05/14
 * @since 1.0.0
 */
public class sianfatest {
    public sianfatest(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        List<Integer> in = new ArrayList<>(),out = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            in.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            out.add(sc.nextInt());
        }

        //���ҵ���Сֵ��ǰ����ж��������
        //��������Сֵ�������һ���Ļ�����ô�������Сֵ�ĺ�һ����ʼ������ȥ������Сֵ���ݹ�
        System.out.println(NumOfCaoChe(in,out));
    }
    public int NumOfCaoChe(List<Integer> in,List<Integer> out){
        int result = FindMinAndGetnums(in, out);
        int sum = 0;
        while(result != out.size()-1){
            sum+=result;
            //��������ȡout�ĺ���
            out = out.subList(result+1,out.size());
            result = FindMinAndGetnums(in, out);
        }
        sum+=result;
        return sum;
    }
    public int FindMinAndGetnums(List<Integer> in,List<Integer> out){
        int min = in.size()+1;
        int k = 0;
        for (Integer integer : out) {
            int i = in.indexOf(integer);
            if (i<min){
                min = i;
                k = out.indexOf(integer);
            }
        }
        return k;
    }
    public static void main(String[] args) {
        new sianfatest();
    }
}
