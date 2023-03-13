package ArrayListStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReminderSumSortFromArray {
    /**
     *  1. 그냥 배열로 해보기
     *  2. 정렬하여 해보기
     */

    static int[] standArray ;

    static BufferedReader br;
    static StringTokenizer st;

    static void makeArrayFromLength(int numOfLength, int sumOfArray) throws Exception{

        st = new StringTokenizer(br.readLine());
        standArray = new int [numOfLength];
        for(int i=0; i< standArray.length; i++){
            standArray[i] = Integer.parseInt(st.nextToken());
        }

        //checkSumFromArray(sumOfArray);
        checkSumFromSortArray(sumOfArray);

    }
    static void checkSumFromArray(int sumOfStandard){

        int countNum=0;

        for(int i=0; i<standArray.length; i++){

            if(standArray[i] > sumOfStandard) i++;
            for(int j=i+1; j<standArray.length; j++){
                if(standArray[i]+standArray[j] == sumOfStandard){
                    countNum = countNum+1;
                }

            }
        }
    }

    static void checkSumFromSortArray(int sumOfStandard){

        Arrays.sort(standArray);

        int startIndex = 0 ;
        int endIndex = standArray.length-1;
        int countNum = 0;

        for(int i=0; i<standArray.length; i++){

            if(startIndex > endIndex) {
                System.out.print(countNum);
                return;
            }

            if(standArray[startIndex] + standArray[endIndex] < sumOfStandard){
                startIndex = startIndex + 1;
            }else if(standArray[startIndex] + standArray[endIndex] > sumOfStandard){
                endIndex = endIndex -1;
            }else{
                countNum = countNum+1;
                startIndex = startIndex + 1;
                endIndex = endIndex -1;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int lengthOfArray = Integer.parseInt(st.nextToken());
        int sumOfStandard = Integer.parseInt(st.nextToken());


        makeArrayFromLength(lengthOfArray,sumOfStandard);
    }
}
