package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ1427 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String numStr = num + "";
		int arrLen = numStr.length();
		int numArr[] = makeNumArr(arrLen, num, br);
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[numArr.length-1-i]);
		}
	}
	
	static int[] makeNumArr(int arrLen, int num, BufferedReader br) throws Exception{
		int numArr[] = new int[arrLen];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = num%10;
			num /= 10;
		}
		
		Arrays.sort(numArr);
		
		return numArr;
	}
}
