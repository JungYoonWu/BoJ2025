package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ2346 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
		Deque<int[]> deque = new ArrayDeque<int[]>();

		
		for(int i = 0; i < num; i++) {
			deque.add(new int[] {i+1, Integer.parseInt(st.nextToken())});
		}
		
		while(!deque.isEmpty()) {
			int [] current = deque.pollFirst();
			sb.append(current[0]).append(" ");
			int move = current[1];
			
			if(deque.isEmpty()) break;
			
			if(move > 0) {
				for(int i = 0; i < move -1; i++) {
					deque.addLast(deque.pollFirst());
				}
			}else {
				for(int i = 0; i < Math.abs(move); i++) {
					deque.addFirst(deque.pollLast());
				}
			}
		}
		
		System.out.println(sb);
	}
}
