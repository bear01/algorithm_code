package 算法题;

public class RedBlackTree {
	private final int R = 0;
	private final int B = 1;
	private Node root = null; // 根节点
	class Node{
		int data; //存的具体数字
		int color = R;
		Node left;
		Node right;
		Node parent;
		public Node (int data){
			this.data =data;
		}
	}
	//插入部分
	public void insert(Node root,int data){ //root结点一定不为空，最开始就默认进去了
		if(root.data<data){
			if(root.right==null){
				root.right=new Node(data);
			}else{
				insert(root.right, data);
			}
		}else{
			if(root.left==null){
				root.left=new Node(data);
			}else{
				insert(root.left, data);
			}
		}
	}
	//左旋
	public void leftRotate(Node node) {
		if(node.parent == null){ //表示该结点是根结点
			Node E = root;
			Node S = E.right;
			//移S的左子树
			E.right = S.left;
			S.left.parent = E;
			
			//修改E的指针
			E.parent = S;
			
			//修改S的指针
			S.parent = null;
			
		}
	}
}
