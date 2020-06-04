package leetcode;

import java.util.ArrayList;
/**
 * 给定一个单词列表和两个单词 word1 和 word2，返回列表中这两个单词之间的最短距离。

示例:
假设 words = ["practice", "makes", "perfect", "coding", "makes"]

输入: word1 = “coding”, word2 = “practice”
输出: 3
输入: word1 = "makes", word2 = "coding"
输出: 1

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shortest-word-distance
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
