package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1018 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		int paint = Integer.MAX_VALUE;
		
		String [] chess = new String[row];
		
		for(int i = 0; i < row; i++) {
			chess[i]=br.readLine();
		}
		
		for(int i = 0; i <= row - 8; i++) {
			for(int j = 0; j <= col - 8; j++) {
				int tempPaint = countPaint(i, j, chess);
				
				if(tempPaint < paint) {paint = tempPaint;}
			}
		}
		
		System.out.println(paint);
	}
	static int countPaint(int rowCutStart, int colCutStart, String[] chess) {
		String [] boardWB = {"WBWBWBWB", "BWBWBWBW"};
		int white = 0;
		for(int i = 0; i < 8; i++) {
			int row = rowCutStart + i;
			for(int j = 0; j < 8; j++) {
				int col = colCutStart + j;
				if(chess[row].charAt(col) != boardWB[row%2].charAt(j)) {
					white++;
				}
			}
		}
		
		return Math.min(white, 64-white);
	}
}
