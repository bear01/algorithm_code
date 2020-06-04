package 剑指offer;

public class offer_8 {
	public static TreeLinkNode GetNext(TreeLinkNode  pNode) {
		if (pNode==null) {
			return null;
		}
		TreeLinkNode next = null;
		// 如果该节点有右节点
		if (pNode.M_Right!=null) {
				TreeLinkNode pRight = pNode.M_Right;
				while(pRight.M_Left!=null){
					pRight = pRight.M_Left;
				}
				next = pRight;
		}
		// 如果 该节点没有右节点
		while(pNode.M_Parent!=null){
			if (pNode == pNode.M_Parent.M_Left) {
				next = pNode.M_Parent;
			}
			pNode = pNode.M_Parent;
		}
		return next;
	}
	public static void main(String[] args) {
		TreeLinkNode node1 = new TreeLinkNode(1);
		TreeLinkNode node2 = new TreeLinkNode(2);
		TreeLinkNode node3 = new TreeLinkNode(3);
		TreeLinkNode node4 = new TreeLinkNode(4);
		TreeLinkNode node5 = new TreeLinkNode(5);
		TreeLinkNode node6 = new TreeLinkNode(6);
		node1.M_Left = node2;
		node1.M_Right = node3;
		node2.M_Left = node4;
		node2.M_Parent = node1;
		node3.M_Left = node5;
		node3.M_Right = node6;
		node3.M_Parent = node1;
		TreeLinkNode node = GetNext(node4);
		if (node!=null) {
			System.out.println(node.val);
		}else  System.out.println("不存在");
		
	}
}
class TreeLinkNode{
	public int val;
	public TreeLinkNode M_Left=null;
	public TreeLinkNode M_Right = null;
	public TreeLinkNode M_Parent = null;
	public TreeLinkNode(int val) {
		this.val = val;
	}
	
}