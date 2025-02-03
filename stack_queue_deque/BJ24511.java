package stack_queue_deque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ24511 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 배열의 크기 입력
        int[] structureArr = new int[N]; // 배열 선언

        Deque<Integer> deque = new LinkedList<>(); //덱

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < structureArr.length; i++) {
            structureArr[i] = Integer.parseInt(st.nextToken()); // 배열 값 입력
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < structureArr.length; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (structureArr[i] == 0) {
                deque.addLast(num); // 배열 값이 0일 경우 deque에 추가
            }
        }

        dequeOper(br, bw, deque);

        br.close(); 
        bw.close(); 
    }

    
     static void dequeOper(BufferedReader br, BufferedWriter bw, Deque<Integer> deque) throws IOException {
        int M = Integer.parseInt(br.readLine()); // 추가되는 수가 몇개인지
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            deque.addFirst(Integer.parseInt(st.nextToken())); // deque 맨앞에 추가
            bw.write(deque.pollLast() + " "); // deque에서 마지막 값 poll 하고 write
        }
        bw.flush(); // 출력
    }
}
