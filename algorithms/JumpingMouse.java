public class JumpingMouse {

    // BDD 
    // Given an input of 21 feetwide as an integer
    // Then the method mouseJumpingWays() should return a string "There are this many ways : 55"

    // SOLUTION
    // This problem describes the Fibonacci series
    // Example
    // First step = number of ways to get there is: one 1-step
    // Second step = number of ways to get there is: one 2-step OR two 1-step
    // Third step = number of ways to get there is: one 2-step and one 1-step OR vice-verse OR three 1-step
    // The number of steps to get to the third step is the sum of the number of ways to get to the first
    // and second step

    static int mouseJumpingWays(int feetWide) {
        int numOfDifferentWays = 0;
        int j= 0;
        int k = 1;
        while(j <= feetWide) {
            numOfDifferentWays = j + k;
            j = k;
            k = numOfDifferentWays;
        }
        return numOfDifferentWays;
    }

    public static void main(String[] args) {
        int feetWide = 21;
        //Given a river this feet wide 
        System.out.println(String.format("There are this many ways : %s", JumpingMouse.mouseJumpingWays(feetWide)));
    }
}
