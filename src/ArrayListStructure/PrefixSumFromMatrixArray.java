package ArrayListStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSumFromMatrixArray {

    static BufferedReader br ;

    static StringTokenizer st;

    static int[][] standArray;
    static int[][] sumPrefixArray;

    static void makeSumFromArray(int size) throws Exception{

        standArray = new int[size+1][size+1];

        for(int i=1; i<= size; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<= size; j++){
                standArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sumPrefixArray = new int[size+1][size+1];
        for(int i=1; i<= size; i++){
            for(int j=1; j<=size; j++){
                sumPrefixArray[i][j] = sumPrefixArray[i][j-1] + sumPrefixArray[i-1][j] - sumPrefixArray[i-1][j-1] + standArray[i][j];
            }
        }

    }
    static void getPrefixSumFromArray(int count) throws Exception{

        for(int i=0; i< count; i++){
            st = new StringTokenizer(br.readLine());
            int xNumFront = Integer.parseInt(st.nextToken());
            int yNumFront  = Integer.parseInt(st.nextToken());
            int xNumBehind = Integer.parseInt(st.nextToken());
            int yNumBehind = Integer.parseInt(st.nextToken());

            int getResult = sumPrefixArray[xNumBehind][yNumBehind] - sumPrefixArray[xNumFront-1][yNumBehind] - sumPrefixArray[xNumBehind][yNumFront-1]
                    + sumPrefixArray[xNumFront-1][yNumFront-1];

            System.out.println(getResult);

        }
    }
    public static void main(String[] args) throws Exception {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int arraySize = Integer.parseInt(st.nextToken());
        int calCount =  Integer.parseInt(st.nextToken());

        makeSumFromArray(arraySize);
        getPrefixSumFromArray(calCount);





    }
}
