import java.util.Arrays;

public class MissingInteger {

    static int findMissingInteger(int[] K){
        int missingNum;
        int n = K.length;
        //sort the array in ascending order
        Arrays.sort(K);
        for(int i = 0; i < n; i++) {
            int expectedNextNum = K[i] + 1;
            if(i < n-1 && expectedNextNum != K[i+1]){
                return expectedNextNum;
            }
        }
        //return 0 if there is no missing integer
        return 0;
    }

    public static void main(String[] args) {
        //tests
        int K[] = {3,2,4,1};
        System.out.println(findMissingInteger(K));
    }

}


