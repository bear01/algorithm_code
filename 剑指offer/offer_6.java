package 剑指offer;

import java.util.Stack;

import javax.sound.midi.Receiver;

public class offer_6{
	public static void main(String[] args){
		SingLeLinkedListDemo singLeLinkedListDemo = new SingLeLinkedListDemo();
		// 添加节点
		singLeLinkedListDemo.addHeroNode(new HeroNode(1, "刘备"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(2, "关羽"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(3, "张飞"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(4, "吕布"));
		singLeLinkedListDemo.addHeroNode(new HeroNode(5, "貂蝉"));
		// 获取头部
		HeroNode head = singLeLinkedListDemo.getHead();		
		// 显示节点
		singLeLinkedListDemo.showLinkedList(head);
		// 从尾到头打印链表 -- 递归
		revers(head.next);
		// 从尾到头打印链表 -- 栈（后进先出）
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
	
	// 头节点用来方便查找
	// 有个方法来获取头节点
	public HeroNode getHead(){
		return head;
	}
	// 添加结点
	public void addHeroNode(HeroNode heroNode){
		//因为head节点是不能动的，因此我们需要一个辅助结点temp
		HeroNode temp = head;
		// 添加数据是从链表的最后添加的
		// 如何确定最后的位置，只能，节点.next这样遍历下去，知道节点.next ==null,就找到位置了
		while(true){
			if(temp.next!=null) temp=temp.next;
			else {
				break;
			}
		}
		temp.next = heroNode;
	}
	// 显示列表
	public void showLinkedList(HeroNode head){
		if(head.next==null){
			System.out.print("空链表");
			return;
		}
		// 因为我们的头结点不能动，所以我们需要一个辅助变量来遍历
		HeroNode temp = head.next;
		while(true){
			if(temp==null) break;
			System.out.println(temp);
			temp = temp.next;
		}
	}
}
//节点
class HeroNode{
	public int id;
	public String name;
	public HeroNode next;
	//构造函数 初始化
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