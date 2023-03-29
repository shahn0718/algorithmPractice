package ArrayListStructure;

import java.io.*;
import java.util.*;

public class SlidingWindowQueue {

    static class Node{
        private int value;
        private int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<Node> deque = new LinkedList<>();
        for(int i=0; i<N; i++){
            int tmp = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > tmp){
                deque.removeLast();
            }
            deque.addLast(new Node(tmp,i));
            if(deque.getFirst().index <= i-L){
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
}

