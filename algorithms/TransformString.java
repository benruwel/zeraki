import java.util.ArrayList;

public class TransformString {

    // BDD
    // Given a string S of length N
    // Then return a transformed string by reversing characters in groups of four 
    // Example : input = "Lorem ipsum" then output = "meT roppi"

    // SOLUTION
    // Create a method stringTransform that takes string S as a parameter
    // Initialize transformedCharactersArray which is an ArrayList of type Character
    // Initialize charactersArray array of type char, this is the given string broken into an array of its characters
    // Initialize n, length of charactersArray array
    // Initialize extra, this is will hold the number of extra characters after the string is grouped in groups of 4 characters
    // Inititalize variable j, this is the position the of the extra characters in the charactersArray array
    // Perform a for loop n+2 number of types whereby we skip 4 positions front from the ith index after each loop
    // We start performing operations in the 3rd index of the charactersArray array and go backwards to avoid ArrayOutBounds exception
    // Using an if-esle statement we check if the ith index of the array is less than n
    // This together with skipping four positions, allows us to group the characters in groups of four
    // If i < n, we add the ith character in the array to the transformedCharactersArray arraylist
    // We then add (i-1)th, (i-2)th,...,(i-3)th to the arraylist, this keeps the characters in a reversed manner by taking advantage of ArrayList class features
    // In the case where i > n, we add the characters to the arraylist depending on the number of extra characters
    // We get the number of extra characters by subtracting n by (i-3)
    // (i-3) is as result of (i-4)+1
    // We subtract the four positions we skipped and go back to the ith index we were in the previous loop
    // We get the position by adding 1 because 'i' is in index form [0,1,2,..,n]
    // Once we get the number of extra characters we use if statements to check if there is 3,2 or 1 extra characters
    // We then use j as our index reference and start at the (j + "extra-characters")th index and add it to the arraylist
    // After breaking the first foor loop, we instantiate a StringBuilder object and append all the characters from transformedCharactersArray array to it
    // We return this instance as our tranformed string


    static String stringTransform(String S) {
        ArrayList<Character> transformedCharactersArray = new ArrayList<>();
        //convert string to workable array
        char[] charactersArray = S.toCharArray();
        int n =  charactersArray.length;
        int extra;
        int j;
        for(int i = 3; i <= n+2; i=i+4) {
            if(i < n){
                transformedCharactersArray.add(charactersArray[i]);
                transformedCharactersArray.add(charactersArray[i-1]);
                transformedCharactersArray.add(charactersArray[i-2]);
                transformedCharactersArray.add(charactersArray[i-3]);
            } else {
                extra = n - (i-3);
                if(extra == 3) {
                    j = (i-4) + 3;
                    transformedCharactersArray.add(charactersArray[j]);
                    transformedCharactersArray.add(charactersArray[j-1]);
                    transformedCharactersArray.add(charactersArray[j-2]);
                }
                if(extra == 2) {
                    j = (i-4) + 2;
                    transformedCharactersArray.add(charactersArray[j]);
                    transformedCharactersArray.add(charactersArray[j-1]);
                }
                if(extra == 1) {
                    j = (i-4) + 1;
                    transformedCharactersArray.add(charactersArray[j]);
                }
            }
        }
        StringBuilder transformedString = new StringBuilder();
        for (Character c : transformedCharactersArray) {
            transformedString.append(c);
        }
        return transformedString.toString();
    }

    public static void main(String[] args) {
        String test = "Lorem at";
        String test2 = "Tempor ip";
        System.out.println(TransformString.stringTransform(test));
        System.out.println(TransformString.stringTransform(test2));
    }
}

