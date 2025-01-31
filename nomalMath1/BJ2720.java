package nomalMath1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2720 {
	public static void main(String[] args) throws Exception{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int num = Integer.parseInt(br.readLine());
	
			for(int i = 0; i < num; i++) {
				int quaterCnt = 0;
				int dimeCnt = 0;
				int nickelCnt = 0;
				int pennyCnt = 0;
				int money = Integer.parseInt(br.readLine());
				quaterCnt = (money / 25);
				money %= 25;
				dimeCnt = (money / 10);
				money %= 10;
				nickelCnt = (money / 5);
				money %= 5;
				pennyCnt = (money / 1);
				sb.append(quaterCnt).append(' ').append(dimeCnt).append(' ').append(nickelCnt).append(' ').append(pennyCnt).append('\n');
			}
			
			System.out.println(sb);
		}
}
