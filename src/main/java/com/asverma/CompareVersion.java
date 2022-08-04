package com.asverma;

/**
 * @author asverma
 */

public class CompareVersion
{
    public int compareVersion(final String version1, final String version2){

        // using result as I prefer not to have multiple exit in methods // more readable
        int result = 0;
        if(Integer.parseInt(version1) > Integer.parseInt(version2)){
            result = 1;
        } else if (Integer.parseInt(version1) < Integer.parseInt(version2)){
            result = -1;
        }
        return result;
    }
}
