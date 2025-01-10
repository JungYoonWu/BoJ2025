package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ11650 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numN = Integer.parseInt(br.readLine());
		int position[][] = new int[numN][2];
		StringTokenizer st;
		for(int i = 0; i < numN; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 2; j++) {
				position[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sortPosition(position);
		
		printArr(position);
	}
	
	static void sortPosition(int[][] position) {
		Arrays.sort(position, new Comparator<int[]>() {
			@Override
			public int compare(int[] p1, int[] p2) {
				if(p1[0] == p2[0]) {
					return p1[1] - p2[1];
				}else {
					return p1[0] - p2[0];
				}
			}
		});
	}
	
	static void printArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++	) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
	}
}
