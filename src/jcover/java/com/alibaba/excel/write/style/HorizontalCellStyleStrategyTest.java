package com.alibaba.excel.write.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.HorizontalCellStyleStrategy
 *
 * @author Diffblue Cover
 */

class HorizontalCellStyleStrategyTest {

    @Test
    void uniqueValueReturnsCellStyleStrategy() {
        assertThat(new HorizontalCellStyleStrategy(new WriteCellStyle(), new WriteCellStyle()).uniqueValue(), is("CellStyleStrategy"));
    }
}
