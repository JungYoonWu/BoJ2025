package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2750 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numN = Integer.parseInt(br.readLine());
		int numArr[] = new int[numN];
		for(int i = 0; i < numN; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(numArr);
		for(int i = 0; i < numN; i++) {
			System.out.println(numArr[i]);
		}
	}
}
