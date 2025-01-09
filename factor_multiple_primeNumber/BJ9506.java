package factor_multiple_primeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ9506 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		while(num != -1) {
			num = Integer.parseInt(br.readLine());
			if(num == -1) return;
			int numArr[] = new int[num+2];
			int index = 0;
			if(checkPerfectNum(num, numArr) != 0) {
				index = checkPerfectNum(num, numArr);
				System.out.print(num + " = ");
				for(int i = 0; i < index-1; i++) {
					System.out.print(numArr[i] + " + ");
				}System.out.println(numArr[--index]);
			}else {
				System.out.println(num + " is NOT perfect.");
			}
		}
	}
	
	static int checkPerfectNum(int num, int[] numArr) {
		int divisorSum=0;
		int index=0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				divisorSum += i;
				numArr[index++] = i;
			}
		}
		if(num == divisorSum) {
			return index;
		}else {
			return 0;
		}
	}
}
