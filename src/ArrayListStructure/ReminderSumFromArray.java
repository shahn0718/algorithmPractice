package ArrayListStructure;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReminderSumFromArray {

    static BufferedReader br;
    static StringTokenizer st;

    static int [] standSumArray ;
    static int [] reminderCountArray;

    static int result;

    static void doSumFromArray(int arrLength, int reminderStd) throws Exception{

        standSumArray = new int [arrLength+1];
        reminderCountArray = new int [reminderStd];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<  arrLength+1 ; i++){
            standSumArray[i] = (standSumArray[i-1] + Integer.parseInt(st.nextToken())) % reminderStd;
            //1) 배열의 나머지가 0인 경우 찾기.
            if(standSumArray[i] == 0) {result++;}

            //나머지(Reminder) 같은 인덱스 수 카운팅
            reminderCountArray[standSumArray[i]]++;
        }
    }
    static void doReminderCountFromArray(int reminderStd){

        for(int i=0; i< reminderStd; i++){
            if(reminderCountArray[i] > 1){
              result = result + (reminderCountArray[i] * (reminderCountArray[i]-1) / 2);
            }
        }
        System.out.println(result);
    }



    public static void main(String[] args) throws Exception {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int arrayLength = Integer.parseInt(st.nextToken());
        int reminderStd = Integer.parseInt(st.nextToken());

        doSumFromArray(arrayLength, reminderStd);
        doReminderCountFromArray(reminderStd);
    }
}
