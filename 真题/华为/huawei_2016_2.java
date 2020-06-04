package ����.��Ϊ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * ����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš�
	1�� ��¼���8�������¼��ѭ����¼������ͬ�Ĵ����¼�����ļ����ƺ��к���ȫƥ�䣩ֻ��¼һ��������������ӣ�
	2�� ����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���
	3�� ������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·����
	��������:һ�л�����ַ�����ÿ�а�����·���ļ����ƣ��кţ��Կո������
	�������:�����еļ�¼ͳ�Ʋ�������������ʽ���ļ��� �������� ��Ŀ��һ���ո�������磺
	��������:E:\V1R2\product\fpgadrive.c   1325
	�������:fpgadrive.c 1325 1
	
 * @author WGS
 */
public class huawei_2016_2 {
 
	private static void RecordingErrorLogs(Map<String, Integer> map,String fileLocation,int lineNum) {
		//input[0]�ļ�·��:E:\V1R2\product\fpgadrive.c   input[1]�к�:1325
		//1 ��ȡ�ļ�������������16�Ľ�ȡ
		String[] arr=fileLocation.split("\\\\");//�ֽ⣺>>E:  \\   V1R2 \\  product  \\  fpgadrive.c
		String fileName=arr[arr.length-1];
		if(fileName.length()>16){
			fileName=fileName.substring(fileName.length()-16);
		}
		
		//2  ���ļ�·�����к�����Ϊ�ַ�������Ϊmap��key��ֵ
		String inputStr= fileName +" "+ lineNum;
		
		//3 ��֤������ͬ�Ĵ����¼�����ļ����ƺ��к���ȫƥ�䣩ֻ��¼һ��������������ӣ�
		if(map.containsKey(inputStr)){
			map.put(inputStr,map.get(inputStr)+1);
		}else{
			//û���ظ��ģ�����������Ϊ1
			map.put(inputStr,1);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//����Ҫ��������ʹ��LinkedHashMap
		Map<String, Integer> map=new TreeMap<String, Integer>();
		while(sc.hasNext()){
			String fileLocation=sc.next();
			int lineNum=sc.nextInt();
			//��һ����Ϣ����¼һ��
			RecordingErrorLogs(map,fileLocation,lineNum);
		}
		//����map��key��ֵ�������ļ�+�к���Ϣ�������ǰ������¼��
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1,Entry<String,Integer> o2){
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		int count=0;
		for(int i=0;i<8;i++){
			Entry<String, Integer> s = list.get(i);
			System.out.println(s);//�ļ�·���к�+����
			if(i==list.size()-1)break;
		}
		sc.close();
	}
}