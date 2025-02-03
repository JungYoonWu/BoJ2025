package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<Integer>();
		
		int numK = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 0; i < numK; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				stk.pop();
			}else {
				stk.push(num);
			}
			
		}
		
		while(!stk.isEmpty()) {
			sum += stk.pop();
		}
		System.out.println(sum);
	}
}
