package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ18258 {
	
	static Queue<Integer> que = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	static int last = -1;

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			queMethod(br.readLine());
		}
		System.out.println(sb);
	}
	static int queMethod(String commend) {
		StringTokenizer st = new StringTokenizer(commend, " ");
		int result = 0;
		switch(st.nextToken()) {
		case "push":
			result = Integer.parseInt(st.nextToken());
			last = result;
			que.add(result);
			break;
		case "pop": 
			if(que.isEmpty()) {
				result = -1;
				sb.append(result).append("\n");
			}else {
				result = que.poll();
				sb.append(result).append("\n");
			}
			break;
		case "size":
			result = que.size();
			sb.append(result).append("\n");
			break;
		case "empty":
			if(que.isEmpty()) {
				result = 1;
				sb.append(result).append("\n");
			}else {
				result = 0;
				sb.append(result).append("\n");
			}
			break;
		case "front":
			if(que.isEmpty()) {
				result = -1;
				sb.append(result).append("\n");
			}else {
				result = que.peek();
				sb.append(result).append("\n");
			}
			break;
		case "back":
			if(que.isEmpty()) {
				result = -1;
				sb.append(result).append("\n");
			}else {
				sb.append(last).append("\n");
			}
			break;
		}
		return result;
	}
}

