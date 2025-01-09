package factor_multiple_primeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ11653 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		
		int factor = 2;
		
		while(num > 1) {
			if(num % factor == 0) {
				sb.append(factor).append("\n");
				num /= factor;
			}else {
				factor++;
			}
		}
		
		System.out.println(sb);
	}
}
