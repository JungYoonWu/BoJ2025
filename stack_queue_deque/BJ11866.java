package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ11866 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que = new LinkedList<Integer>();
		
		int numN = Integer.parseInt(st.nextToken());
		int numK = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for(int i = 1; i <= numN; i++) {
			que.add(i);
		}
		sb.append("<");
		while(que.size()>1	) {
			count++;
			if(count % numK == 0) {
				sb.append(que.poll()).append(", ");
			}else {
				que.add(que.poll());
			}
		}sb.append(que.poll()).append(">");
		System.out.println(sb);
	}
}
