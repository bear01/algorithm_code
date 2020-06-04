package others;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈超车数量检测〉
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

        //先找到最小值，前面的有多少算多少
        //如果这个最小值不是最后一个的话，那么从这个最小值的后一个开始算起，再去查找最小值，递归
        System.out.println(NumOfCaoChe(in,out));
    }
    public int NumOfCaoChe(List<Integer> in,List<Integer> out){
        int result = FindMinAndGetnums(in, out);
        int sum = 0;
        while(result != out.size()-1){
            sum+=result;
            //继续，截取out的后半段
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
