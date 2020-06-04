package ��ָoffer;

import java.util.Stack;

import javax.sound.midi.Receiver;

public class offer_6{
	public static void main(String[] args){
		SingLeLinkedListDemo singLeLinkedListDemo = new SingLeLinkedListDemo();
		// ��ӽڵ�
		singLeLinkedListDemo.addHeroNode(new HeroNode(1, "����"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(2, "����"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(3, "�ŷ�"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(4, "����"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(5, "����"));
		// ��ȡͷ��
		HeroNode head = singLeLinkedListDemo.getHead();		
		// ��ʾ�ڵ�
		singLeLinkedListDemo.showLinkedList(head);
		// ��β��ͷ��ӡ���� -- �ݹ�
		revers(head.next);
		// ��β��ͷ��ӡ���� -- ջ������ȳ���
		stackrevers(head.next);

	}
	public static void revers(HeroNode pNodehead) {
		if(pNodehead.next!=null){
			revers(pNodehead.next);
		}
		System.out.println(pNodehead.id+" "+pNodehead.name);
	}
	public static void stackrevers(HeroNode pHeroNode) {
		Stack<HeroNode> nodes = new Stack<HeroNode>();
		HeroNode hNode = pHeroNode;
		while(hNode!=null){
			nodes.push(hNode);
			hNode=hNode.next;
		}
		while(!nodes.empty()){
			hNode=nodes.pop();
			System.out.println(hNode.id+" "+hNode.name);
		}
	}
}

class SingLeLinkedListDemo{
	private HeroNode head = new HeroNode(0, "");
	
	// ͷ�ڵ������������
	// �и���������ȡͷ�ڵ�
	public HeroNode getHead(){
		return head;
	}
	// ��ӽ��
	public void addHeroNode(HeroNode heroNode){
		//��Ϊhead�ڵ��ǲ��ܶ��ģ����������Ҫһ���������temp
		HeroNode temp = head;
		// ��������Ǵ�����������ӵ�
		// ���ȷ������λ�ã�ֻ�ܣ��ڵ�.next����������ȥ��֪���ڵ�.next ==null,���ҵ�λ����
		while(true){
			if(temp.next!=null) temp=temp.next;
			else {
				break;
			}
		}
		temp.next = heroNode;
	}
	// ��ʾ�б�
	public void showLinkedList(HeroNode head){
		if(head.next==null){
			System.out.print("������");
			return;
		}
		// ��Ϊ���ǵ�ͷ��㲻�ܶ�������������Ҫһ����������������
		HeroNode temp = head.next;
		while(true){
			if(temp==null) break;
			System.out.println(temp);
			temp = temp.next;
		}
	}
}
//�ڵ�
class HeroNode{
	public int id;
	public String name;
	public HeroNode next;
	//���캯�� ��ʼ��
	public HeroNode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "HeroNode [id=" + id + ", name=" + name + "]";
	}
	
}