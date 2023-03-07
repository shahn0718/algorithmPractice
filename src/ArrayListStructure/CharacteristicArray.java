package ArrayListStructure;

public class CharacteristicArray {

    static void StringToCharArray(String strData){

        char[] StrToCharArray = strData.toCharArray();

        System.out.println(StrToCharArray.length);

        for(int i=0; i<= StrToCharArray.length-1; i++){
            System.out.print(StrToCharArray[i]);
        }

        //String K = StrToCharArray.toString();
        //String stringValueOf = String.valueOf(StrToCharArray);
        //String copyValueOf = String.copyValueOf(StrToCharArray);
        //System.out.println(stringValueOf);
        //System.out.println(copyValueOf);

    }

    static void CharToStringArray(){

    }

    static void  IntToStringArray(){

    }

    static void StringToIntArray(){

    }

    public static void main(String[] args) {

        String strData = "Hello Java Spring!";
        int intData = 0;
        StringToCharArray(strData);

    }
}
