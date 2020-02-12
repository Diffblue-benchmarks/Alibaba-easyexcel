package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.enums.CellDataTypeEnum
 *
 * @author Diffblue JCover
 */

public class CellDataTypeEnumDiffblueTest {

    @Test(timeout=10000)
    public void buildFromCellType() {
        assertThat(CellDataTypeEnum.buildFromCellType(""), is(CellDataTypeEnum.EMPTY));
        assertThat(CellDataTypeEnum.buildFromCellType("gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void valuesReturnsSTRINGDIRECT_STRINGNUMBERBOOLEANEMPTYERRORIMAGE() {
        CellDataTypeEnum[] result = CellDataTypeEnum.values();
        assertThat(result[0], is(CellDataTypeEnum.STRING));
        assertThat(result[1], is(CellDataTypeEnum.DIRECT_STRING));
        assertThat(result[2], is(CellDataTypeEnum.NUMBER));
        assertThat(result[3], is(CellDataTypeEnum.BOOLEAN));
        assertThat(result[4], is(CellDataTypeEnum.EMPTY));
        assertThat(result[5], is(CellDataTypeEnum.ERROR));
        assertThat(result[6], is(CellDataTypeEnum.IMAGE));
    }
}
