package factor_multiple_primeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1978 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numN = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int numArr[] = new int[numN];
		
		int count = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			if(checkPrimeNumber(Integer.parseInt(st.nextToken()))) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static boolean checkPrimeNumber(int number) {
		if(number == 1) return false;
		if(number == 2) return true;
		if(number % 2 == 0) return false;
		
		for(int i = 3; i < number; i+=2) {
			if(number % i == 0) return false;
		}
		return true;
	}
}
