package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ9012 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {
			String inStr = br.readLine();
			char[] charArr = new char[inStr.length()];
			charArr = inStr.toCharArray();
			if(checkValid(charArr)) {
				sb.append("YES\n");
			}else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb);
	}
	
	static boolean checkValid(char[] charArr) {
		
		Stack<Character> charStack = new Stack<Character>();
		for(char inChar : charArr) {
			if(inChar == '(') {
				charStack.push(inChar);
			}else if(inChar == ')'){
				if(charStack.isEmpty()) {
					return false;
				}else if(charStack.peek() != '(') {
					return false;
				}
				charStack.pop();
			}
		}
		if(!charStack.isEmpty()) {return false;}
		return true;
	}
}
