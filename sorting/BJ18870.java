package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ18870 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numN = Integer.parseInt(br.readLine());
		
		int[] position = new int [numN];
		int[] rankPosition = new int[numN];
		Map<Integer, Integer> rankMap = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < numN; i++) {
			position[i] = rankPosition[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(rankPosition);
		
		int rank = 0;
		for(int val : rankPosition) {
			if(!rankMap.containsKey(val)) {
				rankMap.put(val, rank++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : position) {
			int ranking = rankMap.get(key);
			sb.append(ranking).append(" ");
		}
		
		System.out.println(sb);
	}
}
