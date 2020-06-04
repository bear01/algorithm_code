package 剑指offer;

import java.util.Stack;
// 用两个栈实现队列
class Queue{
	// 创建两个栈 ，栈：后进先出
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	// 将元素推入栈一 
	public void push(int node) {
		stack1.push(node);
	}
	// 推出栈一的元素，推入到栈二
	public int pop() {
		if (stack2.empty()) {
			if (stack1.empty()) {
				throw new RuntimeException("队列为空");
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
