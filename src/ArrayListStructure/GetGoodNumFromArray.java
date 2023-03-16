package ArrayListStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GetGoodNumFromArray {

    static int [] standArray ;

    static BufferedReader br ;

    static StringTokenizer st;

    static void setNumFromArray(int arrayLength) throws Exception{

        standArray = new int[arrayLength];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i< standArray.length; i++){
            standArray[i] = Integer.parseInt(st.nextToken());
        }

        getGoodNumFromArray();
    }
   /*
    static void getGoodNumFromArray(int arrayInfo){

        int countNum = 0;
        int standardNum =  arrayInfo;

        Arrays.sort(standArray);
        for(int i=0; i<standArray.length; i++){
            for(int j=i+1; j<standArray.length; j++){

                if(standArray[i]>standArray[j]){
                    i++;
                }else if (standArray[i]+standArray[j] == standardNum){
                    countNum=countNum+1;
                }
            }

        }
        System.out.println(countNum);
    }
    */
   static void getGoodNumFromArray() throws Exception{


       Arrays.sort(standArray);
        int countNum = 0;

       for(int i=0; i<standArray.length; i++){
           int startIndex = 0;
           int endIndex = standArray.length-1;

           while(startIndex < endIndex){
               if(standArray[startIndex] + standArray[endIndex] == standArray[i]){
                   if(standArray[startIndex] != standArray[i] && standArray[endIndex] != standArray[i]) {
                       countNum= countNum+1;
                       break;
                   }else if(standArray[startIndex] == i) startIndex++;
                   else if(standArray[endIndex] == i) endIndex--;
               }
               else if(standArray[startIndex] + standArray[endIndex] < standArray[i]){
                   startIndex++;
               }else{
                   endIndex--;
               }
           }

       }
       System.out.println(countNum);
       br.close();
   }

    public static void main(String[] ars) throws Exception {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int setArrayStandard = Integer.parseInt(st.nextToken());
        setNumFromArray(setArrayStandard);



    }
}
