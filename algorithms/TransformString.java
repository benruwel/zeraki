import java.util.ArrayList;

public class TransformString {

    static String stringTransform(String S) {
        ArrayList<Character> tranformedArray = new ArrayList<>();
        //convert string to workable array
        char[] stringArray = S.toCharArray();
        int n =  stringArray.length;
        int extra;
        int j;
        for(int i = 3; i <= n; i=i+4) {
            if(i < n){
                tranformedArray.add(stringArray[i]);
                tranformedArray.add(stringArray[i-1]);
                tranformedArray.add(stringArray[i-2]);
                tranformedArray.add(stringArray[i-3]);
            } 
            if(i > n-1) {
                extra = n - (i-3);
                if(extra == 3) {
                    j = (i-4) + 3;
                    tranformedArray.add(stringArray[j]);
                    tranformedArray.add(stringArray[j-1]);
                    tranformedArray.add(stringArray[j-2]);
                }
                if(extra == 2) {
                    j = (i-4) + 2;
                    tranformedArray.add(stringArray[j]);
                    tranformedArray.add(stringArray[j-1]);
                }
                if(extra == 1) {
                    j = (i-4) + 1;
                    tranformedArray.add(stringArray[j]);
                }
            }
        }
        StringBuilder transformedString = new StringBuilder();
        for (Character c : tranformedArray) {
            transformedString.append(c);
        }
        return transformedString.toString();
    }

    public static void main(String[] args) {
        String test = "Lorem ipsum";
        System.out.println(TransformString.stringTransform(test));
    }
}

