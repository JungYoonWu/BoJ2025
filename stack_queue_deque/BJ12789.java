package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ12789 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
//		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		
		int [] orderArr = new int [N];
		int orderNum = 1;
		//시작 배치 queue로 입력
		for(int i = 1; i <= N; i++) {
			queue.offer(Integer.parseInt(st.nextToken()));
		}
		
		//queue의 값이 다 빠질때까지 반복
		while(!queue.isEmpty()) {
			//orderNum 과 queue의 front값이 같다면 poll하고 orderNum을 1증가
			if(orderNum == queue.peek()) {
				queue.poll();
				orderNum++;
			}
			//stack에 값이 있고 그 값이 orderNum과 같다면 stack에서 그 값을 pop하고 orderNum을 1증가
			else if(!stack.isEmpty() && stack.peek()==orderNum) {
				stack.pop();
				orderNum++;
			}
			//orderNum과 queue의 front값과 stack의 top값이 같지 않다면 queue에서poll한 값을 
			//stack에 push
			else {
				stack.push(queue.poll());
			}
		}
		
		//stack이 orderNum과 같을때 pop해서 비워지는지 확인
		while(!stack.isEmpty()) {
			//stack의 top값이 orderNum과 같은지 확인
			if(stack.peek()==orderNum) {
				stack.pop();
				orderNum++;
			}else {
				break;
			}
		}
		
		if(stack.isEmpty()) {
			System.out.print("Nice");
		}else {
			System.out.print("Sad");
		}

	}

}
