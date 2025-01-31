package nomalMath1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11005 {

	public static void main(String[] args) throws Exception{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int num = Integer.parseInt(st.nextToken());
			int digit = Integer.parseInt(st.nextToken());
			
			System.out.println(convDigit(num, digit));
		}
		
		static String convDigit(int num, int digit) {
			StringBuilder sb = new StringBuilder(); 
			String result = "";
			String card = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			while(num > 0) {
				int remainder = num % digit;
				sb.append(card.charAt(remainder));
				num /= digit;
			}
			result = sb.reverse().toString();
			return result;
		}
}
