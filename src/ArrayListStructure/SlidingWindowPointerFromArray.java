package ArrayListStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SlidingWindowPointerFromArray {
    static BufferedReader br;
    static StringTokenizer st;
    static char [] dnaArray;
    static int [] checkDnaArray;
    static int [] presentDnaArray;
    static int checkResult;
    static int finalResult;

    static void chkDnaSettingFromArray(int dnaLength, int chkDnaLength) throws Exception{

        dnaArray = new char [dnaLength];
        dnaArray = br.readLine().toCharArray();

        checkDnaArray = new int [4];
        presentDnaArray = new int [4];

        checkResult = 0;
        finalResult = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i< checkDnaArray.length; i++){
            checkDnaArray[i] = Integer.parseInt(st.nextToken());
            if(checkDnaArray[i] == 0) checkResult++;
        }

        for(int i=0; i<chkDnaLength; i++){
            addCheckDnaArray(dnaArray[i]);
        }

        if(checkResult ==4) finalResult++;

        for(int i = chkDnaLength; i < dnaLength; i++){
            int j = i - chkDnaLength;
            addCheckDnaArray(dnaArray[i]);
            removeCheckDnaArray(dnaArray[j]);
            if(checkResult == 4) finalResult++;
        }
        System.out.println(finalResult);
        br.close();


    }

    private static void addCheckDnaArray(char dnaArrayValue) {

        switch(dnaArrayValue){
            case 'A':
                presentDnaArray[0]++;
                if(presentDnaArray[0] == checkDnaArray[0]) checkResult++;
                break;
            case 'C':
                presentDnaArray[1]++;
                if(presentDnaArray[1] == checkDnaArray[1]) checkResult++;
                break;
            case 'G':
                presentDnaArray[2]++;
                if(presentDnaArray[2] == checkDnaArray[2]) checkResult++;
                break;
            case 'T':
                presentDnaArray[3]++;
                if(presentDnaArray[3] == checkDnaArray[3]) checkResult++;
                break;
        }
    }


    private static void removeCheckDnaArray(char dnaArrayValue) {
        switch(dnaArrayValue){
            case 'A':
                if(presentDnaArray[0] == checkDnaArray[0]) checkResult--;
                presentDnaArray[0]--;
                break;
            case 'C' :
                if(presentDnaArray[1] == checkDnaArray[1]) checkResult--;
                presentDnaArray[1]--;
                break;
            case 'G' :
                if(presentDnaArray[2] == checkDnaArray[2]) checkResult--;
                presentDnaArray[2]--;
                break;
            case 'T':
                if(presentDnaArray[3] == checkDnaArray[3]) checkResult--;
                presentDnaArray[3]--;
                break;
        }
    }

    public static void main(String[] args) throws Exception {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int dnaLength =  Integer.parseInt(st.nextToken());
        int checkDnaLength = Integer.parseInt(st.nextToken());

        chkDnaSettingFromArray(dnaLength, checkDnaLength);

    }
}
