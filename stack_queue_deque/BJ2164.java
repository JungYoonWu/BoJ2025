package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ2164 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i = 1; i <= num; i++	) {
			que.offer(i);
		}
		
		while(que.size()>1) {
			count++;
			if(count % 2 == 1) {
				que.poll();
			}else {
				que.offer(que.poll());
			}
		}
		System.out.println(que.poll());
	}
}
