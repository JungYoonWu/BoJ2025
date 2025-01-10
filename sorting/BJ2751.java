package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BJ2751 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numN = Integer.parseInt(br.readLine());
		int numArr[] = new int[numN];
		
		for(int i = 0; i < numN; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(numArr);
		
		for(int i = 0; i < numN; i++) {
			bw.write(numArr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
