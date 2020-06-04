package 真题.华为;

import java.util.LinkedList;
import java.util.Scanner;


public class huawei_2020_3 {
	  LinkedList<Integer> list = new LinkedList<>();
	    int max = Integer.MIN_VALUE;
	    int i = 0;
	    public static void main(String[] args) {
			new huawei_2020_3();
		}
	    public huawei_2020_3(){
	        Scanner scanner = new Scanner(System.in);
	        String next = scanner.next();
	        char[] chars = next.toCharArray();
	        for (int i1 = 0; i1 < chars.length; i1++) {
	            if(chars[i1]!='('&&chars[i1]!=')'&&chars[i1]!=',') {
	                if (i1==0) {
	                    i = i1;
	                    list.clear();
	                    findmax(chars);
	                }else{
	                    if(chars[i1-1]=='('||chars[i1-1]==','||chars[i1-1] == ')'){
	                        i = i1;
	                        list.clear();
	                        findmax(chars);
	                    }
	                }
	            }
	        }
	        System.out.println(max);
	    }
	    public void findmax(char[] chs){
	        if(chs[i]!='('&&chs[i]!=')'&&chs[i]!=',') {
	            StringBuilder str = new StringBuilder();
	            if(chs[i] == '-'||chs[i]!=')'||chs[i]!=','||chs[i]!='('){
	                if(chs[i] == '-'){ str.append(chs[i]);i++;}
	                while (chs[i]!=')'&&chs[i]!=','&&chs[i]!='('){
	                    str.append(chs[i]);
	                    i++;
	                }
	            }
	            String string = str.toString();
	            if (!"".equals(string))
	                list.add(Integer.parseInt(str.toString()));
	        }
	        if(chs[i] == ','||chs[i] == ')'){
	            int sum = 0;
	            for (Integer integer : list) {
	                sum+=integer;
	            }
	            if (sum>max)
	                max = sum;
	            return;
	        }
	        i++;
	        findmax(chs);
	        list.remove(list.size()-1);
	        if(i<chs.length) {
	            i++;
	            findmax(chs);
	        }
	    }
	//-1(3,2(0,-1(0,3)))
	}

