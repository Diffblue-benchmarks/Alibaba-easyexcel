package com.alibaba.excel.enums;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.enums.CellExtraTypeEnum
 *
 * @author Diffblue Cover
 */

class CellExtraTypeEnumTest {

    @Test
    void valuesReturnsCommentHyperlinkMerge() {
        CellExtraTypeEnum[] result = CellExtraTypeEnum.values();
        assertThat(result[0], is(CellExtraTypeEnum.COMMENT));
        assertThat(result[1], is(CellExtraTypeEnum.HYPERLINK));
        assertThat(result[2], is(CellExtraTypeEnum.MERGE));
    }
}
