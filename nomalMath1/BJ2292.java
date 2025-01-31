package nomalMath1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2292 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		System.out.println(countDistance(num));
	}
	
	static int countDistance(int num) {
		if(num == 1) return 1;
		int cnt = 0;
		
		// 1,  2,   3,     4,    5
		// 1, 2~7, 8~19, 20~37, 38~61, 
		// 1, 6,  , 12,    18,   24
		// 1, An+1 = An + 6n
		for(int i = 1; i < num; i++) {
			
			if(((3*i*i) -3*i + 1) < num && num <=(3*(i+1)*(i+1)) -3*(i+1) + 1 ) {
				cnt = i+1;
				break;
			}
		}
		return cnt;
	}
}
