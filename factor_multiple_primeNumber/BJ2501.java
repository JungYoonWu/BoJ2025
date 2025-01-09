package factor_multiple_primeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2501 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int numN = Integer.parseInt(st.nextToken());
		int numK = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int numArr[] = new int[numK];
		for(int i = 1; i <= numN; i++) {
			if(numN % i == 0) {
				numArr[count] = i;
				count++;
			}
			if(numK == count) {
				break;
			}
		}
		if(numK == count) {
			System.out.println(numArr[--count]);
		}else {
			System.out.println(0);
		}
	}
}
