package ArrayListStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSumUseBufferFromArray {

    private static int [] standArray ;
    static BufferedReader br;
    static StringTokenizer st;

    static void sumFromArray(int arrLength, int calCount) throws Exception{

        st = new StringTokenizer(br.readLine());
        standArray = new int[arrLength+1];
        for(int i=1; i<=arrLength; i++){
            standArray[i] = standArray[i-1]; Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < calCount; j++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            System.out.println(standArray[j] - standArray[i - 1]);
        }
    }

    public static void main(String[] args) throws Exception{

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int arrLength = Integer.parseInt(st.nextToken());
        int calCount = Integer.parseInt(st.nextToken());

        sumFromArray(arrLength, calCount);

    }
}
