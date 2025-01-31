package nomalMath1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2745 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String cardB = st.nextToken();
		int notation = Integer.parseInt(st.nextToken());
		System.out.println(convDecimal(cardB,notation));

	}
	static int convDecimal(String cardNum, int notation) {
		String card ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int result = 0;
		int power = 1;
		for(int i=cardNum.length()-1; i>=0; i--) {
			char c = cardNum.charAt(i);
			int value = card.indexOf(c);
			result += value*power;
			power *= notation;
		}
		return result;
	}
}
