package stack_queue_deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ4949 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String inStr = null;
		
		while(true) {
			inStr = br.readLine();
			char[] charArr = inStr.toCharArray();
			if(inStr.equals(".")) break;
			if(checkValid(charArr)) {
				sb.append("yes\n");
			}else {
				sb.append("no\n");
			}
		}
		
		System.out.println(sb);
	}
	
	static boolean checkValid(char[] charArr) {
		Stack<Character> stk = new Stack<>();
		for(char inChar : charArr) {
			if(inChar == '(' || inChar == '[') {
				stk.push(inChar);
			}else if(inChar == ')') {
				if(stk.isEmpty()) {return false;}
				if(stk.peek() != '(') {return false;}
				else {
					stk.pop();
				}
			}else if(inChar == ']') {
				if(stk.isEmpty()) {return false;}
				if(stk.peek() != '[') {
					return false;
				}else {
					stk.pop();
				}
			}
		}
		if(!stk.isEmpty()) return false;
		return true;
	}
}
