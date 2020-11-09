import java.util.Arrays;

public class MissingInteger {

    // BDD
    // Scenario : array K with N integers from 1 to N+1 such that the array has exactly one integer missing
    // Given k = {3,5,4,1}
    // Then the function should return an integer 2

    // SOLUTION
    // Create a method findMissingInteger that takes array K a parameter
    // initialize a local variable missingNum with value of 0, this will hold the value of the number we are looking for
    // initialize a local variable expectedNum with value of 0, this will be the next number in the natural numbers sequence we are expecting after the number in the ith position of the array
    // initialie variable n which is the length of the given array
    // Sort array in Ascending order for more workability
    // Perform a for loop that iterates n number of times
    // Using an if statement, compare the curent and next number in the loop
    // If the next number is not the current sum 1, then we break from the loop, equate it to missingNum variable and return its value
    // If not, we return 0, suggesting there is no missing number in the given array

    static int findMissingInteger(int[] K){
        int missingNum = 0;
        int expectedNextNum = 0;
        int n = K.length;
        Arrays.sort(K);
        for(int i = 0; i < n; i++) {
            expectedNextNum = K[i] + 1;
            if(i < n-1 && expectedNextNum != K[i+1]){
                missingNum = expectedNextNum;
            }
        }
        return missingNum;
    }

    public static void main(String[] args) {
        //tests
        int K[] = {3,5,4,1};
        System.out.println(findMissingInteger(K));
    }

}


