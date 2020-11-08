import java.util.ArrayList;

public class TransformString {

    static String stringTransform(String S) {
        ArrayList<Character> tranformedArray = new ArrayList<>();
        //convert string to workable array
        char[] stringArray = S.toCharArray();
        int n =  stringArray.length;
        for(int i = 3; i < n; i=i+4) {
            tranformedArray.add(stringArray[i]);
            tranformedArray.add(stringArray[i-1]);
            tranformedArray.add(stringArray[i-2]);
            tranformedArray.add(stringArray[i-3]);
        }
        StringBuilder transformedString = new StringBuilder();
        for (Character c : tranformedArray) {
            transformedString.append(c);
        }
        return transformedString.toString();
    }

    public static void main(String[] args) {
        String test = "Lorem ipsuma";
        System.out.println(TransformString.stringTransform(test));
    }
}

