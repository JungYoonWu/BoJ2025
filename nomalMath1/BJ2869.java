package nomalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());
		int numV = Integer.parseInt(st.nextToken());
		
		int result = (numV - numB)/(numA-numB);
		
		if((numV - numB)%(numA-numB)==0) {
			System.out.println(result);
		}else {
			System.out.println(result+1);
		}
	}

}
