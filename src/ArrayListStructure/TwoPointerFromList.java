package ArrayListStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoPointerFromList {

    static List<Integer> makePointerList = new ArrayList<>();
     static void getNumMakeList(int getNum){

         makePointerList = new ArrayList<>();
         for(int i=1; i<=getNum; i++){
             makePointerList.add(i-1,i);
         }

         getCountMakeSumUseList(getNum);

     }

     static void getCountMakeSumUseList(int setNum){

         int startIndex= 1;
         int endIndex = 1;
         int countIndex=1;
         int indexOfSum= 1;
         //우선 while 문 대신에 작성해보기
         for(int i=1; i<=setNum; i++){
            if(indexOfSum == setNum){
                countIndex = countIndex + 1;
                endIndex = endIndex + 1;
                indexOfSum = indexOfSum + makePointerList.get(endIndex-1);
            }else if(indexOfSum > setNum){
                indexOfSum = indexOfSum - makePointerList.get(startIndex-1);
                startIndex = startIndex + 1;
            }else{
                endIndex = endIndex + 1;
                indexOfSum = indexOfSum + makePointerList.get(endIndex-1);
            }
         }
         System.out.println(countIndex);

     }

     static void getCountMakeSumUseWhile(int setNum){
         int startIndex= 1;
         int endIndex = 1;
         int countIndex=1;
         int indexOfSum= 1;

         while(endIndex != setNum){
             if(indexOfSum == setNum){
                 countIndex++;
                 endIndex++;
                 indexOfSum = indexOfSum + endIndex;
             }else if(indexOfSum > setNum){
                 indexOfSum = indexOfSum - startIndex;
                 startIndex++;
             }else{
                 endIndex++;
                 indexOfSum = indexOfSum + endIndex;
             }
         }
         System.out.println(countIndex);
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setNum = sc.nextInt();
        //getNumMakeList(setNum);
        getCountMakeSumUseWhile(setNum);
    }
}
