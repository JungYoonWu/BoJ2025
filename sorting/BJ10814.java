package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ10814 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numN = Integer.parseInt(br.readLine());
		String[][] memberInfo = new String[numN][3];
		StringTokenizer st;
		
		for(int i = 0; i < numN; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 3; j++) {
				if(st.hasMoreTokens()) {
					memberInfo[i][j] = st.nextToken();					
				}else {
					memberInfo[i][j] = String.valueOf(i);
				}

			}
		}
		
		sort(memberInfo);
		printArr(memberInfo);
	}
	
	static void sort(String[][]arr) {
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				if(Integer.parseInt(s1[0]) == Integer.parseInt(s2[0])) {
					return Integer.parseInt(s1[2]) - Integer.parseInt(s2[2]); 
				}else {
					return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				}
			}
		});
	}
	
	static void printArr(String[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
	}
}
