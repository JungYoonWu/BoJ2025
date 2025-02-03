package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ28278 {

	static Stack<Integer> stk = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			stackMethod(br.readLine());
		}
		System.out.println(sb);
	}
	
	static void stackMethod(String command) {
		StringTokenizer st = new StringTokenizer(command, " ");
		int result = 0;
		switch(Integer.parseInt(st.nextToken())) {
		case 1:
			result = Integer.parseInt(st.nextToken());
			stk.push(result);
			break;
		case 2:
			if(stk.isEmpty()) {
				sb.append(-1).append("\n");
			}else {
				result = stk.pop();
				sb.append(result).append("\n");
			}
			break;
		case 3:
			result = stk.size();
			sb.append(result).append("\n");
			break;
		case 4:
			if(stk.isEmpty()) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
			break;
		case 5:
			if(stk.isEmpty()) {
				sb.append(-1).append("\n");
			}else {
				result = stk.peek();
				sb.append(result).append("\n");
			}
			break;
		}
	}
}
