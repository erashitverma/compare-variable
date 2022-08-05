package com.asverma;

/**
 * @author asverma
 */

public class CompareVersion
{
    public static void main( String[] args )
    {
        System.out.println( "**********  Welcome  ************" );
        System.out.println( "Run test for different test scenarios" );
    }

    public int compareVersion(final String version1, final String version2){

        // using result as I prefer not to have multiple exit in methods // more readable
        int result = 0;
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");
        int version1Length = version1Arr.length;
        int version2Length = version2Arr.length;

        // Iterating over the input for larger length version
        // TODO: Handle Integer overflow while parsing
        for(int i=0; i<Math.max(version1Arr.length,version2Arr.length); i++){

            // checking if i is smaller tha array length if not then assign 0
            // find the difference to determine the larger number
            int difference = (i < version1Length ? Integer.parseInt(version1Arr[i]) : 0) - (i < version2Length ? Integer.parseInt(version2Arr[i]) : 0);
            if (difference !=0 ){
                result = difference > 0 ? 1 : -1;
                break;
            }
        }
        return result;
    }
}