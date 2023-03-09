package ArrayListStructure;

import java.util.Scanner;

public class SumFromArray {

    /*
        N개의 숫자가 공백없이 써있다. 숫자를 모두 합하는 프로그램을 작성하시오
        첫번째, 숫자의 갯수
        두번째, 공백없이 주어진 N개의 갯수 -> 공백 없이**
     */

    static int standArray(String arrayData){

        char[] sumFromArray = arrayData.toCharArray();

        int arraySumResult = 0;

        for(int i=0; i<sumFromArray.length; i++) {
            arraySumResult += sumFromArray[i] - '0';
        }

        return arraySumResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String arrayData = sc.next();
        System.out.println(standArray(arrayData));

    }
}
