package ��ָoffer;

import java.util.Arrays;

public class offer_7 {
// �ؽ�������
	public static TreeNode BinaryTreeNode(int[]preoder,int[] inoder) {
		if(preoder.length<=0||inoder.length<=0) return null;
		//ǰ����� ��һ���ڵ��Ǹ��ڵ�
		TreeNode root = new TreeNode(preoder[0]);
		// ������������ҵ���
		for (int i = 0; i < inoder.length; i++) {
			if (inoder[i] == preoder[0]) {
				// ������
				root.m_Left = BinaryTreeNode(
						Arrays.copyOfRange(preoder, 1, i+1),
						Arrays.copyOfRange(inoder, 0, i));
				// ������
				root.m_Right = BinaryTreeNode(
						Arrays.copyOfRange(preoder, i+1,preoder.length ),
						Arrays.copyOfRange(inoder, i+1, inoder.length));
				break;
			}
		}
		return root;
	}
	public static void main(String[] args) {
		int[] per = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = BinaryTreeNode(per, in);
		System.out.println(root.m_Right.m_vlue);
	}
}
class TreeNode{
	public int m_vlue;
	public TreeNode m_Left=null;
	public TreeNode m_Right=null;
	public TreeNode(int m_vlue) {
		super();
		this.m_vlue = m_vlue;
	}
	
}