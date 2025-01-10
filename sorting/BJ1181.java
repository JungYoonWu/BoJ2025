package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ1181 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numN = Integer.parseInt(br.readLine());
		String[] arr = new String[numN];
		for(int i = 0; i < numN; i++) {
			arr[i] = br.readLine();
		}
		
		dictionarySort(arr);
		printArr(arr);
	}
	
	static void dictionarySort(String[] arr) {
		Arrays.sort(arr, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length() - s2.length();
				}
			}
		});
	}
	
	static void printArr(String[] arr) {
		System.out.println(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
