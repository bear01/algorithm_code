package ����.��Ϊ;

import java.util.Scanner;

/**
 * 
 * ��һ������a[N]˳����0~N-1��Ҫ��ÿ��������ɾ��һ��������ĩβʱѭ������ͷ�������У�
�����һ����ɾ��������ԭʼ�±�λ�á�
��8����(N=7)Ϊ��:��0��1��2��3��4��5��6��7����0->1->2(ɾ��)->3->4->5(ɾ��)->6->7->0(ɾ��),���ѭ��ֱ�����һ������ɾ����
��������:
ÿ������Ϊһ��һ������n(С�ڵ���1000)��Ϊ�����Ա��,�������1000�����a[999]���м��㡣
�������:
һ��������һ����ɾ��������ԭʼ�±�λ�á�
��������1:
8
�������1:
6
 * @author bear
 *
 */
class Node{
	public int id;
	public Node next=null;
	public Node(int id) {
		super();
		this.id = id;
	}
	
}

public class huawei_2016_A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=0;
		while(in.hasNext()){
			 N = in.nextInt();
		}
		in.close();
		if(N>1000) N = 1000;
		Node head =new Node(0);
		Node P = head;
		
		for(int i=1;i<N;i++){
			Node temp = new Node(i);
			head.next=temp;
			head = head.next;
		}
		head.next = P;
		while(P!=P.next){
			P.next.next = P.next.next.next;
			P = P.next.next;
		}
		System.out.print(P.id);
	}
}
