package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ25305 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int numN = Integer.parseInt(st.nextToken());
		int numK = Integer.parseInt(st.nextToken());
		int score[] = new int[numN];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < numN; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(findCutLine(score, numK));
	}
	
	static int findCutLine(int[] numArr, int numK) {
		Arrays.sort(numArr);
		return numArr[numArr.length-numK];
	}
}
