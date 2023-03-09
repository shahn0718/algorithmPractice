package ArrayListStructure;

import java.util.Scanner;

public class AverageFromArray {
    /*
        점수 중 최댓값을 고른다.
        M 이라고 가정할때, 모든 점수 -> 점수/M*100
        새로운 평균을 구하는 프로그램을 작성
        입력 = 시험을 본 과목 갯수
               갯수 관련 시험점수
     */

    static long getMaxFromScore(int kindTest){

        Scanner putDataInArray= new Scanner(System.in);

        long [] scoreArray = new long[kindTest];
        long maxScore = 0;
        long sumScore = 0;

        for(int i=0; i<scoreArray.length; i++){

            scoreArray[i] = putDataInArray.nextInt();

            if(maxScore < scoreArray[i]) maxScore = scoreArray[i];
            sumScore += scoreArray[i];
        }
        return getAverageFromScore(maxScore,sumScore, kindTest);
    }

    static long getAverageFromScore(long max, long sum, long kind){

        long average = (long) (sum * 100.0 / max / kind);

        return average;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int kindTest = sc.nextInt();
        System.out.println(getMaxFromScore(kindTest));
    }
}
