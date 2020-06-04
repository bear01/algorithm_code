package others;

import javax.sound.midi.Receiver;

public class SingleLinkedList {
	public static void main(String[] args){
		SingLeLinkedListDemo singLeLinkedListDemo = new SingLeLinkedListDemo();
		//�����ڵ�
		HeroNode node1 = new HeroNode(1, "����");
		HeroNode node2 = new HeroNode(2, "����");
		HeroNode node3 = new HeroNode(3, "�ŷ�");
		HeroNode node4 = new HeroNode(4, "����");
		HeroNode node5 = new HeroNode(5, "����");
		// ��ӽڵ�
		singLeLinkedListDemo.addHeroNode(node1);
		singLeLinkedListDemo.addHeroNode(node2);
		singLeLinkedListDemo.addHeroNode(node3);
		singLeLinkedListDemo.addHeroNode(node4);
		singLeLinkedListDemo.addHeroNode(node5);
		HeroNode head = singLeLinkedListDemo.getHead();
		revers(head.next);
		//��ʾ�ڵ�
//		singLeLinkedListDemo.showLinkedList(singLeLinkedListDemo.getHead());
//		System.out.println("--------------------------");
//		//�޸Ľڵ� ��������Ϊ��ʩ
//		singLeLinkedListDemo.updataLinkedList(new HeroNode(5, "��ʩ"));
//		singLeLinkedListDemo.showLinkedList(singLeLinkedListDemo.getHead());
//		System.out.println("--------------------------");
//		//ɾ���ڵ� ��ɾ��id = 5�Ľڵ�
//		singLeLinkedListDemo.delLinkedList(1);
//		singLeLinkedListDemo.showLinkedList(singLeLinkedListDemo.getHead());
	}
	public static void revers(HeroNode pNodehead) {
		if(pNodehead.next!=null){
			revers(pNodehead.next);
		}
		System.out.println(pNodehead.id+" "+pNodehead.name);
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
	// 1����->2����->3�ŷ�
	// if(temp.id ==heroNode.id) temp.name = heroNode.name
	// �޸�����ڵ�����
	public void updataLinkedList(HeroNode heroNode){	
		// �ж������Ƿ�Ϊ��
		if(head.next == null){
			System.out.println("����Ϊ��");
			return;
		}
		// ����һ�������ڵ�
		HeroNode temp = head.next;
		boolean flag = false;
		//�Ƿ��ҵ���Ӧ�ڵ�
		while(true){
			// ����ҵ�
			if(temp.id == heroNode.id){
				flag =true;
				break;
			}
			//��ֹ��ָ��
			if(temp.next==null){
				break;
			}
			temp = temp.next;
		}
		if(flag){
			temp.name = heroNode.name;
		}else{
			System.out.println("û���ҵ�idΪ" + heroNode.id);
		}
	}
	// ɾ���ڵ�
	public void delLinkedList(int id){
		HeroNode temp = head;
		boolean flag = false;
		while(true){
			if(temp.next==null){
				break;
			}
			// �ҵ�
			if(temp.next.id==id){
				flag = true;
				break;
			}
			temp=temp.next;
		}
		if(flag){
			temp.next = temp.next.next;
		}else {
			System.out.println("û���ҵ�idΪ" + id);
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