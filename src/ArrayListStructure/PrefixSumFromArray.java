package ArrayListStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrefixSumFromArray {

    /*
        구간합 구하는 과정

        sumFromArray = 합 배열
        prefixSumFromArray = i~j 까지 기준 -> j 까지의 합 - (i-1) 까지의 합

     */
    private static int [] standArray ;

    static int sumFromArray(int length){

        Scanner putNumToArray = new Scanner(System.in);
        standArray = new int [length];

        int sumFromArray = 0;

        for(int i=0; i< standArray.length; i++){
            standArray[i] = putNumToArray.nextInt();
            sumFromArray  += standArray[i];
        }
        return sumFromArray;

    }
    static int prefixSumFromArray(int startNum, int finishNum){

        int prefixStartNumResult = 0;
        int prefixFinishNumResult = 0;
        int prefixSumResult= 0;

        for(int i =0; i<=finishNum-1; i++){
            prefixFinishNumResult += standArray[i];
        }

        for(int i=0; i<=startNum-2; i++){
            prefixStartNumResult += standArray[i];
        }

        prefixSumResult = prefixFinishNumResult - prefixStartNumResult;

        return prefixSumResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        System.out.println(sumFromArray(arrayLength));

        int sumPrefixTime = sc.nextInt();

        for(int i=0; i< sumPrefixTime; i++){

            int startPrefix = sc.nextInt();
            int finishPrefix = sc.nextInt();
            System.out.println(prefixSumFromArray(startPrefix, finishPrefix));
        }
        /*
            int startPrefix = sc.nextInt();
            int finishPrefix = sc.nextInt();
            System.out.println(prefixSumFromArray(startPrefix, finishPrefix));
        */


    }
}
