package factor_multiple_primeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2581 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int startNum = Integer.parseInt(br.readLine());
		int endNum   = Integer.parseInt(br.readLine());
		int [] info = new int[2];
		info = findPrimeNumberInfo(startNum, endNum, info);
		if(info[0] == 0) {
			System.out.println(-1);
		}else {
			System.out.println(info[0]);
			System.out.println(info[1]);
		}
	}
	
	static int[] findPrimeNumberInfo (int start, int end, int[] info) {
		int sum = 0;
		int minPrime = end;
		
		for(int i = start; i <= end; i++) {
			if(isPrime(i)) {
				sum += i;
				if(i < minPrime) {
					minPrime = i;
				}
			}
		}
		info[0] = sum;
		info[1] = minPrime;
		
		return info;
	}
	
	static boolean isPrime(int number) {
		if(number == 1) return false;
		if(number == 2) return true;
		if(number % 2 == 0) return false;
		
		for(int i = 3; i < number; i+=2) {
			if(number % i == 0) return false;
		}
		return true;
	}
}
