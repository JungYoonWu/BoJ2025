package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1436 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(countMovieName(num));
		
	}
	
	static int countMovieName(int num) {
		int count = 0;
		int movieNum = 666;
		while(count != num) {
			if(String.valueOf(movieNum).contains("666")) {
				count++;
			}
			movieNum++;
		}
		return movieNum-1;
	}
}
