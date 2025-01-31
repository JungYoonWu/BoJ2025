package nomalMath1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2903 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(countDot(num));
	}
	static int countDot(int num) {
		int cnt = 0;
		cnt = (((int) Math.pow(2, num)) + 1)*(((int) Math.pow(2, num)) + 1);
		return cnt;
	}
}
