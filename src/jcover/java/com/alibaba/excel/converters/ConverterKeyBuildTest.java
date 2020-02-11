package com.alibaba.excel.converters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.ConverterKeyBuild
 *
 * @author Diffblue JCover
 */

public class ConverterKeyBuildTest {

    @Test(timeout=10000)
    public void buildKey() {
        assertThat(ConverterKeyBuild.buildKey(String.class), is("java.lang.String"));
        assertThat(ConverterKeyBuild.buildKey(String.class, CellDataTypeEnum.STRING), is("java.lang.String-STRING"));
    }
}
