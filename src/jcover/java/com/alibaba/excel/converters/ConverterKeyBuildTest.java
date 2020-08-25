package com.alibaba.excel.converters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.ConverterKeyBuild
 *
 * @author Diffblue Cover
 */

class ConverterKeyBuildTest {

    @Test
    void buildKey() {
        assertThat(ConverterKeyBuild.buildKey(String.class), is("java.lang.String"));
        assertThat(ConverterKeyBuild.buildKey(String.class, CellDataTypeEnum.STRING), is("java.lang.String-STRING"));
        assertThat(ConverterKeyBuild.buildKey(int.class), is("java.lang.Integer"));
    }
}
