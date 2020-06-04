package 真题.华为;

import java.util.Scanner;

/**
 * 
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，
求最后一个被删掉的数的原始下标位置。
以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
输入描述:
每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。
输出描述:
一行输出最后一个被删掉的数的原始下标位置。
输入例子1:
8
输出例子1:
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
