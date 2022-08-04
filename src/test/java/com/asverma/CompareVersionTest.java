package com.asverma;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class CompareVersionTest
{
    @Test
    public void testShouldReturn1_ifVersion1IsBigger_whenNoDecimalPresent(){
        CompareVersion compareVersion = new CompareVersion();
        String version1 = "3";
        String version2 = "2";
        assertThat(compareVersion.compareVersion(version1, version2)).isEqualTo(1);
    }

    @Test
    public void testShouldReturnNegative1_ifVersion2IsBigger_whenNoDecimalPresent(){
        CompareVersion compareVersion = new CompareVersion();
        String version1 = "1";
        String version2 = "2";
        assertThat(compareVersion.compareVersion(version1, version2)).isEqualTo(-1);
    }
}
