package leetcode;

import java.util.ArrayList;
/**
 * ����һ�������б���������� word1 �� word2�������б�������������֮�����̾��롣

ʾ��:
���� words = ["practice", "makes", "perfect", "coding", "makes"]

����: word1 = ��coding��, word2 = ��practice��
���: 3
����: word1 = "makes", word2 = "coding"
���: 1

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/shortest-word-distance
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 * @author bear
 *
 */
public class code_243 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"a", "c", "b", "a"};
		String word1 = "a";
		String word2 = "b";
		System.out.print(shortestDistance(words,word1,word2));
	}
	  public static int shortestDistance(String[] words, String word1, String word2) {
		   ArrayList<Integer> list1 = new ArrayList<Integer>();
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	        int min = 0;
	        for(int i=0;i<words.length;i++){
	            if(words[i].equals(word1)) list1.add(i);
	            if(words[i].equals(word2)) list2.add(i);          
	        }
	        int i=0,j=0;
	        int len1 = list1.size();
	        int len2 = list2.size();
	        min = Math.abs(list1.get(0)-list2.get(0));
	        while(i<len1){
	            int x = list1.get(i);
	            while(j<len2){
	                int y =list2.get(j);
	                if(Math.abs(x-y)<min){
	                    min = Math.abs(x-y);
	                }        
	                j++;
	            } 
	            i++;
	            j=0;
	        }
	       
	        return min;
	    }

}
