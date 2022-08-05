package com.asverma;

/**
 * @author asverma
 */

public class CompareVersion
{
    public int compareVersion(final String version1, final String version2){

        // using result as i prefer not to have multiple exit in methods // more readable
        int result = 0;
        float version1Float = Float.parseFloat(version1);
        float version2Float = Float.parseFloat(version2);
        if(Float.parseFloat(version1) > Float.parseFloat(version2)){
            result = 1;
        } else if (Float.parseFloat(version1) < Float.parseFloat(version2)){
            result = -1;
        }
        return result;
    }
}
