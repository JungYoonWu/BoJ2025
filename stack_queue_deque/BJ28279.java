package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ28279 {

	static StringBuilder sb = new StringBuilder();
	static Deque<Integer> deque = new LinkedList<Integer>();
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String command = br.readLine();
			dequeMethod(command);
		}
		
		System.out.println(sb);
	}
	
	static void dequeMethod(String command) {
		StringTokenizer st = new StringTokenizer(command," ");
		int result = -1;
		switch(Integer.parseInt(st.nextToken())) {
		case 1:
			deque.addFirst(Integer.parseInt(st.nextToken()));
			break;
		case 2:
			deque.addLast(Integer.parseInt(st.nextToken()));
			break;
		case 3:
			if(deque.isEmpty()) {
				sb.append(result).append('\n');
			}else {
				sb.append(deque.pollFirst()).append('\n');
			}
			break;
		case 4:
			if(deque.isEmpty()) {
				sb.append(result).append('\n');
			}else {
				sb.append(deque.pollLast()).append('\n');
			}
			break;
		case 5:
			sb.append(deque.size()).append('\n');
			break;
		case 6:
			if(deque.isEmpty()) {
				sb.append(1).append('\n');
			}else {
				sb.append(0).append('\n');
			}
			break;
		case 7:
			if(deque.isEmpty()) {
				sb.append(result).append('\n');
			}else {
				sb.append(deque.peekFirst()).append('\n');
			}
			break;
		case 8:
			if(deque.isEmpty()) {
				sb.append(result).append('\n');
			}else {
				sb.append(deque.peekLast()).append('\n');
			}
			break;
		}
	}
}
