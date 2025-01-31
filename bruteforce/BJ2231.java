package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2231 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int con = findConstructor(num);
		
		System.out.println(con);
	}

	private static int findConstructor(int num) {
		int con = 0;
		for(int i = 1; i < num; i++) {
			int temp = i;
			int sum = i;
			
			while(temp != 0) {
				sum += temp %10;
				temp /= 10;
			}
			
			if(sum == num) {
				con = i;
				break;
			}
		}
		
		return con;
	}
	
	
}
