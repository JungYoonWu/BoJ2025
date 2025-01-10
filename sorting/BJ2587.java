package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2587 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numArr[] = new int[5];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(findAverage(numArr));
		System.out.println(findMiddleNumber(numArr));
	}
	
	static int findAverage(int[] numArr) {
		int sum = 0;
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		return sum/numArr.length;
	}
	
	static int findMiddleNumber(int[] numArr) {
		Arrays.sort(numArr);
		return numArr[2];
	}
}
