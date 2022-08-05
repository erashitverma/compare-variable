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

    @Test
    public void testShouldReturn0_ifVersion1Version2AreEqual_whenNoDecimalPresent(){
        CompareVersion compareVersion = new CompareVersion();
        String version1 = "3";
        String version2 = "3";
        assertThat(compareVersion.compareVersion(version1, version2)).isEqualTo(0);
    }

    @Test
    public void testShouldReturn1_ifVersion1IsBigger_whenBothNumbersHaveEqualDecimal(){
        CompareVersion compareVersion = new CompareVersion();
        String version1 = "3.1";
        String version2 = "1.9";
        assertThat(compareVersion.compareVersion(version1, version2)).isEqualTo(1);
    }
}
