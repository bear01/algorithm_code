package others;

import javax.sound.midi.Receiver;

public class SingleLinkedList {
	public static void main(String[] args){
		SingLeLinkedListDemo singLeLinkedListDemo = new SingLeLinkedListDemo();
		//创建节点
		HeroNode node1 = new HeroNode(1, "刘备");
		HeroNode node2 = new HeroNode(2, "关羽");
		HeroNode node3 = new HeroNode(3, "张飞");
		HeroNode node4 = new HeroNode(4, "吕布");
		HeroNode node5 = new HeroNode(5, "貂蝉");
		// 添加节点
		singLeLinkedListDemo.addHeroNode(node1);
		singLeLinkedListDemo.addHeroNode(node2);
		singLeLinkedListDemo.addHeroNode(node3);
		singLeLinkedListDemo.addHeroNode(node4);
		singLeLinkedListDemo.addHeroNode(node5);
		HeroNode head = singLeLinkedListDemo.getHead();
		revers(head.next);
		//显示节点
//		singLeLinkedListDemo.showLinkedList(singLeLinkedListDemo.getHead());
//		System.out.println("--------------------------");
//		//修改节点 如貂蝉改为西施
//		singLeLinkedListDemo.updataLinkedList(new HeroNode(5, "西施"));
//		singLeLinkedListDemo.showLinkedList(singLeLinkedListDemo.getHead());
//		System.out.println("--------------------------");
//		//删除节点 如删除id = 5的节点
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
	// 1刘备->2关羽->3张飞
	// if(temp.id ==heroNode.id) temp.name = heroNode.name
	// 修改链表节点数据
	public void updataLinkedList(HeroNode heroNode){	
		// 判断链表是否为空
		if(head.next == null){
			System.out.println("链表为空");
			return;
		}
		// 定义一个辅助节点
		HeroNode temp = head.next;
		boolean flag = false;
		//是否找到对应节点
		while(true){
			// 如果找到
			if(temp.id == heroNode.id){
				flag =true;
				break;
			}
			//防止空指针
			if(temp.next==null){
				break;
			}
			temp = temp.next;
		}
		if(flag){
			temp.name = heroNode.name;
		}else{
			System.out.println("没有找到id为" + heroNode.id);
		}
	}
	// 删除节点
	public void delLinkedList(int id){
		HeroNode temp = head;
		boolean flag = false;
		while(true){
			if(temp.next==null){
				break;
			}
			// 找到
			if(temp.next.id==id){
				flag = true;
				break;
			}
			temp=temp.next;
		}
		if(flag){
			temp.next = temp.next.next;
		}else {
			System.out.println("没有找到id为" + id);
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