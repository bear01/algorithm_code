package ��ָoffer;

import java.util.Stack;
// ������ջʵ�ֶ���
class Queue{
	// ��������ջ ��ջ������ȳ�
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	// ��Ԫ������ջһ 
	public void push(int node) {
		stack1.push(node);
	}
	// �Ƴ�ջһ��Ԫ�أ����뵽ջ��
	public int pop() {
		if (stack2.empty()) {
			if (stack1.empty()) {
				throw new RuntimeException("����Ϊ��");
			}
			else {
				while(!stack1.empty()){
					stack2.push(stack1.pop());
				}
			}
		}
		return stack2.pop();
	}
	
}
public class offer_9 {
	
	public static void test() {
		Queue queue = new Queue();
		queue.push(1);
		System.out.println(queue.pop());
		queue.push(2);
		System.out.println(queue.pop());
		queue.push(3);
		System.out.println(queue.pop());
		
		
	}
	public static void main(String[] args) {
		test();
	}
	
}
