import java.util.Arrays;

public class MissingInteger {

    static int findMissingInteger(int[] K){
        int missingNum = 0;
        int n = K.length;
        //sort the array in ascending order
        Arrays.sort(K);
        for(int i = 0; i < n; i++) {
            int expectedNextNum = K[i] + 1;
            if(i < n-1 && expectedNextNum != K[i+1]){
                missingNum = expectedNextNum;
            }
        }
        //returns 0 if there is no missing integer
        return missingNum;
    }

    public static void main(String[] args) {
        //tests
        int K[] = {3,5,4,1};
        System.out.println(findMissingInteger(K));
    }

}


