package factor_multiple_primeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ5086 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int numA = -1;
		int numB = -1;
//		System.out.println(numA +", " + numB);
		do {
			st = new StringTokenizer(br.readLine(), " ");
			numA = Integer.parseInt(st.nextToken());
			numB = Integer.parseInt(st.nextToken());
//			System.out.println(numA + ", " + numB);
			if(checkFMN(numA, numB) != null) {
				System.out.println(checkFMN(numA, numB));
			}
		}while(numA != 0 && numB != 0);
		
	}
	
	static String checkFMN(int numA, int numB) {
		if(numA == 0|| numB == 0) return null;
		if(numB % numA == 0) {
			return "factor";
		}else if(numA % numB == 0) {
			return "multiple";
		}else {
			return "neither";
		}
	}
}
