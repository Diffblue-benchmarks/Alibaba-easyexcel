package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.enums.CellDataTypeEnum
 *
 * @author Diffblue Cover
 */

class CellDataTypeEnumTest {

    @Test
    void valuesReturnsStringDirect_stringNumberBooleanEmptyErrorImage() {
        CellDataTypeEnum[] result = CellDataTypeEnum.values();
        assertThat(result[0], is(CellDataTypeEnum.STRING));
        assertThat(result[1], is(CellDataTypeEnum.DIRECT_STRING));
        assertThat(result[2], is(CellDataTypeEnum.NUMBER));
        assertThat(result[3], is(CellDataTypeEnum.BOOLEAN));
        assertThat(result[4], is(CellDataTypeEnum.EMPTY));
        assertThat(result[5], is(CellDataTypeEnum.ERROR));
        assertThat(result[6], is(CellDataTypeEnum.IMAGE));
    }

    @Test
    void buildFromCellType() {
        assertThat(CellDataTypeEnum.buildFromCellType("BASIC"), is(nullValue()));
        assertThat(CellDataTypeEnum.buildFromCellType(""), is(CellDataTypeEnum.EMPTY));
    }
}
