package com.asverma;

/**
 * @author asverma
 */

public class CompareVersion
{
    public int compareVersion(final String version1, final String version2){

        // using result as I prefer not to have multiple exit in methods // more readable
        int result = 0;
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");
        int minLength = Math.min(version1Arr.length,version2Arr.length);
        for(int i=0; i<minLength; i++){
            if(Integer.parseInt(version1Arr[i]) > Integer.parseInt(version2Arr[i])){
                result = 1;
                break;
            } else if (Integer.parseInt(version1Arr[i]) < Integer.parseInt(version2Arr[i])){
                result = -1;
                break;
            }
        }
        return result;
    }
}
