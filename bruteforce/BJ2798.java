package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2798 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int [] card = new int[num];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < num; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(blackjack(card, score));
	}
	static int blackjack(int[] card	, int score) {
		int sum = 0;
		for(int i = 0; i < card.length-2; i++) {
			for(int j = i+1; j < card.length-1; j++) {
				for(int k = j+1; k < card.length; k++) {
					int temp = card[i] + card[j] + card[k];
					if(temp <= score && temp > sum) {
						sum = temp;
					}
					
				}
			}
		}
		return sum;
		
	}
}
