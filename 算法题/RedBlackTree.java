package �㷨��;

public class RedBlackTree {
	private final int R = 0;
	private final int B = 1;
	private Node root = null; // ���ڵ�
	class Node{
		int data; //��ľ�������
		int color = R;
		Node left;
		Node right;
		Node parent;
		public Node (int data){
			this.data =data;
		}
	}
	//���벿��
	public void insert(Node root,int data){ //root���һ����Ϊ�գ��ʼ��Ĭ�Ͻ�ȥ��
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
	//����
	public void leftRotate(Node node) {
		if(node.parent == null){ //��ʾ�ý���Ǹ����
			Node E = root;
			Node S = E.right;
			//��S��������
			E.right = S.left;
			S.left.parent = E;
			
			//�޸�E��ָ��
			E.parent = S;
			
			//�޸�S��ָ��
			S.parent = null;
			
		}
	}
}
