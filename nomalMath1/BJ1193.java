package nomalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1193 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		int a = 0, b = 0;
		
		while(a < num) {
			b++;
			a += b;
		}
		
		if(b % 2 == 0) {
			System.out.println((b-(a - num)) + "/" + (b+((a - b)-num)+1));
		}else {
			System.out.println((b+((a - b)-num)+1)+"/"+(b-(a - num)));
		}
	}
}
